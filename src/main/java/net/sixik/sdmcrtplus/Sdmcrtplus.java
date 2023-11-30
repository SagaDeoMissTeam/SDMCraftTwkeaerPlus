package net.sixik.sdmcrtplus;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.zencode.scriptrun.IScriptRun;
import com.blamejared.crafttweaker.api.zencode.scriptrun.ScriptRunConfiguration;
import com.blamejared.crafttweaker.platform.Services;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.registries.RegisterEvent;
import net.sixik.sdmcrtplus.configs.ConfigBase;
import net.sixik.sdmcrtplus.configs.ConfigInit;
import net.sixik.sdmcrtplus.source.EventListener;
import net.sixik.sdmcrtplus.source.cinematic.Commands.StartVideoCommand;
import net.sixik.sdmcrtplus.source.cinematic.client.ClientHandler;
import net.sixik.sdmcrtplus.source.cinematic.networking.PacketHandler;
import net.sixik.sdmcrtplus.source.cinematic.utils.FancyEvents;
import net.sixik.sdmcrtplus.source.cinematic.utils.FileManager;
import net.sixik.sdmcrtplus.source.client.Restricted.ClientGUIRestrictedBase;
import net.sixik.sdmcrtplus.source.client.events.SDMClientEvents;
import net.sixik.sdmcrtplus.source.integration.ftblibrary.FTBLibraryIntegration;
import net.sixik.sdmcrtplus.source.integration.ftbquest.FTBQuestIntegration;
import net.sixik.sdmcrtplus.source.integration.ftbteam.FTBTeamsIntegration;
import net.sixik.sdmcrtplus.source.lore.network.PacketPlayLoreQuote;
import net.sixik.sdmcrtplus.source.network.ModMessage;
import net.sixik.sdmcrtplus.source.proxy.SDMClientProxy;
import net.sixik.sdmcrtplus.source.proxy.SDMCommonProxy;
import net.sixik.sdmcrtplus.source.register.ModSounds;
import net.sixik.sdmcrtplus.source.sixikrpg.events.LivingEntityEvents;
import net.sixik.sdmcrtplus.source.sixikrpg.register.EntityRegisters;
import net.sixik.sdmcrtplus.source.timer.SDMTimer;
import org.slf4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Mod(Sdmcrtplus.MODID)
public class Sdmcrtplus {

    public static final Map<ResourceLocation, ClientGUIRestrictedBase> CLIENT_GUI_RESTRICTED = new HashMap<>();
    public static final String MODID = "sdmcrtplus";
    public static final Logger LOGGER = LogUtils.getLogger();



    public static boolean isServer;

    private static FileManager fileManager;
    public static final SDMCommonProxy PROXY = DistExecutor.unsafeRunForDist(() -> SDMClientProxy::new, () -> SDMCommonProxy::new);
    public static SimpleChannel packetInstance;
    public Sdmcrtplus() {
        ConfigInit.init();

        ModSounds.register(FMLJavaModLoadingContext.get().getModEventBus());

        FMLJavaModLoadingContext.get().getModEventBus().register(this);
//        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        FMLJavaModLoadingContext.get().getModEventBus().register(PROXY);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadComplete);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadClient);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(PROXY);
        MinecraftForge.EVENT_BUS.register(SDMTimer.class);
        MinecraftForge.EVENT_BUS.register(LivingEntityEvents.class);
        MinecraftForge.EVENT_BUS.register(EventListener.class);
        MinecraftForge.EVENT_BUS.addListener(CustomParameters::modReload);
        MinecraftForge.EVENT_BUS.addListener(this::reload);

        if(ModList.get().isLoaded("ftblibrary")) FTBLibraryIntegration.init();
        if(ModList.get().isLoaded("ftbquests")) FTBQuestIntegration.init();
        if(ModList.get().isLoaded("ftbteams")) FTBTeamsIntegration.init();
    }

    private void reload(AddReloadListenerEvent event){
        event.addListener(EntityRegisters.INSTANCE);
    }

    private void setup(FMLCommonSetupEvent event){
        packetInstance = NetworkRegistry.ChannelBuilder.named(new ResourceLocation(MODID, "main")).networkProtocolVersion(() -> {
            return "1";
        }).clientAcceptedVersions("1"::equals).serverAcceptedVersions("1"::equals).simpleChannel();
        packetInstance.registerMessage(0, PacketPlayLoreQuote.class, PacketPlayLoreQuote::encode, PacketPlayLoreQuote::decode, PacketPlayLoreQuote::handle);

        ModMessage.register();
        PacketHandler.init();
    }

    private void loadComplete(FMLLoadCompleteEvent event){
        PROXY.loadComplete(event);
    }

    private void onlyClient(){
        LOGGER.info("SDM Cinematic Mod is loaded in client");
        MinecraftForge.EVENT_BUS.register(ClientHandler.ClientEvents.class);

        FancyEvents fancyEvents = new FancyEvents();
        fancyEvents.register();

        final File VIDEO_DIR = new File(Minecraft.getInstance().gameDirectory,"video");
        fileManager = new FileManager(VIDEO_DIR);

    }

    public static void onlyServer(MinecraftServer MCserver){
        LOGGER.info("SDM Cinematic Mod is loaded in server");
        final File VIDEO_DIR = new File(MCserver.getServerDirectory(),"video");
        fileManager = new FileManager(VIDEO_DIR);
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

    public void  loadClient(FMLClientSetupEvent event){
        isServer = false;
        onlyClient();
    }


    public static FileManager getFileManager() {
        return fileManager;
    }
    public static boolean isServer(){return isServer;}



//    @SubscribeEvent
//    public void onCommandRegister(RegisterCommandsEvent e){
//        LOGGER.debug("[SIXIK] REGISTER");
//        StartVideoCommand.register(e.getDispatcher());
//    }

//    // You can use SubscribeEvent and let the Event Bus discover methods to call
//    @SubscribeEvent
//    public void onServerStarting(ServerStartingEvent event) {
//
//    }
}
