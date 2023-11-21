package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyKillCurrentItemInStructure")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyKillCurrentItemInStructure")
public class ItemLootPropertyKillCurrentItemInStructure extends ItemLootPropertyKillCurrentItem{

    public ResourceLocation[] structure;
    @ZenCodeType.Constructor
    public ItemLootPropertyKillCurrentItemInStructure(IItemStack[] items, ResourceLocation[] structure) {
        super(items);
        this.structure = structure;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("structure")
    public ResourceLocation[] getStructure() {
        return structure;
    }
}
