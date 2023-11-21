package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyContainItemInSlot")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyContainItemInSlot")
public class ItemLootPropertyContainItemInSlot extends ItemLootPropertyContainItem{


    public int slot;

    @ZenCodeType.Constructor
    public ItemLootPropertyContainItemInSlot(IItemStack itemStack,int slot){
        super(itemStack);
        this.slot= slot;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("slot")
    public int getSlot() {
        return slot;
    }

}
