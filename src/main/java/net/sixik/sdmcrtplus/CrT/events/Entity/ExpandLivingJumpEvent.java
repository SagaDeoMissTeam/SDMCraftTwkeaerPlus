package net.sixik.sdmcrtplus.CrT.events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/living/LivingJumpEvent")
@NativeTypeRegistration(value = LivingEvent.LivingJumpEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.living.LivingJumpEvent")
public class ExpandLivingJumpEvent {

    @ZenCodeType.Method
    public static LivingEntity getEntity(LivingEvent.LivingJumpEvent event){
       return event.getEntity();
    }
}
