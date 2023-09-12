package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.tileentities;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.blocks.AbstractBlockMinecoloniesRack;
import com.minecolonies.api.blocks.ModBlocks;
import com.minecolonies.api.blocks.types.RackType;
import com.minecolonies.api.crafting.ItemStorage;
import com.minecolonies.api.inventory.container.ContainerRack;
import com.minecolonies.api.tileentities.AbstractTileEntityColonyBuilding;
import com.minecolonies.api.tileentities.AbstractTileEntityRack;
import com.minecolonies.api.tileentities.TileEntityRack;
import com.minecolonies.api.util.WorldUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/tileentities/TileEntityRack")
@NativeTypeRegistration(value = TileEntityRack.class, zenCodeName = "mods.sdmcrtplus.integration.api.tileentities.TileEntityRack")
public class ExpandTileEntityRack {

    @ZenCodeType.Method
    public static int getCount(TileEntityRack tileEntityRack, ItemStorage storage) {
        return tileEntityRack.getCount(storage);
    }
    @ZenCodeType.Method
    public static boolean hasItemStack(TileEntityRack tileEntityRack, Predicate<ItemStack> itemStackSelectionPredicate) {
        return tileEntityRack.hasItemStack(itemStackSelectionPredicate);
    }
    @ZenCodeType.Method
    public static boolean hasSimilarStack(TileEntityRack tileEntityRack, ItemStack stack) {
        return tileEntityRack.hasSimilarStack(stack);
    }
    @ZenCodeType.Method
    public static Map<ItemStorage, Integer> getAllContent(TileEntityRack tileEntityRack) {
        return tileEntityRack.getAllContent();
    }
    @ZenCodeType.Method
    public static void upgradeRackSize(TileEntityRack tileEntityRack) {
        tileEntityRack.upgradeRackSize();
    }
    @ZenCodeType.Method
    public static int getItemCount( TileEntityRack tileEntityRack,Predicate<ItemStack> predicate) {
        return tileEntityRack.getItemCount(predicate);
    }
    @ZenCodeType.Method
    public static void updateItemStorage(TileEntityRack tileEntityRack) {
        tileEntityRack.updateItemStorage();
    }
    @ZenCodeType.Method
    public static AbstractTileEntityRack getOtherChest(TileEntityRack tileEntityRack) {
        return tileEntityRack.getOtherChest();
    }
    @ZenCodeType.Method
    public static boolean isEmpty(TileEntityRack tileEntityRack) {
        return tileEntityRack.isEmpty();
    }
    @ZenCodeType.Method
    public static int getUpgradeSize(TileEntityRack tileEntityRack) {
        return tileEntityRack.getUpgradeSize();
    }
    @ZenCodeType.Method
    public static void setChanged(TileEntityRack tileEntityRack) {
        tileEntityRack.setChanged();

    }
    @ZenCodeType.Method
    public static @NotNull Component getDisplayName(TileEntityRack tileEntityRack) {
        return tileEntityRack.getDisplayName();
    }
    @ZenCodeType.Method
    public static void setRemoved(TileEntityRack tileEntityRack) {
        tileEntityRack.setRemoved();
    }
}
