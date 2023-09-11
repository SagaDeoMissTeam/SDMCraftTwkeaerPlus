package net.sixik.sdmcrtplus.mixin.mods.enhancedcelestials;

import corgitaco.enhancedcelestials.meteor.MeteorContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.ChunkAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = MeteorContext.class, remap = false)
public class MeteorContextMixin {


    @Inject(method = "chunkTick", at = @At("HEAD"))
    public void sdm$chunkTick(Level level, ChunkAccess chunkAccess, CallbackInfo ci){

    }
}
