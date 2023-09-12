package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen.citizenhandlers;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.jobs.IJob;
import com.minecolonies.api.entity.ai.ITickingStateAI;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenItemHandler;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenJobHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/citizenhandlers/ICitizenJobHandler")
@NativeTypeRegistration(value = ICitizenJobHandler.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.citizenhandlers.ICitizenJobHandler")
public class ExpandICitizenJobHandler {

    @ZenCodeType.Method
   public static void setModelDependingOnJob(ICitizenJobHandler iCitizenJobHandler, @ZenCodeType.Nullable IJob<?> var1){
        iCitizenJobHandler.setModelDependingOnJob(var1);
    }
    @ZenCodeType.Method
   public static void onJobChanged(ICitizenJobHandler iCitizenJobHandler,@ZenCodeType.Nullable IJob<?> var1){
        iCitizenJobHandler.onJobChanged(var1);
    }
    @ZenCodeType.Method
   public static @ZenCodeType.Nullable IJob<?> getColonyJob(ICitizenJobHandler iCitizenJobHandler){
        return iCitizenJobHandler.getColonyJob();
    }
    @ZenCodeType.Method
   public static boolean shouldRunAvoidance(ICitizenJobHandler iCitizenJobHandler){
        return iCitizenJobHandler.shouldRunAvoidance();
    }
//    @ZenCodeType.Method
//   public static void setWorkAI(ICitizenJobHandler iCitizenJobHandler,ITickingStateAI var1){
//        iCitizenJobHandler.setWorkAI(var1);
//    }
//    @ZenCodeType.Method
//   public static ITickingStateAI getWorkAI(ICitizenJobHandler iCitizenJobHandler){
//        iCitizenJobHandler
//    }
}
