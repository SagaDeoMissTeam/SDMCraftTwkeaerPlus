package net.sixik.sdmcrtplus.CrT.items;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandlerModifiable;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/items/IItemHandlerModifiable")
@NativeTypeRegistration(value = IItemHandlerModifiable.class, zenCodeName = "mods.sdmcrtplus.items.IItemHandlerModifiable")
public class ExpandIItemHandlerModifiable {

    @ZenCodeType.Method
    public static void setStackInSlot(IItemHandlerModifiable iItemHandlerModifiable, int slot, ItemStack stack){
        iItemHandlerModifiable.setStackInSlot(slot,stack);
    }
}
