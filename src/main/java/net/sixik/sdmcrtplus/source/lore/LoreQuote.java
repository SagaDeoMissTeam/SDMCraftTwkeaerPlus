package net.sixik.sdmcrtplus.source.lore;

import com.google.common.base.Preconditions;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.PacketDistributor;
import net.sixik.sdmcrtplus.Sdmcrtplus;
import net.sixik.sdmcrtplus.source.lore.client.LoreQuoteHandler;
import net.sixik.sdmcrtplus.source.lore.client.LoreSubtitles;
import net.sixik.sdmcrtplus.source.lore.network.PacketPlayLoreQuote;
import net.sixik.sdmcrtplus.source.utils.HandlerHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LoreQuote {

    public static final Random RANDOM = new Random();
    public static final List<LoreQuote> ALL_QUOTES = new ArrayList<>();
    public static final LoreQuote NO_PERIL = register(new LoreQuote("no_peril")).addSubtitles(new LoreSubtitles(5));
    private static LoreQuote lastQuote;
    private final SoundEvent sound;
    private final String name;
    private LoreSubtitles subtitles;
    private final int id;

    public LoreQuote(String name) {
        this.name = name;
        this.sound = HandlerHelper.registerSound("sixikquote." + name);
        this.id = ALL_QUOTES.size();
        ALL_QUOTES.add(this);
    }

    public LoreQuote addSubtitles(LoreSubtitles subtitles) {
        Preconditions.checkArgument(this.subtitles == null, "Subtitles already added!");
        subtitles.setQuote(this);
        this.subtitles = subtitles;
        return this;
    }


    public void play(ServerPlayer player, int delayTicks) {
        Sdmcrtplus.packetInstance.send(PacketDistributor.PLAYER.with(() -> {
            return player;
        }), new PacketPlayLoreQuote(this, delayTicks));
        lastQuote = this;
    }


    public void play(ServerPlayer player) {
        this.play(player, 1);
    }

    @OnlyIn(Dist.CLIENT)
    public void play() {
        this.play(1);
    }

    @OnlyIn(Dist.CLIENT)
    public void play(int delayTicks) {
        if (delayTicks < 1) {
            throw new IllegalArgumentException("Delay cannot be less than 1 tick!");
        } else {
            LoreQuoteHandler.INSTANCE.playQuote(this, delayTicks);
        }
    }


    public static LoreQuote getByID(int id) {
        return (LoreQuote)ALL_QUOTES.get(id);
    }

    public static List<LoreQuote> getAllQuotes() {
        return Collections.unmodifiableList(ALL_QUOTES);
    }


    public static LoreQuote getRandom(List<LoreQuote> list) {
        LoreQuote quote = null;

        do {
            quote = (LoreQuote)list.get(RANDOM.nextInt(list.size()));
        } while(quote == lastQuote);

        return quote;
    }
    public String getName() {
        return name;
    }

    public static LoreQuote getLastQuote() {
        return lastQuote;
    }

    public int getId() {
        return id;
    }

    public LoreSubtitles getSubtitles() {
        return subtitles;
    }

    public SoundEvent getSound() {
        return sound;
    }


    public static LoreQuote register(LoreQuote loreQuote){
        if(ALL_QUOTES.contains(loreQuote)) return loreQuote;
        Sdmcrtplus.LOGGER.debug(loreQuote.name + " add to ALL LORE !");
        ALL_QUOTES.add(loreQuote);
        return loreQuote;
    }
}
