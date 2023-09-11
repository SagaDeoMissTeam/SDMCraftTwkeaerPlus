package net.sixik.sdmcrtplus.CrT.integration.enhancedcelestials.lunarevent.customEvent;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import corgitaco.enhancedcelestials.api.client.ColorSettings;
import corgitaco.enhancedcelestials.api.lunarevent.client.LunarEventClientSettings;
import net.minecraft.resources.ResourceLocation;
import net.sixik.sdmcrtplus.SDMConstants;
import org.openzen.zencode.java.ZenCodeType;

import javax.annotation.Nullable;

@Document("mods/sdmcrtplus/integration/enhancedcelestials/lunarevent/customEvent/LunarEventClientSettingsBuilder")
@ZenCodeType.Name("mods.sdmcrtplus.integration.enhancedcelestials.lunarevent.customEvent.LunarEventClientSettingsBuilder")
@ZenRegister(modDeps = "enhancedcelestials", loaders = SDMConstants.CT_LOADER)
public class LunarEventClientSettingsBuilder {

    public LunarEventClientSettings lunarEventClientSettings;
    @ZenCodeType.Constructor
    public LunarEventClientSettingsBuilder(){

    }

    @ZenCodeType.Method
    public LunarEventClientSettingsBuilder build(String skyLightHexColor, String moonTextureHexColor, float moonSize, @ZenCodeType.Nullable ResourceLocation moonTextureLocation){
        this.lunarEventClientSettings = new LunarEventClientSettings(new ColorSettings(skyLightHexColor, moonTextureHexColor), moonSize, moonTextureLocation, null);
        return this;
    }

    public LunarEventClientSettings getLunarEventClientSettings() {
        return lunarEventClientSettings;
    }
}
