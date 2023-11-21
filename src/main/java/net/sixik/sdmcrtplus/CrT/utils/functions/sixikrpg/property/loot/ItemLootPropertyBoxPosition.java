package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.core.BlockPos;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBoxPosition")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyBoxPosition")
public class ItemLootPropertyBoxPosition extends ItemLootPropertyBase {

    public BlockPos pos1;
    public BlockPos pos2;

    @ZenCodeType.Constructor
    public ItemLootPropertyBoxPosition(BlockPos pos1, BlockPos pos2){
        this.pos1 = pos1;
        this.pos2 = pos2;
    }

    @ZenCodeType.Getter("pos1")
    @ZenCodeType.Method
    public BlockPos getPos1() {
        return pos1;
    }

    @ZenCodeType.Getter("pos2")
    @ZenCodeType.Method
    public BlockPos getPos2() {
        return pos2;
    }
}
