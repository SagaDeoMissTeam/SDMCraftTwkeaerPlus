package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyLevel")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyLevel")
public class ItemLootPropertyLevel extends ItemLootPropertyBase{

    public int level;
    @ZenCodeType.Constructor
    public ItemLootPropertyLevel(int level){
        this.level = level;
    }

    @ZenCodeType.Method
    public int getLevel() {
        return level;
    }
}
