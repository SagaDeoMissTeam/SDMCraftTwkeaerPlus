package net.sixik.sdmcrtplus.CrT.integration.enigmaticlegacy.events;

import com.aizistral.enigmaticlegacy.api.events.SummonedEntityEvent;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.Entity;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "enigmaticlegacy")
@Document("mods/sdmcrtplus/integration/enigmaticlegacy/events/SummonedEntityEvent")
@NativeTypeRegistration(value = SummonedEntityEvent.class, zenCodeName = "mods.sdmcrtplus.integration.enigmaticlegacy.events.SummonedEntityEvent")
public class ExpandSummonedEntityEvent {

    @ZenCodeType.Method
    public static Entity getSummonedEntity(SummonedEntityEvent event){
        return event.getSummonedEntity();
    }
}
