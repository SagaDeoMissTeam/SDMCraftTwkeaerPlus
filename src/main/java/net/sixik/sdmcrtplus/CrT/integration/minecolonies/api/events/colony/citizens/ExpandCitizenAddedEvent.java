package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.events.colony.citizens;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.citizens.event.CitizenAddedEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/events/colony/citizens/CitizenAddedEvent")
@NativeTypeRegistration(value = CitizenAddedEvent.class, zenCodeName = "mods.sdmcrtplus.integration.api.events.colony.citizens.CitizenAddedEvent")
public class ExpandCitizenAddedEvent {
    @ZenCodeType.Method
    public static CitizenAddedEvent.Source getSource(CitizenAddedEvent event){
      return event.getSource();
    }
}
