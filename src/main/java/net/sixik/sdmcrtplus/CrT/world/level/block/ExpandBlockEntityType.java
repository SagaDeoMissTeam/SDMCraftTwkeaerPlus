package net.sixik.sdmcrtplus.CrT.world.level.block;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/block/BlockEntityType")
@NativeTypeRegistration(value = BlockEntityType.class, zenCodeName = "mods.sdmcrtplus.world.level.block.BlockEntityType")
public class ExpandBlockEntityType {

    @ZenCodeType.Method
    public static <T extends BlockEntity> T getBlockEntity(BlockEntityType<T> blockEntityType, BlockGetter blockGetter, BlockPos pos){
       return blockEntityType.getBlockEntity(blockGetter, pos);
    }
    @ZenCodeType.Method
    public static <T extends BlockEntity> T create(BlockEntityType<T> blockEntityType, BlockPos pos, BlockState blockState){
       return blockEntityType.create(pos, blockState);
    }
    @ZenCodeType.Method
    public static <T extends BlockEntity> boolean isValid(BlockEntityType<T> blockEntityType, BlockState blockState){
       return blockEntityType.isValid(blockState);
    }
}
