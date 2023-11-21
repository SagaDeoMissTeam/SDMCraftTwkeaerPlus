package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.core.BlockPos;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyPositions")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyPositions")
public class ItemLootPropertyPositions extends ItemLootPropertyBase {

    public BlockPos pos;

    @ZenCodeType.Constructor
    public ItemLootPropertyPositions(BlockPos pos) {
        this.pos = pos;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("pos")
    public BlockPos getPos() {
        return pos;
    }
}
