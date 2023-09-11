package net.sixik.sdmcrtplus.CrT.integration.enhancedcelestials.lunarevent;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.mojang.datafixers.util.Pair;
import corgitaco.enhancedcelestials.EnhancedCelestialsWorldData;
import corgitaco.enhancedcelestials.api.EnhancedCelestialsRegistry;
import corgitaco.enhancedcelestials.api.lunarevent.DefaultLunarEvents;
import corgitaco.enhancedcelestials.api.lunarevent.LunarDimensionSettings;
import corgitaco.enhancedcelestials.api.lunarevent.LunarEvent;
import corgitaco.enhancedcelestials.core.EnhancedCelestialsContext;
import corgitaco.enhancedcelestials.lunarevent.LunarEventInstance;
import corgitaco.enhancedcelestials.lunarevent.LunarForecast;
import net.minecraft.commands.arguments.ResourceOrTagLocationArgument;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraftforge.server.ServerLifecycleHooks;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;


@ZenRegister(modDeps = "enhancedcelestials")
@Document("mods/sdmcrtplus/integration/enhancedcelestials/lunarevent/LunarUtils")
@ZenCodeType.Name("mods.sdmcrtplus.integration.enhancedcelestials.lunarevent.LunarUtils")
public class LunarUtils extends LunarForecast {

    public LunarUtils(Holder<LunarDimensionSettings> dimensionSettingsHolder, Registry<LunarEvent> lunarEventRegistry, long currentDayTime, Data savedData) {
        super(dimensionSettingsHolder, lunarEventRegistry, currentDayTime, savedData);
    }

    @ZenCodeType.Method
    public static List<LunarEvent> getLunarEvents(){
        List<LunarEvent> events = new ArrayList<>();
        Registry<LunarEvent> registry = ServerLifecycleHooks.getCurrentServer().registryAccess().registryOrThrow(DefaultLunarEvents.LUNAR_EVENTS.getRegistryKey());
        for(LunarEvent lunarEvent : registry){
            events.add(lunarEvent);

        }
        return events;
    }

    @ZenCodeType.Method
    public static int startLunarEvent(Level level, ResourceLocation resourceLocation){
        ServerLevel world = (ServerLevel) level;
        EnhancedCelestialsContext enhancedCelestialsContext = ((EnhancedCelestialsWorldData)world).getLunarContext();
        if (enhancedCelestialsContext == null) {
            return 0;
        } else {
            LunarForecast forecast = enhancedCelestialsContext.getLunarForecast();
            long dayLength = ((LunarDimensionSettings)forecast.getDimensionSettingsHolder().value()).dayLength();
            long currentDay = world.getDayTime() / dayLength;

            Pair<Component, Boolean> component =
                    forecast.setOrReplaceEventWithResponse((ResourceOrTagLocationArgument.Result<LunarEvent>) DefaultLunarEvents.LUNAR_EVENTS.getRegistry().get(resourceLocation), currentDay, world.getRandom());
            if ((Boolean)component.getSecond()) {
                if (!world.isNight()) {
                    world.setDayTime(currentDay * dayLength + 13000L);
                }

                return 1;
            } else {
                return 0;
            }
        }
    }
}
