package net.sixik.sdmcrtplus.source.integration.ftblibrary;

import dev.ftb.mods.ftblibrary.sidebar.SidebarButton;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;

@Cancelable
public class FTBSidebarButtonCreatedEvent extends Event {

    public SidebarButton button;
    public FTBSidebarButtonCreatedEvent(){
    }
}
