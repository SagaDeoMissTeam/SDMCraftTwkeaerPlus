package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.inventory;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.inventory.InventoryCitizen;
import com.minecolonies.api.tileentities.AbstractTileEntityColonyBuilding;
import com.minecolonies.api.util.ItemStackUtils;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/inventory/InventoryCitizen")
@NativeTypeRegistration(value = InventoryCitizen.class, zenCodeName = "mods.sdmcrtplus.integration.api.inventory.InventoryCitizen")
public class ExpandInventoryCitizen {

    @ZenCodeType.Method public static void setCustomName(InventoryCitizen inventoryCitizen, String customName) {
        inventoryCitizen.setCustomName(customName);
    }


    @ZenCodeType.Method public static ItemStack getHeldItem(InventoryCitizen inventoryCitizen,InteractionHand hand) {
        return inventoryCitizen.getHeldItem(hand);
    }


    @ZenCodeType.Method public static void setHeldItem(InventoryCitizen inventoryCitizen, InteractionHand hand, int slot) {
        inventoryCitizen.setHeldItem(hand,slot);
    }

    @ZenCodeType.Method public static int getHeldItemSlot(InventoryCitizen inventoryCitizen, InteractionHand hand) {
        return inventoryCitizen.getHeldItemSlot(hand);
    }

    @ZenCodeType.Method public static int getSlots(InventoryCitizen inventoryCitizen) {
        return inventoryCitizen.getSlots();
    }

    @ZenCodeType.Method public static boolean hasSpace(InventoryCitizen inventoryCitizen) {
        return inventoryCitizen.hasSpace();
    }

    @ZenCodeType.Method public static boolean isEmpty(InventoryCitizen inventoryCitizen) {
        return inventoryCitizen.isEmpty();
    }

    @ZenCodeType.Method public static boolean isFull(InventoryCitizen inventoryCitizen) {
        return inventoryCitizen.isFull();
    }

    @ZenCodeType.Method public static Component getName(InventoryCitizen inventoryCitizen) {
        return inventoryCitizen.getName();
    }

    @ZenCodeType.Method public static boolean hasCustomName(InventoryCitizen inventoryCitizen) {
        return inventoryCitizen.hasCustomName();
    }

    @ZenCodeType.Method public static ItemStack getStackInSlot(InventoryCitizen inventoryCitizen, int index) {
        return inventoryCitizen.getStackInSlot(index);
    }

    @ZenCodeType.Method public static <T extends LivingEntity> boolean damageInventoryItem(InventoryCitizen inventoryCitizen, int slot, int amount, @ZenCodeType.Nullable T entityIn, @ZenCodeType.Nullable Consumer<T> onBroken) {
        return inventoryCitizen.damageInventoryItem(slot,amount,entityIn, onBroken);
    }

    @ZenCodeType.Method public static boolean shrinkInventoryItem(InventoryCitizen inventoryCitizen,int slot) {
        return inventoryCitizen.shrinkInventoryItem(slot);
    }
    
    @ZenCodeType.Method public static ItemStack insertItem(InventoryCitizen inventoryCitizen,int slot, ItemStack stack, boolean simulate) {
        return inventoryCitizen.insertItem(slot,stack,simulate);
    }
    
    @ZenCodeType.Method public static ItemStack extractItem(InventoryCitizen inventoryCitizen,int slot, int amount, boolean simulate) {
        return inventoryCitizen.extractItem(slot,amount,simulate);
    }

    @ZenCodeType.Method public static int getSlotLimit(InventoryCitizen inventoryCitizen, int slot) {
        return inventoryCitizen.getSlotLimit(slot);
    }

    @ZenCodeType.Method public static boolean isItemValid(InventoryCitizen inventoryCitizen, int slot, ItemStack stack) {
        return inventoryCitizen.isItemValid(slot, stack);
    }

    @ZenCodeType.Method public static void markDirty(InventoryCitizen inventoryCitizen) {
        inventoryCitizen.markDirty();

    }

    @ZenCodeType.Method public static Component getDisplayName(InventoryCitizen inventoryCitizen) {
        return inventoryCitizen.getDisplayName();
    }

}
