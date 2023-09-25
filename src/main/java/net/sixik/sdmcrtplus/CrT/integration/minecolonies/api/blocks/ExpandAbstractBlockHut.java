package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.blocks;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.blocks.AbstractBlockHut;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/blocks/AbstractBlockHut")
@NativeTypeRegistration(value = AbstractBlockHut.class, zenCodeName = "mods.sdmcrtplus.integration.api.blocks.AbstractBlockHut")
public class ExpandAbstractBlockHut {

    @ZenCodeType.Method
    public static <T extends AbstractBlockHut<T>> String getHutName(AbstractBlockHut<T> abstractBlockHut){
        return abstractBlockHut.getHutName();
    }
    @ZenCodeType.Method
    public static <T extends AbstractBlockHut<T>> String getBlueprintName(AbstractBlockHut<T> abstractBlockHut){
        return abstractBlockHut.getBlueprintName();
    }
    @ZenCodeType.Method
    public static <T extends AbstractBlockHut<T>> Component getBlueprintDisplayName(AbstractBlockHut<T> abstractBlockHut){
        return abstractBlockHut.getBlueprintDisplayName();
    }
    @ZenCodeType.Method
    public static <T extends AbstractBlockHut<T>> ResourceLocation getRegistryName(AbstractBlockHut<T> abstractBlockHut){
        return abstractBlockHut.getRegistryName();
    }
    @ZenCodeType.Method
    public static <T extends AbstractBlockHut<T>> BuildingEntry getBuildingEntry(AbstractBlockHut<T> abstractBlockHut){
        return abstractBlockHut.getBuildingEntry();
    }
    @ZenCodeType.Method
    public static <T extends AbstractBlockHut<T>> List<MutableComponent> getDesc(AbstractBlockHut<T> abstractBlockHut){
        return abstractBlockHut.getDesc();
    }
    @ZenCodeType.Method
    public static <T extends AbstractBlockHut<T>> float getDestroyProgress(AbstractBlockHut<T> abstractBlockHut,
                                                                           BlockState state, Player player, BlockGetter world, BlockPos pos){
        return abstractBlockHut.getDestroyProgress(state, player, world, pos);
    }

    @ZenCodeType.Method
    public static <T extends AbstractBlockHut<T>> int getLevel(AbstractBlockHut<T> abstractBlockHut, CompoundTag data){
        return abstractBlockHut.getLevel(data);
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable <T extends AbstractBlockHut<T>> BlockState getStateForPlacement(AbstractBlockHut<T> abstractBlockHut, BlockPlaceContext context){
        return abstractBlockHut.getStateForPlacement(context);
    }

    @ZenCodeType.Method
    public static <T extends AbstractBlockHut<T>> void setPlacedBy(AbstractBlockHut<T> abstractBlockHut, Level worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack){
        abstractBlockHut.setPlacedBy(worldIn, pos, state, placer, stack);
    }
}
