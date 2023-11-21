package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.utils;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.block.BlockSkillBase;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.entity.elements.EntityElementBase;
import net.sixik.sdmcrtplus.source.sixikrpg.register.EntityRegisters;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/utils/SixikRPGUtils")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.utils.SixikRPGUtils")
public class SixikRPGUtils {

    @ZenCodeType.Method
    public static List<EntityElementBase> getRegisteredEntity(){
        return EntityRegisters.ENTITY_ELEMENT_BASES_LIST;
    }
    @ZenCodeType.Method
    public static List<BlockSkillBase> getBlockSkills(){
        return EntityRegisters.BLOCK_SKILL_BASES_LIST;
    }

    @ZenCodeType.Method
    public static EntityElementBase register(EntityElementBase elements){
        return EntityRegisters.getOrCreate(elements);
    }
    @ZenCodeType.Method
    public static EntityElementBase[] register(EntityElementBase[] elements){
        for(EntityElementBase i : elements){
            EntityRegisters.getOrCreate(i);
        }
        return elements;
    }
    @ZenCodeType.Method
    public static BlockSkillBase register(BlockSkillBase elements){
        return EntityRegisters.getOrCreate(elements);
    }
    @ZenCodeType.Method
    public static BlockSkillBase[] register(BlockSkillBase[] elements){
        for(BlockSkillBase i : elements){
            EntityRegisters.getOrCreate(i);
        }
        return elements;
    }
}
