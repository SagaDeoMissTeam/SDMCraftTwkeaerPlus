package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.entity.EntityType;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot.ItemLootBase;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot.ItemLootPropertyBase;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.Map;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityDropLootProperty")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.entity.EntityDropLootProperty")
public class EntityDropLootProperty extends EntityPropertyLootBase{

    public ItemLootBase items;
    public int maxItems;

    @ZenCodeType.Constructor
    public EntityDropLootProperty(ItemLootBase items,int maxItems){
        this.items = items;
        this.maxItems = maxItems;
    }

    @ZenCodeType.Method
    public ItemLootBase getItems() {
        return items;
    }

    @ZenCodeType.Method
    public int getMaxItems() {
        return maxItems;
    }
}
