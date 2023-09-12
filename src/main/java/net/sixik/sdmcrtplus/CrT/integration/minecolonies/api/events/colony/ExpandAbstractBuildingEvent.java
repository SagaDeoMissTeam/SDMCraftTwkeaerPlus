package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.events.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.colony.buildings.event.AbstractBuildingEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/events/colony/AbstractBuildingEvent")
@NativeTypeRegistration(value = AbstractBuildingEvent.class, zenCodeName = "mods.sdmcrtplus.integration.api.events.colony.AbstractBuildingEvent")
public class ExpandAbstractBuildingEvent {

    @ZenCodeType.Method
    public static IBuilding getBuilding(AbstractBuildingEvent event){
        return event.getBuilding();
    }

}
