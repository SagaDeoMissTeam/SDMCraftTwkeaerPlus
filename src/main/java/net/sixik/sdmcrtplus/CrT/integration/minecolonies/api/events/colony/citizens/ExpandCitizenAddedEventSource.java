package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.events.colony.citizens;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.citizens.event.CitizenAddedEvent;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/events/colony/citizens/CitizenAddedEventSource")
@NativeTypeRegistration(value = CitizenAddedEvent.Source.class, zenCodeName = "mods.sdmcrtplus.integration.api.events.colony.citizens.CitizenAddedEventSource")
@BracketEnum("minecolonies:event/source")
public class ExpandCitizenAddedEventSource {
}
