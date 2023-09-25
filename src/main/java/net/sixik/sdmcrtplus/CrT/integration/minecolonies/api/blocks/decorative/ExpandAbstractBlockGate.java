package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.blocks.decorative;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.blocks.decorative.AbstractBlockGate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/blocks/decorative/AbstractBlockGate")
@NativeTypeRegistration(value = AbstractBlockGate.class, zenCodeName = "mods.sdmcrtplus.integration.api.blocks.decorative.AbstractBlockGate")
public class ExpandAbstractBlockGate {

    @ZenCodeType.Method
    public static void removeGate(AbstractBlockGate abstractBlockGate, Level world, BlockPos startPos, Direction facing){
         abstractBlockGate.removeGate(world, startPos, facing);
    }

    @Deprecated
    @ZenCodeType.Method
    public static float getBlockHardness(AbstractBlockGate abstractBlockGate, BlockState blockState, BlockGetter worldIn, BlockPos pos){
        return abstractBlockGate.getBlockHardness(blockState, worldIn, pos);
    }

    @ZenCodeType.Method
    public static void toggleGate(AbstractBlockGate abstractBlockGate,Level world, BlockPos clickedBlock, Direction facing){
         abstractBlockGate.toggleGate(world, clickedBlock, facing);
    }
}
