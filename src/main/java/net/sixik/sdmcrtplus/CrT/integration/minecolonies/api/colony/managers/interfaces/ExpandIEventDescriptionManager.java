package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.managers.interfaces;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.colonyEvents.descriptions.IColonyEventDescription;
import com.minecolonies.api.colony.managers.interfaces.IEventDescriptionManager;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/managers/interfaces/IEventDescriptionManager")
@NativeTypeRegistration(value = IEventDescriptionManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.managers.interfaces.IEventDescriptionManager")
public class ExpandIEventDescriptionManager {

    @ZenCodeType.Method
    public static void addEventDescription(IEventDescriptionManager iEventDescriptionManager, IColonyEventDescription var1){
        iEventDescriptionManager.addEventDescription(var1);
    }
    @ZenCodeType.Method
    public static List<IColonyEventDescription> getEventDescriptions(IEventDescriptionManager iEventDescriptionManager){
        return iEventDescriptionManager.getEventDescriptions();
    }
}
