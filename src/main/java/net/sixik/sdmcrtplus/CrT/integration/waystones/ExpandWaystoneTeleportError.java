package net.sixik.sdmcrtplus.CrT.integration.waystones;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.blay09.mods.waystones.api.WaystoneTeleportError;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/WaystoneTeleportError")
@NativeTypeRegistration(value = WaystoneTeleportError.class,zenCodeName = "mods.sdmcrtplus.integration.waystones.WaystoneTeleportError")
public class ExpandWaystoneTeleportError {

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable String getTranslationKey(WaystoneTeleportError waystoneTeleportError){
        return waystoneTeleportError.getTranslationKey();
    }
}
