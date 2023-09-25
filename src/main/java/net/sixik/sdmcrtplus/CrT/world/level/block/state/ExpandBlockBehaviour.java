package net.sixik.sdmcrtplus.CrT.world.level.block.state;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/block/state/BlockBehaviour")
@NativeTypeRegistration(value = BlockBehaviour.class, zenCodeName = "mods.sdmcrtplus.world.level.block.state.BlockBehaviour")
public class ExpandBlockBehaviour {

    @Deprecated
    @ZenCodeType.Method
    public static FluidState getFluidState(BlockBehaviour blockBehaviour, BlockState state) {
        return blockBehaviour.getFluidState(state);
    }
}
