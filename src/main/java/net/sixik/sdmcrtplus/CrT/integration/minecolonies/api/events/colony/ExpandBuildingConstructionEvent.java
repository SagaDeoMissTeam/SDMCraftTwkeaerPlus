package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.events.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.buildings.event.BuildingConstructionEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/events/BuildingConstructionEvent")
@NativeTypeRegistration(value = BuildingConstructionEvent.class, zenCodeName = "mods.sdmcrtplus.integration.api.events.BuildingConstructionEvent")
public class ExpandBuildingConstructionEvent {

    @ZenCodeType.Method
    public static BuildingConstructionEvent.EventType getEventType(BuildingConstructionEvent event){
        return event.getEventType();
    }

    @ZenRegister(modDeps = "minecolonies")
    @Document("mods/sdmcrtplus/integration/minecolonies/api/events/EventType")
    @NativeTypeRegistration(value = BuildingConstructionEvent.EventType.class, zenCodeName = "mods.sdmcrtplus.integration.api.events.EventType")
    @BracketEnum("minecolonies:events/type/building")
    public static class ExpandEventType{

    }
}
