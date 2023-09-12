package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen.citizenhandlers;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenSleepHandler;
import net.minecraft.core.BlockPos;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/citizenhandlers/ICitizenSleepHandler")
@NativeTypeRegistration(value = ICitizenSleepHandler.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.citizenhandlers.ICitizenSleepHandler")
public class ExpandICitizenSleepHandler {

    @ZenCodeType.Method
   public static boolean isAsleep(ICitizenSleepHandler iCitizenSleepHandler){
       return iCitizenSleepHandler.isAsleep();
   }
    @ZenCodeType.Method
   public static boolean trySleep(ICitizenSleepHandler iCitizenSleepHandler, BlockPos var1){
        return iCitizenSleepHandler.trySleep(var1);
    }
    @ZenCodeType.Method
   public static void onWakeUp(ICitizenSleepHandler iCitizenSleepHandler){
        iCitizenSleepHandler.onWakeUp();
    }
    @ZenCodeType.Method
   public static BlockPos findHomePos(ICitizenSleepHandler iCitizenSleepHandler){
        return iCitizenSleepHandler.findHomePos();
    }
    @ZenCodeType.Method
   public static BlockPos getBedLocation(ICitizenSleepHandler iCitizenSleepHandler){
        return iCitizenSleepHandler.getBedLocation();
    }
    @ZenCodeType.Method
   public static boolean shouldGoSleep(ICitizenSleepHandler iCitizenSleepHandler){
        return iCitizenSleepHandler.shouldGoSleep();
    }
}
