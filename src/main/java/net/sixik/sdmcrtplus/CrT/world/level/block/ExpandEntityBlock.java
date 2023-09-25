package net.sixik.sdmcrtplus.CrT.world.level.block;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEventListener;
import org.openzen.zencode.java.ZenCodeType;

import javax.annotation.Nullable;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/block/EntityBlock")
@NativeTypeRegistration(value = EntityBlock.class, zenCodeName = "mods.sdmcrtplus.world.level.block.EntityBlock")
public class ExpandEntityBlock {

    @ZenCodeType.Method
    @ZenCodeType.Nullable
    public static BlockEntity newBlockEntity(EntityBlock entityBlock, BlockPos pos, BlockState blockState){
        return entityBlock.newBlockEntity(pos, blockState);
    }

    @ZenCodeType.Method
    @ZenCodeType.Nullable
    public static  <T extends BlockEntity> BlockEntityTicker<T> getTicker(EntityBlock entityBlock, Level level, BlockState blockState, BlockEntityType<T> tBlockEntityType) {
        return entityBlock.getTicker(level,blockState,tBlockEntityType);
    }

    @ZenCodeType.Method
    @ZenCodeType.Nullable
    public static <T extends BlockEntity> GameEventListener getListener(EntityBlock entityBlock, ServerLevel level, T t) {
        return entityBlock.getListener(level,t);
    }
}
