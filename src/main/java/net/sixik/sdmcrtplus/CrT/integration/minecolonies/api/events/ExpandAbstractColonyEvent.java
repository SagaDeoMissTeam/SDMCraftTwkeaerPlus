package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.event.AbstractColonyEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/events/AbstractColonyEvent")
@NativeTypeRegistration(value = AbstractColonyEvent.class, zenCodeName = "mods.sdmcrtplus.integration.api.events.AbstractColonyEvent")
public class ExpandAbstractColonyEvent {

    @ZenCodeType.Method
    public static IColony getColony(AbstractColonyEvent event){
        return event.getColony();
    }
}
