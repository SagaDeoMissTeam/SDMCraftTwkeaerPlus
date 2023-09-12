package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings.workerbuildings;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.buildings.workerbuildings.ITownHall;
import com.minecolonies.api.colony.permissions.PermissionEvent;
import com.minecolonies.api.tileentities.AbstractTileEntityWareHouse;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import org.openzen.zencode.java.ZenCodeType;

import java.util.UUID;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/workerbuildings/ITownHall")
@NativeTypeRegistration(value = ITownHall.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.workerbuildings.ITownHall")
public class ExpandITownHall {
    @ZenCodeType.Method
    public static void addPermissionEvent(ITownHall iTownHall, PermissionEvent var1){
        iTownHall.addPermissionEvent(var1);
    }

    @ZenCodeType.Method
    public static void removePermissionEvents(ITownHall iTownHall,String uuid){
        iTownHall.removePermissionEvents(UUID.fromString(uuid));
    }
}
