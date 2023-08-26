package net.sixik.sdmcrtplus.CrT.integration.curios;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.type.inventory.IDynamicStackHandler;

@ZenRegister(modDeps = "curios")
@Document("mods/sdmcrtplus/integration/curios/IDynamicStackHandler")
@NativeTypeRegistration(value = IDynamicStackHandler.class,zenCodeName = "mods.sdmcrtplus.integration.curios.IDynamicStackHandler")
public class ExpandIDynamicStackHandler {

    @ZenCodeType.Method
    @ZenCodeType.Getter("slots")
    public static int getSlots(IDynamicStackHandler iDynamicStackHandler){
       return iDynamicStackHandler.getSlots();
    }
    @ZenCodeType.Method
    public static ItemStack getStackInSlot(IDynamicStackHandler iDynamicStackHandler, int slot){
        return iDynamicStackHandler.getStackInSlot(slot);
    }
    @ZenCodeType.Method
    public static ItemStack getPreviousStackInSlot(IDynamicStackHandler iDynamicStackHandler, int slot){
        return iDynamicStackHandler.getPreviousStackInSlot(slot);
    }
    @ZenCodeType.Method
    public static int getSlotLimit(IDynamicStackHandler iDynamicStackHandler, int slot){
        return iDynamicStackHandler.getSlotLimit(slot);
    }
    @ZenCodeType.Method
    public static void setStackInSlot(IDynamicStackHandler iDynamicStackHandler, int slot, IItemStack stack){
        iDynamicStackHandler.setStackInSlot(slot, stack.getInternal());
    }
    @ZenCodeType.Method
    public static void setPreviousStackInSlot(IDynamicStackHandler iDynamicStackHandler, int slot, IItemStack stack){
        iDynamicStackHandler.setPreviousStackInSlot(slot, stack.getInternal());
    }
    @ZenCodeType.Method
    public static boolean isItemValid(IDynamicStackHandler iDynamicStackHandler, int slot, IItemStack stack){
      return  iDynamicStackHandler.isItemValid(slot, stack.getInternal());
    }

    /**
     * @param simulate If true, the insertion is only simulated
     */
    @ZenCodeType.Method
    public static ItemStack insertItem(IDynamicStackHandler iDynamicStackHandler, int slot, IItemStack stack, boolean simulate){
      return iDynamicStackHandler.insertItem(slot, stack.getInternal(), simulate);
    }
    /**
     * @param simulate If true, the insertion is only simulated
     */
    @ZenCodeType.Method
    public static ItemStack extractItem(IDynamicStackHandler iDynamicStackHandler, int slot, int amount, boolean simulate){
      return iDynamicStackHandler.extractItem(slot, amount, simulate);
    }
}
