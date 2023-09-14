package net.sixik.sdmcrtplus;

import com.blamejared.crafttweaker.CraftTweakerCommon;
import com.blamejared.crafttweaker.CraftTweakerRegistries;
import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.CraftTweakerConstants;
import com.blamejared.crafttweaker.api.zencode.IScriptLoadSource;
import com.blamejared.crafttweaker.api.zencode.IScriptLoader;
import com.blamejared.crafttweaker.api.zencode.scriptrun.IScriptRun;
import com.blamejared.crafttweaker.api.zencode.scriptrun.ScriptRunConfiguration;
import com.blamejared.crafttweaker.impl.preprocessor.LoaderPreprocessor;
import com.blamejared.crafttweaker.impl.script.scriptrun.ScriptRunManager;
import com.blamejared.crafttweaker.platform.Services;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;
import net.sixik.sdmcrtplus.source.EventListener;
import net.sixik.sdmcrtplus.source.integration.ftbquest.FTBQuestIntegration;
import net.sixik.sdmcrtplus.source.integration.ftbteam.FTBTeamsIntegration;
import org.openzen.zenscript.javabytecode.JavaBytecodeRunUnit;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Sdmcrtplus.MODID)
public class Sdmcrtplus {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "sdmcrtplus";
    public static final Logger LOGGER = LogUtils.getLogger();
    public Sdmcrtplus() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(EventListener.class);
        MinecraftForge.EVENT_BUS.addListener(CustomParameters::modReload);

        if(Services.PLATFORM.isModLoaded("ftbquest")) FTBQuestIntegration.init();
        if(Services.PLATFORM.isModLoaded("ftbteams")) FTBTeamsIntegration.init();
        modEventBus.addListener(EventPriority.LOW, this::register);
    }

    public static void loadScripts(){
        final ScriptRunConfiguration scriptRunConfiguration = new ScriptRunConfiguration(SDMConstants.CT_LOADER, SDMConstants.PRE_REGISTRY_LOAD_SOURCE, ScriptRunConfiguration.RunKind.EXECUTE);
        final IScriptRun run = CraftTweakerAPI.getScriptRunManager().createScriptRun(scriptRunConfiguration);
        try {
            run.execute();
        } catch (final Throwable e) {
            CraftTweakerAPI.LOGGER.error("An error occurred while trying to run SDM scripts", e);
        }
    }

    private void register(RegisterEvent event){
        final ScriptRunConfiguration scriptRunConfiguration = new ScriptRunConfiguration(SDMConstants.CT_LOADER, SDMConstants.PRE_REGISTRY_LOAD_SOURCE, ScriptRunConfiguration.RunKind.EXECUTE);
        final IScriptRun run = CraftTweakerAPI.getScriptRunManager().createScriptRun(scriptRunConfiguration);
        
        try {
            run.execute();
        } catch (final Throwable e) {
            CraftTweakerAPI.LOGGER.error("An error occurred while trying to run SDM scripts", e);
        }
    }
//    public void registerLunarEvents(final FMLCommonSetupEvent event){
//        if(Services.PLATFORM.isModLoaded("enhancedcelestials")) {
//            try {
//                IScriptLoader scriptLoader = CraftTweakerAPI.getRegistry().findLoader(MODID);
//                CraftTweakerAPI.getScriptRunManager().createScriptRun(new ScriptRunConfiguration(
//                        scriptLoader,
//                        IScriptLoadSource.find(new ResourceLocation(MODID)),
//                        ScriptRunConfiguration.RunKind.EXECUTE
//                )).execute();
//            } catch (Throwable e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
