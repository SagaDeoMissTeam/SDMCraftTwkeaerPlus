package net.sixik.sdmcrtplus.mixin.vanilla.generation;

import net.minecraft.world.level.levelgen.feature.stateproviders.DualNoiseProvider;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(DualNoiseProvider.class)
public class DualNoiseProviderMixin {

//    @Inject(method = "getState", at = @At("HEAD"), cancellable = true)
//    public void sdm$get(RandomSource p_225910_, BlockPos p_225911_, CallbackInfoReturnable<BlockState> cir){
//        cir.cancel();
//        cir.setReturnValue(Blocks.SAND.defaultBlockState());
//    }

}
