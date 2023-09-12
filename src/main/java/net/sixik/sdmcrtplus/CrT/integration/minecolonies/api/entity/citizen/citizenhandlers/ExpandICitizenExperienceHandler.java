package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen.citizenhandlers;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenExperienceHandler;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/citizenhandlers/ICitizenExperienceHandler")
@NativeTypeRegistration(value = ICitizenExperienceHandler.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.citizenhandlers.ICitizenExperienceHandler")
public class ExpandICitizenExperienceHandler {
    @ZenCodeType.Method
    public static void updateLevel(ICitizenExperienceHandler iCitizenExperienceHandler){
        iCitizenExperienceHandler.updateLevel();
    }
    @ZenCodeType.Method
    public static void addExperience(ICitizenExperienceHandler iCitizenExperienceHandler,double var1){
        iCitizenExperienceHandler.addExperience(var1);
    }
    @ZenCodeType.Method
    public static void dropExperience(ICitizenExperienceHandler iCitizenExperienceHandler){
        iCitizenExperienceHandler.dropExperience();
    }

    @ZenCodeType.Method
    public static void gatherXp(ICitizenExperienceHandler iCitizenExperienceHandler){
        iCitizenExperienceHandler.gatherXp();
    }
}
