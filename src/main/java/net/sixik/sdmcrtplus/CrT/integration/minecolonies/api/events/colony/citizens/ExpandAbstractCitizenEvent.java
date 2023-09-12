package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.events.colony.citizens;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizen;
import com.minecolonies.api.colony.citizens.event.AbstractCitizenEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/events/colony/citizens/AbstractCitizenEvent")
@NativeTypeRegistration(value = AbstractCitizenEvent.class, zenCodeName = "mods.sdmcrtplus.integration.api.events.colony.citizens.AbstractCitizenEvent")
public class ExpandAbstractCitizenEvent {
    @ZenCodeType.Method
    public static ICitizen getCitizen(AbstractCitizenEvent event){
        return event.getCitizen();
    }

}
