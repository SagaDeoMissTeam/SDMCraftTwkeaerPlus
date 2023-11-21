package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantment;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyKillCurrentEnchantmentInStructure")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyKillCurrentEnchantmentInStructure")
public class ItemLootPropertyKillCurrentEnchantmentInStructure extends ItemLootPropertyKillCurrentEnchantment{

    public ResourceLocation[] structure;

    @ZenCodeType.Constructor
    public ItemLootPropertyKillCurrentEnchantmentInStructure(Enchantment[] enchantmentInstances, ResourceLocation[] structure) {
        super(enchantmentInstances);
        this.structure = structure;
    }


    @ZenCodeType.Method
    @ZenCodeType.Getter("structure")
    public ResourceLocation[] getStructure() {
        return structure;
    }
}
