package net.sixik.sdmcrtplus.CrT.integration.waystones.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.blay09.mods.waystones.api.WaystoneTeleportEvent;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/events/WaystoneTeleportPostEvent")
@NativeTypeRegistration(value = WaystoneTeleportEvent.Post.class,zenCodeName = "mods.sdmcrtplus.integration.waystones.events.WaystoneTeleportPostEvent")
public class ExpandWaystoneTeleportPostEvent {

    @ZenCodeType.Method
    public static List<Entity> getAdditionalEntities(WaystoneTeleportEvent.Post event){
        return event.getContext().getAdditionalEntities();
    }
    @ZenCodeType.Method
    public static Entity getEntity(WaystoneTeleportEvent.Post event){
        return event.getContext().getEntity();
    }
    @ZenCodeType.Method
    public static int getCooldown(WaystoneTeleportEvent.Post event){
        return event.getContext().getCooldown();
    }
    @ZenCodeType.Method
    public static int getXpCost(WaystoneTeleportEvent.Post event){
        return event.getContext().getXpCost();
    }
    @ZenCodeType.Method
    public static BlockPos getPos(WaystoneTeleportEvent.Post event){
        return event.getContext().getFromWaystone().getPos();
    }
    @ZenCodeType.Method
    public static String getWaystoneUid(WaystoneTeleportEvent.Post event){
        return event.getContext().getFromWaystone().getWaystoneUid().toString();
    }
    @ZenCodeType.Method
    public static ResourceLocation getWaystoneType(WaystoneTeleportEvent.Post event){
        return event.getContext().getFromWaystone().getWaystoneType();
    }
    @ZenCodeType.Method
    public static Direction getDirection(WaystoneTeleportEvent.Post event){
        return event.getContext().getDestination().getDirection();
    }
    @ZenCodeType.Method
    public static ServerLevel getLevel(WaystoneTeleportEvent.Post event){
        return event.getContext().getDestination().getLevel();
    }
    @ZenCodeType.Method
    public static Vec3 getLocation(WaystoneTeleportEvent.Post event){
        return event.getContext().getDestination().getLocation();
    }
    @ZenCodeType.Method
    public static String getOwnerUid(WaystoneTeleportEvent.Post event){
        return event.getContext().getTargetWaystone().getOwnerUid().toString();
    }
    @ZenCodeType.Method
    public static double getXpCostMultiplier(WaystoneTeleportEvent.Post event){
        return event.getContext().getWarpMode().getXpCostMultiplier();
    }
}
