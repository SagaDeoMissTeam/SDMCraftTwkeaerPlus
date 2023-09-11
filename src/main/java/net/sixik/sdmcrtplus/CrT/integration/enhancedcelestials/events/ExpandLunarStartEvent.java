package net.sixik.sdmcrtplus.CrT.integration.enhancedcelestials.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import corgitaco.enhancedcelestials.lunarevent.LunarEventInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.RandomSource;
import net.minecraftforge.server.ServerLifecycleHooks;
import net.sixik.sdmcrtplus.source.integration.enhancedcelestials.events.LunarStartEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "enhancedcelestials")
@Document("mods/sdmcrtplus/integration/enhancedcelestials/events/LunarStartEvent")
@NativeTypeRegistration(value = LunarStartEvent.class, zenCodeName = "mods.sdmcrtplus.integration.enhancedcelestials.events.LunarStartEvent")
public class ExpandLunarStartEvent {

    @ZenCodeType.Method
    public static LunarEventInstance getLunarEventInstance(LunarStartEvent event){
        return event.getLunarEventInstance();
    }
    @ZenCodeType.Method
    public static long getCurrentDay(LunarStartEvent event){
        return event.getCurrentDay();
    }
    @ZenCodeType.Method
    public static ResourceLocation getLunarName(LunarStartEvent event){
        return event.getLunarName();
    }
    @ZenCodeType.Method
    public static RandomSource getRandomSource(LunarStartEvent event){
        return event.getRandomSource();
    }
    @ZenCodeType.Method
    public static MinecraftServer getCurrentServer(LunarStartEvent event){
        return ServerLifecycleHooks.getCurrentServer();
    }
}
