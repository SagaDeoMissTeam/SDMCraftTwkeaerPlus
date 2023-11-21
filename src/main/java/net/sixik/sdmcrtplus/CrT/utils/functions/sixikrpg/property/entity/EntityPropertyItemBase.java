package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.entity.EntityType;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyItemBase")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.entity.EntityPropertyItemBase")
public class EntityPropertyItemBase extends EntityPropertyBase{

    public IItemStack[] itemStack;

    @ZenCodeType.Constructor
    public EntityPropertyItemBase(IItemStack[] itemStack){
        this.itemStack = itemStack;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public IItemStack[] getItems() {
        return itemStack;
    }
}
