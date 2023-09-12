package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.workorders;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.workorders.IWorkManager;
import com.minecolonies.api.colony.workorders.IWorkOrder;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/workorders/IWorkManager")
@NativeTypeRegistration(value = IWorkManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.workorders.IWorkManager")
public class ExpandIWorkManager {

    @ZenCodeType.Method
    public static void removeWorkOrder(IWorkManager iWorkManager, IWorkOrder var1){
        iWorkManager.removeWorkOrder(var1);
    }

    @ZenCodeType.Method
    public static void removeWorkOrder(IWorkManager iWorkManager,int var1){
        iWorkManager.removeWorkOrder(var1);
    }

    @ZenCodeType.Method
    public static <W extends IWorkOrder> @ZenCodeType.Nullable W getWorkOrder(IWorkManager iWorkManager, int var1, Class<W> var2){
        return iWorkManager.getWorkOrder(var1,var2);
    }

    @ZenCodeType.Method
    public static IWorkOrder getWorkOrder(IWorkManager iWorkManager,int var1){
        return iWorkManager.getWorkOrder(var1);
    }

    @ZenCodeType.Method
    public static<W extends IWorkOrder> @ZenCodeType.Nullable W getUnassignedWorkOrder(IWorkManager iWorkManager, Class<W> var1){
        return iWorkManager.getUnassignedWorkOrder(var1);
    }

    @ZenCodeType.Method
    public static <W extends IWorkOrder> List<W> getWorkOrdersOfType(IWorkManager iWorkManager, Class<W> var1){
        return iWorkManager.getWorkOrdersOfType(var1);
    }

    @ZenCodeType.Method
    public static  Map<Integer, IWorkOrder> getWorkOrders(IWorkManager iWorkManager){
        return iWorkManager.getWorkOrders();
    }

    @ZenCodeType.Method
    public static void clearWorkForCitizen(IWorkManager iWorkManager, ICitizenData var1){
        iWorkManager.clearWorkForCitizen(var1);
    }

    @ZenCodeType.Method
    public static void addWorkOrder(IWorkManager iWorkManager, IWorkOrder var1, boolean var2){
        iWorkManager.addWorkOrder(var1,var2);
    }

    @ZenCodeType.Method
    public static void onColonyTick(IWorkManager iWorkManager, IColony var1){
        iWorkManager.onColonyTick(var1);
    }

    @ZenCodeType.Method
    public static <W extends IWorkOrder> List<W> getOrderedList(IWorkManager iWorkManager, Class<W> var1, BlockPos var2){
        return iWorkManager.getOrderedList(var1,var2);
    }

    @ZenCodeType.Method
    public static List<IWorkOrder> getOrderedList(IWorkManager iWorkManager, Predicate<IWorkOrder> var1, BlockPos var2){
        return iWorkManager.getOrderedList(var1,var2);
    }
    @ZenCodeType.Method
    public static boolean isDirty(IWorkManager iWorkManager){
        return iWorkManager.isDirty();
    }

    @ZenCodeType.Method
    public static void setDirty(IWorkManager iWorkManager,boolean var1){
        iWorkManager.setDirty(var1);
    }

    @ZenCodeType.Method
    public static IColony getColony(IWorkManager iWorkManager){
        return iWorkManager.getColony();
    }
}
