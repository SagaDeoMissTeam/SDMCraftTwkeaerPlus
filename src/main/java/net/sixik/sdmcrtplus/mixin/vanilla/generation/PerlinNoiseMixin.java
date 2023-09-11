package net.sixik.sdmcrtplus.mixin.vanilla.generation;


import net.minecraft.world.level.levelgen.synth.PerlinNoise;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.sdmcrtplus.source.GenerationHelper;
import net.sixik.sdmcrtplus.source.events.generations.PernilNoiseEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PerlinNoise.class)
public class PerlinNoiseMixin {

    @Inject(method = "Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;getValue(DDDDDZ)D", at = @At("HEAD"), cancellable = true)
    public void custom$customNoise(double x, double y, double p_75420_, double p_75421_, double p_75422_, boolean p_75423_, CallbackInfoReturnable<Double> cir){
        PernilNoiseEvent event = new PernilNoiseEvent(GenerationHelper.getPlayer(), x,y);
        MinecraftForge.EVENT_BUS.post(event);
        if(event.isCanceled()){
            cir.cancel();
            cir.setReturnValue(event.getTotalNum());
        }

        //        if(CustomParameters.customPerlinNoise){
//            cir.cancel();
//            cir.setReturnValue(CustomParameters.customPerlinProperty);
//        }

    }
}
