package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block.BlockPropertyBase;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootBase")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootBase")
public class ItemLootBase {

    public IItemStack[] itemStack;
    public double chance;
    public ItemLootPropertyBase[] property;

    @ZenCodeType.Constructor
    public ItemLootBase(IItemStack[] itemStack, ItemLootPropertyBase[] property, double chance){
        this.itemStack = itemStack;
        this.chance = chance;
        this.property = property;
    }
    @ZenCodeType.Method
    public IItemStack[] getItemStack() {
        return itemStack;
    }
    @ZenCodeType.Method
    public double getChance() {
        return chance;
    }

    @ZenCodeType.Method
    public ItemLootPropertyBase[] getProperty() {
        return property;
    }
}
