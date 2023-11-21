package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.level.biome.Biome;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBiome")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyBiome")
public class ItemLootPropertyBiome extends ItemLootPropertyBase {

    public Biome biome;
    @ZenCodeType.Constructor
    public ItemLootPropertyBiome(Biome biome) {
        this.biome= biome;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("biome")
    public Biome getBiome() {
        return biome;
    }
}
