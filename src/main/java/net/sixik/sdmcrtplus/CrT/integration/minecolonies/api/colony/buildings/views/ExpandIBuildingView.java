package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings.views;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenDataView;
import com.minecolonies.api.colony.IColonyView;
import com.minecolonies.api.colony.buildings.modules.IBuildingModuleView;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.api.colony.buildings.views.IBuildingView;
import com.minecolonies.api.colony.requestsystem.request.IRequest;
import com.minecolonies.api.colony.requestsystem.token.IToken;
import net.minecraft.core.BlockPos;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/views/IBuildingView")
@NativeTypeRegistration(value = IBuildingView.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.views.IBuildingView")
public class ExpandIBuildingView {
    @ZenCodeType.Method
   public static BlockPos getID(IBuildingView ibv){
       return ibv.getID();
   }
    @ZenCodeType.Method
   public static  BlockPos getPosition(IBuildingView ibv){
       return ibv.getPosition();
   }
    @ZenCodeType.Method
   public static BlockPos getParent(IBuildingView ibv){
       return ibv.getParent();
   }
    @ZenCodeType.Method
   public static int getBuildingLevel(IBuildingView ibv){
       return ibv.getBuildingLevel();
   }
    @ZenCodeType.Method
   public static List<BlockPos> getContainerList(IBuildingView ibv){
       return ibv.getContainerList();
   }
    @ZenCodeType.Method
   public static int getBuildingMaxLevel(IBuildingView ibv){
       return ibv.getBuildingMaxLevel();
   }
    @ZenCodeType.Method
   public static boolean isBuildingMaxLevel(IBuildingView ibv){
       return ibv.isBuildingMaxLevel();
   }
    @ZenCodeType.Method
   public static int getCurrentWorkOrderLevel(IBuildingView ibv){
       return ibv.getCurrentWorkOrderLevel();
   }@ZenCodeType.Method

   public static String getStructurePath(IBuildingView ibv){
       return ibv.getStructurePath();
   }
    @ZenCodeType.Method
   public static String getCustomName(IBuildingView ibv){
       return ibv.getCustomName();
   }
    @ZenCodeType.Method
   public static String getStructurePack(IBuildingView ibv){
       return ibv.getStructurePack();
   }
    @ZenCodeType.Method
   public static int getRotation(IBuildingView ibv){
       return ibv.getRotation();
   }
    @ZenCodeType.Method
   public static boolean isMirrored(IBuildingView ibv){
       return ibv.isMirrored();
   }
    @ZenCodeType.Method
   public static boolean hasWorkOrder(IBuildingView ibv){
       return ibv.hasWorkOrder();
   }
    @ZenCodeType.Method
   public static boolean isBuilding(IBuildingView ibv){
       return ibv.isBuilding();
   }
    @ZenCodeType.Method
   public static boolean isRepairing(IBuildingView ibv){
       return ibv.isRepairing();
   }
    @ZenCodeType.Method
   public static boolean isDeconstructing(IBuildingView ibv){
       return ibv.isDeconstructing();
   }
    @ZenCodeType.Method
   public static int getClaimRadius(IBuildingView ibv){
       return ibv.getClaimRadius();
   }
    @ZenCodeType.Method
   public static Map<Integer, Collection<IToken<?>>> getOpenRequestsByCitizen(IBuildingView ibv){
       return ibv.getOpenRequestsByCitizen();
   }
    @ZenCodeType.Method
   public static List<IRequest<?>> getOpenRequests(IBuildingView ibv, ICitizenDataView var1){
       return ibv.getOpenRequests(var1).stream().toList();
   }
    @ZenCodeType.Method
   public static List<IRequest<?>> getOpenRequestsOfBuilding(IBuildingView ibv){
       return ibv.getOpenRequestsOfBuilding().stream().toList();
   }
    @ZenCodeType.Method
   public static IColonyView getColony(IBuildingView ibv){
       return ibv.getColony();
   }
    @ZenCodeType.Method
   public static int getBuildingDmPrio(IBuildingView ibv){
       return ibv.getBuildingDmPrio();
   }
    @ZenCodeType.Method
   public static List<IToken<?>> getResolverIds(IBuildingView ibv){
       return ibv.getResolverIds().stream().toList();
   }
    @ZenCodeType.Method
   public static void setCustomName(IBuildingView ibv,String var1){
       ibv.setCustomName(var1);
   }
    @ZenCodeType.Method
   public static boolean isDeconstructed(IBuildingView ibv){
       return ibv.isDeconstructed();
   }
    @ZenCodeType.Method
   public static void registerModule(IBuildingView ibv,IBuildingModuleView var1){
       ibv.registerModule(var1);
   }
    @ZenCodeType.Method
   public static List<IBuildingModuleView> getAllModuleViews(IBuildingView ibv){
       return ibv.getAllModuleViews();
   }
    @ZenCodeType.Method
   public static BuildingEntry getBuildingType(IBuildingView ibv){
       return ibv.getBuildingType();
   }
    @ZenCodeType.Method
   public static void setBuildingType(IBuildingView ibv,BuildingEntry var1){
       ibv.setBuildingType(var1);
   }

   @ZenCodeType.Method
   public static Set<Integer> getAllAssignedCitizens(IBuildingView ibv){
       return ibv.getAllAssignedCitizens();
   }
    @ZenCodeType.Method
   public static boolean allowsAssignment(IBuildingView ibv){
       return ibv.allowsAssignment();
   }
}
