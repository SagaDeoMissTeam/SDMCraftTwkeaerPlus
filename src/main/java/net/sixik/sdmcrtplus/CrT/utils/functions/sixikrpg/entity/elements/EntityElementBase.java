package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.entity.elements;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity.EntityPropertyBase;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/entity/elements/EntityElementBase")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.entity.elements.EntityElementBase")
public class EntityElementBase {

    public EntityPropertyBase[] propertyBase;
    public EntityType<Entity>[] entityTypes;

    @ZenCodeType.Constructor
    public EntityElementBase(EntityType<Entity>[] entityTypes, EntityPropertyBase[] propertyBase){
        this.entityTypes = entityTypes;
        this.propertyBase = propertyBase;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("property")
    public EntityPropertyBase[] getProperty() {
        return propertyBase;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("entityTypes")
    public EntityType<?>[] getEntityTypes() {
        return entityTypes;
    }
}
