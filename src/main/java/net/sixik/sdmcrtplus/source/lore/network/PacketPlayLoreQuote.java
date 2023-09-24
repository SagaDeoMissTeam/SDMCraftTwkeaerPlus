package net.sixik.sdmcrtplus.source.lore.network;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;
import net.sixik.sdmcrtplus.source.lore.LoreQuote;

import java.util.function.Supplier;

public class PacketPlayLoreQuote {
    private LoreQuote quote;
    private int delay;

    public PacketPlayLoreQuote(LoreQuote quote, int delay) {
        this.quote = quote;
        this.delay = delay;
    }

    public static void encode(PacketPlayLoreQuote msg, FriendlyByteBuf buf) {
        buf.writeInt(msg.quote.getId());
        buf.writeInt(msg.delay);
    }

    public static PacketPlayLoreQuote decode(FriendlyByteBuf buf) {
        return new PacketPlayLoreQuote(LoreQuote.getByID(buf.readInt()), buf.readInt());
    }

    public static void handle(PacketPlayLoreQuote msg, Supplier<NetworkEvent.Context> ctx) {
        (ctx.get()).enqueueWork(() -> {
            msg.quote.play(msg.delay);
        });
        (ctx.get()).setPacketHandled(true);
    }

}
