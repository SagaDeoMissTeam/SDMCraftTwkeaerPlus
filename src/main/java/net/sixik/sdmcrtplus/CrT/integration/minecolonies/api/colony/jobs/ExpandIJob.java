package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.jobs;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.jobs.IJob;
import com.minecolonies.api.colony.jobs.registry.JobEntry;
import com.minecolonies.api.entity.citizen.AbstractEntityCitizen;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Set;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/jobs/IJob")
@NativeTypeRegistration(value = IJob.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.jobs.IJob")
public class ExpandIJob {
    @ZenCodeType.Method
    public static JobEntry getJobRegistryEntry(IJob<?> iJob){
        return iJob.getJobRegistryEntry();
    }
    @ZenCodeType.Method
    public static ResourceLocation getModel(IJob<?> iJob){
        return iJob.getModel();
    }
    @ZenCodeType.Method
    public static IColony getColony(IJob<?> iJob){
        return iJob.getColony();
    }

    @ZenCodeType.Method
    public static boolean hasCheckedForFoodToday(IJob<?> iJob){
        return iJob.hasCheckedForFoodToday();
    }
    @ZenCodeType.Method
    public static void setCheckedForFood(IJob<?> iJob){
        iJob.setCheckedForFood();
    }
    @ZenCodeType.Method
    public static String getNameTagDescription(IJob<?> iJob){
        return iJob.getNameTagDescription();
    }
    @ZenCodeType.Method
    public static void setNameTag(IJob<?> iJob,String var1){
        iJob.setNameTag(var1);
    }
    @ZenCodeType.Method
    public static void triggerDeathAchievement(IJob<?> iJob,DamageSource var1, AbstractEntityCitizen var2){
        iJob.triggerDeathAchievement(var1,var2);
    }
    @ZenCodeType.Method
    public static boolean onStackPickUp(IJob<?> iJob, ItemStack var1){
        return iJob.onStackPickUp(var1);
    }
    @ZenCodeType.Method
    public static void onLevelUp(IJob<?> iJob) {
        iJob.onLevelUp();
    }
    @ZenCodeType.Method
    public static void initEntityValues(IJob<?> iJob,AbstractEntityCitizen citizen) {
         iJob.initEntityValues(citizen);
    }
    @ZenCodeType.Method
    public static ICitizenData getCitizen(IJob<?> iJob){
        return iJob.getCitizen();
    }
    @ZenCodeType.Method
    public static void onWakeUp(IJob<?> iJob){
        iJob.onWakeUp();
    }
    @ZenCodeType.Method
    public static boolean canAIBeInterrupted(IJob<?> iJob){
        return iJob.canAIBeInterrupted();
    }
    @ZenCodeType.Method
    public static int getActionsDone(IJob<?> iJob){
        return iJob.getActionsDone();
    }
    @ZenCodeType.Method
    public static void incrementActionsDone(IJob<?> iJob){
        iJob.incrementActionsDone();
    }
    @ZenCodeType.Method
    public static void incrementActionsDone(IJob<?> iJob,int var1){
        iJob.incrementActionsDone(var1);
    }
    @ZenCodeType.Method
    public static void clearActionsDone(IJob<?> iJob){
        iJob.clearActionsDone();
    }

    @ZenCodeType.Method
    public static boolean isIdling(IJob<?> iJob){
        return iJob.isIdling();
    }
    @ZenCodeType.Method
    public static void resetAI(IJob<?> iJob){
        iJob.resetAI();
    }
    @ZenCodeType.Method
    public static boolean allowsAvoidance(IJob<?> iJob){
        return iJob.allowsAvoidance();
    }
    @ZenCodeType.Method
    public static int getDiseaseModifier(IJob<?> iJob){
        return iJob.getDiseaseModifier();
    }
    @ZenCodeType.Method
    public static void onRemoval(IJob<?> iJob){
        iJob.onRemoval();
    }
    @ZenCodeType.Method
    public static boolean ignoresDamage(IJob<?> iJob, DamageSource var1){
        return iJob.ignoresDamage(var1);
    }
    @ZenCodeType.Method
    public static boolean pickupSuccess(IJob<?> iJob, ItemStack var1){
        return iJob.pickupSuccess(var1);
    }
    @ZenCodeType.Method
    public static void processOfflineTime(IJob<?> iJob,long var1){
        iJob.processOfflineTime(var1);
    }
    @ZenCodeType.Method
    public static int getInactivityLimit(IJob<?> iJob) {
        return iJob.getInactivityLimit();
    }
    @ZenCodeType.Method
    public static int getIdleSeverity(IJob<?> iJob,boolean isDemand) {
        return iJob.getIdleSeverity(isDemand);
    }
    @ZenCodeType.Method
    public static  void triggerActivityChangeAction(IJob<?> iJob,boolean newState) {
        iJob.triggerActivityChangeAction(newState);
    }
    @ZenCodeType.Method
    public static void setRegistryEntry(IJob<?> iJob,JobEntry var1){
        iJob.setRegistryEntry(var1);
    }
    @ZenCodeType.Method
    public static boolean isGuard(IJob<?> iJob) {
        return iJob.isGuard();
    }
}
