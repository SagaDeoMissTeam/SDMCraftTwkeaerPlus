package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.items;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/item/ItemPropertyBase")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.item.ItemPropertyBase")
public class ItemPropertyBase {
    public IItemStack itemStack;

    @ZenCodeType.Constructor
    public ItemPropertyBase(IItemStack itemStack){
        this.itemStack = itemStack;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public IItemStack getItem() {
        return itemStack;
    }
}
