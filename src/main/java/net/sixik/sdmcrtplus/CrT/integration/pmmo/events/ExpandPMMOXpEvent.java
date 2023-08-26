package net.sixik.sdmcrtplus.CrT.integration.pmmo.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import harmonised.pmmo.api.events.XpEvent;
import net.minecraft.nbt.CompoundTag;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "pmmo")
@Document("mods/sdmcrtplus/integration/pmmo/events/XpEvent")
@NativeTypeRegistration(value = XpEvent.class,zenCodeName = "mods.sdmcrtplus.integration.pmmo.events.XpEvent")
public class ExpandPMMOXpEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("awarded")
    public static long getAmountAwarded(XpEvent event){
       return event.amountAwarded;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("skill")
    public static String getSkill(XpEvent event){
       return event.skill;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("endLevel")
    public static int getEndLevel(XpEvent event){
       return event.endLevel();
    }
//    @ZenCodeType.Method
//    @ZenCodeType.Getter("context")
//    public static CompoundTag getContext(XpEvent event){
//       return event.getContext();
//    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("startLevel")
    public static int getStartLevel(XpEvent event){
       return event.startLevel();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("isLevelUp")
    public static boolean isLevelUp(XpEvent event){
       return event.isLevelUp();
    }
    @ZenCodeType.Method
    public static boolean isCancelable(XpEvent event){
       return event.isCancelable();
    }
}
