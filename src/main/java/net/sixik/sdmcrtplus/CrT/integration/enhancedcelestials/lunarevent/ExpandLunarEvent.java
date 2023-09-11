package net.sixik.sdmcrtplus.CrT.integration.enhancedcelestials.lunarevent;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import corgitaco.enhancedcelestials.api.lunarevent.LunarEvent;
import net.minecraft.network.chat.Component;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "enhancedcelestials")
@Document("mods/sdmcrtplus/integration/enhancedcelestials/lunarevent/LunarEvent")
@NativeTypeRegistration(value = LunarEvent.class, zenCodeName = "mods.sdmcrtplus.integration.enhancedcelestials.lunarevent.LunarEvent")
public class ExpandLunarEvent {
    @ZenCodeType.Method
    public static Component getName(LunarEvent lunarEvent){
        return lunarEvent.getTextComponents().name().getComponent();
    }
    @ZenCodeType.Method
    public static String getNameKey(LunarEvent lunarEvent){
        return lunarEvent.getTextComponents().name().getKey();
    }
}
