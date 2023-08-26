package net.sixik.sdmcrtplus.CrT.integration.curios.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.event.CurioChangeEvent;

@ZenRegister(modDeps = "curios")
@Document("mods/sdmcrtplus/integration/curios/events/CurioChangeEvent")
@NativeTypeRegistration(value = CurioChangeEvent.class,zenCodeName = "mods.sdmcrtplus.integration.curios.events.CurioChangeEvent")
public class ExpandCurioChangeEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("from")
    public static ItemStack getFrom(CurioChangeEvent event){
        return event.getFrom();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("to")
    public static ItemStack getTo(CurioChangeEvent event){
        return event.getTo();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("entity")
    public static LivingEntity getEntity(CurioChangeEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("identifier")
    public static String getIdentifier(CurioChangeEvent event){
        return event.getIdentifier();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("slot")
    public static int getSlotIndex(CurioChangeEvent event){
        return event.getSlotIndex();
    }
    @ZenCodeType.Method
    public static boolean isCancelable(CurioChangeEvent event){
        return event.isCancelable();
    }
}
