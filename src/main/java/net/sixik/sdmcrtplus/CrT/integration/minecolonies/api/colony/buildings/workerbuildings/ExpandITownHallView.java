package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings.workerbuildings;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.buildings.workerbuildings.ITownHallView;
import com.minecolonies.api.colony.colonyEvents.descriptions.IColonyEventDescription;
import com.minecolonies.api.colony.permissions.PermissionEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/workerbuildings/ITownHallView")
@NativeTypeRegistration(value = ITownHallView.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.workerbuildings.ITownHallView")
public class ExpandITownHallView {

    @ZenCodeType.Method
   public static List<PermissionEvent> getPermissionEvents(ITownHallView iTownHallView){
       return iTownHallView.getPermissionEvents();
   }
    @ZenCodeType.Method
   public static List<IColonyEventDescription> getColonyEvents(ITownHallView iTownHallView){
        return iTownHallView.getColonyEvents();
    }
    @ZenCodeType.Method
   public static boolean canPlayerUseTP(ITownHallView iTownHallView){
        return iTownHallView.canPlayerUseTP();
    }
}
