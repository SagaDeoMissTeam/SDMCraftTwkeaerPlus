package net.sixik.sdmcrtplus.CrT.integration.curios.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.item.ItemEntity;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.event.CurioDropsEvent;
import top.theillusivec4.curios.api.type.capability.ICuriosItemHandler;

import java.util.Collection;

@ZenRegister(modDeps = "curios")
@Document("mods/sdmcrtplus/integration/curios/events/CurioDropsEvent")
@NativeTypeRegistration(value = CurioDropsEvent.class,zenCodeName = "mods.sdmcrtplus.integration.curios.events.CurioDropsEvent")
public class ExpandCurioDropsEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("drops")
    public static Collection<ItemEntity> getDrops(CurioDropsEvent event){
        return event.getDrops();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("handler")
    public static ICuriosItemHandler getCurioHandler(CurioDropsEvent event){
        return event.getCurioHandler();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("lootingLevel")
    public static int getLootingLevel(CurioDropsEvent event){
        return event.getLootingLevel();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("source")
    public static DamageSource getSource(CurioDropsEvent event){
        return event.getSource();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("isRecentlyHit")
    public static boolean isRecentlyHit(CurioDropsEvent event){
        return event.isRecentlyHit();
    }
}
