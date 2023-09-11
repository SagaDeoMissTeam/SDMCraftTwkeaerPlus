package net.sixik.sdmcrtplus.CrT;

import com.blamejared.crafttweaker.api.plugin.*;
import com.blamejared.crafttweaker.api.zencode.scriptrun.IScriptRunModuleConfigurator;
import net.sixik.sdmcrtplus.SDMConstants;
import net.sixik.sdmcrtplus.Sdmcrtplus;

@CraftTweakerPlugin(Sdmcrtplus.MODID + ":main")
@SuppressWarnings("unused")
public class SDMCTPlugin implements ICraftTweakerPlugin {

    public SDMCTPlugin(){

    }

    @Override
    public void registerLoaders(ILoaderRegistrationHandler handler) {
        handler.registerLoader(SDMConstants.CT_LOADER);
    }

    @Override
    public void registerLoadSource(IScriptLoadSourceRegistrationHandler handler) {
        handler.registerLoadSource(SDMConstants.PRE_REGISTRY_LOAD_SOURCE);
    }

    @Override
    public void registerModuleConfigurators(IScriptRunModuleConfiguratorRegistrationHandler handler) {
        handler.registerConfigurator(SDMConstants.CT_LOADER, IScriptRunModuleConfigurator.createDefault(Sdmcrtplus.MODID));
    }

    @Override
    public void registerListeners(IListenerRegistrationHandler handler) {
        handler.onCraftTweakerLoadCompletion(Sdmcrtplus::loadScripts);
    }
}
