package net.sixik.sdmcrtplus.CrT.integration.waystones.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.blay09.mods.waystones.api.IWaystone;
import net.blay09.mods.waystones.api.KnownWaystonesEvent;
import net.blay09.mods.waystones.api.WaystoneActivatedEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/events/KnownWaystonesEvent")
@NativeTypeRegistration(value = KnownWaystonesEvent.class,zenCodeName = "mods.sdmcrtplus.integration.waystones.events.KnownWaystonesEvent")
public class ExpandKnownWaystonesEvent {

    @ZenCodeType.Method
    public static List<IWaystone> getWaystones(KnownWaystonesEvent knownWaystonesEvent) {
        return knownWaystonesEvent.getWaystones();
    }
}
