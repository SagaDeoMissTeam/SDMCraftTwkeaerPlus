package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.managers.interfaces;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.colony.buildings.IMysticalSite;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.api.colony.buildings.workerbuildings.ITownHall;
import com.minecolonies.api.colony.buildings.workerbuildings.IWareHouse;
import com.minecolonies.api.colony.fields.IField;
import com.minecolonies.api.colony.managers.interfaces.IRaiderManager;
import com.minecolonies.api.colony.managers.interfaces.IRegisteredStructureManager;
import com.minecolonies.api.entity.citizen.AbstractEntityCitizen;
import com.minecolonies.api.quests.IQuestInstance;
import com.minecolonies.api.tileentities.AbstractTileEntityColonyBuilding;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.chunk.LevelChunk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/managers/interfaces/IRegisteredStructureManager")
@NativeTypeRegistration(value = IRegisteredStructureManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.managers.interfaces.IRegisteredStructureManager")
public class ExpandIRegisteredStructureManager {

//   @ZenCodeType.Method public static void read(IRegisteredStructureManager ism, CompoundTag var1){
//
//   }
//
//   @ZenCodeType.Method public static void write(IRegisteredStructureManager ism, CompoundTag var1){
//
//   }
    
   @ZenCodeType.Method public static void clearDirty(IRegisteredStructureManager ism){
       ism.clearDirty();
   }

   @ZenCodeType.Method public static void sendPackets(IRegisteredStructureManager ism,Set<ServerPlayer> var1, Set<ServerPlayer> var2){
       ism.sendPackets(var1,var2);
   }

   @ZenCodeType.Method public static void onColonyTick(IRegisteredStructureManager ism,IColony var1){
       ism.onColonyTick(var1);
   }

   @ZenCodeType.Method public static void cleanUpBuildings(IRegisteredStructureManager ism,IColony var1){
       ism.cleanUpBuildings(var1);
   }

   @ZenCodeType.Method public static IBuilding getBuilding(IRegisteredStructureManager ism,BlockPos var1){
       return ism.getBuilding(var1);
   }

   @ZenCodeType.Method public static List<BlockPos> getLeisureSites(IRegisteredStructureManager ism){
       return ism.getLeisureSites();
   }

   @ZenCodeType.Method public static @ZenCodeType.Nullable BlockPos getFirstBuildingMatching(IRegisteredStructureManager ism,Predicate<IBuilding> var1){
       return ism.getFirstBuildingMatching(var1);
   }

   @ZenCodeType.Method public static void addLeisureSite(IRegisteredStructureManager ism,BlockPos var1){
       ism.addLeisureSite(var1);
   }

   @ZenCodeType.Method public static void removeLeisureSite(IRegisteredStructureManager ism,BlockPos var1){
        ism.removeLeisureSite(var1);
   }

   @ZenCodeType.Method public static @ZenCodeType.Nullable IWareHouse getClosestWarehouseInColony(IRegisteredStructureManager ism,BlockPos var1){
       return ism.getClosestWarehouseInColony(var1);
   }

   @ZenCodeType.Method public static  Map<BlockPos, IBuilding> getBuildings(IRegisteredStructureManager ism){
       return ism.getBuildings();
   }

   @ZenCodeType.Method public static ITownHall getTownHall(IRegisteredStructureManager ism){
       return ism.getTownHall();
   }

   @ZenCodeType.Method public static int getMysticalSiteMaxBuildingLevel(IRegisteredStructureManager ism){
       return ism.getMysticalSiteMaxBuildingLevel();
   }

   @ZenCodeType.Method public static boolean hasWarehouse(IRegisteredStructureManager ism){
       return ism.hasWarehouse();
   }

   @ZenCodeType.Method public static boolean hasMysticalSite(IRegisteredStructureManager ism){
       return ism.hasMysticalSite();
   }

   @ZenCodeType.Method public static boolean hasTownHall(IRegisteredStructureManager ism){
       return ism.hasWarehouse();
   }

   @ZenCodeType.Method public static <B extends IBuilding> @ZenCodeType.Nullable B getBuilding(IRegisteredStructureManager ism,BlockPos var1,  Class<B> var2){
       return ism.getBuilding(var1,var2);
   }

   @ZenCodeType.Method public static void removeBuilding(IRegisteredStructureManager ism, IBuilding var1, Set<ServerPlayer> var2){
       ism.removeBuilding(var1,var2);
   }

   @ZenCodeType.Method public static void markBuildingsDirty(IRegisteredStructureManager ism){
       ism.markBuildingsDirty();
   }

   @ZenCodeType.Method public static void markFieldsDirty(IRegisteredStructureManager ism){
       ism.markFieldsDirty();
   }

   @ZenCodeType.Method public static @ZenCodeType.Nullable IBuilding addNewBuilding(IRegisteredStructureManager ism, AbstractTileEntityColonyBuilding var1, Level var2){
       return ism.addNewBuilding(var1,var2);
   }

   @ZenCodeType.Method public static BlockPos getBestBuilding(IRegisteredStructureManager ism,AbstractEntityCitizen var1, Class<? extends IBuilding> var2){
       return ism.getBestBuilding(var1,var2);
   }

   @ZenCodeType.Method public static BlockPos getBestBuilding(IRegisteredStructureManager ism,BlockPos var1, Class<? extends IBuilding> var2){
       return ism.getBestBuilding(var1,var2);
   }

   @ZenCodeType.Method public static BlockPos getRandomBuilding(IRegisteredStructureManager ism,Predicate<IBuilding> var1){
       return ism.getRandomBuilding(var1);
   }

   @ZenCodeType.Method public static boolean hasGuardBuildingNear(IRegisteredStructureManager ism,IBuilding var1){
       return ism.hasGuardBuildingNear(var1);
   }

   @ZenCodeType.Method public static void guardBuildingChangedAt(IRegisteredStructureManager ism,IBuilding var1, int var2){
       ism.guardBuildingChangedAt(var1,var2);
   }

   @ZenCodeType.Method public static void setTownHall(IRegisteredStructureManager ism,@ZenCodeType.Nullable ITownHall var1){
       ism.setTownHall(var1);
   }

   @ZenCodeType.Method public static void removeWareHouse(IRegisteredStructureManager ism,IWareHouse var1){
       ism.removeWareHouse(var1);
   }

   @ZenCodeType.Method public static List<IWareHouse> getWareHouses(IRegisteredStructureManager ism){
       return ism.getWareHouses();
   }

   @ZenCodeType.Method public static void removeMysticalSite(IRegisteredStructureManager ism,IMysticalSite var1){
       ism.removeMysticalSite(var1);
   }

   @ZenCodeType.Method public static List<IMysticalSite> getMysticalSites(IRegisteredStructureManager ism){
       return ism.getMysticalSites();
   }

   @ZenCodeType.Method public static boolean canPlaceAt(IRegisteredStructureManager ism,Block var1, BlockPos var2, Player var3){
       return ism.canPlaceAt(var1,var2,var3);
   }

   @ZenCodeType.Method public static boolean isWithinBuildingZone(IRegisteredStructureManager ism,LevelChunk var1){
       return ism.isWithinBuildingZone(var1);
   }

   @ZenCodeType.Method public static IBuilding getHouseWithSpareBed(IRegisteredStructureManager ism){
       return ism.getHouseWithSpareBed();
   }

   @ZenCodeType.Method public static void onBuildingUpgradeComplete(IRegisteredStructureManager ism,@ZenCodeType.Nullable IBuilding var1, int var2){
       ism.onBuildingUpgradeComplete(var1, var2);
   }

   @ZenCodeType.Method public static BlockPos getRandomLeisureSite(IRegisteredStructureManager ism){
       return ism.getRandomLeisureSite();
   }

   @ZenCodeType.Method public static void trackBuildingLevelUp(IRegisteredStructureManager ism, BuildingEntry var1,  IQuestInstance var2){
       ism.trackBuildingLevelUp(var1,var2);
   }

   @ZenCodeType.Method public static void stopTrackingBuildingLevelUp(IRegisteredStructureManager ism, BuildingEntry var1,  IQuestInstance var2){
       ism.stopTrackingBuildingLevelUp(var1,var2);
   }

   @ZenCodeType.Method public static  List<IField> getFields(IRegisteredStructureManager ism,Predicate<IField> var1){
       return ism.getFields(var1);
   }

   @ZenCodeType.Method public static Optional<IField> getField(IRegisteredStructureManager ism,Predicate<IField> var1){
       return ism.getField(var1);
   }

   @ZenCodeType.Method public static boolean addField(IRegisteredStructureManager ism,IField var1){
       return ism.addField(var1);
   }

   @ZenCodeType.Method public static void removeField(IRegisteredStructureManager ism,Predicate<IField> var1){
       ism.removeField(var1);
   }
}
