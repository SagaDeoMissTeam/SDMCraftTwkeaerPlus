package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizen;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.inventory.InventoryCitizen;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/ICitizen")
@NativeTypeRegistration(value = ICitizen.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.ICitizen")
public class ExpandICitizen {

    @ZenCodeType.Method
    public static int getId(ICitizen ic){
        return ic.getId();
    }
    @ZenCodeType.Method
    public static String getName(ICitizen ic){
        return ic.getName();
    }
    @ZenCodeType.Method
    public static boolean isFemale(ICitizen ic){
        return ic.isFemale();
    }
    @ZenCodeType.Method
    public static double getSaturation(ICitizen ic){
        return ic.getSaturation();
    }
    @ZenCodeType.Method
    public static boolean isChild(ICitizen ic){
        return ic.isChild();
    }
    @ZenCodeType.Method
    public static InventoryCitizen getInventory(ICitizen ic){
        return ic.getInventory();
    }
    @ZenCodeType.Method
    public static void setPaused(ICitizen ic,boolean var1){
        ic.setPaused(var1);
    }
    @ZenCodeType.Method
    public static boolean isPaused(ICitizen ic){
        return ic.isPaused();
    }
    @ZenCodeType.Method
    public static IColony getColony(ICitizen ic){
        return ic.getColony();
    }
}
