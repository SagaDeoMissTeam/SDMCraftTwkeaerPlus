package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings.workerbuildings;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.buildings.workerbuildings.ITownHallView;
import com.minecolonies.api.colony.buildings.workerbuildings.IWareHouse;
import com.minecolonies.api.tileentities.AbstractTileEntityWareHouse;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/workerbuildings/IWareHouse")
@NativeTypeRegistration(value = IWareHouse.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.workerbuildings.IWareHouse")
public class ExpandIWareHouse {

    @ZenCodeType.Method
   public static boolean canAccessWareHouse(IWareHouse iWareHouse, ICitizenData var1){
       return iWareHouse.canAccessWareHouse(var1);
   }
    @ZenCodeType.Method
   public static void upgradeContainers(IWareHouse iWareHouse,Level var1){
        iWareHouse.upgradeContainers(var1);
    }
    @ZenCodeType.Method
   public static AbstractTileEntityWareHouse getTileEntity(IWareHouse iWareHouse){
        return iWareHouse.getTileEntity();
    }
    @ZenCodeType.Method
   public static boolean hasContainerPosition(IWareHouse iWareHouse,BlockPos var1){
        return iWareHouse.hasContainerPosition(var1);
    }
}
