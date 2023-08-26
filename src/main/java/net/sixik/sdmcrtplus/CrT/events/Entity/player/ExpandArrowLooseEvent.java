package net.sixik.sdmcrtplus.CrT.events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/player/ArrowLooseEvent")
@NativeTypeRegistration(value = ArrowLooseEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.player.ArrowLooseEvent")
public class ExpandArrowLooseEvent {

    @ZenCodeType.Getter("player")
    @ZenCodeType.Method
    public static Player getPlayer(ArrowLooseEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Getter("level")
    @ZenCodeType.Method
    public static Level getLevel(ArrowLooseEvent event){
        return event.getLevel();
    }
    @ZenCodeType.Getter("bow")
    @ZenCodeType.Method
    public static IItemStack getBow(ArrowLooseEvent event){
        return new MCItemStack(event.getBow());
    }
    @ZenCodeType.Getter("charge")
    @ZenCodeType.Method
    public static int getCharge(ArrowLooseEvent event){
       return event.getCharge();
    }
}
