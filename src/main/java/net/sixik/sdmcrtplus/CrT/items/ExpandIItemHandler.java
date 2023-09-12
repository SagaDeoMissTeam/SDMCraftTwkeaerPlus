//package net.sixik.sdmcrtplus.CrT.items;
//
//import com.blamejared.crafttweaker.api.annotation.ZenRegister;
//import com.blamejared.crafttweaker_annotations.annotations.Document;
//import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
//import net.minecraft.world.item.ItemStack;
//import net.minecraftforge.items.IItemHandler;
//import org.openzen.zencode.java.ZenCodeType;
//
//@ZenRegister
//@Document("mods/sdmcrtplus/items/IItemHandler")
//@NativeTypeRegistration(value = IItemHandler.class, zenCodeName = "mods.sdmcrtplus.items.IItemHandler")
//public class ExpandIItemHandler {
//
//    @ZenCodeType.Method
//   public static int getSlots(IItemHandler iItemHandler){
//       return iItemHandler.getSlots();
//   }
//    @ZenCodeType.Method
//   public static ItemStack getStackInSlot(IItemHandler iItemHandler,int slot){
//       return iItemHandler.getStackInSlot(slot);
//   }
//    @ZenCodeType.Method
//   public static ItemStack insertItem(IItemHandler iItemHandler,int slot, ItemStack stack, boolean simulate){
//       return iItemHandler.insertItem(slot,stack,simulate);
//   }
//    @ZenCodeType.Method
//   public static ItemStack extractItem(IItemHandler iItemHandler,int slot, int amount, boolean simulate){
//       return iItemHandler.extractItem(slot,amount,simulate);
//   }
//    @ZenCodeType.Method
//   public static int getSlotLimit(IItemHandler iItemHandler,int slot){
//       return iItemHandler.getSlotLimit(slot);
//   }
//    @ZenCodeType.Method
//   public static boolean isItemValid(IItemHandler iItemHandler,int slot, ItemStack stack){
//       return iItemHandler.isItemValid(slot, stack);
//   }
//}
