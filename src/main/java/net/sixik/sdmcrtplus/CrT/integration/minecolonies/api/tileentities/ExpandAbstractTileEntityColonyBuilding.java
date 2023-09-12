package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.tileentities;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.tileentities.AbstractTileEntityColonyBuilding;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Tuple;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.Map;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/tileentities/AbstractTileEntityColonyBuilding")
@NativeTypeRegistration(value = AbstractTileEntityColonyBuilding.class, zenCodeName = "mods.sdmcrtplus.integration.api.tileentities.AbstractTileEntityColonyBuilding")
public class ExpandAbstractTileEntityColonyBuilding {

    @ZenCodeType.Method
    public static BlockPos getTilePos(AbstractTileEntityColonyBuilding  abstractTileEntityColonyBuilding){
        return abstractTileEntityColonyBuilding.getTilePos();
    }
    @ZenCodeType.Method
    public static Map<BlockPos, List<String>> getPositionedTags(AbstractTileEntityColonyBuilding  abstractTileEntityColonyBuilding){
        return abstractTileEntityColonyBuilding.getPositionedTags();
    }
    @ZenCodeType.Method
    public static Tuple<BlockPos, BlockPos> getSchematicCorners(AbstractTileEntityColonyBuilding  abstractTileEntityColonyBuilding){
        return abstractTileEntityColonyBuilding.getSchematicCorners();
    }
}
