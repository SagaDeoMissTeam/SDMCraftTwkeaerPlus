package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyInStructure")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyInStructure")
public class ItemLootPropertyInStructure extends ItemLootPropertyBase {

    public ResourceLocation[] structure;
    @ZenCodeType.Constructor
    public ItemLootPropertyInStructure(ResourceLocation[] structure) {
        this.structure = structure;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("structure")
    public ResourceLocation[] getStructure() {
        return structure;
    }
}
