package net.sixik.sdmcrtplus.source.integration.ftblibrary;

import dev.ftb.mods.ftblibrary.sidebar.SidebarButtonCreatedEvent;
import dev.architectury.event.EventResult;
import net.minecraftforge.common.MinecraftForge;

public class FTBLibraryIntegration {

    public static void init(){
        SidebarButtonCreatedEvent.EVENT.register(FTBLibraryIntegration::siderButtonEvent);


    }

    private static EventResult siderButtonEvent(SidebarButtonCreatedEvent event){
        event.setCanceled(true);
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new FTBSidebarButtonCreatedEvent(

        )));
    }
}
