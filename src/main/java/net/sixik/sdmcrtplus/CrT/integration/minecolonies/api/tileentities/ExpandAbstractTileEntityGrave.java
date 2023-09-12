package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.tileentities;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IGraveData;
import com.minecolonies.api.tileentities.AbstractTileEntityGrave;
import com.minecolonies.api.tileentities.AbstractTileEntityRack;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/tileentities/AbstractTileEntityGrave")
@NativeTypeRegistration(value = AbstractTileEntityGrave.class, zenCodeName = "mods.sdmcrtplus.integration.api.tileentities.AbstractTileEntityGrave")
public class ExpandAbstractTileEntityGrave {

    @ZenCodeType.Method
    public static IGraveData getGraveData(AbstractTileEntityGrave abstractTileEntityGrave) {
        return abstractTileEntityGrave.getGraveData();
    }

    @ZenCodeType.Method
    public static void setGraveData(AbstractTileEntityGrave abstractTileEntityGrave ,IGraveData graveData) {
        abstractTileEntityGrave.setGraveData(graveData);
    }
}
