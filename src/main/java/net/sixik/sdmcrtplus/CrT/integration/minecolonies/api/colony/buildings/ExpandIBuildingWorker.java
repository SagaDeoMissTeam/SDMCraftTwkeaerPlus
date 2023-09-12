package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.buildings.HiringMode;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.colony.buildings.IBuildingWorker;
import com.minecolonies.api.colony.jobs.IJob;
import com.minecolonies.api.entity.citizen.Skill;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/IBuildingWorker")
@NativeTypeRegistration(value = IBuildingWorker.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.IBuildingWorker")
public class ExpandIBuildingWorker {

    @ZenCodeType.Method
   public static IJob<?> createJob(IBuildingWorker ibw,ICitizenData var1){
       return ibw.createJob(var1);
   }
    @ZenCodeType.Method
   public static boolean isItemStackInRequest(IBuildingWorker ibw,@ZenCodeType.Nullable ItemStack var1){
        return ibw.isItemStackInRequest(var1);
    }
    @ZenCodeType.Method
   public static void setHiringMode(IBuildingWorker ibw,HiringMode var1){
        ibw.setHiringMode(var1);
   }
    @ZenCodeType.Method
   public static HiringMode getHiringMode(IBuildingWorker ibw){
        return ibw.getHiringMode();
   }
    @ZenCodeType.Method
   public static List<IItemHandler> getHandlers(IBuildingWorker ibw){
        return ibw.getHandlers();
   }
    @ZenCodeType.Method
   public static boolean assignCitizen(IBuildingWorker ibw,ICitizenData var1){
        return ibw.assignCitizen(var1);
   }
    @ZenCodeType.Method
   public static  String getJobName(IBuildingWorker ibw){
        return ibw.getJobName();
   }
    @ZenCodeType.Method
   public static int getMaxToolLevel(IBuildingWorker ibw){
        return ibw.getMaxToolLevel();
   }
    @ZenCodeType.Method
   public static boolean canWorkDuringTheRain(IBuildingWorker ibw){
        return ibw.canWorkDuringTheRain();
   }
    @ZenCodeType.Method
   public static  Skill getPrimarySkill(IBuildingWorker ibw){
        return ibw.getPrimarySkill();
   }
    @ZenCodeType.Method
   public static  Skill getSecondarySkill(IBuildingWorker ibw){
        return ibw.getSecondarySkill();
   }
    @ZenCodeType.Method
   public static  Skill getRecipeImprovementSkill(IBuildingWorker ibw){
        return ibw.getRecipeImprovementSkill();
   }
    @ZenCodeType.Method
   public static boolean canEat(IBuildingWorker ibw,ItemStack var1){
        return ibw.canEat(var1);
   }
}
