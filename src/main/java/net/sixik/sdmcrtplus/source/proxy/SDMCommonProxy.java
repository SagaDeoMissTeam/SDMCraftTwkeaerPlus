package net.sixik.sdmcrtplus.source.proxy;

import com.aizistral.enigmaticlegacy.client.QuoteHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sixik.sdmcrtplus.Sdmcrtplus;
import net.sixik.sdmcrtplus.source.cinematic.Commands.StartVideoCommand;
import net.sixik.sdmcrtplus.source.lore.client.LoreQuoteHandler;

public class SDMCommonProxy {

    public SDMCommonProxy() {

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(this::onServerStarting);
        MinecraftForge.EVENT_BUS.addListener(this::onCommandRegister);
    }


    public void loadComplete(FMLLoadCompleteEvent event){

    }


    public void onServerStarting(ServerStartingEvent event) {
        Sdmcrtplus.isServer = true;
        Sdmcrtplus.onlyServer(event.getServer());
        StartVideoCommand.register(event.getServer().getCommands().getDispatcher());
    }

    public void onCommandRegister(RegisterCommandsEvent e){
        StartVideoCommand.register(e.getDispatcher());
    }
}
