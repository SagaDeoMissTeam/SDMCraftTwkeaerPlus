package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.entity.EntityType;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.utils.PropertyFunctions;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityDamageProperty")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.entity.EntityDamageProperty")
public class EntityDamageProperty extends EntityPropertyBase{

    public double procent;
    public PropertyFunctions function;
    @ZenCodeType.Constructor
    public EntityDamageProperty(double percent, PropertyFunctions function){
        this.procent = percent;
        this.function = function;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("percent")
    public double getPercent() {
        return procent;
    }

    @ZenCodeType.Method
//    @ZenCodeType.Getter("type")
    public PropertyFunctions getTypeFunction() {
        return function;
    }
}
