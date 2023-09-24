package net.sixik.sdmcrtplus.source.lore.client;

import net.minecraft.client.resources.language.I18n;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.sixik.sdmcrtplus.source.lore.LoreQuote;

import java.util.*;

public class LoreSubtitles {

    private static final String PLACEHOLDER_LINE = "PLACEHOLDER_LINE";
    private final Map<Double, String> map;
    private final double duration;
    private LoreQuote quote;
    private int placeholderCounter;

    public LoreSubtitles(double timeCount) {
        this("NULL_SUBTITLE1", timeCount);
        ++this.placeholderCounter;
    }

    public LoreSubtitles(String firstLine, double duration) {
        this.map = new HashMap();
        this.quote = null;
        this.placeholderCounter = 1;
        this.map.put(0.0, firstLine);
        this.duration = duration;
    }

    public LoreSubtitles add(double time) {
        int intVar = this.placeholderCounter++;
        return this.add(time, "NULL_SUBTITLE" + intVar);
    }

    public LoreSubtitles add(double time, String line) {
        this.map.put(time, line);
        return this;
    }



    public double getDuration() {
        return this.duration;
    }

    public void setQuote(LoreQuote quote) {
        this.quote = quote;
    }

    @OnlyIn(Dist.CLIENT)
    public String getLine(double time) {
        String line = "ERROR";
        double bestTime = -1.0;
        Iterator var6 = this.map.entrySet().iterator();

        while (var6.hasNext()) {
            Map.Entry<Double, String> entry = (Map.Entry) var6.next();
            if ((Double) entry.getKey() <= time && (Double) entry.getKey() > bestTime) {
                line = (String) entry.getValue();
                bestTime = (Double) entry.getKey();
            }
        }

        if (line.startsWith("NULL_SUBTITLE")) {
            String var10000 = this.quote.getName();
            String key = "sixikquote." + var10000 + "_" + line.replace("NULL_SUBTITLE", "");
            return I18n.get(key, new Object[0]);
        } else {
            return line;
        }
    }
}
