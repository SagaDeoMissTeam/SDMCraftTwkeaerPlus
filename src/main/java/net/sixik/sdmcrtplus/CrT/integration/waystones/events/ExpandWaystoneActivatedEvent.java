package net.sixik.sdmcrtplus.CrT.integration.waystones.events;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.blay09.mods.waystones.api.IWaystone;
import net.blay09.mods.waystones.api.WaystoneActivatedEvent;
import net.minecraft.world.entity.player.Player;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/events/WaystoneActivatedEvent")
@NativeTypeRegistration(value = WaystoneActivatedEvent.class,zenCodeName = "mods.sdmcrtplus.integration.waystones.events.WaystoneActivatedEvent")
public class ExpandWaystoneActivatedEvent {

    @ZenCodeType.Method
    public static IWaystone getWaystone(WaystoneActivatedEvent waystoneActivatedEvent){
        return waystoneActivatedEvent.getWaystone();
    }
    @ZenCodeType.Method
    public static Player getPlayer(WaystoneActivatedEvent waystoneActivatedEvent){
        return waystoneActivatedEvent.getPlayer();
    }
}
