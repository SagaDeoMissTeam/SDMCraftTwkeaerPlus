package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.blocks.interfaces;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.blocks.interfaces.IBlockMinecolonies;
import com.minecolonies.api.blocks.interfaces.IBuildingBrowsableBlock;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/blocks/interfaces/IBuildingBrowsableBlock")
@NativeTypeRegistration(value = IBuildingBrowsableBlock.class, zenCodeName = "mods.sdmcrtplus.integration.api.blocks.interfaces.IBuildingBrowsableBlock")
public class ExpandIBuildingBrowsableBlock {


    @ZenCodeType.Method
    public static boolean shouldBrowseBuildings(IBuildingBrowsableBlock iBuildingBrowsableBlock, PlayerInteractEvent.RightClickItem event) {
        return iBuildingBrowsableBlock.shouldBrowseBuildings(event);
    }

}
