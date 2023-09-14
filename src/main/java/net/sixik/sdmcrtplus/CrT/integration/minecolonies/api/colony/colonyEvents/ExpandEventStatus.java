package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.colonyEvents;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.colonyEvents.EventStatus;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/colonyEvents/EventStatus")
@NativeTypeRegistration(value = EventStatus.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.colonyEvents.EventStatus")
@BracketEnum("minecolonies:events/status")
public class ExpandEventStatus {

}
