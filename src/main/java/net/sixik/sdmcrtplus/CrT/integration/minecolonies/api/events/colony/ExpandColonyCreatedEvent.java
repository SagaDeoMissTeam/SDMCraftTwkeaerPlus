package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.events.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.event.ColonyCreatedEvent;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/events/colony/ColonyCreatedEvent")
@NativeTypeRegistration(value = ColonyCreatedEvent.class, zenCodeName = "mods.sdmcrtplus.integration.api.events.colony.ColonyCreatedEvent")
public class ExpandColonyCreatedEvent {

}
