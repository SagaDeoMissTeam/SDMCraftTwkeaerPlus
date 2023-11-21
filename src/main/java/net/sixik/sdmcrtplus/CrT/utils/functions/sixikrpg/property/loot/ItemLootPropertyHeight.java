package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.level.biome.Biome;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyHeight")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyHeight")
public class ItemLootPropertyHeight extends ItemLootPropertyBase {

    public int yPos;

    @ZenCodeType.Constructor
    public ItemLootPropertyHeight(int yPos) {;
        this.yPos = yPos;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("y")
    public int getyPos() {
        return yPos;
    }
}
