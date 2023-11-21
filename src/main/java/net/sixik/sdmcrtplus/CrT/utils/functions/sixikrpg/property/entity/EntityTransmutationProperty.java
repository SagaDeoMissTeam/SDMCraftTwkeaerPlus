package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityTransmutationProperty")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.entity.EntityTransmutationProperty")
public class EntityTransmutationProperty extends EntityPropertyBase{

    public EntityType<Entity>[] entityTypes;

    @ZenCodeType.Constructor
    public EntityTransmutationProperty(EntityType<Entity>[] entityTypes){
        this.entityTypes = entityTypes;
    }

    @ZenCodeType.Method
    public EntityType<Entity>[] getEntityTypes() {
        return entityTypes;
    }
}
