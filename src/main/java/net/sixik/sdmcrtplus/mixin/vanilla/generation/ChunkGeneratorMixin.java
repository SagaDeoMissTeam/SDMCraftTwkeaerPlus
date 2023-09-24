package net.sixik.sdmcrtplus.mixin.vanilla.generation;

import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.CrashReport;
import net.minecraft.ReportedException;
import net.minecraft.SharedConstants;
import net.minecraft.core.*;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.FeatureSorter;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.blending.Blender;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.sdmcrtplus.source.GenerationHelper;
import net.sixik.sdmcrtplus.source.events.StructureSpawnEvent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Mixin(ChunkGenerator.class)
public abstract class ChunkGeneratorMixin {

    @Shadow @Final private Supplier<List<FeatureSorter.StepFeatureData>> featuresPerStep;

    @Shadow @Final protected BiomeSource biomeSource;

    private static BoundingBox getWritableArea(ChunkAccess p_187718_) {
        ChunkPos chunkpos = p_187718_.getPos();
        int i = chunkpos.getMinBlockX();
        int j = chunkpos.getMinBlockZ();
        LevelHeightAccessor levelheightaccessor = p_187718_.getHeightAccessorForGeneration();
        int k = levelheightaccessor.getMinBuildHeight() + 1;
        int l = levelheightaccessor.getMaxBuildHeight() - 1;
        return new BoundingBox(i, k, j, i + 15, l, j + 15);
    }

    @Shadow @Final private Function<Holder<Biome>, BiomeGenerationSettings> generationSettingsGetter;


    @Shadow public abstract void ensureStructuresGenerated(RandomState p_223101_);

    @Inject(method = "createBiomes", at = @At("HEAD"))
    public void sdm$createBiome(Registry<Biome> p_223158_, Executor p_223159_, RandomState p_223160_, Blender p_223161_, StructureManager p_223162_, ChunkAccess p_223163_, CallbackInfoReturnable<CompletableFuture<ChunkAccess>> cir){

    }

    @Inject(method = "applyBiomeDecoration", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/StructureManager;startsForStructure(Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/levelgen/structure/Structure;)Ljava/util/List;"), cancellable = true)
    public void applyBiomeDecoration(WorldGenLevel worldGenLevel, ChunkAccess chunkAccess, StructureManager structureManager, CallbackInfo ci) {
        ci.cancel();
        ChunkPos chunkpos = chunkAccess.getPos();
        if (!SharedConstants.debugVoidTerrain(chunkpos)) {
            SectionPos sectionpos = SectionPos.of(chunkpos, worldGenLevel.getMinSection());
            BlockPos blockpos = sectionpos.origin();
            Registry<Structure> registry = worldGenLevel.registryAccess().registryOrThrow(Registry.STRUCTURE_REGISTRY);
            Map<Integer, List<Structure>> map = registry.stream().collect(Collectors.groupingBy((p_223103_) -> {
                return p_223103_.step().ordinal();
            }));
            List<FeatureSorter.StepFeatureData> list = this.featuresPerStep.get();
            WorldgenRandom worldgenrandom = new WorldgenRandom(new XoroshiroRandomSource(RandomSupport.generateUniqueSeed()));
            long i = worldgenrandom.setDecorationSeed(worldGenLevel.getSeed(), blockpos.getX(), blockpos.getZ());
            Set<Holder<Biome>> set = new ObjectArraySet<>();
            ChunkPos.rangeClosed(sectionpos.chunk(), 1).forEach((p_223093_) -> {
                ChunkAccess chunkaccess = worldGenLevel.getChunk(p_223093_.x, p_223093_.z);

                for(LevelChunkSection levelchunksection : chunkaccess.getSections()) {
                    levelchunksection.getBiomes().getAll(set::add);
                }

            });
            set.retainAll(this.biomeSource.possibleBiomes());
            int j = list.size();

            try {
                Registry<PlacedFeature> registry1 = worldGenLevel.registryAccess().registryOrThrow(Registry.PLACED_FEATURE_REGISTRY);
                int i1 = Math.max(GenerationStep.Decoration.values().length, j);

                for(int k = 0; k < i1; ++k) {
                    int l = 0;
                    if (structureManager.shouldGenerateStructures()) {
                        for(Structure structure : map.getOrDefault(k, Collections.emptyList())) {
                            worldgenrandom.setFeatureSeed(i, l, k);
                            Supplier<String> supplier = () -> {
                                return registry.getResourceKey(structure).map(Object::toString).orElseGet(structure::toString);
                            };
                            try {
                                StructureSpawnEvent event = new StructureSpawnEvent(structure, structureManager, chunkpos, sectionpos, worldGenLevel.getLevel(), GenerationHelper.getPlayer());
                                MinecraftForge.EVENT_BUS.post(event);
                                if (!event.isCanceled()){
                                    worldGenLevel.setCurrentlyGenerating(supplier);
                                    Structure structure1 =  event.getStructure();

                                    structureManager.startsForStructure(sectionpos, structure1 != null ? structure1 : structure).forEach((p_223086_) -> {
                                        p_223086_.placeInChunk(worldGenLevel, structureManager, ((ChunkGenerator) (Object) this), worldgenrandom, getWritableArea(chunkAccess), chunkpos);
                                    });
                                }
                            } catch (Exception exception) {
                                CrashReport crashreport1 = CrashReport.forThrowable(exception, "Feature placement");
                                crashreport1.addCategory("Feature").setDetail("Description", supplier::get);
                                throw new ReportedException(crashreport1);
                            }

                            ++l;
                        }
                    }

                    if (k < j) {
                        IntSet intset = new IntArraySet();

                        for(Holder<Biome> holder : set) {
                            List<HolderSet<PlacedFeature>> list1 = this.generationSettingsGetter.apply(holder).features();
                            if (k < list1.size()) {
                                HolderSet<PlacedFeature> holderset = list1.get(k);
                                FeatureSorter.StepFeatureData featuresorter$stepfeaturedata1 = list.get(k);
                                holderset.stream().map(Holder::value).forEach((p_223174_) -> {
                                    intset.add(featuresorter$stepfeaturedata1.indexMapping().applyAsInt(p_223174_));
                                });
                            }
                        }

                        int j1 = intset.size();
                        int[] aint = intset.toIntArray();
                        Arrays.sort(aint);
                        FeatureSorter.StepFeatureData featuresorter$stepfeaturedata = list.get(k);

                        for(int k1 = 0; k1 < j1; ++k1) {
                            int l1 = aint[k1];
                            PlacedFeature placedfeature = featuresorter$stepfeaturedata.features().get(l1);
                            Supplier<String> supplier1 = () -> {
                                return registry1.getResourceKey(placedfeature).map(Object::toString).orElseGet(placedfeature::toString);
                            };
                            worldgenrandom.setFeatureSeed(i, l1, k);

                            try {
                                worldGenLevel.setCurrentlyGenerating(supplier1);
                                placedfeature.placeWithBiomeCheck(worldGenLevel, ((ChunkGenerator)(Object)this), worldgenrandom, blockpos);
                            } catch (Exception exception1) {
                                CrashReport crashreport2 = CrashReport.forThrowable(exception1, "Feature placement");
                                crashreport2.addCategory("Feature").setDetail("Description", supplier1::get);
                                throw new ReportedException(crashreport2);
                            }
                        }
                    }
                }

                worldGenLevel.setCurrentlyGenerating((Supplier<String>)null);
            } catch (Exception exception2) {
                CrashReport crashreport = CrashReport.forThrowable(exception2, "Biome decoration");
                crashreport.addCategory("Generation").setDetail("CenterX", chunkpos.x).setDetail("CenterZ", chunkpos.z).setDetail("Seed", i);
                throw new ReportedException(crashreport);
            }
        }
    }
}
