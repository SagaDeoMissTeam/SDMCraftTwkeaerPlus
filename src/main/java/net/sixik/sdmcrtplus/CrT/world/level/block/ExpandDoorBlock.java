package net.sixik.sdmcrtplus.CrT.world.level.block;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/block/DoorBlock")
@NativeTypeRegistration(value = DoorBlock.class, zenCodeName = "mods.sdmcrtplus.world.level.block.DoorBlock")
public class ExpandDoorBlock {

    @ZenCodeType.Method
    public static void setOpen(DoorBlock doorBlock, @ZenCodeType.Nullable Entity entity, Level level, BlockState blockState, BlockPos pos, boolean b){
        doorBlock.setOpen(entity,level,blockState,pos,b);
    }

    @ZenCodeType.Method
    public static boolean isPathfindable(DoorBlock doorBlock, BlockState blockState, BlockGetter blockGetter, BlockPos pos, PathComputationType pathComputationType){
        return doorBlock.isPathfindable(blockState,blockGetter,pos,pathComputationType);
    }
}
