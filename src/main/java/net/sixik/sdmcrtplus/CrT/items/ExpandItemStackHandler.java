package net.sixik.sdmcrtplus.CrT.items;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.ItemStackHandler;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/items/ItemStackHandler")
@NativeTypeRegistration(value = ItemStackHandler.class, zenCodeName = "mods.sdmcrtplus.items.ItemStackHandler")
public class ExpandItemStackHandler {

    @ZenCodeType.Method
    public static int getSlots(ItemStackHandler itemStackHandler){
        return itemStackHandler.getSlots();
    }
    @ZenCodeType.Method
    public static ItemStack getStackInSlot(ItemStackHandler itemStackHandler, int slot){
        return itemStackHandler.getStackInSlot(slot);
    }
//    @ZenCodeType.Method
//    public static CompoundTag serializeNBT(ItemStackHandler itemStackHandler, int slot){
//        return itemStackHandler.serializeNBT();
//    }
}
