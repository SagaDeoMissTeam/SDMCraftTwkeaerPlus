package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.managers.interfaces;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.managers.interfaces.IGraveManager;
import com.minecolonies.api.colony.managers.interfaces.IRaiderManager;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/managers/interfaces/IRaiderManager")
@NativeTypeRegistration(value = IRaiderManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.managers.interfaces.IRaiderManager")
public class ExpandIRaiderManager {
    @ZenCodeType.Method
   public static boolean canHaveRaiderEvents(IRaiderManager iRaiderManager){
       return iRaiderManager.canRaid();
   }
    @ZenCodeType.Method
   public static boolean willRaidTonight(IRaiderManager iRaiderManager){
       return iRaiderManager.willRaidTonight();
   }
    @ZenCodeType.Method
   public static void setCanHaveRaiderEvents(IRaiderManager iRaiderManager,boolean var1){
       iRaiderManager.setCanHaveRaiderEvents(var1);
   }
    @ZenCodeType.Method
   public static void addRaiderSpawnPoint(IRaiderManager iRaiderManager,BlockPos var1){
       iRaiderManager.addRaiderSpawnPoint(var1);
   }
    @ZenCodeType.Method
   public static void setRaidNextNight(IRaiderManager iRaiderManager,boolean var1){
       iRaiderManager.setRaidNextNight(var1);
   }
    @ZenCodeType.Method
   public static void setRaidNextNight(IRaiderManager iRaiderManager,boolean var1, String var2){
       iRaiderManager.setRaidNextNight(var1,var2);
   }
    @ZenCodeType.Method
   public static boolean areSpiesEnabled(IRaiderManager iRaiderManager){
       return iRaiderManager.areSpiesEnabled();
   }
    @ZenCodeType.Method
   public static void setSpiesEnabled(IRaiderManager iRaiderManager,boolean var1){
       iRaiderManager.setSpiesEnabled(var1);
   }
    @ZenCodeType.Method
   public static void raiderEvent(IRaiderManager iRaiderManager){
       iRaiderManager.raiderEvent();
   }
    @ZenCodeType.Method
   public static void raiderEvent(IRaiderManager iRaiderManager,String var1){
       iRaiderManager.raiderEvent(var1);
   }
    @ZenCodeType.Method
   public static BlockPos calculateSpawnLocation(IRaiderManager iRaiderManager){
       return iRaiderManager.calculateSpawnLocation();
   }
    @ZenCodeType.Method
   public static List<BlockPos> getLastSpawnPoints(IRaiderManager iRaiderManager){
       return iRaiderManager.getLastSpawnPoints();
   }
    @ZenCodeType.Method
   public static int calculateRaiderAmount(IRaiderManager iRaiderManager,int var1){
       return iRaiderManager.calculateRaiderAmount(var1);
   }
    @ZenCodeType.Method
   public static boolean isRaided(IRaiderManager iRaiderManager){
       return iRaiderManager.isRaided();
   }
    @ZenCodeType.Method
   public static void onNightFall(IRaiderManager iRaiderManager){
       iRaiderManager.onNightFall();
   }
    @ZenCodeType.Method
   public static int getNightsSinceLastRaid(IRaiderManager iRaiderManager){
       return iRaiderManager.getNightsSinceLastRaid();
   }
    @ZenCodeType.Method
   public static void setNightsSinceLastRaid(IRaiderManager iRaiderManager,int var1){
       iRaiderManager.setNightsSinceLastRaid(var1);
   }
    @ZenCodeType.Method
   public static boolean canRaid(IRaiderManager iRaiderManager){
       return iRaiderManager.canRaid();
   }
    @ZenCodeType.Method
   public static int getColonyRaidLevel(IRaiderManager iRaiderManager){
       return iRaiderManager.getColonyRaidLevel();
   }
    @ZenCodeType.Method
   public static BlockPos getRandomBuilding(IRaiderManager iRaiderManager){
       return iRaiderManager.getRandomBuilding();
   }
    @ZenCodeType.Method
   public static double getRaidDifficultyModifier(IRaiderManager iRaiderManager){
       return iRaiderManager.getRaidDifficultyModifier();
   }
    @ZenCodeType.Method
   public static void onLostCitizen(IRaiderManager iRaiderManager,ICitizenData var1){
       iRaiderManager.onLostCitizen(var1);
   }
@ZenCodeType.Method
   public static int getLostCitizen(IRaiderManager iRaiderManager){
       return iRaiderManager.getLostCitizen();
   }


    @ZenCodeType.Method
   public static void write(IRaiderManager iRaiderManager, CompoundTag var1){
        iRaiderManager.write(var1);
   }

   @ZenCodeType.Method
   public static void read(IRaiderManager iRaiderManager, CompoundTag var1){
        iRaiderManager.read(var1);
   }
}
