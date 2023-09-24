package net.sixik.sdmcrtplus.CrT.integration.waystones.error;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.blay09.mods.waystones.api.WaystoneTeleportError;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/SpecificLeashedWarpDenied")
@NativeTypeRegistration(value = WaystoneTeleportError.SpecificLeashedWarpDenied.class,zenCodeName = "mods.sdmcrtplus.integration.waystones.SpecificLeashedWarpDenied")
public class ExpandSpecificLeashedWarpDenied {
}
