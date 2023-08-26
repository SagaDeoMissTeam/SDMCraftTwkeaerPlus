package net.sixik.sdmcrtplus.CrT.events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.sixik.sdmcrtplus.source.events.players.PlayerEnchantEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/player/PlayerEnchantEvent")
@NativeTypeRegistration(value = PlayerEnchantEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.player.PlayerEnchantEvent")
public class ExpandEnchantEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("enchantment")
    public static Enchantment getEnchantment(PlayerEnchantEvent event){
        return event.getEnchantment();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static IItemStack getItem(PlayerEnchantEvent event){
        return new MCItemStack(event.getItem());
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("world")
    public static Level getWorld(PlayerEnchantEvent event){
        return event.getWorld();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("pos")
    public static BlockPos getBlockPos(PlayerEnchantEvent event){
        return event.getPos();
    }
}