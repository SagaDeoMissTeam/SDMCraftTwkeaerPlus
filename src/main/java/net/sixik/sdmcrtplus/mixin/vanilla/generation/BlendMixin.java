package net.sixik.sdmcrtplus.mixin.vanilla.generation;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.chunk.ProtoChunk;
import net.minecraft.world.level.levelgen.blending.Blender;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Blender.class)
public class BlendMixin {

    @Inject(method = "addAroundOldChunksCarvingMaskFilter", at = @At("HEAD"), cancellable = true)
    private static void sdm$get(WorldGenLevel p_197035_, ProtoChunk p_197036_, CallbackInfo ci){
        ci.cancel();

    }
}
