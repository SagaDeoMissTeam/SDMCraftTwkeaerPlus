package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot.ItemLootPropertyBase;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyKillCurrentEnchantment")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyKillCurrentEnchantment")
public class ItemLootPropertyKillCurrentEnchantment extends ItemLootPropertyBase {
    public Enchantment[] enchantment;
    @ZenCodeType.Constructor
    public ItemLootPropertyKillCurrentEnchantment(Enchantment[] enchantmentInstances) {
        this.enchantment = enchantmentInstances;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("enchantment")
    public Enchantment[] getEnchantment() {
        return enchantment;
    }
}
