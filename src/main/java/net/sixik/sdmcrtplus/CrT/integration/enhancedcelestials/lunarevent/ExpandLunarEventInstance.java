package net.sixik.sdmcrtplus.CrT.integration.enhancedcelestials.lunarevent;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import corgitaco.enhancedcelestials.lunarevent.LunarEventInstance;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "enhancedcelestials")
@Document("mods/sdmcrtplus/integration/enhancedcelestials/lunarevent/LunarEventInstance")
@NativeTypeRegistration(value = LunarEventInstance.class, zenCodeName = "mods.sdmcrtplus.integration.enhancedcelestials.lunarevent.LunarEventInstance")
public class ExpandLunarEventInstance {

    @ZenCodeType.Method
    public static boolean active(LunarEventInstance instance, long currentDay){
        return instance.active(currentDay);
    }
    @ZenCodeType.Method
    public static boolean passed(LunarEventInstance instance, long currentDay){
        return instance.passed(currentDay);
    }
    @ZenCodeType.Method
    public static long getDaysUntil(LunarEventInstance instance, long currentDay){
        return instance.getDaysUntil(currentDay);
    }
    @ZenCodeType.Method
    public static ResourceLocation getRegistryName(LunarEventInstance instance){
        return instance.getLunarEventKey().registry();
    }
    @ZenCodeType.Method
    public static long scheduledDay(LunarEventInstance instance){
        return instance.scheduledDay();
    }
}
