package net.sixik.sdmcrtplus.CrT.integration.waystones;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.blay09.mods.waystones.api.TeleportDestination;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.phys.Vec3;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/TeleportDestination")
@NativeTypeRegistration(value = TeleportDestination.class,zenCodeName = "mods.sdmcrtplus.integration.waystones.TeleportDestination")
public class ExpandTeleportDestination {
    @ZenCodeType.Method
    public static Vec3 getLocation(TeleportDestination teleportDestination){
        return teleportDestination.getLocation();
    }
    @ZenCodeType.Method
    public static Direction getDirection(TeleportDestination teleportDestination){
        return teleportDestination.getDirection();
    }
    @ZenCodeType.Method
    public static ServerLevel getLevel(TeleportDestination teleportDestination){
        return teleportDestination.getLevel();
    }
}
