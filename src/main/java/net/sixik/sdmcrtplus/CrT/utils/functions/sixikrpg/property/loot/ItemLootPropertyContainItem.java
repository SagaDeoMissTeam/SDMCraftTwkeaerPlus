package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyContainItem")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyContainItem")
public class ItemLootPropertyContainItem extends ItemLootPropertyBase{

    public IItemStack itemStack;
    @ZenCodeType.Constructor
    public ItemLootPropertyContainItem(IItemStack itemStack){
        this.itemStack = itemStack;
    }

    @ZenCodeType.Method
    public IItemStack getItemStack() {
        return itemStack;
    }

}
