package net.sixik.sdmcrtplus.CrT.events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.LivingEntity;
import net.sixik.sdmcrtplus.source.events.LivingEntityTickEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/living/LivingTickEvent")
@NativeTypeRegistration(value = LivingEntityTickEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.living.LivingTickEvent")
public class ExpandLivingTickEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("entityLiving")
    public static LivingEntity getEntity(LivingEntityTickEvent event){
        return event.getEntity();
    }
}
