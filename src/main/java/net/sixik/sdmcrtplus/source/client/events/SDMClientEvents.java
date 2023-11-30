package net.sixik.sdmcrtplus.source.client.events;

import com.blamejared.crafttweaker.api.data.MapData;
import com.blamejared.crafttweaker.platform.Services;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.*;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.sixik.sdmcrtplus.Sdmcrtplus;
import net.sixik.sdmcrtplus.source.cinematic.client.ClientHandler;
import net.sixik.sdmcrtplus.source.cinematic.client.render.VideoScreen;
import net.sixik.sdmcrtplus.source.client.Restricted.ClientGUIRestrictedData;
import net.sixik.sdmcrtplus.source.client.Restricted.ClientGUIRestrictedStage;
import net.sixik.sdmcrtplus.source.client.Screens.QuestScreen;
import net.sixik.sdmcrtplus.source.client.Screens.TestGUI;


@OnlyIn(Dist.CLIENT)
public class SDMClientEvents {
    public static SDMClientEvents INSTANCE = new SDMClientEvents();
    public SDMClientEvents(){
    }

    @SubscribeEvent
    public void screenRender(RenderGuiOverlayEvent.Pre event){
        if(!Sdmcrtplus.CLIENT_GUI_RESTRICTED.isEmpty() && !Minecraft.getInstance().player.isCreative()){
            if(Sdmcrtplus.CLIENT_GUI_RESTRICTED.containsKey(event.getOverlay().id())){
                if((Sdmcrtplus.CLIENT_GUI_RESTRICTED.get(event.getOverlay().id()) instanceof ClientGUIRestrictedStage && Services.PLATFORM.isModLoaded("gamestages"))){
                    ClientGUIRestrictedStage gui = (ClientGUIRestrictedStage) Sdmcrtplus.CLIENT_GUI_RESTRICTED.get(event.getOverlay().id());
                }
                else if(Sdmcrtplus.CLIENT_GUI_RESTRICTED.get(event.getOverlay().id()) instanceof ClientGUIRestrictedData){

                    Player player = Minecraft.getInstance().player;
                    MapData data = new MapData(Services.PLATFORM.getCustomData(player));
                    if(!data.contains(((ClientGUIRestrictedData) Sdmcrtplus.CLIENT_GUI_RESTRICTED.get(event.getOverlay().id())).data)){
                        event.setCanceled(true);
                    }
                } else
                    event.setCanceled(true);

            }
        }
    }

//    @SubscribeEvent
//    public void side(SidebarButtonCreatedEvent event){
//        event.setCanceled(true);
//    }

//    @SubscribeEvent
//    public void scrren(ScreenEvent.BackgroundRendered.Init event) {
//        event.setCanceled(true);
//
//    }
//    @SubscribeEvent
//    public void scrren1(ContainerScreenEvent.Render event) {
//        event.setCanceled(true);
//
//    }


    //        if (ClientHandler.isOpen){
//            if (!(render.getScreen() instanceof VideoScreen)) {
//                render.setCanceled(true);
//            }
//        }

}
