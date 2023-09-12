package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.tileentities;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.tileentities.TileEntityGrave;
import com.minecolonies.api.tileentities.TileEntityRack;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/tileentities/TileEntityGrave")
@NativeTypeRegistration(value = TileEntityGrave.class, zenCodeName = "mods.sdmcrtplus.integration.api.tileentities.TileEntityGrave")
public class ExpandTileEntityGrave {
}
