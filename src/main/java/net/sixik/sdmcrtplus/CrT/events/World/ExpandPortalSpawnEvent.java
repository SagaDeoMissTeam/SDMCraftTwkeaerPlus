package net.sixik.sdmcrtplus.CrT.events.World;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.sixik.sdmcrtplus.source.events.PortalSpawnEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/level/PortalSpawnEvent")
@NativeTypeRegistration(value = PortalSpawnEvent.class, zenCodeName = "mods.sdmcrtplus.events.level.PortalSpawnEvent")
public class ExpandPortalSpawnEvent {

    @ZenCodeType.Method
    public static boolean isComplete(PortalSpawnEvent event) {
        return event.getPortalShape().isComplete();
    }
    @ZenCodeType.Method
    public static boolean isValid(PortalSpawnEvent event) {
        return event.getPortalShape().isValid();
    }
    @ZenCodeType.Method
    public static BlockPos getPos(PortalSpawnEvent event) {
        return event.getPos();
    }
    @ZenCodeType.Method
    public static BlockState getState(PortalSpawnEvent event) {
        return event.getState();
    }
    @ZenCodeType.Method
    public static Level getLevel(PortalSpawnEvent event) {
        return (Level) event.getLevel();
    }
    @ZenCodeType.Method
    public static void setCanceled(PortalSpawnEvent event,boolean cancel) {
        event.setCanceled(cancel);
    }
    @ZenCodeType.Method
    public static boolean isCancelable(PortalSpawnEvent event) {
        return event.isCancelable();
    }
    @ZenCodeType.Method
    public static boolean isCanceled(PortalSpawnEvent event) {
        return event.isCanceled();
    }
}
