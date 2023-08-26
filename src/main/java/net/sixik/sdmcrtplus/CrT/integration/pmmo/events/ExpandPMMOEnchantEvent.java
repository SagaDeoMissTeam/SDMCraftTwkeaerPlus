package net.sixik.sdmcrtplus.CrT.integration.pmmo.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import harmonised.pmmo.api.events.EnchantEvent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "pmmo")
@Document("mods/sdmcrtplus/integration/pmmo/events/EnchantEvent")
@NativeTypeRegistration(value = EnchantEvent.class,zenCodeName = "mods.sdmcrtplus.integration.pmmo.events.EnchantEvent")
public class ExpandPMMOEnchantEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("enchantment")
    public static Enchantment getEnchantment(EnchantEvent event){
        return event.getEnchantment().enchantment;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("enchantmentLevel")
    public static int getEnchantmentLevel(EnchantEvent event){
        return event.getEnchantment().level;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static ItemStack getItem(EnchantEvent event){
        return event.getItem();
    }
    @ZenCodeType.Method
    public static boolean isCancelable(EnchantEvent event){
        return event.isCancelable();
    }
}
