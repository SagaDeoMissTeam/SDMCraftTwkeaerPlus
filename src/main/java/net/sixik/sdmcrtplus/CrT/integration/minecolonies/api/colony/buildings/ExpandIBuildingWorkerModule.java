package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.buildings.IBuildingWorkerModule;
import com.minecolonies.api.colony.jobs.IJob;
import com.minecolonies.api.colony.jobs.registry.JobEntry;
import com.minecolonies.api.entity.citizen.Skill;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/IBuildingWorkerModule")
@NativeTypeRegistration(value = IBuildingWorkerModule.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.IBuildingWorkerModule")
public class ExpandIBuildingWorkerModule {

    @ZenCodeType.Method
   public static IJob<?> createJob(IBuildingWorkerModule iBuildingWorkerModule,ICitizenData var1){
        return iBuildingWorkerModule.createJob(var1);
    }
    @ZenCodeType.Method
   public static boolean canWorkDuringTheRain(IBuildingWorkerModule iBuildingWorkerModule){
        return iBuildingWorkerModule.canWorkDuringTheRain();
    }
    @ZenCodeType.Method
   public static Skill getPrimarySkill(IBuildingWorkerModule iBuildingWorkerModule){
        return iBuildingWorkerModule.getPrimarySkill();
    }
    @ZenCodeType.Method
   public static Skill getSecondarySkill(IBuildingWorkerModule iBuildingWorkerModule){
        return iBuildingWorkerModule.getSecondarySkill();
    }
    @ZenCodeType.Method
   public static JobEntry getJobEntry(IBuildingWorkerModule iBuildingWorkerModule){
        return iBuildingWorkerModule.getJobEntry();
    }
}
