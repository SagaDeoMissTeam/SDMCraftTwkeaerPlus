package net.sixik.sdmcrtplus.source.sixikrpg.events.logic;

import com.blamejared.crafttweaker.api.item.IItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity.EntityBlockItemDamageProperty;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity.EntityDamageItemProperty;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity.EntityDamageProperty;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity.EntityDropLootProperty;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.utils.PropertyFunctions;

import java.util.Arrays;
import java.util.Random;

public class EntityPropertyLogic {

    public static boolean BlockItemDamage(EntityBlockItemDamageProperty itemDamageProperty, IItemStack itemStack){
        return Arrays.stream(itemDamageProperty.getItems()).toList().contains(itemStack);
    }

    public static double EntityDamageItem(EntityDamageItemProperty itemProperty, IItemStack itemStack, double damage) {
        if (Arrays.stream(itemProperty.getItems()).toList().contains(itemStack)) {
            switch (itemProperty.functions) {
                case ADD -> {
                    return damage + (damage * itemProperty.procent);
                }
                case SUBTRACT -> {
                    return damage - (damage * itemProperty.procent);
                }
                case MULTIPLY -> {
                    return damage * (damage * itemProperty.procent);
                }
                case DIVIDE -> {
                    return damage / (damage * itemProperty.procent);
                }
                default -> {
                }
            }
        }
        return damage;
    }

    public static double EntityDamage(EntityDamageProperty itemProperty, double damage){
        switch (itemProperty.function) {
            case ADD -> {
                return damage + (damage * itemProperty.procent);
            }
            case SUBTRACT -> {
                return damage - (damage * itemProperty.procent);
            }
            case MULTIPLY -> {
                return damage * (damage * itemProperty.procent);
            }
            case DIVIDE -> {
                return damage / (damage * itemProperty.procent);
            }
            default -> {
            }
        }

        return damage;
    }

    public static void EntityLoot(EntityDropLootProperty entityDrop, LivingEntity entity, LivingEntity killer, Entity projectile){
        EntityDropLootLogic.makeLogic(entityDrop, entity,killer,projectile, new Random().nextDouble(100.0));
    }
}
