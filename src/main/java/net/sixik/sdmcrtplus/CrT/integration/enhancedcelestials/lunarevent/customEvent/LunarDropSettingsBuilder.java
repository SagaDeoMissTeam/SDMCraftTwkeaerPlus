package net.sixik.sdmcrtplus.CrT.integration.enhancedcelestials.lunarevent.customEvent;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import corgitaco.enhancedcelestials.api.lunarevent.DropSettings;
import net.sixik.sdmcrtplus.SDMConstants;
import org.openzen.zencode.java.ZenCodeType;


@Document("mods/sdmcrtplus/integration/enhancedcelestials/lunarevent/customEvent/LunarDropSettingsBuilder")
@ZenCodeType.Name("mods.sdmcrtplus.integration.enhancedcelestials.lunarevent.customEvent.LunarDropSettingsBuilder")
@ZenRegister(modDeps = "enhancedcelestials", loaders = SDMConstants.CT_LOADER)
public class LunarDropSettingsBuilder {

    public DropSettings dropSettings;
    @ZenCodeType.Constructor
    public LunarDropSettingsBuilder(){

    }
    @ZenCodeType.Method
    public LunarDropSettingsBuilder build(){
        this.dropSettings = DropSettings.EMPTY;
        return this;
    }

    public DropSettings getDropSettings() {
        return dropSettings;
    }
}
