package net.sixik.sdmcrtplus.CrT.events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.sixik.sdmcrtplus.source.events.players.PlayerPotionEvent;
import org.openzen.zencode.java.ZenCodeType;


@ZenRegister
@Document("mods/sdmcrtplus/events/entity/player/PlayerPotionEvent")
@NativeTypeRegistration(value = PlayerPotionEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.player.PlayerPotionEvent")
public class ExpandPlayerPotionEvent {


    @ZenCodeType.Method
    @ZenCodeType.Getter("level")
    public static Level getLevel(PlayerPotionEvent event){
        return event.getEntity().getLevel();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static IItemStack getStack(PlayerPotionEvent event){
        return new MCItemStack(event.getStack());
    }
}
