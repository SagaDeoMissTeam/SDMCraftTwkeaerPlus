package net.sixik.sdmcrtplus.mixin.vanilla.generation;

import net.minecraft.core.Registry;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeManager;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.levelgen.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SurfaceSystem.class)
public class SurfaceSystemMixin {

    @Inject(method = "buildSurface", at = @At("HEAD"), cancellable = true)
    public void c$buildSurface(RandomState p_224649_, BiomeManager p_224650_, Registry<Biome> p_224651_, boolean p_224652_, WorldGenerationContext p_224653_, ChunkAccess p_224654_, NoiseChunk p_224655_, SurfaceRules.RuleSource p_224656_, CallbackInfo ci){
//        ci.cancel();

    }
}
