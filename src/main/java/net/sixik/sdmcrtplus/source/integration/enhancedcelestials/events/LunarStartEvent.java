package net.sixik.sdmcrtplus.source.integration.enhancedcelestials.events;

import corgitaco.enhancedcelestials.lunarevent.LunarEventInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraftforge.eventbus.api.Event;


public class LunarStartEvent extends Event {
    private ResourceLocation lunarName;
    private long currentDay;
    private RandomSource randomSource;
    private LunarEventInstance lunarEventInstance;
    public LunarStartEvent(ResourceLocation lunarName, long currentDay, RandomSource randomSource, LunarEventInstance lunarEventInstance){
        this.lunarName = lunarName;
        this.currentDay = currentDay;
        this.randomSource = randomSource;
        this.lunarEventInstance = lunarEventInstance;
    }

    public ResourceLocation getLunarName() {
        return lunarName;
    }

    public long getCurrentDay() {
        return currentDay;
    }

    public RandomSource getRandomSource() {
        return randomSource;
    }

    public LunarEventInstance getLunarEventInstance() {
        return lunarEventInstance;
    }
}
