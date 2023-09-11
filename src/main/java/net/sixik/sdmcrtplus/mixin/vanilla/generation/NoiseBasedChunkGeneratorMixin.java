package net.sixik.sdmcrtplus.mixin.vanilla.generation;

import com.google.common.collect.Sets;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.server.level.WorldGenRegion;
import net.minecraft.util.Mth;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.biome.BiomeManager;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.blending.Blender;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.sdmcrtplus.source.GenerationHelper;
import net.sixik.sdmcrtplus.source.events.generations.fillFromNoiseEvent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@Mixin(NoiseBasedChunkGenerator.class)
public abstract class NoiseBasedChunkGeneratorMixin {

    @Shadow @Final protected Holder<NoiseGeneratorSettings> settings;

    @Shadow protected abstract ChunkAccess doFill(Blender p_224285_, StructureManager p_224286_, RandomState p_224287_, ChunkAccess p_224288_, int p_224289_, int p_224290_);

    @Inject(method = "Lnet/minecraft/world/level/levelgen/NoiseBasedChunkGenerator;buildSurface(Lnet/minecraft/server/level/WorldGenRegion;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", at = @At("HEAD"), cancellable = true)
    public void sdm$get(WorldGenRegion p_224232_, StructureManager p_224233_, RandomState p_224234_, ChunkAccess p_224235_, CallbackInfo ci){
//        ci.cancel();
    }

    @Inject(method = "applyCarvers", at = @At("HEAD"), cancellable = true)
    public void sdm$applyCarvers(WorldGenRegion p_224224_, long p_224225_, RandomState p_224226_, BiomeManager p_224227_, StructureManager p_224228_, ChunkAccess p_224229_, GenerationStep.Carving p_224230_, CallbackInfo ci){
        ci.cancel();
    }

//    @Inject(method = "")
//    public void sdm$applyCarvers(){
//
//    }

    @Inject(method = "fillFromNoise", at = @At("HEAD"), cancellable = true)
    public void sdm$fillFromNoise(Executor p_224312_, Blender p_224313_, RandomState p_224314_, StructureManager p_224315_, ChunkAccess p_224316_, CallbackInfoReturnable<CompletableFuture<ChunkAccess>> cir){
        cir.cancel();
        NoiseSettings noisesettings = this.settings.value().noiseSettings().clampToHeightAccessor(p_224316_.getHeightAccessorForGeneration());
        int i = noisesettings.minY();
        int j = Mth.intFloorDiv(i, noisesettings.getCellHeight());
        int k = Mth.intFloorDiv(noisesettings.height(), noisesettings.getCellHeight());
        fillFromNoiseEvent event = new fillFromNoiseEvent(j, i, k, GenerationHelper.getPlayer());
        MinecraftForge.EVENT_BUS.post(event);
        int cK = event.getNumZ();
        int cI = event.getNumY();
        int cJ = event.getNumX();

        if (cK <= 0) {
            cir.setReturnValue(CompletableFuture.completedFuture(p_224316_));
        } else {
            int l = p_224316_.getSectionIndex(cK * noisesettings.getCellHeight() - 1 + cI);
            int i1 = p_224316_.getSectionIndex(cI);
            Set<LevelChunkSection> set = Sets.newHashSet();

            for(int j1 = l; j1 >= i1; --j1) {
                LevelChunkSection levelchunksection = p_224316_.getSection(j1);
                levelchunksection.acquire();
                set.add(levelchunksection);
            }

            cir.setReturnValue(CompletableFuture.supplyAsync(Util.wrapThreadWithTaskName("wgen_fill_noise", () -> {
                return this.doFill(p_224313_, p_224315_, p_224314_, p_224316_, cJ, cK);
            }), Util.backgroundExecutor()).whenCompleteAsync((p_224309_, p_224310_) -> {
                for(LevelChunkSection levelchunksection1 : set) {
                    levelchunksection1.release();
                }

            }, p_224312_));
        }
    }
}
