package net.sixik.sdmcrtplus.CrT.events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.EntityMobGriefingEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/living/EntityMobGriefingEvent")
@NativeTypeRegistration(value = EntityMobGriefingEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.living.EntityMobGriefingEvent")
public class ExpandEntityMobGriefingEvent {

}
