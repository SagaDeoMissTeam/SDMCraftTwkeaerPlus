package net.sixik.sdmcrtplus.CrT.integration.curios.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.event.CurioAttributeModifierEvent;

@ZenRegister(modDeps = "curios")
@Document("mods/sdmcrtplus/integration/curios/events/CurioAttributeModifierEvent")
@NativeTypeRegistration(value = CurioAttributeModifierEvent.class,zenCodeName = "mods.sdmcrtplus.integration.curios.events.CurioAttributeModifierEvent")
public class ExpandCurioAttributeModifierEvent {

    @ZenCodeType.Getter("item")
    @ZenCodeType.Method
    public static ItemStack getItemStack(CurioAttributeModifierEvent event){
        return event.getItemStack();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("uuid")
    public static String getUuid(CurioAttributeModifierEvent event){
        return event.getUuid().toString();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("context")
    public static SlotContext getSlotContext(CurioAttributeModifierEvent event){
        return event.getSlotContext();
    }
}
