package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen.citizenhandlers;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenHappinessHandler;
import com.minecolonies.api.entity.citizen.happiness.IHappinessModifier;
import net.minecraft.nbt.CompoundTag;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/citizenhandlers/ICitizenHappinessHandler")
@NativeTypeRegistration(value = ICitizenHappinessHandler.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.citizenhandlers.ICitizenHappinessHandler")
public class ExpandICitizenHappinessHandler {
    @ZenCodeType.Method
   public static void addModifier(ICitizenHappinessHandler iCitizenHappinessHandler,IHappinessModifier var1){
       iCitizenHappinessHandler.addModifier(var1);
   }
    @ZenCodeType.Method
   public static void resetModifier(ICitizenHappinessHandler iCitizenHappinessHandler,String var1){
        iCitizenHappinessHandler.resetModifier(var1);
    }
    @ZenCodeType.Method
   public static IHappinessModifier getModifier(ICitizenHappinessHandler iCitizenHappinessHandler, String var1){
        return iCitizenHappinessHandler.getModifier(var1);
    }
    @ZenCodeType.Method
   public static void processDailyHappiness(ICitizenHappinessHandler iCitizenHappinessHandler, ICitizenData var1){
        iCitizenHappinessHandler.processDailyHappiness(var1);
    }
    @ZenCodeType.Method
   public static double getHappiness(ICitizenHappinessHandler iCitizenHappinessHandler, IColony var1, ICitizenData var2){
        return iCitizenHappinessHandler.getHappiness(var1,var2);
    }
    @ZenCodeType.Method
   public static List<String> getModifiers(ICitizenHappinessHandler iCitizenHappinessHandler){
        return iCitizenHappinessHandler.getModifiers();
    }
}
