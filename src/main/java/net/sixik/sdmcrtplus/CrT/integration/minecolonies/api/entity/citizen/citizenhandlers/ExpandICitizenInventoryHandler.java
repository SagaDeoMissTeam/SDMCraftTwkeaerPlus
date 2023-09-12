package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen.citizenhandlers;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenInventoryHandler;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/citizenhandlers/ICitizenInventoryHandler")
@NativeTypeRegistration(value = ICitizenInventoryHandler.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.citizenhandlers.ICitizenInventoryHandler")
public class ExpandICitizenInventoryHandler {
    @ZenCodeType.Method
    public static int findFirstSlotInInventoryWith(ICitizenInventoryHandler iCitizenInventoryHandler,Item var1){
        return iCitizenInventoryHandler.findFirstSlotInInventoryWith(var1);
    }
    @ZenCodeType.Method
    public static int findFirstSlotInInventoryWith(ICitizenInventoryHandler iCitizenInventoryHandler,Block var1){
        return iCitizenInventoryHandler.findFirstSlotInInventoryWith(var1);
    }
    @ZenCodeType.Method
    public static int getItemCountInInventory(ICitizenInventoryHandler iCitizenInventoryHandler,Block var1){
        return iCitizenInventoryHandler.getItemCountInInventory(var1);
    }
    @ZenCodeType.Method
    public static int getItemCountInInventory(ICitizenInventoryHandler iCitizenInventoryHandler,Item var1){
        return iCitizenInventoryHandler.getItemCountInInventory(var1);
    }
    @ZenCodeType.Method
    public static boolean hasItemInInventory(ICitizenInventoryHandler iCitizenInventoryHandler,Block var1){
        return iCitizenInventoryHandler.hasItemInInventory(var1);
    }
    @ZenCodeType.Method
    public static boolean hasItemInInventory(ICitizenInventoryHandler iCitizenInventoryHandler,Item var1){
        return iCitizenInventoryHandler.hasItemInInventory(var1);
    }
    @ZenCodeType.Method
    public static boolean isInventoryFull(ICitizenInventoryHandler iCitizenInventoryHandler){
        return iCitizenInventoryHandler.isInventoryFull();
    }
}
