package net.sixik.sdmcrtplus.CrT.integration.waystones.error;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.blay09.mods.waystones.api.IWaystone;
import net.blay09.mods.waystones.api.WaystoneTeleportError;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/MissingWaystone")
@NativeTypeRegistration(value = WaystoneTeleportError.MissingWaystone.class,zenCodeName = "mods.sdmcrtplus.integration.waystones.MissingWaystone")
public class ExpandMissingWaystone {

    @ZenCodeType.Method
    public static IWaystone getWaystone(WaystoneTeleportError.MissingWaystone waystoneTeleportError){
        return waystoneTeleportError.getWaystone();
    }
}
