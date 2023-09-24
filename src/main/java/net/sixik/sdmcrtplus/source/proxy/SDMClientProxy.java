package net.sixik.sdmcrtplus.source.proxy;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sixik.sdmcrtplus.source.lore.client.LoreQuoteHandler;

import java.util.Random;

public class SDMClientProxy extends SDMCommonProxy{

    private static final Random RANDOM = new Random();
    public SDMClientProxy() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::onClientSetup);

        MinecraftForge.EVENT_BUS.register(LoreQuoteHandler.INSTANCE);
    }

    @Override
    public void loadComplete(FMLLoadCompleteEvent event) {

    }


    @OnlyIn(Dist.CLIENT)
    public void onClientSetup(FMLClientSetupEvent event) {

    }
}
