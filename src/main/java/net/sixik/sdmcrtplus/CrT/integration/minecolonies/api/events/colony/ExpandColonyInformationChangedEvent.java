package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.events.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.event.ColonyInformationChangedEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/events/colony/ColonyInformationChangedEvent")
@NativeTypeRegistration(value = ColonyInformationChangedEvent.class, zenCodeName = "mods.sdmcrtplus.integration.api.events.colony.ColonyInformationChangedEvent")
public class ExpandColonyInformationChangedEvent {

    @ZenCodeType.Method
    public static ColonyInformationChangedEvent.Type getType(ColonyInformationChangedEvent event){
        return event.getType();
    }

}
