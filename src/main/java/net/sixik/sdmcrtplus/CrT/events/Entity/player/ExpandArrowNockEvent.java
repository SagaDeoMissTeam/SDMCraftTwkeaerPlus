package net.sixik.sdmcrtplus.CrT.events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/player/ArrowNockEvent")
@NativeTypeRegistration(value = ArrowNockEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.player.ArrowNockEvent")
public class ExpandArrowNockEvent {

    @ZenCodeType.Getter("level")
    @ZenCodeType.Method
    public static Level getLevel(ArrowNockEvent event){
        return event.getLevel();
    }
    @ZenCodeType.Getter("bow")
    @ZenCodeType.Method
    public static IItemStack getBow(ArrowNockEvent event){
        return new MCItemStack(event.getBow());
    }
    @ZenCodeType.Getter("hand")
    @ZenCodeType.Method
    public static InteractionHand getHand(ArrowNockEvent event){
        return event.getHand();
    }
}
