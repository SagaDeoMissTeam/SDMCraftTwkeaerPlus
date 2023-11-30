package net.sixik.sdmcrtplus.source.network;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;
import net.sixik.sdmcrtplus.Sdmcrtplus;
import net.sixik.sdmcrtplus.source.network.packet.ExperementalS2CPacket;
import net.sixik.sdmcrtplus.source.network.packet.TestC2SPacket;

public class ModMessage {
    private static SimpleChannel INSTANCE;
    private static int packetiD = 0;
    private static int id(){
        return packetiD++;
    }

    public static void register(){
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(Sdmcrtplus.MODID, "message"))
                .networkProtocolVersion(() -> "1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();

        INSTANCE = net;

        net.messageBuilder(TestC2SPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(TestC2SPacket::new)
                .encoder(TestC2SPacket::toBytes)
                .consumerMainThread(TestC2SPacket::handler)
                .add();

        net.messageBuilder(ExperementalS2CPacket.class, id(), NetworkDirection.PLAY_TO_CLIENT)
                .decoder(ExperementalS2CPacket::new)
                .encoder(ExperementalS2CPacket::toBytes)
                .consumerMainThread(ExperementalS2CPacket::handler)
                .add();
    }

    public static <MSG> void sendMessage(MSG message){
        INSTANCE.sendToServer(message);
    }

    public static <MSG> void sendToPlayer(MSG message, ServerPlayer player){
        INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), message);
    }
}
