package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

/**
 * It only works when the GameStages mod is installed
 */
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyStage")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyStage")
public class ItemLootPropertyStage extends ItemLootPropertyBase{
    public String stage;
    @ZenCodeType.Constructor
    public ItemLootPropertyStage(String stage) {
        this.stage = stage;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("stage")
    public String getStage() {
        return stage;
    }
}
