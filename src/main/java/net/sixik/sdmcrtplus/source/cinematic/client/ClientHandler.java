package net.sixik.sdmcrtplus.source.cinematic.client;

import dev.ftb.mods.ftblibrary.FTBLibraryClient;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.NetworkEvent;
import net.sixik.sdmcrtplus.Sdmcrtplus;
import net.sixik.sdmcrtplus.source.cinematic.client.render.VideoScreen;
import net.sixik.sdmcrtplus.source.cinematic.networking.message.SendVideoPlayer;
import net.sixik.sdmcrtplus.source.cinematic.utils.FileManager;
import net.sixik.sdmcrtplus.source.cinematic.utils.KeyBinding;
import net.sixik.sdmcrtplus.source.cinematic.utils.Video;

import java.util.function.Supplier;

@OnlyIn(Dist.CLIENT)
public class ClientHandler {
    public static boolean isOpen = false;
    public static int shButton = 0;

    public static void handlePacket(SendVideoPlayer msg, Supplier<NetworkEvent.Context> ctx){
        Video video = FileManager.getInstance().getVideoFromName(msg.name) == null ?
                new Video(msg.name) : FileManager.getInstance().getVideoFromName(msg.name);

        openVideo(video, msg.volume);
    }

    public static void openVideo(Video video, int volume) {
        Minecraft.getInstance().execute(()->{
            ClientHandler.isOpen = true;
            if(ModList.get().isLoaded("ftblibrary")) {
                shButton = FTBLibraryClient.showButtons;
                FTBLibraryClient.showButtons = 0;
            }
            VideoScreen screen = new VideoScreen(video,volume);
            Minecraft.getInstance().setScreen(screen);
        });
    }

    @Mod.EventBusSubscriber(modid = Sdmcrtplus.MODID, value = Dist.CLIENT,
            bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientEvents{
        @SubscribeEvent
        public static void registerKey(RegisterKeyMappingsEvent e){
            e.register(KeyBinding.EXIT_KEY);
        }

//        @SubscribeEvent
//        public static void onDrawGui(RenderGuiOverlayEvent.Post event){
//            if(Mods.INSTANCE.isModLoaded("jei")){
//                CraftTweakerAPI.LOGGER.info(event.getOverlay().id().toString());
//            }
//        }
    }


}
