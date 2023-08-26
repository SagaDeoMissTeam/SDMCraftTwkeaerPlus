package net.sixik.sdmcrtplus.CrT.world.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/BlockGetter")
@NativeTypeRegistration(value = BlockGetter.class, zenCodeName = "mods.sdmcrtplus.world.level.BlockGetter")
public class ExpandBlockGetter {

    @ZenCodeType.Method
    public static BlockEntity getBlockEntity(BlockGetter blockGetter, BlockPos position){
        return blockGetter.getBlockEntity(position);
    }
    @ZenCodeType.Method
    public static BlockState getBlockState(BlockGetter blockGetter, BlockPos position){
        return blockGetter.getBlockState(position);
    }
    @ZenCodeType.Method
    public static double getBlockFloorHeight(BlockGetter blockGetter, BlockPos position){
        return blockGetter.getBlockFloorHeight(position);
    }
    @ZenCodeType.Method
    public static int getLightEmission(BlockGetter blockGetter, BlockPos position){
        return blockGetter.getLightEmission(position);
    }
    @ZenCodeType.Method
    public static List<BlockState> getLightEmission(BlockGetter blockGetter, AABB aabb){
        return blockGetter.getBlockStates(aabb).toList();
    }
}
