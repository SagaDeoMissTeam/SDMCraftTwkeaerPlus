package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.tileentities;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.tileentities.TileEntityRack;
import com.minecolonies.coremod.tileentities.TileEntityWareHouse;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/tileentities/TileEntityWareHouse")
@NativeTypeRegistration(value = TileEntityWareHouse.class, zenCodeName = "mods.sdmcrtplus.integration.api.tileentities.TileEntityWareHouse")
public class ExpandTileEntityWareHouse {

    @ZenCodeType.Method
    public static BlockEntity getRackForStack(TileEntityWareHouse tileEntityWareHouse, IItemStack itemStack){
        return tileEntityWareHouse.getRackForStack(itemStack.getInternal());
    }
}
