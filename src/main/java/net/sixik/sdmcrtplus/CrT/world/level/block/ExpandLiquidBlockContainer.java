package net.sixik.sdmcrtplus.CrT.world.level.block;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/block/LiquidBlockContainer")
@NativeTypeRegistration(value = LiquidBlockContainer.class, zenCodeName = "mods.sdmcrtplus.world.level.block.LiquidBlockContainer")
public class ExpandLiquidBlockContainer {
    @ZenCodeType.Method
    public static boolean canPlaceLiquid(LiquidBlockContainer liquidBlockContainer, BlockGetter blockGetter, BlockPos pos, BlockState blockState, Fluid fluid){
       return liquidBlockContainer.canPlaceLiquid(blockGetter,pos,blockState,fluid);
   }

   @ZenCodeType.Method
    public static boolean placeLiquid(LiquidBlockContainer liquidBlockContainer, LevelAccessor levelAccessor, BlockPos pos, BlockState blockState, FluidState fluidState){
       return liquidBlockContainer.placeLiquid(levelAccessor,pos,blockState,fluidState);
    }
}
