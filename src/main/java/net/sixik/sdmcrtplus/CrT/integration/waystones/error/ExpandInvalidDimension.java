package net.sixik.sdmcrtplus.CrT.integration.waystones.error;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.blay09.mods.waystones.api.WaystoneTeleportError;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/InvalidDimension")
@NativeTypeRegistration(value = WaystoneTeleportError.InvalidDimension.class,zenCodeName = "mods.sdmcrtplus.integration.waystones.InvalidDimension")
public class ExpandInvalidDimension {

    @ZenCodeType.Method
    public static ResourceKey<Level> getDimension(WaystoneTeleportError.InvalidDimension invalidDimension){
        return invalidDimension.getDimension();
    }
}
