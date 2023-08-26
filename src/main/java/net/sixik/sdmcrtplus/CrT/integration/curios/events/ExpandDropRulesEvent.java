package net.sixik.sdmcrtplus.CrT.integration.curios.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.damagesource.DamageSource;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.event.DropRulesEvent;
import top.theillusivec4.curios.api.type.capability.ICuriosItemHandler;

@ZenRegister(modDeps = "curios")
@Document("mods/sdmcrtplus/integration/curios/events/DropRulesEvent")
@NativeTypeRegistration(value = DropRulesEvent.class,zenCodeName = "mods.sdmcrtplus.integration.curios.events.DropRulesEvent")
public class ExpandDropRulesEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("handler")
    public static ICuriosItemHandler getCurioHandler(DropRulesEvent event){
        return event.getCurioHandler();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("lootingLevel")
    public static int getLootingLevel(DropRulesEvent event){
        return event.getLootingLevel();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("source")
    public static DamageSource getSource(DropRulesEvent event){
        return event.getSource();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("isRecentlyHit")
    public static boolean isRecentlyHit(DropRulesEvent event){
        return event.isRecentlyHit();
    }
}
