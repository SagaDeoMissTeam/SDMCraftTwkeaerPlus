package net.sixik.sdmcrtplus.source.sixikrpg.events.logic;

import com.blamejared.crafttweaker.api.item.IItemStack;
import dev.architectury.platform.Platform;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.fml.ModList;
import net.sixik.sdmcrtplus.CrT.entity.ExpandLivingEntity;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.entity.EntityDropLootProperty;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot.*;
import top.theillusivec4.curios.api.CuriosApi;

import java.util.*;

public class EntityDropLootLogic {

    protected static boolean checkConditions(List<ItemLootPropertyBase> conditions, LivingEntity entity, LivingEntity killer, Entity projectile) {
        long day = entity.level.getDayTime() / 24000;
        for (ItemLootPropertyBase d1 : conditions) {


            if(d1 instanceof ItemLootPropertyDimension property){
                if(!entity.level.dimension().registry().equals(property.dimension)) return false;
            }
            if(d1 instanceof ItemLootPropertyOnlyPlayer property){
                if(!(killer instanceof Player)) return false;
            }

            if(d1 instanceof ItemLootPropertyProjectile property){
                if(projectile instanceof Projectile pr){
                    if(!pr.equals(property.projectile)) return false;
                } else return false;
            }

            if(d1 instanceof ItemLootPropertyDistance property){
                if(killer.distanceTo(entity) < property.distance) return false;
            }

            if (d1 instanceof ItemLootPropertyContainItem property) {
                if (killer instanceof Player player) {
                    if (!player.getInventory().contains(property.getItemStack().getInternal())) {
                        return false;
                    }
                } else return false;
            }
            if (d1 instanceof ItemLootPropertyContainItemInSlot property) {
                if (killer instanceof Player player) {
                    if (!player.getInventory().getItem(property.slot).sameItem(property.itemStack.getInternal())) {
                        return false;
                    }
                } else return false;
            }
//                if(ModList.get().isLoaded("curios")) {
//                    if (d1 instanceof ItemLootPropertyCurios property) {
//                        int count = 0;
//                        for(IItemStack itemStack : property.curios) {
//                            CuriosApi.getCuriosHelper().findCurios(player, itemStack.getInternal().getItem()).
//                        }
//                    }
//                }
            if (d1 instanceof ItemLootPropertyDay property) {
                if (day < property.day) return false;
            }
            if (d1 instanceof ItemLootPropertyEquipmentArmor property) {
                if (killer instanceof Player player) {
                    if (
                            !(property.helmet.getInternal().equals(player.getInventory().getArmor(3)) &&
                                    property.chestPlate.getInternal().equals(player.getInventory().getArmor(2)) &&
                                    property.leggings.getInternal().equals(player.getInventory().getArmor(1)) &&
                                    property.boots.getInternal().equals(player.getInventory().getArmor(0)))
                    ) return false;
                } else return false;
            }
            if (d1 instanceof ItemLootPropertyKillCurrentItem property) {
                if (killer instanceof Player player) {
                    boolean st = false;
                    for (IItemStack i : property.items) {
                        if (!player.getInventory().getSelected().sameItem(i.getInternal())) st = true;
                    }
                    if (st) return false;
                } else return false;
            }
            if (d1 instanceof ItemLootPropertyKillCurrentItemInStructure property) {
                if (killer instanceof Player player) {
                    boolean stt = false;
                    boolean onSt = false;
                    for (ResourceLocation st : property.structure) {
                        if (ExpandLivingEntity.onStructure(entity, st)) onSt = true;
                    }
                    for (IItemStack i : property.items) {
                        if (player.getInventory().getSelected().sameItem(i.getInternal())) stt = true;
                    }

                    if (!onSt || !stt) return false;
                } else  return false;
            }

            if(d1 instanceof ItemLootPropertyKillCurrentEnchantment property){
                if (killer instanceof Player player) {
                    for (Map.Entry<Enchantment, Integer> d2 : player.getInventory().getSelected().getAllEnchantments().entrySet()) {
                        if (Arrays.stream(property.getEnchantment()).toList().contains(d2.getKey())) return false;
                    }
                } else return false;
            }
            if (d1 instanceof ItemLootPropertyKillCurrentEnchantmentInStructure property) {
                if (killer instanceof Player player) {
                    boolean stt = false;
                    boolean onSt = false;
                    for (ResourceLocation st : property.structure) {
                        if (ExpandLivingEntity.onStructure(entity, st)) onSt = true;
                    }
                    for (Map.Entry<Enchantment, Integer> d2 : player.getInventory().getSelected().getAllEnchantments().entrySet()) {
                        if (Arrays.stream(property.getEnchantment()).toList().contains(d2.getKey())) stt = true;
                    }

                    if (!onSt || !stt) return false;
                } else return false;
            }
            if(d1 instanceof ItemLootPropertyLevel property){
                if (killer instanceof Player player) {
                    if (player.experienceLevel < property.level) return false;
                } else return false;
            }


            if (d1 instanceof ItemLootPropertyBiome property) {
                if (!property.biome.equals(entity.getLevel().getBiome(entity.blockPosition()).get())) {
                    return false;
                }
            }
            if (d1 instanceof ItemLootPropertyBoxPosition property) {
                BoundingBox zone = new BoundingBox(
                        property.pos1.getX(),
                        property.pos1.getY(),
                        property.pos1.getZ(),
                        property.pos2.getX(),
                        property.pos2.getY(),
                        property.pos2.getZ()
                );
                if (!zone.isInside(entity.blockPosition())) {
                    return false;
                }
            }
            if (d1 instanceof ItemLootPropertyHeight property) {
                if (entity.getY() < property.yPos) return false;
            }
            if (d1 instanceof ItemLootPropertyInStructure property) {
                boolean onSt = false;
                for (ResourceLocation st : property.structure) {
                    if (ExpandLivingEntity.onStructure(entity, st)) onSt = true;
                }
                if (!onSt) return false;
            }
            if (d1 instanceof ItemLootPropertyMobEffect property) {
                for (MobEffect effect : property.effect) {
                    if (!entity.hasEffect(effect)) return false;
                }
            }
            if (d1 instanceof ItemLootPropertyMobEffectInstance property) {
                for (MobEffectInstance i : property.effectInstance) {
                    if (!entity.hasEffect(i.getEffect())) return false;
                }
            }
            if (d1 instanceof ItemLootPropertyPositions property) {
                if (!entity.blockPosition().equals(property.pos)) return false;
            }
            if (d1 instanceof ItemLootPropertyRain property) {
                if (!entity.getLevel().isRainingAt(entity.blockPosition())) return false;
            }
            if (d1 instanceof ItemLootPropertyThunderstorm property) {
                if (!entity.getLevel().isThundering() && !entity.getLevel().isRainingAt(entity.blockPosition()))
                    return false;
            }
        }
        return true;
    }

    protected static void spawnLoot(Level level, BlockPos pos, IItemStack itemStack, int count) {
        IItemStack spawn = itemStack.setAmount(new Random().nextInt(1, count));
        ItemEntity item = new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), spawn.getInternal());
        level.addFreshEntity(item);
    }

    public static void makeLogic(EntityDropLootProperty entityDropLootProperty, LivingEntity entity, LivingEntity killer, Entity projectile, double chance) {
            if ((chance - entityDropLootProperty.items.chance) <= 0) {
                if (checkConditions(List.of(entityDropLootProperty.items.property), entity, killer, projectile)) {
                    spawnLoot(entity.level, entity.blockPosition(),
                            Arrays.stream(entityDropLootProperty.items.itemStack)
                                    .toList()
                                    .get(new Random().nextInt(Arrays.stream(entityDropLootProperty.items.itemStack).toList().size())),
                            entityDropLootProperty.maxItems
                    );
                }
            }
    }
}
