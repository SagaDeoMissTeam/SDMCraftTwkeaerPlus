package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.workorders;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.jobs.IJob;
import com.minecolonies.api.colony.workorders.IWorkManager;
import com.minecolonies.api.colony.workorders.IWorkOrder;
import com.minecolonies.api.colony.workorders.WorkOrderType;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/workorders/IWorkOrder")
@NativeTypeRegistration(value = IWorkOrder.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.workorders.IWorkOrder")
public class ExpandIWorkOrder {

    @ZenCodeType.Method
    public static int getID(IWorkOrder iWorkOrder){
        return iWorkOrder.getID();
    }
    @ZenCodeType.Method
    public static void setID(IWorkOrder iWorkOrder,int var1){
        iWorkOrder.setID(var1);
    }
    @ZenCodeType.Method
    public static int getPriority(IWorkOrder iWorkOrder){
        return iWorkOrder.getPriority();
    }
    @ZenCodeType.Method
    public static void setPriority(IWorkOrder iWorkOrder,int var1){
        iWorkOrder.setPriority(var1);
    }
    @ZenCodeType.Method
    public static String getStructurePath(IWorkOrder iWorkOrder){
        return iWorkOrder.getStructurePath();
    }
    @ZenCodeType.Method
    public static String getStructurePack(IWorkOrder iWorkOrder){
        return iWorkOrder.getStructurePack();
    }
    @ZenCodeType.Method
    public static int getCurrentLevel(IWorkOrder iWorkOrder){
        return iWorkOrder.getCurrentLevel();
    }
    @ZenCodeType.Method
    public static int getTargetLevel(IWorkOrder iWorkOrder){
        return iWorkOrder.getTargetLevel();
    }
    @ZenCodeType.Method
    public static int getAmountOfResources(IWorkOrder iWorkOrder){
        return iWorkOrder.getAmountOfResources();
    }
    @ZenCodeType.Method
    public static void setAmountOfResources(IWorkOrder iWorkOrder,int var1){
        iWorkOrder.setAmountOfResources(var1);
    }
    @ZenCodeType.Method
    public static String getIteratorType(IWorkOrder iWorkOrder){
        return iWorkOrder.getIteratorType();
    }
    @ZenCodeType.Method
    public static void setIteratorType(IWorkOrder iWorkOrder,String var1){
        iWorkOrder.setIteratorType(var1);
    }
    @ZenCodeType.Method
    public static boolean isCleared(IWorkOrder iWorkOrder){
        return iWorkOrder.isCleared();
    }
    @ZenCodeType.Method
    public static void setCleared(IWorkOrder iWorkOrder,boolean var1){
        iWorkOrder.setCleared(var1);
    }
    @ZenCodeType.Method
    public static boolean isRequested(IWorkOrder iWorkOrder){
        return iWorkOrder.isRequested();
    }
    @ZenCodeType.Method
    public static void setRequested(IWorkOrder iWorkOrder,boolean var1){
        iWorkOrder.setRequested(var1);
    }
    @ZenCodeType.Method
    public static boolean isDirty(IWorkOrder iWorkOrder){
        return iWorkOrder.isDirty();
    }
    @ZenCodeType.Method
    public static void resetChange(IWorkOrder iWorkOrder){
        iWorkOrder.resetChange();
    }
    @ZenCodeType.Method
    public static String getTranslationKey(IWorkOrder iWorkOrder){
        return iWorkOrder.getTranslationKey();
    }
    @ZenCodeType.Method
    public static WorkOrderType getWorkOrderType(IWorkOrder iWorkOrder){
        return iWorkOrder.getWorkOrderType();
    }
    @ZenCodeType.Method
    public static BlockPos getLocation(IWorkOrder iWorkOrder){
        return iWorkOrder.getLocation();
    }
    @ZenCodeType.Method
    public static int getRotation(IWorkOrder iWorkOrder){
        return iWorkOrder.getRotation();
    }
    @ZenCodeType.Method
    public static boolean isMirrored(IWorkOrder iWorkOrder){
        return iWorkOrder.isMirrored();
    }
    @ZenCodeType.Method
    public static boolean isClaimed(IWorkOrder iWorkOrder){
        return iWorkOrder.isClaimed();
    }
    @ZenCodeType.Method
    public static boolean isClaimedBy(IWorkOrder iWorkOrder, ICitizenData var1){
        return iWorkOrder.isClaimedBy(var1);
    }
    @ZenCodeType.Method
    public static BlockPos getClaimedBy(IWorkOrder iWorkOrder){
        return iWorkOrder.getClaimedBy();
    }
    @ZenCodeType.Method
    public static void setClaimedBy(IWorkOrder iWorkOrder,@ZenCodeType.Nullable ICitizenData var1){
        iWorkOrder.setClaimedBy(var1);
    }
    @ZenCodeType.Method
    public static void setClaimedBy(IWorkOrder iWorkOrder,BlockPos var1){
        iWorkOrder.setClaimedBy(var1);
    }
    @ZenCodeType.Method
    public static void clearClaimedBy(IWorkOrder iWorkOrder){
        iWorkOrder.clearClaimedBy();
    }
    @ZenCodeType.Method
    public static Component getDisplayName(IWorkOrder iWorkOrder){
        return iWorkOrder.getDisplayName();
    }
    @ZenCodeType.Method
    public static boolean isValid(IWorkOrder iWorkOrder,IColony var1){
        return iWorkOrder.isValid(var1);
    }

    @ZenCodeType.Method
    public static void onAdded(IWorkOrder iWorkOrder,IColony var1, boolean var2){
        iWorkOrder.onAdded(var1,var2);
    }
    @ZenCodeType.Method
    public static void onCompleted(IWorkOrder iWorkOrder,IColony var1, ICitizenData var2){
        iWorkOrder.onCompleted(var1,var2);
    }
    @ZenCodeType.Method
    public static void onRemoved(IWorkOrder iWorkOrder,IColony var1){
        iWorkOrder.onRemoved(var1);
    }
    @ZenCodeType.Method
    public static boolean canBeResolved(IWorkOrder iWorkOrder,IColony var1, int var2){
        return iWorkOrder.canBeResolved(var1,var2);
    }
    @ZenCodeType.Method
    public static boolean tooFarFromAnyBuilder(IWorkOrder iWorkOrder,IColony var1, int var2){
        return iWorkOrder.tooFarFromAnyBuilder(var1,var2);
    }
    @ZenCodeType.Method
    public static boolean canBuild(IWorkOrder iWorkOrder, ICitizenData var1){
        return iWorkOrder.canBuild(var1);
    }
    @ZenCodeType.Method
    public static boolean canBeMadeBy(IWorkOrder iWorkOrder, IJob<?> var1){
        return iWorkOrder.canBeMadeBy(var1);
    }
    @ZenCodeType.Method
    public static String getFileName(IWorkOrder iWorkOrder) {
        return iWorkOrder.getFileName();
    }
}
