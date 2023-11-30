package net.sixik.sdmcrtplus.source.cinematic.networking.message;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.network.NetworkEvent;
import net.sixik.sdmcrtplus.source.cinematic.client.ClientHandler;

import java.util.function.Supplier;

public class SendVideoPlayer implements IMessage<SendVideoPlayer>{

    public String name;

    public int volume;

    public SendVideoPlayer(){}

    public SendVideoPlayer(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    @Override
    public void encode(SendVideoPlayer mess, FriendlyByteBuf buf) {
        buf.writeUtf(mess.name);
        buf.writeInt(mess.volume);
    }

    @Override
    public SendVideoPlayer decode(FriendlyByteBuf buf) {
        String name = buf.readUtf();
        int volume = buf.readInt();
        return new SendVideoPlayer(name,volume);
    }


    @Override
    public void handle(SendVideoPlayer mess, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(()->{
            DistExecutor.unsafeRunWhenOn(Dist.CLIENT, ()->()-> ClientHandler.handlePacket(mess,ctx));
        });
        ctx.get().setPacketHandled(true);
    }
}
