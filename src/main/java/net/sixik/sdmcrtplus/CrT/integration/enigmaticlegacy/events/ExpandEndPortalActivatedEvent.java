package net.sixik.sdmcrtplus.CrT.integration.enigmaticlegacy.events;


import com.aizistral.enigmaticlegacy.api.events.EndPortalActivatedEvent;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "enigmaticlegacy")
@Document("mods/sdmcrtplus/integration/enigmaticlegacy/events/EndPortalActivatedEvent")
@NativeTypeRegistration(value = EndPortalActivatedEvent.class, zenCodeName = "mods.sdmcrtplus.integration.enigmaticlegacy.events.EndPortalActivatedEvent")
public class ExpandEndPortalActivatedEvent {

    @ZenCodeType.Method
    public static BlockPos getPos(EndPortalActivatedEvent event){
        return event.getPos();
    }
}
