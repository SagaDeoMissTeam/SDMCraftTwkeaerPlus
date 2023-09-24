package net.sixik.sdmcrtplus;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.zencode.scriptrun.IScriptRun;
import com.blamejared.crafttweaker.api.zencode.scriptrun.ScriptRunConfiguration;
import com.blamejared.crafttweaker.platform.Services;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.registries.RegisterEvent;
import net.sixik.sdmcrtplus.source.EventListener;
import net.sixik.sdmcrtplus.source.integration.ftbquest.FTBQuestIntegration;
import net.sixik.sdmcrtplus.source.integration.ftbteam.FTBTeamsIntegration;
import net.sixik.sdmcrtplus.source.lore.network.PacketPlayLoreQuote;
import net.sixik.sdmcrtplus.source.proxy.SDMClientProxy;
import net.sixik.sdmcrtplus.source.proxy.SDMCommonProxy;
import net.sixik.sdmcrtplus.source.register.ModSounds;
import net.sixik.sdmcrtplus.source.timer.SDMTimer;
import org.slf4j.Logger;


@Mod(Sdmcrtplus.MODID)
public class Sdmcrtplus {
    public static final String MODID = "sdmcrtplus";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final SDMCommonProxy PROXY = DistExecutor.unsafeRunForDist(() -> SDMClientProxy::new, () -> SDMCommonProxy::new);
    public static SimpleChannel packetInstance;
    public Sdmcrtplus() {

        ModSounds.register(FMLJavaModLoadingContext.get().getModEventBus());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadComplete);
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        FMLJavaModLoadingContext.get().getModEventBus().register(PROXY);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(PROXY);
        MinecraftForge.EVENT_BUS.register(SDMTimer.class);
        MinecraftForge.EVENT_BUS.register(EventListener.class);
        MinecraftForge.EVENT_BUS.addListener(CustomParameters::modReload);

        if(Services.PLATFORM.isModLoaded("ftbquest")) FTBQuestIntegration.init();
        if(Services.PLATFORM.isModLoaded("ftbteams")) FTBTeamsIntegration.init();
    }


    private void setup(FMLCommonSetupEvent event){
        packetInstance = NetworkRegistry.ChannelBuilder.named(new ResourceLocation(MODID, "main")).networkProtocolVersion(() -> {
            return "1";
        }).clientAcceptedVersions("1"::equals).serverAcceptedVersions("1"::equals).simpleChannel();
        packetInstance.registerMessage(0, PacketPlayLoreQuote.class, PacketPlayLoreQuote::encode, PacketPlayLoreQuote::decode, PacketPlayLoreQuote::handle);
    }

    private void loadComplete(FMLLoadCompleteEvent event){
        PROXY.loadComplete(event);
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

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


//    // You can use SubscribeEvent and let the Event Bus discover methods to call
//    @SubscribeEvent
//    public void onServerStarting(ServerStartingEvent event) {
//
//    }
}
