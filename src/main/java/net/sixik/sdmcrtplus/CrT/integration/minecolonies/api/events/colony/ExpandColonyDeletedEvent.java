package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.events.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.event.ColonyDeletedEvent;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/events/colony/ColonyDeletedEvent")
@NativeTypeRegistration(value = ColonyDeletedEvent.class, zenCodeName = "mods.sdmcrtplus.integration.api.events.colony.ColonyDeletedEvent")
public class ExpandColonyDeletedEvent {

}
