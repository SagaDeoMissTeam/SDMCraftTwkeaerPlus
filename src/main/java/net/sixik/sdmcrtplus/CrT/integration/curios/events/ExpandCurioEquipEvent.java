package net.sixik.sdmcrtplus.CrT.integration.curios.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.event.CurioEquipEvent;

@ZenRegister(modDeps = "curios")
@Document("mods/sdmcrtplus/integration/curios/events/CurioEquipEvent")
@NativeTypeRegistration(value = CurioEquipEvent.class,zenCodeName = "mods.sdmcrtplus.integration.curios.events.CurioEquipEvent")
public class ExpandCurioEquipEvent {
    @ZenCodeType.Method
    @ZenCodeType.Getter("context")
    public static SlotContext getSlotContext(CurioEquipEvent event){
        return event.getSlotContext();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static ItemStack getStack(CurioEquipEvent event){
        return event.getStack();
    }
}
