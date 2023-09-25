package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.blocks.interfaces;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.blocks.interfaces.IRSComponentBlock;
import com.minecolonies.api.blocks.interfaces.ITickableBlockMinecolonies;
import com.minecolonies.api.tileentities.ITickable;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/blocks/interfaces/ITickableBlockMinecolonies")
@NativeTypeRegistration(value = ITickableBlockMinecolonies.class, zenCodeName = "mods.sdmcrtplus.integration.api.blocks.interfaces.ITickableBlockMinecolonies")
public class ExpandITickableBlockMinecolonies {

    @ZenCodeType.Method
    public static <T extends BlockEntity> @ZenCodeType.Nullable BlockEntityTicker<T> getTicker(ITickableBlockMinecolonies iTickableBlockMinecolonies, Level level, BlockState state, BlockEntityType<T> type) {
        return iTickableBlockMinecolonies.getTicker(level,state,type);
    }

//    @ZenCodeType.Method
//    public static <E extends BlockEntity, A extends BlockEntity> @ZenCodeType.Nullable BlockEntityTicker<A> createTickerHelper(ITickableBlockMinecolonies iTickableBlockMinecolonies,BlockEntityType<A> aBlockEntityType, BlockEntityType<E> eBlockEntityType, BlockEntityTicker<? super E> blockEntityTicker) {
//        return iTickableBlockMinecolonies.createTickerHelper(aBlockEntityType, eBlockEntityType, blockEntityTicker);
//    }
}
