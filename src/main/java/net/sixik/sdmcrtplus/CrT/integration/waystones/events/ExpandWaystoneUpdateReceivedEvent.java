package net.sixik.sdmcrtplus.CrT.integration.waystones.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.blay09.mods.waystones.api.IWaystone;
import net.blay09.mods.waystones.api.WaystoneUpdateReceivedEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/events/WaystoneUpdateReceivedEvent")
@NativeTypeRegistration(value = WaystoneUpdateReceivedEvent.class,zenCodeName = "mods.sdmcrtplus.integration.waystones.events.WaystoneUpdateReceivedEvent")
public class ExpandWaystoneUpdateReceivedEvent {

    @ZenCodeType.Method
    public static IWaystone getWaystone(WaystoneUpdateReceivedEvent waystoneUpdateReceivedEvent){
        return waystoneUpdateReceivedEvent.getWaystone();
    }
}
