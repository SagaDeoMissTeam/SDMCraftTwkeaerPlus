package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.managers.interfaces;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ColonyProgressType;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.colony.managers.interfaces.IProgressManager;
import com.minecolonies.api.colony.workorders.IWorkOrder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/managers/interfaces/IProgressManager")
@NativeTypeRegistration(value = IProgressManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.managers.interfaces.IProgressManager")
public class ExpandIProgressManager {

   @ZenCodeType.Method
   public static void progressBuildingPlacement(IProgressManager iProgressManager, Block var1){
      iProgressManager.progressBuildingPlacement(var1);
   }
   @ZenCodeType.Method
   public static void progressCitizenSpawn(IProgressManager iProgressManager,int var1, int var2){
      iProgressManager.progressCitizenSpawn(var1,var2);
   }
   @ZenCodeType.Method
   public static void progressWorkOrderPlacement(IProgressManager iProgressManager,IWorkOrder var1){
      iProgressManager.progressWorkOrderPlacement(var1);
   }
   @ZenCodeType.Method
   public static void progressBuildBuilding(IProgressManager iProgressManager,IBuilding var1, int var2, int var3){
      iProgressManager.progressBuildBuilding(var1,var2,var3);
   }
   @ZenCodeType.Method
   public static void progressEmploy(IProgressManager iProgressManager,int var1){
      iProgressManager.progressEmploy(var1);
   }
   @ZenCodeType.Method
   public static void progressEmploymentModeChange(IProgressManager iProgressManager){
      iProgressManager.progressEmploymentModeChange();
   }
   @ZenCodeType.Method
   public static void trigger(IProgressManager iProgressManager,ColonyProgressType var1){
      iProgressManager.trigger(var1);
   }
   @ZenCodeType.Method
   public static void togglePrintProgress(IProgressManager iProgressManager){
      iProgressManager.togglePrintProgress();
   }

//   public static void read(IProgressManager iProgressManager, CompoundTag var1){
//
//   }
//
//   public static void write(IProgressManager iProgressManager, CompoundTag var1);
@ZenCodeType.Method
   public static boolean isPrintingProgress(IProgressManager iProgressManager){
      return iProgressManager.isPrintingProgress();
   }
}
