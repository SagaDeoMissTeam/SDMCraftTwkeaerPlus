package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.CitizenNameFile;
import com.minecolonies.api.colony.ColonyState;
import com.minecolonies.api.colony.ICitizen;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.managers.interfaces.*;
import com.minecolonies.api.colony.permissions.IPermissions;
import com.minecolonies.api.colony.requestsystem.manager.IRequestManager;
import com.minecolonies.api.colony.requestsystem.requester.IRequester;
import com.minecolonies.api.colony.workorders.IWorkManager;
import com.minecolonies.api.entity.citizen.AbstractEntityCitizen;
import com.minecolonies.api.quests.IQuestManager;
import com.minecolonies.api.research.IResearchManager;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraftforge.event.TickEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.*;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/IColony")
@NativeTypeRegistration(value = IColony.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.IColony")
public class ExpandIColony {
    @ZenCodeType.Method
   public static CompoundTag write(IColony iColony, CompoundTag var1){
      return iColony.write(var1);
   }

   @ZenCodeType.Method
   public static void read(IColony iColony, CompoundTag var1){
       iColony.read(var1);
   }
    @ZenCodeType.Method
    public static IWorkManager getWorkManager(IColony iColony){
        return iColony.getWorkManager();
    }

    @ZenCodeType.Method
    public static BlockPos getCenter(IColony iColony){
        return iColony.getCenter();
    }

    @ZenCodeType.Method
    public static String getName(IColony iColony){
        return iColony.getName();
    }

    @ZenCodeType.Method
    public static void setName(IColony iColony, String var1){
        iColony.setName(var1);
    }

    @ZenCodeType.Method
    public static IPermissions getPermissions(IColony iColony){
        return iColony.getPermissions();
    }

    @ZenCodeType.Method
    public static boolean isCoordInColony(IColony iColony, Level var1, BlockPos var2){
        return iColony.isCoordInColony(var1,var2);
    }

    @ZenCodeType.Method
    public static long getDistanceSquared(IColony iColony, BlockPos var1){
        return iColony.getDistanceSquared(var1);
    }

    @ZenCodeType.Method
    public static boolean hasTownHall(IColony iColony){
        return iColony.hasTownHall();
    }

    @ZenCodeType.Method
    public static int getID(IColony iColony){
        return iColony.getID();
    }

    @ZenCodeType.Method
    public static boolean hasWarehouse(IColony iColony){
        return iColony.hasWarehouse();
    }

    @ZenCodeType.Method
    public static boolean hasBuilding(IColony iColony, String var1, int var2, boolean var3){
        return iColony.hasBuilding(var1,var2,var3);
    }

    @ZenCodeType.Method
    public static String getTeamName(IColony iColony) {
        return iColony.getTeamName();
    }

    @ZenCodeType.Method
    public static ChatFormatting getTeamColonyColor(IColony iColony){
        return iColony.getTeamColonyColor();
    }

    @ZenCodeType.Method
    public static ListTag getColonyFlag(IColony iColony){
        return iColony.getColonyFlag();
    }

    @ZenCodeType.Method
    public static boolean isDay(IColony iColony){
        return iColony.isDay();
    }

    @ZenCodeType.Method
    public static PlayerTeam getTeam(IColony iColony){
        return iColony.getTeam();
    }

    @ZenCodeType.Method
    public static int getLastContactInHours(IColony iColony){
        return iColony.getLastContactInHours();
    }

    @ZenCodeType.Method
    public static Level getWorld(IColony iColony){
        return iColony.getWorld();
    }
    @ZenCodeType.Method
    public static IRequestManager getRequestManager(IColony iColony){
        return iColony.getRequestManager();
    }

    @ZenCodeType.Method
    public static void markDirty(IColony iColony){
        iColony.markDirty();
    }


    @ZenCodeType.Method
    public static boolean canBeAutoDeleted(IColony iColony){
        return iColony.canBeAutoDeleted();
    }

    @ZenCodeType.Method
    public static IRequester getRequesterBuildingForPosition(IColony iColony, BlockPos var1){
        return iColony.getRequesterBuildingForPosition(var1);
    }

    @ZenCodeType.Method
    public static void removeVisitingPlayer(IColony iColony, Player var1){
        iColony.removeVisitingPlayer(var1);
    }

    @ZenCodeType.Method
    public static List<Player> getMessagePlayerEntities(IColony iColony){
        return iColony.getMessagePlayerEntities();
    }

    @ZenCodeType.Method
    public static List<BlockPos> getWayPoints(IColony iColony, BlockPos position, BlockPos target) {
        return iColony.getWayPoints(position,target);
    }

    @ZenCodeType.Method
    public static double getOverallHappiness(IColony iColony){
        return iColony.getOverallHappiness();
    }

    @ZenCodeType.Method
    public static Map<BlockPos, BlockState> getWayPoints(IColony iColony){
        return iColony.getWayPoints();
    }

    @ZenCodeType.Method
    public static String getStructurePack(IColony iColony){
        return iColony.getStructurePack();
    }

    @ZenCodeType.Method
    public static void setStructurePack(IColony iColony,String var1){
        iColony.setStructurePack(var1);
    }

    @ZenCodeType.Method
    public static IRegisteredStructureManager getBuildingManager(IColony iColony){
        return iColony.getBuildingManager();
    }

    @ZenCodeType.Method
    public static ICitizenManager getCitizenManager(IColony iColony){
        return iColony.getCitizenManager();
    }

    @ZenCodeType.Method
    public static IGraveManager getGraveManager(IColony iColony){
        return iColony.getGraveManager();
    }

    @ZenCodeType.Method
    public static IVisitorManager getVisitorManager(IColony iColony){
        return iColony.getVisitorManager();
    }

    @ZenCodeType.Method
    public static IRaiderManager getRaiderManager(IColony iColony){
        return iColony.getRaiderManager();
    }

    @ZenCodeType.Method
    public static IEventManager getEventManager(IColony iColony){
        return iColony.getEventManager();
    }

    @ZenCodeType.Method
    public static IReproductionManager getReproductionManager(IColony iColony){
        return iColony.getReproductionManager();
    }

    @ZenCodeType.Method
    public static IEventDescriptionManager getEventDescriptionManager(IColony iColony){
        return iColony.getEventDescriptionManager();
    }

    @ZenCodeType.Method
    public static IColonyPackageManager getPackageManager(IColony iColony){
        return iColony.getPackageManager();
    }

    @ZenCodeType.Method
    public static IProgressManager getProgressManager(IColony iColony){
        return iColony.getProgressManager();
    }
    @ZenCodeType.Method
    public static void addVisitingPlayer(IColony iColony,Player var1){
        iColony.addVisitingPlayer(var1);
    }
    @ZenCodeType.Method
    public static ResourceKey<Level> getDimension(IColony iColony){
        return iColony.getDimension();
    }
    @ZenCodeType.Method
    public static boolean isRemote(IColony iColony){
        return iColony.isRemote();
    }
    @ZenCodeType.Method
    public static IResearchManager getResearchManager(IColony iColony){
        return iColony.getResearchManager();
    }
    @ZenCodeType.Method
    public static void usedMercenaries(IColony iColony){
        iColony.usedMercenaries();
    }
    @ZenCodeType.Method
    public static long getMercenaryUseTime(IColony iColony){
        return iColony.getMercenaryUseTime();
    }
    @ZenCodeType.Method
    public static CompoundTag getColonyTag(IColony iColony){
        return iColony.getColonyTag();
    }
    @ZenCodeType.Method
    public static boolean isColonyUnderAttack(IColony iColony){
        return iColony.isColonyUnderAttack();
    }

    @ZenCodeType.Method
    public static boolean isValidAttackingPlayer(IColony iColony,Player var1){
        return iColony.isValidAttackingPlayer(var1);
    }

    @ZenCodeType.Method
    public static boolean isValidAttackingGuard(IColony iColony,AbstractEntityCitizen var1){
        return iColony.isValidAttackingGuard(var1);
    }

    @ZenCodeType.Method
    public static void setColonyColor(IColony iColony,ChatFormatting var1){
        iColony.setColonyColor(var1);
    }

    @ZenCodeType.Method
    public static void setColonyFlag(IColony iColony,ListTag var1){
        iColony.setColonyFlag(var1);
    }

    @ZenCodeType.Method
    public static void setManualHousing(IColony iColony,boolean var1){
        iColony.setManualHousing(var1);
    }

    @ZenCodeType.Method
    public static void addWayPoint(IColony iColony,BlockPos var1, BlockState var2){
        iColony.addWayPoint(var1,var2);
    }

    @ZenCodeType.Method
    public static void addGuardToAttackers(IColony iColony,AbstractEntityCitizen var1, Player var2){
        iColony.addGuardToAttackers(var1,var2);
    }

    @ZenCodeType.Method
    public static void addFreePosition(IColony iColony,BlockPos var1){
        iColony.addFreePosition(var1);
    }

    @ZenCodeType.Method
    public static void addFreeBlock(IColony iColony,Block var1){
        iColony.addFreeBlock(var1);
    }
    @ZenCodeType.Method
    public static void removeFreePosition(IColony iColony,BlockPos var1){
        iColony.removeFreePosition(var1);
    }
    @ZenCodeType.Method
    public static void removeFreeBlock(IColony iColony,Block var1){
        iColony.removeFreeBlock(var1);
    }
    @ZenCodeType.Method
    public static void setCanBeAutoDeleted(IColony iColony,boolean var1){
        iColony.setCanBeAutoDeleted(var1);
    }
    @ZenCodeType.Method
    public static void setManualHiring(IColony iColony,boolean var1){
        iColony.setManualHiring(var1);
    }

    @ZenCodeType.Method
    public static void setMoveIn(IColony iColony,boolean var1){
        iColony.setMoveIn(var1);
    }
    @ZenCodeType.Method
    public static @NotNull List<Player> getImportantMessageEntityPlayers(IColony iColony){
        return iColony.getImportantMessageEntityPlayers();
    }
    @ZenCodeType.Method
    public static boolean isManualHiring(IColony iColony){
       return iColony.isManualHiring();
    }
    @ZenCodeType.Method
    public static boolean isManualHousing(IColony iColony){
        return iColony.isManualHiring();
    }
    @ZenCodeType.Method
    public static boolean canMoveIn(IColony iColony){
        return iColony.canMoveIn();
    }
    @ZenCodeType.Method
    public static boolean useAdditionalChildTime(IColony iColony,int var1){
        return iColony.useAdditionalChildTime(var1);
    }
    @ZenCodeType.Method
    public static void updateHasChilds(IColony iColony){
        iColony.updateHasChilds();
    }
    @ZenCodeType.Method
    public static void addLoadedChunk(IColony iColony,long var1, LevelChunk var3){
        iColony.addLoadedChunk(var1,var3);
    }
    @ZenCodeType.Method
    public static void removeLoadedChunk(IColony iColony,long var1){
        iColony.removeLoadedChunk(var1);
    }
    @ZenCodeType.Method
    public static int getLoadedChunkCount(IColony iColony){
        return iColony.getLoadedChunkCount();
    }
    @ZenCodeType.Method
    public static Set<Long> getLoadedChunks(IColony iColony){
        return iColony.getLoadedChunks();
    }
    @ZenCodeType.Method
    public static ColonyState getState(IColony iColony){
        return iColony.getState();
    }
    @ZenCodeType.Method
    public static boolean isActive(IColony iColony){
        return iColony.isActive();
    }
    @ZenCodeType.Method
    public static Set<Long> getTicketedChunks(IColony iColony){
        return iColony.getTicketedChunks();
    }
    @ZenCodeType.Method
    public static void setTextureStyle(IColony iColony,String var1){
        iColony.setTextureStyle(var1);
    }
    @ZenCodeType.Method
    public static String getTextureStyleId(IColony iColony){
        return iColony.getTextureStyleId();
    }
    @ZenCodeType.Method
    public static String getNameStyle(IColony iColony){
        return iColony.getNameStyle();
    }
    @ZenCodeType.Method
    public static void setNameStyle(IColony iColony,String var1){
        iColony.setNameStyle(var1);
    }
    @ZenCodeType.Method
    public static CitizenNameFile getCitizenNameFile(IColony iColony){
        return iColony.getCitizenNameFile();
    }
    @ZenCodeType.Method
    public static IStatisticsManager getStatisticsManager(IColony iColony){
        return iColony.getStatisticsManager();
    }
    @ZenCodeType.Method
    public static int getDay(IColony iColony){
        return iColony.getDay();
    }
    @ZenCodeType.Method
    public static IQuestManager getQuestManager(IColony iColony){
        return iColony.getQuestManager();
    }
    @ZenCodeType.Method
    public static ICitizen getCitizen(IColony iColony,int var1){
        return iColony.getCitizen(var1);
    }
}
