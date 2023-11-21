package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;


/**
 * It only works when the Curios API mod is installed
 */
@ZenRegister(modDeps = "curios")
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyCurios")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyCurios")
public class ItemLootPropertyCurios extends ItemLootPropertyBase{

    public IItemStack[] curios;
    @ZenCodeType.Constructor
    public ItemLootPropertyCurios(IItemStack[] curios) {
        this.curios = curios;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("curios")
    public IItemStack[] getCurios() {
        return curios;
    }
}
