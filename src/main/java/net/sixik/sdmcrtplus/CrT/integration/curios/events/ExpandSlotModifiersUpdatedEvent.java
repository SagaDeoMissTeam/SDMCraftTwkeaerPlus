package net.sixik.sdmcrtplus.CrT.integration.curios.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.event.SlotModifiersUpdatedEvent;

import java.util.Set;

@ZenRegister(modDeps = "curios")
@Document("mods/sdmcrtplus/integration/curios/events/SlotModifiersUpdatedEvent")
@NativeTypeRegistration(value = SlotModifiersUpdatedEvent.class,zenCodeName = "mods.sdmcrtplus.integration.curios.events.SlotModifiersUpdatedEvent")
public class ExpandSlotModifiersUpdatedEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("types")
    public static Set<String> getTypes(SlotModifiersUpdatedEvent event){
        return event.getTypes();
    }
}
