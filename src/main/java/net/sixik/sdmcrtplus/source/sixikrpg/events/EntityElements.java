package net.sixik.sdmcrtplus.source.sixikrpg.events;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.entity.elements.EntityElementBase;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity.EntityDropLootProperty;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity.EntityPropertyBase;
import net.sixik.sdmcrtplus.source.sixikrpg.events.logic.EntityPropertyLogic;
import net.sixik.sdmcrtplus.source.sixikrpg.register.EntityRegisters;

import javax.annotation.Nullable;
import java.util.Arrays;

public class EntityElements {

    public static void logicEntityElements(Entity entity, @Nullable Entity killer,Entity project){
        if(killer == null) return;
        if(EntityRegisters.ENTITY_ELEMENT_BASES_LIST.isEmpty()) return;
        if(entity instanceof LivingEntity && killer instanceof LivingEntity){
            logic(entity, killer, project);
        }
        //if(!isPlayer(killer)) return;


    }


    public static boolean isPlayer(Entity entity) {
        return entity instanceof Player;
    }

    public static void logic(Entity entity, Entity killer, Entity project){
        for(EntityElementBase d1 : EntityRegisters.ENTITY_ELEMENT_BASES_LIST){
            if(Arrays.stream(d1.entityTypes).toList().contains(entity.getType())){
                for(EntityPropertyBase d2 : d1.getProperty()){
                    if(d2 instanceof EntityDropLootProperty property){
                        EntityPropertyLogic.EntityLoot(property, (LivingEntity) entity, (LivingEntity) killer, project);
                    }
                }
            }
        }
    }
}
