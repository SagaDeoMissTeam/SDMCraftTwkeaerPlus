package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

import java.security.PublicKey;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyKillCurrentItem")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyKillCurrentItem")
public class ItemLootPropertyKillCurrentItem extends ItemLootPropertyBase{
    public IItemStack[] items;
    @ZenCodeType.Constructor
    public ItemLootPropertyKillCurrentItem(IItemStack[] items) {
        this.items = items;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("items")
    public IItemStack[] getNeedItems() {
        return items;
    }
}
