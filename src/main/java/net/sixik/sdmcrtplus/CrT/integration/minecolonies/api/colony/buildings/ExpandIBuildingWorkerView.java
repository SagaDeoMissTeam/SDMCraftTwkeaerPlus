package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.buildings.HiringMode;
import com.minecolonies.api.colony.buildings.IBuildingWorkerModule;
import com.minecolonies.api.colony.buildings.IBuildingWorkerView;
import com.minecolonies.api.entity.citizen.Skill;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/IBuildingWorkerView")
@NativeTypeRegistration(value = IBuildingWorkerView.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.IBuildingWorkerView")
public class ExpandIBuildingWorkerView {
    @ZenCodeType.Method
   public static List<Integer> getWorkerId(IBuildingWorkerView iBuildingWorkerView){
       return iBuildingWorkerView.getWorkerId();
   }
    @ZenCodeType.Method
   public static void addWorkerId(IBuildingWorkerView iBuildingWorkerView,int var1){
       iBuildingWorkerView.addWorkerId(var1);
   }
    @ZenCodeType.Method
   public static Skill getPrimarySkill(IBuildingWorkerView iBuildingWorkerView){
       return iBuildingWorkerView.getPrimarySkill();
   }
    @ZenCodeType.Method
   public static Skill getSecondarySkill(IBuildingWorkerView iBuildingWorkerView){
       return iBuildingWorkerView.getSecondarySkill();
   }
    @ZenCodeType.Method
   public static void removeWorkerId(IBuildingWorkerView iBuildingWorkerView,int var1){
       iBuildingWorkerView.removeWorkerId(var1);
   }
    @ZenCodeType.Method
   public static boolean hasEnoughWorkers(IBuildingWorkerView iBuildingWorkerView){
       return iBuildingWorkerView.hasEnoughWorkers();
   }
    @ZenCodeType.Method
   public static void setHiringMode(IBuildingWorkerView iBuildingWorkerView,HiringMode var1){
       iBuildingWorkerView.setHiringMode(var1);
   }
    @ZenCodeType.Method
   public static String getJobName(IBuildingWorkerView iBuildingWorkerView){
       return iBuildingWorkerView.getJobName();
   }

   @ZenCodeType.Method
   public static String getJobDisplayName(IBuildingWorkerView iBuildingWorkerView){
       return iBuildingWorkerView.getJobDisplayName();
   }
}
