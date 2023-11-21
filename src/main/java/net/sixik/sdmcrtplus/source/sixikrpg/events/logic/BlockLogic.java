package net.sixik.sdmcrtplus.source.sixikrpg.events.logic;

import com.blamejared.crafttweaker.api.item.IItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.sixik.sdmcrtplus.CrT.entity.ExpandLivingEntity;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.block.BlockSkillBase;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block.BlockPropertyBase;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block.destroy.BlockCurrentItem;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block.BlockDropLoot;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block.BlockExplosion;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block.destroy.BlockNoDestroy;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot.*;
import net.sixik.sdmcrtplus.source.sixikrpg.register.EntityRegisters;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BlockLogic {

    public static boolean checkConditions(List<ItemLootPropertyBase> propertyBaseList, LivingEntity entity){
        long day = entity.level.getDayTime() / 24000;
        for(ItemLootPropertyBase d1 : propertyBaseList){
            if(d1 instanceof ItemLootPropertyOnlyPlayer property){
                if(!(entity instanceof Player)) return false;
            }


            if (d1 instanceof ItemLootPropertyContainItem property) {
                if (entity instanceof Player player) {
                    if (!player.getInventory().contains(property.getItemStack().getInternal())) {
                        return false;
                    }
                } else return false;
            }
            if (d1 instanceof ItemLootPropertyContainItemInSlot property) {
                if (entity instanceof Player player) {
                    if (!player.getInventory().getItem(property.slot).sameItem(property.itemStack.getInternal())) {
                        return false;
                    }
                } else return false;
            }

            if (d1 instanceof ItemLootPropertyDay property) {
                if (day < property.day) return false;
            }
            if (d1 instanceof ItemLootPropertyEquipmentArmor property) {
                if (entity instanceof Player player) {
                    if (
                            !(property.helmet.getInternal().equals(player.getInventory().getArmor(3)) &&
                                    property.chestPlate.getInternal().equals(player.getInventory().getArmor(2)) &&
                                    property.leggings.getInternal().equals(player.getInventory().getArmor(1)) &&
                                    property.boots.getInternal().equals(player.getInventory().getArmor(0)))
                    ) return false;
                } else return false;
            }

            if(d1 instanceof ItemLootPropertyLevel property){
                if (entity instanceof Player player) {
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
            if(d1 instanceof ItemLootPropertyDimension property){
                if(entity instanceof Player player){
                    if(!player.level.dimension().registry().equals(property.dimension)) return false;
                }
            }
        }
        return true;
    }

    public static void dropLoot(Level level, BlockPos pos, IItemStack itemStack, int count){
        IItemStack spawn = itemStack.setAmount(new Random().nextInt(1, count));
        ItemEntity item = new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), spawn.getInternal());
        level.addFreshEntity(item);
    }

    public static void logicBlockSkillBreak(BlockState block, BlockEvent.BreakEvent event){
        for(BlockSkillBase d1 : EntityRegisters.BLOCK_SKILL_BASES_LIST){
            if(d1.block.equals(block)){
                makeLogics(d1.property, null, event);
            }
        }
    }
    public static void logicBlockSkillBreakSpeed(BlockState block, PlayerEvent.BreakSpeed event){
        for(BlockSkillBase d1 : EntityRegisters.BLOCK_SKILL_BASES_LIST){
            if(d1.block.equals(block)){
                makeLogics(d1.property, event, null);
            }
        }
    }

    public static void makeLogics(BlockPropertyBase[] d1, @Nullable PlayerEvent.BreakSpeed e1, @Nullable BlockEvent.BreakEvent e2){
        for(BlockPropertyBase d2 : d1) {
            if (e1 != null) {
                if (d2 instanceof BlockNoDestroy) {
                    e1.setNewSpeed(0.0f);
                }
                if(d2 instanceof BlockCurrentItem property){
                    if(!Arrays.stream(property.item).toList().contains(IItemStack.of(e1.getEntity().getInventory().getSelected()))){
                        e1.setNewSpeed(0.0f);
                    }
                }
            }
            if (e2 != null) {
                if(d2 instanceof BlockCurrentItem property){
                    if(!Arrays.stream(property.item).toList().contains(IItemStack.of(e1.getEntity().getInventory().getSelected()))){
                        e2.setCanceled(true);
                    }
                }
                if (d2 instanceof BlockExplosion property) {
                    if((new Random().nextDouble(100.0) - property.chance) <= 0){
                        new Explosion(
                                (Level) e2.getLevel(),
                                e2.getPlayer(),
                                e2.getPos().getX(),
                                e2.getPos().getY(),
                                e2.getPos().getZ(),
                                (float) property.radius,
                                false,
                                Explosion.BlockInteraction.BREAK
                        ).explode();
                    }
                }
                if(d2 instanceof BlockDropLoot property){
                    if((new Random().nextDouble(100.0) - property.items.chance) <= 0) {
                        if(checkConditions(List.of(property.items.property), e2.getPlayer())) {
                            dropLoot(
                                    (Level) e2.getLevel(),
                                    e2.getPos(),
                                    Arrays.stream(property.items.itemStack)
                                            .toList()
                                            .get(new Random().nextInt(0, Arrays.stream(property.items.itemStack).toList().size())),
                                    property.maxItems
                            );
                        }
                    }
                }
            }
        }
    }

}
