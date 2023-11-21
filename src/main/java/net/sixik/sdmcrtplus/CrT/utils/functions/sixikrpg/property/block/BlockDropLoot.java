package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block.destroy.BlockPropertyDestroy;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot.ItemLootBase;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/block/BlockDropLoot")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.block.BlockDropLoot")
public class BlockDropLoot extends BlockPropertyDestroy {

    public ItemLootBase items;
    public int maxItems;

    @ZenCodeType.Constructor
    public BlockDropLoot(ItemLootBase items, int maxItems){
        this.items = items;
        this.maxItems = maxItems;
    }
    @ZenCodeType.Method
    public ItemLootBase getItems() {
        return items;
    }

    @ZenCodeType.Method
    public int getMaxItems() {
        return maxItems;
    }

}
