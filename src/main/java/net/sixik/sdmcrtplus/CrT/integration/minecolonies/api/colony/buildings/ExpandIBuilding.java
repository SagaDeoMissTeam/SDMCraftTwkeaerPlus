package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.google.common.reflect.TypeToken;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.api.colony.jobs.registry.JobEntry;
import com.minecolonies.api.colony.requestsystem.request.IRequest;
import com.minecolonies.api.colony.requestsystem.requestable.IDeliverable;
import com.minecolonies.api.colony.requestsystem.requester.IRequester;
import com.minecolonies.api.colony.requestsystem.resolver.IRequestResolver;
import com.minecolonies.api.colony.requestsystem.token.IToken;
import com.minecolonies.api.crafting.ItemStorage;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Tuple;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.items.IItemHandler;
import org.openzen.zencode.java.ZenCodeType;

import java.util.*;
import java.util.function.Predicate;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/IBuilding")
@NativeTypeRegistration(value = IBuilding.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.IBuilding")
public class ExpandIBuilding {

    @ZenCodeType.Method
    public static String getCustomName(IBuilding iBuilding){
        return iBuilding.getCustomName();
    }
    @ZenCodeType.Method
    public static String getBuildingDisplayName(IBuilding iBuilding){
        return iBuilding.getBuildingDisplayName();
    }
    @ZenCodeType.Method
    public static  void onWakeUp(IBuilding iBuilding) {
        iBuilding.onWakeUp();
    }
    @ZenCodeType.Method
    public static void onCleanUp(IBuilding iBuilding, ICitizenData var1){
        iBuilding.onCleanUp(var1);
    }
    @ZenCodeType.Method
    public static void onRestart(IBuilding iBuilding, ICitizenData var1){
        iBuilding.onRestart(var1);
    }
    @ZenCodeType.Method
    public static void onPlacement(IBuilding iBuilding){
        iBuilding.onPlacement();
    }
    @ZenCodeType.Method
    public static  void onPlayerEnterNearby(IBuilding iBuilding, Player player) {
        iBuilding.onPlayerEnterNearby(player);
    }
    @ZenCodeType.Method
    public static void onPlayerEnterBuilding(IBuilding iBuilding, Player player) {
        iBuilding.onPlayerEnterBuilding(player);
    }
    @ZenCodeType.Method
    public static boolean isMatchingBlock(IBuilding iBuilding, Block var1){
        return iBuilding.isMatchingBlock(var1);
    }
    @ZenCodeType.Method
    public static void destroy(IBuilding iBuilding){
        iBuilding.destroy();
    }
    @ZenCodeType.Method
    public static void onDestroyed(IBuilding iBuilding){
        iBuilding.onDestroyed();
    }
    @ZenCodeType.Method
    public static IColony getColony(IBuilding iBuilding){
        return iBuilding.getColony();
    }
    @ZenCodeType.Method
    public static boolean canBeBuiltByBuilder(IBuilding iBuilding, int var1){
        return iBuilding.canBeBuiltByBuilder(var1);
    }
    @ZenCodeType.Method
    public static void markDirty(IBuilding iBuilding){
        iBuilding.markDirty();
    }
    @ZenCodeType.Method
    public static boolean hasWorkOrder(IBuilding iBuilding){
        return iBuilding.hasWorkOrder();
    }
    @ZenCodeType.Method
    public static void removeWorkOrder(IBuilding iBuilding){
        iBuilding.hasWorkOrder();
    }
    @ZenCodeType.Method
    public static int getClaimRadius(IBuilding iBuilding, int var1){
        return iBuilding.getClaimRadius(var1);
    }
    @ZenCodeType.Method
    public static void setCustomBuildingName(IBuilding iBuilding, String var1){
        iBuilding.setCustomBuildingName(var1);
    }
    @ZenCodeType.Method
    public static boolean canBeGathered(IBuilding iBuilding){
        return iBuilding.canBeGathered();
    }
    @ZenCodeType.Method
    public static void requestUpgrade(IBuilding iBuilding, Player var1, BlockPos var2){
        iBuilding.requestUpgrade(var1,var2);
    }
    @ZenCodeType.Method
    public static void requestRemoval(IBuilding iBuilding, Player var1, BlockPos var2){
        iBuilding.requestRemoval(var1,var2);
    }
    @ZenCodeType.Method
    public static void requestRepair(IBuilding iBuilding, BlockPos var1){
        iBuilding.requestRepair(var1);
    }
    @ZenCodeType.Method
    public static boolean isBuilt(IBuilding iBuilding){
        return iBuilding.isBuilt();
    }
    @ZenCodeType.Method
    public static void deconstruct(IBuilding iBuilding){
        iBuilding.deconstruct();
    }
    @ZenCodeType.Method
    public static void onUpgradeComplete(IBuilding iBuilding, int var1){
        iBuilding.onUpgradeComplete(var1);
    }
    @ZenCodeType.Method
    public static boolean isGuardBuildingNear(IBuilding iBuilding){
        return iBuilding.isGuardBuildingNear();
    }
    @ZenCodeType.Method
    public static void resetGuardBuildingNear(IBuilding iBuilding){
        iBuilding.resetGuardBuildingNear();
    }
    @ZenCodeType.Method
    public static int buildingRequiresCertainAmountOfItem(IBuilding iBuilding, ItemStack var1, List<ItemStorage> var2, boolean var3, @ZenCodeType.Nullable JobEntry var4){
        return iBuilding.buildingRequiresCertainAmountOfItem(var1,var2,var3,var4);
    }
    @ZenCodeType.Method
    public static  int buildingRequiresCertainAmountOfItem(IBuilding iBuilding ,ItemStack stack, List<ItemStorage> localAlreadyKept, boolean inventory) {
        return iBuilding.buildingRequiresCertainAmountOfItem(stack,localAlreadyKept,inventory);
    }
    @ZenCodeType.Method
   public static Map<Predicate<ItemStack>, Tuple<Integer, Boolean>> getRequiredItemsAndAmount(IBuilding iBuilding){
        return iBuilding.getRequiredItemsAndAmount();
    }
    @ZenCodeType.Method
   public static @ZenCodeType.Nullable ItemStack forceTransferStack(IBuilding iBuilding, ItemStack var1, Level var2){
        return iBuilding.forceTransferStack(var1,var2);
    }
    @ZenCodeType.Method
   public static boolean hasWorkerOpenRequests(IBuilding iBuilding, int var1){
        return iBuilding.hasWorkerOpenRequests(var1);
    }
    @ZenCodeType.Method
   public static Collection<IRequest<?>> getOpenRequests(IBuilding iBuilding, int var1){
        return iBuilding.getOpenRequests(var1);
    }
    @ZenCodeType.Method
   public static boolean hasWorkerOpenRequestsFiltered(IBuilding iBuilding ,int var1,  Predicate<IRequest<?>> var2){
        return iBuilding.hasWorkerOpenRequestsFiltered(var1,var2);
    }
    @ZenCodeType.Method
   public static boolean hasOpenSyncRequest(IBuilding iBuilding, ICitizenData var1){
        return iBuilding.hasOpenSyncRequest(var1);
    }
    @ZenCodeType.Method
   public static boolean hasCitizenCompletedRequests(IBuilding iBuilding, ICitizenData var1){
        return iBuilding.hasCitizenCompletedRequests(var1);
   }
    @ZenCodeType.Method
   public static boolean hasCitizenCompletedRequestsToPickup(IBuilding iBuilding, ICitizenData var1){
        return iBuilding.hasCitizenCompletedRequestsToPickup(var1);
    }
    @ZenCodeType.Method
   public static Collection<IRequest<?>> getCompletedRequests(IBuilding iBuilding, ICitizenData var1){
        return iBuilding.getCompletedRequests(var1);
    }
    @ZenCodeType.Method
   public static void markRequestAsAccepted(IBuilding iBuilding, ICitizenData var1, IToken<?> var2){
        iBuilding.markRequestAsAccepted(var1,var2);
    }
    @ZenCodeType.Method
   public static void cancelAllRequestsOfCitizen(IBuilding iBuilding, ICitizenData var1){
        iBuilding.cancelAllRequestsOfCitizen(var1);
    }
    @ZenCodeType.Method
   public static void overruleNextOpenRequestWithStack(IBuilding iBuilding, ItemStack var1){
        iBuilding.overruleNextOpenRequestWithStack(var1);
    }
    @ZenCodeType.Method
   public static boolean overruleNextOpenRequestOfCitizenWithStack(IBuilding iBuilding, ICitizenData var1, ItemStack var2){
        return iBuilding.overruleNextOpenRequestOfCitizenWithStack(var1,var2);
    }
    @ZenCodeType.Method
   public static boolean createPickupRequest(IBuilding iBuilding, int var1){
        return iBuilding.createPickupRequest(var1);
    }

    @ZenCodeType.Method
   public static List<IRequestResolver<?>> getResolvers(IBuilding iBuilding){
        return iBuilding.getResolvers().stream().toList();
   }
    @ZenCodeType.Method
   public static List<IRequestResolver<?>> createResolvers(IBuilding iBuilding){
        return iBuilding.createResolvers().stream().toList();
    }
    @ZenCodeType.Method
   public static IRequester getRequester(IBuilding iBuilding){
        return iBuilding.getRequester();
    }
    @ZenCodeType.Method
   public static ICitizenData getCitizenForRequest(IBuilding iBuilding, IToken<?> var1){
        return iBuilding.getCitizenForRequest(var1).get();
    }
    @ZenCodeType.Method
   public static Map<ItemStorage, Integer> reservedStacksExcluding(IBuilding iBuilding, IRequest<? extends IDeliverable> var1){
        return iBuilding.reservedStacksExcluding(var1);
    }
    @ZenCodeType.Method
   public static void processOfflineTime(IBuilding iBuilding, long var1){
        iBuilding.processOfflineTime(var1);
    }
    @ZenCodeType.Method
   public static void calculateCorners(IBuilding iBuilding){
        iBuilding.calculateCorners();
    }
    @ZenCodeType.Method
   public static boolean isInBuilding(IBuilding iBuilding , BlockPos var1){
        return iBuilding.isInBuilding(var1);
    }
    @ZenCodeType.Method
   public static void upgradeBuildingLevelToSchematicData(IBuilding iBuilding){
        iBuilding.upgradeBuildingLevelToSchematicData();
    }
    @ZenCodeType.Method
   public static Map<TypeToken<?>, Collection<IToken<?>>> getOpenRequestsByRequestableType(IBuilding iBuilding){
        return iBuilding.getOpenRequestsByRequestableType();
    }
    @ZenCodeType.Method
   public static void pickUp(IBuilding iBuilding, Player var1){
        iBuilding.pickUp(var1);
    }
    @ZenCodeType.Method
   public static BuildingEntry getBuildingType(IBuilding iBuilding){
        return iBuilding.getBuildingType();
    }
    @ZenCodeType.Method
   public static void setBuildingType(IBuilding iBuilding, BuildingEntry var1){
        iBuilding.setBuildingType(var1);
    }
    @ZenCodeType.Method
   public static void onColonyTick(IBuilding iBuilding, IColony var1){
        iBuilding.onColonyTick(var1);
    }
    @ZenCodeType.Method
   public static boolean isItemStackInRequest(IBuilding iBuilding, @ZenCodeType.Nullable ItemStack var1){
        return iBuilding.isItemStackInRequest(var1);
   }
    @ZenCodeType.Method
   public static int getMaxToolLevel(IBuilding iBuilding) {
        return iBuilding.getMaxToolLevel();
   }
    @ZenCodeType.Method
   public static Set<ICitizenData> getAllAssignedCitizen(IBuilding iBuilding){
        return iBuilding.getAllAssignedCitizen();
    }
    @ZenCodeType.Method
   public static List<IItemHandler> getHandlers(IBuilding iBuilding){
        return iBuilding.getHandlers();
    }
    @ZenCodeType.Method
   public static boolean canEat(IBuilding iBuilding, ItemStack var1){
        return iBuilding.canEat(var1);
    }
}
