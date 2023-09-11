package net.sixik.sdmcrtplus.mixin.vanilla.generation;

import net.minecraft.core.Holder;
import net.minecraft.core.QuartPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeResolver;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.chunk.PalettedContainer;
import net.minecraft.world.level.chunk.PalettedContainerRO;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.server.ServerLifecycleHooks;
import net.sixik.sdmcrtplus.source.GenerationHelper;
import net.sixik.sdmcrtplus.source.events.generations.fillBiomesFromNoiseEvent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

@Mixin(LevelChunkSection.class)
public class LevelChunkSectionMixin {

    @Shadow @Final private int bottomBlockY;

    @Shadow private PalettedContainerRO<Holder<Biome>> biomes;

    @Inject(method = "fillBiomesFromNoise", at = @At("HEAD"), cancellable = true)
    public void GS$fillBiomesFromNoise(BiomeResolver biomeResolver, Climate.Sampler sampler, int posX, int posZ, CallbackInfo ci){
        ci.cancel();
        PalettedContainer<Holder<Biome>> palettedcontainer = this.biomes.recreate();
        int i = QuartPos.fromBlock(this.bottomBlockY);
        int j = 4;

        for(int k = 0; k < 4; ++k) {
            for(int l = 0; l < 4; ++l) {
                for(int i1 = 0; i1 < 4; ++i1) {
                    ResourceLocation biomeMain = new ResourceLocation("");
                    Registry<Biome> registry = ServerLifecycleHooks.getCurrentServer().registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);;
                    for (Biome biome : registry) {
                        if (biomeResolver.getNoiseBiome(posX + k, i + l, posZ + i1, sampler).is(Objects.requireNonNull(registry.getKey(biome)))) {
                            biomeMain = registry.getKey(biome);
                        }
                    }

                    fillBiomesFromNoiseEvent event = new fillBiomesFromNoiseEvent(new ChunkPos(posX, posZ), biomeMain, GenerationHelper.getPlayer());
                    MinecraftForge.EVENT_BUS.post(event);
                    if(event.isCanceled()) {return;}

                    //Holder<Biome> biomes = event.getBiome() != null ? registry.getHolderOrThrow(registry.getResourceKey(Objects.requireNonNull(registry.get(event.getBiome()))).get()) : biomeResolver.getNoiseBiome(posX + k, i + l, posZ + i1, sampler);
                    palettedcontainer.getAndSetUnchecked(k, l, i1, registry.getHolderOrThrow(registry.getResourceKey(Objects.requireNonNull(registry.get(event.getBiome()))).get()));
                }
            }
        }

        this.biomes = palettedcontainer;

    }
}
