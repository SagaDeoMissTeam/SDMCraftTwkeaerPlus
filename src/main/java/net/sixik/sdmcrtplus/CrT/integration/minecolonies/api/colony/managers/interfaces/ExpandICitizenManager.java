package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.managers.interfaces;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.managers.interfaces.ICitizenManager;
import com.minecolonies.api.entity.citizen.happiness.IHappinessModifier;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/managers/interfaces/ICitizen")
@NativeTypeRegistration(value = ICitizenManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.managers.interfaces.ICitizen")
public class ExpandICitizenManager {

    @ZenCodeType.Method
    public static ICitizenData spawnOrCreateCitizen(ICitizenManager iCitizenManager, ICitizenData data, Level world) {
        return iCitizenManager.spawnOrCreateCitizen(data,world);
    }
    @ZenCodeType.Method
    public static ICitizenData spawnOrCreateCitizen(ICitizenManager iCitizenManager,ICitizenData data, Level world, BlockPos spawnPos) {
        return iCitizenManager.spawnOrCreateCitizen(data,world,spawnPos);
    }
    @ZenCodeType.Method
   public static void spawnOrCreateCitizen(ICitizenManager iCitizenManager){
        iCitizenManager.spawnOrCreateCitizen();
   }
    @ZenCodeType.Method
   public static @ZenCodeType.Nullable ICitizenData getJoblessCitizen(ICitizenManager iCitizenManager){
        return iCitizenManager.getJoblessCitizen();
   }
    @ZenCodeType.Method
   public static void calculateMaxCitizens(ICitizenManager iCitizenManager){
       iCitizenManager.calculateMaxCitizens();
   }
    @ZenCodeType.Method
   public static ICitizenData createAndRegisterCivilianData(ICitizenManager iCitizenManager){
       return iCitizenManager.createAndRegisterCivilianData();
   }
    @ZenCodeType.Method
    public static List<ICitizenData> getCitizens(ICitizenManager iCitizenManager) {
        return iCitizenManager.getCitizens();
    }
    @ZenCodeType.Method
    public static int getMaxCitizens(ICitizenManager iCitizenManager){
        return iCitizenManager.getMaxCitizens();
    }
    @ZenCodeType.Method
   public static int getPotentialMaxCitizens(ICitizenManager iCitizenManager){
        return iCitizenManager.getPotentialMaxCitizens();
   }
    @ZenCodeType.Method
   public static double maxCitizensFromResearch(ICitizenManager iCitizenManager){
        return iCitizenManager.maxCitizensFromResearch();
   }
    @ZenCodeType.Method
   public static int getCurrentCitizenCount(ICitizenManager iCitizenManager){
        return iCitizenManager.getCurrentCitizenCount();
   }
    @ZenCodeType.Method
   public static void setMaxCitizens(ICitizenManager iCitizenManager, int var1){
        iCitizenManager.setMaxCitizens(var1);
   }
    @ZenCodeType.Method
   public static void setPotentialMaxCitizens(ICitizenManager iCitizenManager,int var1){
       iCitizenManager.setPotentialMaxCitizens(var1);
   }
    @ZenCodeType.Method
   public static void checkCitizensForHappiness(ICitizenManager iCitizenManager){
       iCitizenManager.checkCitizensForHappiness();
   }
    @ZenCodeType.Method
   public static boolean tickCitizenData(ICitizenManager iCitizenManager){
        return iCitizenManager.tickCitizenData();
   }
    @ZenCodeType.Method
   public static void updateCitizenMourn(ICitizenManager iCitizenManager, ICitizenData var1, boolean var2){
       iCitizenManager.updateCitizenMourn(var1,var2);
   }
    @ZenCodeType.Method
   public static void updateCitizenSleep(ICitizenManager iCitizenManager, boolean var1){
       iCitizenManager.updateCitizenSleep(var1);
   }
    @ZenCodeType.Method
   public static ICitizenData getRandomCitizen(ICitizenManager iCitizenManager){
        return iCitizenManager.getRandomCitizen();
   }
    @ZenCodeType.Method
   public static void injectModifier(ICitizenManager iCitizenManager, IHappinessModifier var1){
       iCitizenManager.injectModifier(var1);
   }
    @ZenCodeType.Method
   public static void onCitizenSleep(ICitizenManager iCitizenManager){
       iCitizenManager.onCitizenSleep();
   }
    @ZenCodeType.Method
   public static ICitizenData getCivilian(ICitizenManager iCitizenManager, int var1){
        return iCitizenManager.getCivilian(var1);
   }
    @ZenCodeType.Method
   public static void onWakeUp(ICitizenManager iCitizenManager){
       iCitizenManager.onWakeUp();
   }

   @ZenCodeType.Method
    public static ICitizenData resurrectCivilianData(ICitizenManager iCitizenManager, CompoundTag var1, boolean var2, Level var3, BlockPos var4){
        return iCitizenManager.resurrectCivilianData(var1,var2,var3,var4);
   }
}
