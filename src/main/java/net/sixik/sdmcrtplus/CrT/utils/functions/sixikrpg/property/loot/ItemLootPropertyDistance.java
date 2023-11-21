package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyDistance")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyDistance")
public class ItemLootPropertyDistance extends ItemLootPropertyBase{

    public double distance;

    @ZenCodeType.Constructor
    public ItemLootPropertyDistance(double distance){
        this.distance = distance;
    }

    @ZenCodeType.Method
    public double getDistance() {
        return distance;
    }
}
