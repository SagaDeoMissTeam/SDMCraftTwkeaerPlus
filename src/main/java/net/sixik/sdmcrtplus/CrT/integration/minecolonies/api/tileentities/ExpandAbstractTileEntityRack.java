package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.tileentities;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.crafting.ItemStorage;
import com.minecolonies.api.tileentities.AbstractTileEntityRack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandlerModifiable;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import java.util.function.Predicate;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/tileentities/AbstractTileEntityRack")
@NativeTypeRegistration(value = AbstractTileEntityRack.class, zenCodeName = "mods.sdmcrtplus.integration.api.tileentities.AbstractTileEntityRack")
public class ExpandAbstractTileEntityRack {

    @ZenCodeType.Method
    public static IItemHandlerModifiable getInventory(AbstractTileEntityRack internal){
        return internal.getInventory();
    }
    @ZenCodeType.Method
    public static void setInWarehouse(AbstractTileEntityRack internal,Boolean var1){
        internal.setInWarehouse(var1);
    }
    @ZenCodeType.Method
    public static int getFreeSlots(AbstractTileEntityRack internal){
        return internal.getFreeSlots();
    }
    @ZenCodeType.Method
    public static boolean hasItemStack(AbstractTileEntityRack internal,ItemStack var1, int var2, boolean var3){
        return internal.hasItemStack(var1,var2,var3);
    }
    @ZenCodeType.Method
    public static int getCount(AbstractTileEntityRack internal,ItemStack var1, boolean var2, boolean var3){
        return internal.getCount(var1,var2,var2);
    }
    @ZenCodeType.Method
    public static int getCount(AbstractTileEntityRack internal,ItemStorage var1){
        return internal.getCount(var1);
    }
    @ZenCodeType.Method
    public static boolean hasItemStack(AbstractTileEntityRack internal, Predicate<ItemStack> var1){
        return internal.hasItemStack(var1);
    }
    @ZenCodeType.Method
    public static boolean hasSimilarStack(AbstractTileEntityRack internal, ItemStack var1){
        return internal.hasSimilarStack(var1);
    }
    @ZenCodeType.Method
    public static void upgradeRackSize(AbstractTileEntityRack internal){
        internal.upgradeRackSize();
    }
    @ZenCodeType.Method
    public static void setBuildingPos(AbstractTileEntityRack internal, BlockPos pos) {
        internal.setBuildingPos(pos);
    }
    @ZenCodeType.Method
    public static int getUpgradeSize(AbstractTileEntityRack internal){
        return internal.getUpgradeSize();
    }
    @ZenCodeType.Method
    public static int getItemCount(AbstractTileEntityRack internal,Predicate<ItemStack> var1){
        return internal.getItemCount(var1);
    }
    @ZenCodeType.Method
    public static void updateItemStorage(AbstractTileEntityRack internal){
        internal.updateItemStorage();
    }

    @ZenCodeType.Method
    public static AbstractTileEntityRack getOtherChest(AbstractTileEntityRack internal){
        return internal.getOtherChest();
    }
    @ZenCodeType.Method
    public static boolean isEmpty(AbstractTileEntityRack internal){
        return internal.isEmpty();
    }

    @ZenRegister(modDeps = "minecolonies")
    @Document("mods/sdmcrtplus/integration/minecolonies/api/tileentities/inventory/RackInventory")
    @NativeTypeRegistration(value = AbstractTileEntityRack.RackInventory.class, zenCodeName = "mods.sdmcrtplus.integration.api.tileentities.inventory.RackInventory")
    public static class ExpandRackInventory{

    }
}
