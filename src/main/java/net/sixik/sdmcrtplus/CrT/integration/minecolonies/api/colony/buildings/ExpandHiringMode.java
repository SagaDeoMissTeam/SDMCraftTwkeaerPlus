package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.buildings.HiringMode;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/HiringMode")
@NativeTypeRegistration(value = HiringMode.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.HiringMode")
@BracketEnum("minecolonies:building/hiringmode")
public class ExpandHiringMode {

    @ZenCodeType.Method
    public static String getTranslationKey(HiringMode hiringMode){
        return hiringMode.getTranslationKey();
    }
}
