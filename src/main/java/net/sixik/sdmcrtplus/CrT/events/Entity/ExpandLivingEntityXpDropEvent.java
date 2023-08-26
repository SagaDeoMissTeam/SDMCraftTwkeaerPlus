package net.sixik.sdmcrtplus.CrT.events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.sixik.sdmcrtplus.source.events.LivingEntityXpDropEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/living/LivingEntityXpDropEvent")
@NativeTypeRegistration(value = LivingEntityXpDropEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.living.LivingEntityXpDropEvent")
public class ExpandLivingEntityXpDropEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("xp")
    public static int getXp(LivingEntityXpDropEvent event){
        return event.getReward();
    }
}
