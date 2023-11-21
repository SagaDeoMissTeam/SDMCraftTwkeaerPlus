package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.entity.EntityType;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

/**
 * Base class of parameters for entities
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyBase")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.entity.EntityPropertyBase")
public class EntityPropertyBase {

    @ZenCodeType.Constructor
    public EntityPropertyBase(){
    }
}
