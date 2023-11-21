package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block.destroy;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block.BlockPropertyBase;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/block/destroy/BlockCurrentItem")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.block.destroy.BlockCurrentItem")
public class BlockCurrentItem extends BlockPropertyBase {

    public IItemStack[] item;
    public BlockCurrentItem(IItemStack[] item){
        this.item = item;
    }

    @ZenCodeType.Method
    public IItemStack[] getItem() {
        return item;
    }
}
