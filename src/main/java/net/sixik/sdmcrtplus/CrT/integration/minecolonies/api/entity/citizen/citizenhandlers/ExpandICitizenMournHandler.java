package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen.citizenhandlers;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenMournHandler;
import net.minecraft.nbt.CompoundTag;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Set;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/citizenhandlers/ICitizenMournHandler")
@NativeTypeRegistration(value = ICitizenMournHandler.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.citizenhandlers.ICitizenMournHandler")
public class ExpandICitizenMournHandler {

    @ZenCodeType.Method
   public static void addDeceasedCitizen(ICitizenMournHandler iCitizenMournHandler, String var1){
       iCitizenMournHandler.addDeceasedCitizen(var1);
   }
    @ZenCodeType.Method
   public static Set<String> getDeceasedCitizens(ICitizenMournHandler iCitizenMournHandler){
        return iCitizenMournHandler.getDeceasedCitizens();
   }
    @ZenCodeType.Method
   public static void removeDeceasedCitizen(ICitizenMournHandler iCitizenMournHandler,String var1){
       iCitizenMournHandler.removeDeceasedCitizen(var1);
   }
    @ZenCodeType.Method
   public static void clearDeceasedCitizen(ICitizenMournHandler iCitizenMournHandler){
       iCitizenMournHandler.clearDeceasedCitizen();
   }
    @ZenCodeType.Method
   public static boolean shouldMourn(ICitizenMournHandler iCitizenMournHandler){
       return iCitizenMournHandler.shouldMourn();
   }
    @ZenCodeType.Method
   public static boolean isMourning(ICitizenMournHandler iCitizenMournHandler){
       return iCitizenMournHandler.isMourning();
   }
    @ZenCodeType.Method
   public static void setMourning(ICitizenMournHandler iCitizenMournHandler,boolean var1){
       iCitizenMournHandler.setMourning(var1);
   }

}
