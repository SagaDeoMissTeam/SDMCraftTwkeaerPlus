package net.sixik.sdmcrtplus.source.cinematic.networking;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;
import net.sixik.sdmcrtplus.Sdmcrtplus;
import net.sixik.sdmcrtplus.source.cinematic.networking.message.SendVideoPlayer;

public class PacketHandler {
    public static final String PROTOCOL_VERSION = "2";

    private static SimpleChannel INSTANCE;

    private static int nextId = 0;

    public static void init() {
        INSTANCE = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(Sdmcrtplus.MODID, "network"))
                .networkProtocolVersion(() -> PROTOCOL_VERSION)
                .clientAcceptedVersions(PROTOCOL_VERSION::equals)
                .serverAcceptedVersions(PROTOCOL_VERSION::equals)
                .simpleChannel();
        register(SendVideoPlayer.class, new SendVideoPlayer());
    }

    private static <T> void register(Class<SendVideoPlayer> clazz, SendVideoPlayer message) {
        INSTANCE.registerMessage(nextId++, clazz, message::encode, message::decode, message::handle);
    }

    public static SimpleChannel getPlayChannel()
    {
        return INSTANCE;
    }

    public static <MSG> void sendTo(MSG msg, Player player) {
        INSTANCE.sendTo(msg, ((ServerPlayer)player).connection.getConnection(), NetworkDirection.PLAY_TO_CLIENT);
    }

    public static <MSG> void sendToAllTracking(MSG msg, LivingEntity entityToTrack) {
        INSTANCE.send(PacketDistributor.TRACKING_ENTITY.with(() -> entityToTrack), msg);
    }

    public static <MSG> void sendToAll(MSG msg) {
        INSTANCE.send(PacketDistributor.ALL.noArg(), msg);
    }

    public static <MSG> void sendToServer(MSG msg) {
        INSTANCE.sendToServer(msg);
    }
}
