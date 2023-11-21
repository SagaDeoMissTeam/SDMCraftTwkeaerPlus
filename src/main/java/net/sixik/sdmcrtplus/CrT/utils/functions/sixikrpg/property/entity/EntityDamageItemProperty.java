package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.entity.EntityType;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.utils.PropertyFunctions;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityDamageItemProperty")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.entity.EntityDamageItemProperty")
public class EntityDamageItemProperty extends EntityPropertyItemBase{
    public double procent;
    public PropertyFunctions functions;
    @ZenCodeType.Constructor
    public EntityDamageItemProperty(IItemStack[] itemStack, double percent, PropertyFunctions functions) {
        super(itemStack);
        this.procent = percent;
        this.functions = functions;
    }

    @ZenCodeType.Method
//    @ZenCodeType.Getter("type")
    public PropertyFunctions getTypeFunction() {
        return functions;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("percent")
    public double getPercent() {
        return procent;
    }
}
