package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.colony.buildings.IGuardBuilding;
import com.minecolonies.api.colony.requestsystem.location.ILocation;
import com.minecolonies.api.entity.citizen.AbstractEntityCitizen;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/IGuardBuilding")
@NativeTypeRegistration(value = IGuardBuilding.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.IGuardBuilding")
public class ExpandIGuardBuilding {

    @ZenCodeType.Method
   public static String getTask(IGuardBuilding igb){
       return igb.getTask();
   }
   @ZenCodeType.Method
   public static @ZenCodeType.Nullable BlockPos getNextPatrolTarget(IGuardBuilding igb, boolean var1){
        return igb.getNextPatrolTarget(var1);
   }
    @ZenCodeType.Method
   public static void arrivedAtPatrolPoint(IGuardBuilding igb,AbstractEntityCitizen var1){
        igb.arrivedAtPatrolPoint(var1);
   }
    @ZenCodeType.Method
   public static int getPatrolDistance(IGuardBuilding igb){
        return igb.getPatrolDistance();
    }
    @ZenCodeType.Method
   public static boolean shallRetrieveOnLowHealth(IGuardBuilding igb){
        return igb.shallRetrieveOnLowHealth();
    }
    @ZenCodeType.Method
   public static boolean shallPatrolManually(IGuardBuilding igb){
        return igb.shallPatrolManually();
    }
    @ZenCodeType.Method
   public static boolean isTightGrouping(IGuardBuilding igb){
        return igb.isTightGrouping();
    }
    @ZenCodeType.Method
   public static BlockPos getGuardPos(IGuardBuilding igb){
        return igb.getGuardPos();
    }
    @ZenCodeType.Method
   public static void setGuardPos(IGuardBuilding igb,BlockPos var1){
        igb.setGuardPos(var1);
    }
    @ZenCodeType.Method
   public static Player getPlayerToFollowOrRally(IGuardBuilding igb){
        return igb.getPlayerToFollowOrRally();
    }
    @ZenCodeType.Method
   public static void setPlayerToFollow(IGuardBuilding igb,Player var1){
        igb.setPlayerToFollow(var1);
    }
    @ZenCodeType.Method
   public static ILocation getRallyLocation(IGuardBuilding igb){
        return igb.getRallyLocation();
    }
    @ZenCodeType.Method
   public static void setRallyLocation(IGuardBuilding igb,ILocation var1){
        igb.setRallyLocation(var1);
    }
    @ZenCodeType.Method
   public static BlockPos getPositionToFollow(IGuardBuilding igb){
        return igb.getPositionToFollow();
    }
    @ZenCodeType.Method
   public static void addPatrolTargets(IGuardBuilding igb,BlockPos var1){
        igb.addPatrolTargets(var1);
    }
    @ZenCodeType.Method
   public static void resetPatrolTargets(IGuardBuilding igb){
        igb.resetPatrolTargets();
    }
    @ZenCodeType.Method
   public static int getBonusVision(IGuardBuilding igb){
        return igb.getBonusVision();
    }
    @ZenCodeType.Method
   public static void calculateMobs(IGuardBuilding igb){
        igb.calculateMobs();
    }
    @ZenCodeType.Method
   public static boolean requiresManualTarget(IGuardBuilding igb){
        return igb.requiresManualTarget();
    }
    @ZenCodeType.Method
   public static void setTempNextPatrolPoint(IGuardBuilding igb,BlockPos var1){
        igb.setTempNextPatrolPoint(var1);
    }
    @ZenCodeType.Method
   public static BlockPos getMinePos(IGuardBuilding igb){
        return igb.getMinePos();
    }
}
