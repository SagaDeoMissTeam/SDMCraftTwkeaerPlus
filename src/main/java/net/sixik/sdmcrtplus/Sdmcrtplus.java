package net.sixik.sdmcrtplus;

import com.blamejared.crafttweaker.platform.Services;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sixik.sdmcrtplus.source.EventListener;
import net.sixik.sdmcrtplus.source.integration.ftbquest.FTBQuestIntegration;
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
    }



    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
