package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.CompactColonyReference;
import com.minecolonies.api.colony.ICitizenDataView;
import com.minecolonies.api.colony.IColonyRelated;
import com.minecolonies.api.colony.IColonyView;
import com.minecolonies.api.colony.buildings.views.IBuildingView;
import com.minecolonies.api.colony.buildings.workerbuildings.ITownHallView;
import com.minecolonies.api.colony.fields.IField;
import com.minecolonies.api.colony.permissions.ColonyPlayer;
import com.minecolonies.api.colony.permissions.IPermissions;
import com.minecolonies.api.colony.requestsystem.manager.IRequestManager;
import com.minecolonies.api.colony.requestsystem.requester.IRequester;
import com.minecolonies.api.colony.workorders.IWorkOrderView;
import com.minecolonies.api.network.IMessage;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.scores.PlayerTeam;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.*;
import java.util.function.Predicate;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/IColonyView")
@NativeTypeRegistration(value = IColonyView.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.IColonyView")
public class ExpandIColonyView {

    
   @ZenCodeType.Method public static List<BlockPos> getFreePositions(IColonyView ic){
       return ic.getFreePositions();
   }

   @ZenCodeType.Method public static List<Block> getFreeBlocks(IColonyView ic){
       return ic.getFreeBlocks();
   }

   @ZenCodeType.Method public static void addFreePosition(IColonyView ic, BlockPos var1){
       ic.addFreePosition(var1);
   }

   @ZenCodeType.Method public static void addFreeBlock(IColonyView ic, Block var1){
       ic.addFreeBlock(var1);
   }

   @ZenCodeType.Method public static void removeFreePosition(IColonyView ic, BlockPos var1){
       ic.removeFreePosition(var1);
   }

   @ZenCodeType.Method public static void removeFreeBlock(IColonyView ic, Block var1){
       ic.removeFreeBlock(var1);
   }

   @ZenCodeType.Method public static ResourceKey<Level> getDimension(IColonyView ic){
       return ic.getDimension();
   }

   @ZenCodeType.Method public static boolean isManualHiring(IColonyView ic){
       return ic.isManualHiring();
   }

   @ZenCodeType.Method public static void setManualHiring(IColonyView ic,boolean var1){
       ic.setManualHiring(var1);
   }

   @ZenCodeType.Method public static boolean isManualHousing(IColonyView ic){
       return ic.isManualHousing();
   }

   @ZenCodeType.Method public static void setManualHousing(IColonyView ic,boolean var1){
       ic.setManualHousing(var1);
   }

   @ZenCodeType.Method public static boolean canMoveIn(IColonyView ic){
       return ic.canMoveIn();
   }

   @ZenCodeType.Method public static void setMoveIn(IColonyView ic,boolean var1){
       ic.setMoveIn(var1);
   }

   @ZenCodeType.Method public static @ZenCodeType.Nullable ITownHallView getTownHall(IColonyView ic){
       return ic.getTownHall();
   }

   @ZenCodeType.Method public static IBuildingView getBuilding(IColonyView ic,int var1, int var2, int var3){
       return ic.getBuilding(var1,var2,var3);
   }

   @ZenCodeType.Method public static IBuildingView getBuilding(IColonyView ic,BlockPos var1){
      return ic.getBuilding(var1);
   }

   @ZenCodeType.Method public static  Map<String, ColonyPlayer> getPlayers(IColonyView ic){
      Map<String, ColonyPlayer> map = new HashMap<>();
      for(Map.Entry<UUID, ColonyPlayer> i : ic.getPlayers().entrySet()){
         map.put(i.getKey().toString(), i.getValue());
      }
      return map;
   }

   @ZenCodeType.Method public static int getCitizenCount(IColonyView ic){
      return ic.getCitizenCount();
   }

   @ZenCodeType.Method public static int getCitizenCountLimit(IColonyView ic){
      return ic.getCitizenCountLimit();
   }

   @ZenCodeType.Method public static Map<Integer, ICitizenDataView> getCitizens(IColonyView ic){
      return ic.getCitizens();
   }

   @ZenCodeType.Method public static Collection<IWorkOrderView> getWorkOrders(IColonyView ic){
      return ic.getWorkOrders();
   }

   @ZenCodeType.Method public static ICitizenDataView getCitizen(IColonyView ic,int var1){
      return ic.getCitizen(var1);
   }


//   @ZenCodeType.Method public static  List<IField> getFields(IColonyView ic,Predicate<IField> var1){
//
//   }
//   @ZenCodeType.Method public static @ZenCodeType.Nullable IField getField(IColonyView ic,Predicate<IField> var1);

   @ZenCodeType.Method public static void addPlayer(IColonyView ic,String var1){
      ic.addPlayer(var1);
   }

   @ZenCodeType.Method public static void removePlayer(IColonyView ic,String uuid){
      ic.removePlayer(UUID.fromString(uuid));
   }

   @ZenCodeType.Method public static double getOverallHappiness(IColonyView ic){
      return ic.getOverallHappiness();
   }

   @ZenCodeType.Method public static BlockPos getCenter(IColonyView ic){
      return ic.getCenter();
   }

   @ZenCodeType.Method public static String getName(IColonyView ic){
      return ic.getName();
   }

   @ZenCodeType.Method public static void setName(IColonyView ic,String var1){
      ic.setName(var1);
   }

   @ZenCodeType.Method public static  IPermissions getPermissions(IColonyView ic){
      return ic.getPermissions();
   }

   @ZenCodeType.Method public static boolean isCoordInColony(IColonyView ic, Level var1,  BlockPos var2){
      return ic.isCoordInColony(var1,var2);
   }

   @ZenCodeType.Method public static long getDistanceSquared(IColonyView ic, BlockPos var1){
      return ic.getDistanceSquared(var1);
   }

   @ZenCodeType.Method public static boolean hasTownHall(IColonyView ic){
      return ic.hasTownHall();
   }

   @ZenCodeType.Method public static int getID(IColonyView ic){
      return ic.getID();
   }

   @ZenCodeType.Method public static boolean hasWarehouse(IColonyView ic){
      return ic.hasTownHall();
   }

   @ZenCodeType.Method public static PlayerTeam getTeam(IColonyView ic){
      return ic.getTeam();
   }

   @ZenCodeType.Method public static int getLastContactInHours(IColonyView ic){
      return ic.getLastContactInHours();
   }

   @ZenCodeType.Method public static Level getWorld(IColonyView ic){
      return ic.getWorld();
   }

   @ZenCodeType.Method public static  IRequestManager getRequestManager(IColonyView ic){
      return ic.getRequestManager();
   }

   @ZenCodeType.Method public static void markDirty(IColonyView ic){
      ic.markDirty();
   }

   @ZenCodeType.Method public static boolean canBeAutoDeleted(IColonyView ic){
      return ic.canBeAutoDeleted();
   }

   @ZenCodeType.Method public static @ZenCodeType.Nullable IRequester getRequesterBuildingForPosition(IColonyView ic, BlockPos var1){
      return ic.getRequesterBuildingForPosition(var1);
   }

   @ZenCodeType.Method public static void removeVisitingPlayer(IColonyView ic,Player var1){
      ic.removeVisitingPlayer(var1);
   }

   @ZenCodeType.Method public static void addVisitingPlayer(IColonyView ic,Player var1){
      ic.addVisitingPlayer(var1);
   }

   @ZenCodeType.Method public static List<BlockPos> getLastSpawnPoints(IColonyView ic){
      return ic.getLastSpawnPoints();
   }

   @ZenCodeType.Method public static boolean isPrintingProgress(IColonyView ic){
      return ic.isPrintingProgress();
   }

   @ZenCodeType.Method public static boolean isRemote(IColonyView ic){
      return ic.isRemote();
   }

   @ZenCodeType.Method public static List<IBuildingView> getBuildings(IColonyView ic){
      return ic.getBuildings();
   }

   @ZenCodeType.Method public static String getStructurePack(IColonyView ic){
      return ic.getStructurePack();
   }

   @ZenCodeType.Method public static boolean isRaiding(IColonyView ic){
      return ic.isRaiding();
   }

   @ZenCodeType.Method public static List<CompactColonyReference> getAllies(IColonyView ic){
      return ic.getAllies();
   }

   @ZenCodeType.Method public static List<CompactColonyReference> getFeuds(IColonyView ic){
      return ic.getFeuds();
   }

   @ZenCodeType.Method public static boolean areSpiesEnabled(IColonyView ic){
      return ic.areSpiesEnabled();
   }

   @ZenCodeType.Method public static ICitizenDataView getVisitor(IColonyView ic,int var1){
      return ic.getVisitor(var1);
   }

   @ZenCodeType.Method public static List<String> getNameFileIds(IColonyView ic){
      return ic.getNameFileIds();
   }
}
