package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyDimension")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyDimension")
public class ItemLootPropertyDimension extends ItemLootPropertyBase{

    public ResourceLocation dimension;

    @ZenCodeType.Constructor
    public ItemLootPropertyDimension(ResourceLocation dimension){
        this.dimension = dimension;
    }

    @ZenCodeType.Method
    public ResourceLocation getDimension() {
        return dimension;
    }
}
