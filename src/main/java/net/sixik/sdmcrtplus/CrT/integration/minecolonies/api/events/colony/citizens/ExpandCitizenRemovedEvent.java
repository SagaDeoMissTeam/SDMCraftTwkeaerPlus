package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.events.colony.citizens;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.citizens.event.CitizenRemovedEvent;
import net.minecraft.world.damagesource.DamageSource;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/events/colony/citizens/CitizenRemovedEvent")
@NativeTypeRegistration(value = CitizenRemovedEvent.class, zenCodeName = "mods.sdmcrtplus.integration.api.events.colony.citizens.CitizenRemovedEvent")
public class ExpandCitizenRemovedEvent {
    @ZenCodeType.Method
    public static DamageSource getDamageSource(CitizenRemovedEvent event){
      return event.getDamageSource();
    }
}
