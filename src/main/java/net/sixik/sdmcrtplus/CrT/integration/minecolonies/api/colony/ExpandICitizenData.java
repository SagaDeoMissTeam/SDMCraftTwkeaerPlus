package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.CitizenNameFile;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.colony.jobs.IJob;
import com.minecolonies.api.entity.citizen.AbstractEntityCitizen;
import com.minecolonies.api.entity.citizen.VisibleCitizenStatus;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenHappinessHandler;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenMournHandler;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenSkillHandler;
import com.minecolonies.api.util.Tuple;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/ICitizenData")
@NativeTypeRegistration(value = ICitizenData.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.ICitizenData")
public class ExpandICitizenData {

    @ZenCodeType.Method
    public static void onRemoveBuilding(ICitizenData iCitizenData, IBuilding var1){
        iCitizenData.onRemoveBuilding(var1);
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IBuilding getHomeBuilding(ICitizenData iCitizenData){
        return iCitizenData.getHomeBuilding();
    }
    @ZenCodeType.Method
    public static void setHomeBuilding(ICitizenData iCitizenData,@ZenCodeType.Nullable IBuilding var1){
        iCitizenData.setHomeBuilding(var1);
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IBuilding getWorkBuilding(ICitizenData iCitizenData){
        return iCitizenData.getWorkBuilding();
    }
    @ZenCodeType.Method
    public static void setWorkBuilding(ICitizenData iCitizenData,@ZenCodeType.Nullable IBuilding var1){
        iCitizenData.setWorkBuilding(var1);
    }
    @ZenCodeType.Method
    public static IJob<?> getJob(ICitizenData iCitizenData){
        return iCitizenData.getJob();
    }
    @ZenCodeType.Method
    public static void setJob(ICitizenData iCitizenData, IJob<?> var1){
        iCitizenData.setJob(var1);
    }
//    @ZenCodeType.Method
//    public static <J extends IJob<?>> @ZenCodeType.Nullable J getJob(ICitizenData iCitizenData, Class<J> var1){
//        return iCitizenData.getJob(var1)
//    }
    @ZenCodeType.Method
    public static void setLastPosition(ICitizenData iCitizenData,BlockPos var1){
        iCitizenData.setLastPosition(var1);
    }
    @ZenCodeType.Method
    public static BlockPos getLastPosition(ICitizenData iCitizenData){
        return iCitizenData.getLastPosition();
    }
    @ZenCodeType.Method
    public static void setSaturation(ICitizenData iCitizenData,double var1){
        iCitizenData.setSaturation(var1);
    }
    @ZenCodeType.Method
    public static boolean isAsleep(ICitizenData iCitizenData){
        return iCitizenData.isAsleep();
    }
    @ZenCodeType.Method
    public static BlockPos getBedPos(ICitizenData iCitizenData){
        return iCitizenData.getBedPos();
    }
    @ZenCodeType.Method
    public static void setAsleep(ICitizenData iCitizenData,boolean var1){
        iCitizenData.setAsleep(var1);
    }
    @ZenCodeType.Method
    public static void setBedPos(ICitizenData iCitizenData,BlockPos var1){
        iCitizenData.setBedPos(var1);
    }
    @ZenCodeType.Method
    public static ICitizenHappinessHandler getCitizenHappinessHandler(ICitizenData iCitizenData){
        return iCitizenData.getCitizenHappinessHandler();
    }
    @ZenCodeType.Method
    public static ICitizenMournHandler getCitizenMournHandler(ICitizenData iCitizenData){
        return iCitizenData.getCitizenMournHandler();
    }
    @ZenCodeType.Method
    public static ICitizenSkillHandler getCitizenSkillHandler(ICitizenData iCitizenData){
        return iCitizenData.getCitizenSkillHandler();
    }
    @ZenCodeType.Method
    public static void scheduleRestart(ICitizenData iCitizenData,ServerPlayer var1){
        iCitizenData.scheduleRestart(var1);
    }
    @ZenCodeType.Method
    public static boolean shouldRestart(ICitizenData iCitizenData){
        return iCitizenData.shouldRestart();
    }
    @ZenCodeType.Method
    public static void restartDone(ICitizenData iCitizenData){
        iCitizenData.restartDone();
    }
    @ZenCodeType.Method
    public static void setIsChild(ICitizenData iCitizenData,boolean var1){
        iCitizenData.setIsChild(var1);
    }
    @ZenCodeType.Method
    public static boolean justAte(ICitizenData iCitizenData){
        return iCitizenData.justAte();
    }
    @ZenCodeType.Method
    public static void setJustAte(ICitizenData iCitizenData,boolean var1){
        iCitizenData.setJustAte(var1);
    }
    @ZenCodeType.Method
    public static boolean isIdleAtJob(ICitizenData iCitizenData){
        return iCitizenData.isIdleAtJob();
    }
    @ZenCodeType.Method
    public static void setIdleAtJob(ICitizenData iCitizenData,boolean var1){
        iCitizenData.setIdleAtJob(var1);
    }
    @ZenCodeType.Method
    public static Optional<AbstractEntityCitizen> getEntity(ICitizenData iCitizenData){
        return iCitizenData.getEntity();
    }
    @ZenCodeType.Method
    public static VisibleCitizenStatus getStatus(ICitizenData iCitizenData){
        return iCitizenData.getStatus();
    }
    @ZenCodeType.Method
    public static void setVisibleStatus(ICitizenData iCitizenData,VisibleCitizenStatus var1){
        iCitizenData.setVisibleStatus(var1);
    }
    @ZenCodeType.Method
    public static Random getRandom(ICitizenData iCitizenData){
        return iCitizenData.getRandom();
    }
    @ZenCodeType.Method
    public static void applyResearchEffects(ICitizenData iCitizenData){
        iCitizenData.applyResearchEffects();
    }
    @ZenCodeType.Method
    public static void onGoSleep(ICitizenData iCitizenData){
        iCitizenData.onGoSleep();
    }
    @ZenCodeType.Method
    public static void setNextRespawnPosition(ICitizenData iCitizenData,BlockPos var1){
        iCitizenData.setNextRespawnPosition(var1);
    }
    @ZenCodeType.Method
    public static boolean needsBetterFood(ICitizenData iCitizenData){
        return iCitizenData.needsBetterFood();
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable ICitizenData getPartner(ICitizenData iCitizenData){
        return iCitizenData.getPartner();
    }
    @ZenCodeType.Method
    public static List<Integer> getChildren(ICitizenData iCitizenData){
        return iCitizenData.getChildren();
    }
    @ZenCodeType.Method
    public static List<Integer> getSiblings(ICitizenData iCitizenData){
        return iCitizenData.getSiblings();
    }
    @ZenCodeType.Method
    public static Tuple<String, String> getParents(ICitizenData iCitizenData){
        return iCitizenData.getParents();
    }
    @ZenCodeType.Method
    public static void addSiblings(ICitizenData iCitizenData,Integer... var1){
        iCitizenData.addSiblings(var1);
    }
    @ZenCodeType.Method
    public static void addChildren(ICitizenData iCitizenData,Integer... var1){
        iCitizenData.addChildren(var1);
    }
    @ZenCodeType.Method
    public static void setPartner(ICitizenData iCitizenData,int var1){
        iCitizenData.setPartner(var1);
    }
    @ZenCodeType.Method
    public static void onDeath(ICitizenData iCitizenData,Integer var1){
        iCitizenData.onDeath(var1);
    }
    @ZenCodeType.Method
    public static void setParents(ICitizenData iCitizenData,String var1, String var2){
        iCitizenData.setParents(var1,var2);
    }
    @ZenCodeType.Method
    public static void generateName(ICitizenData iCitizenData,  Random var1, String var2, String var3, CitizenNameFile var4){
        iCitizenData.generateName(var1,var2,var3,var4);
    }
    @ZenCodeType.Method
    public static boolean isRelatedTo(ICitizenData iCitizenData, ICitizenData var1){
        return iCitizenData.isRelatedTo(var1);
    }
    @ZenCodeType.Method
    public static boolean doesLiveWith(ICitizenData iCitizenData, ICitizenData var1){
        return iCitizenData.doesLiveWith(var1);
    }
    @ZenCodeType.Method
    public static void setWorking(ICitizenData iCitizenData,boolean b) {
        iCitizenData.setWorking(b);
     }
    @ZenCodeType.Method
    public static boolean isWorking(ICitizenData iCitizenData) {
         return iCitizenData.isWorking();
    }
    @ZenCodeType.Method
    public static void onResurrect(ICitizenData iCitizenData){
        iCitizenData.onResurrect();
    }
    @ZenCodeType.Method
    public static boolean hasCustomTexture(ICitizenData iCitizenData) {
      return iCitizenData.hasCustomTexture();
    }
    @ZenCodeType.Method
    public static void setIdleDays(ICitizenData iCitizenData,int var1){
        iCitizenData.setIdleDays(var1);
    }
    @ZenCodeType.Method
    public static void onQuestCompletion(ICitizenData iCitizenData,ResourceLocation var1){
        iCitizenData.onQuestCompletion(var1);
    }
    @ZenCodeType.Method
    public static void onInteractionClosed(ICitizenData iCitizenData,Component var1, ServerPlayer var2){
        iCitizenData.onInteractionClosed(var1,var2);
    }
}
