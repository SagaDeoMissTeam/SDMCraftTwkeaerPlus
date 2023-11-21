package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityItemClickProperty")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.entity.EntityItemClickProperty")
public class EntityItemClickProperty extends  EntityPropertyBase{

    public IItemStack[] items;
    public EntityItemClickProperty(IItemStack[] items){
        this.items = items;
    }

    @ZenCodeType.Method
    public IItemStack[] getItems() {
        return items;
    }
}
