package net.sixik.sdmcrtplus.CrT.integration.enhancedcelestials.lunarevent.customEvent;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import corgitaco.enhancedcelestials.api.lunarevent.LunarTextComponents;
import corgitaco.enhancedcelestials.util.CustomTranslationTextComponent;
import net.minecraft.network.chat.Component;
import net.sixik.sdmcrtplus.SDMConstants;
import org.openzen.zencode.java.ZenCodeType;

@Document("mods/sdmcrtplus/integration/enhancedcelestials/lunarevent/customEvent/LunarTextComponentsBuilder")
@ZenCodeType.Name("mods.sdmcrtplus.integration.enhancedcelestials.lunarevent.customEvent.LunarTextComponentsBuilder")
@ZenRegister(modDeps = "enhancedcelestials", loaders = SDMConstants.CT_LOADER)
public class LunarTextComponentsBuilder {

    public LunarTextComponents textComponents;

    @ZenCodeType.Constructor
    public LunarTextComponentsBuilder(){

    }

    @ZenCodeType.Method
    public LunarTextComponentsBuilder build(String translationName, String translationRiseNotification, String translationSetNotification){
        this.textComponents = new LunarTextComponents(
                new CustomTranslationTextComponent(translationName, new CustomTranslationTextComponent[0]),
                new CustomTranslationTextComponent(translationRiseNotification, new CustomTranslationTextComponent[0]),
                new CustomTranslationTextComponent(translationSetNotification, new CustomTranslationTextComponent[0])
        );
        return this;
    }

    public LunarTextComponents getTextComponents() {
        return textComponents;
    }
}
