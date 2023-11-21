package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyDay")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyDay")
public class ItemLootPropertyDay extends ItemLootPropertyBase{
    public long day;
    @ZenCodeType.Constructor
    public ItemLootPropertyDay( long day) {
        this.day = day;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("day")
    public long getDay() {
        return day;
    }
}
