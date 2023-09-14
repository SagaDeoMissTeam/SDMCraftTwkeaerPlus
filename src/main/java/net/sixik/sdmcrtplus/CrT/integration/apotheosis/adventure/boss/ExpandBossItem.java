package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.boss;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.AABB;
import org.openzen.zencode.java.ZenCodeType;
import shadows.apotheosis.adventure.boss.BossItem;
import shadows.apotheosis.adventure.boss.BossStats;
import shadows.apotheosis.adventure.loot.LootRarity;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/boss/BossItem")
@NativeTypeRegistration(value = BossItem.class,zenCodeName = "mods.sdmcrtplus.integration.apotheosis.adventure.boss.BossItem")
public class ExpandBossItem {

    @ZenCodeType.Method
    public static List<ResourceLocation> getDimensions(BossItem item){
        List<ResourceLocation> list = new ArrayList<>();
        list.addAll(item.getDimensions());
        return list;
    }
    @ZenCodeType.Method
    public static int getWeight(BossItem item) {
        return item.getWeight();
    }
    @ZenCodeType.Method
    public static float getQuality(BossItem item) {
        return item.getQuality();
    }
    @ZenCodeType.Method
    public static LootRarity getMinRarity(BossItem item) {
        return item.getMinRarity();
    }
    @ZenCodeType.Method
    public static LootRarity getMaxRarity(BossItem item) {
        return item.getMaxRarity();
    }
    @ZenCodeType.Method
    public static AABB getSize(BossItem item) {
        return item.getSize();
    }
    @ZenCodeType.Method
    public static EntityType<?> getEntity(BossItem item) {
        return item.getEntity();
    }

    @ZenCodeType.Method
    public static Mob createBoss(BossItem item, ServerLevel world, BlockPos pos, RandomSource random, float luck){
       return item.createBoss(world,pos,random,luck);
    }
    @ZenCodeType.Method
    public static Mob createBoss(BossItem item, ServerLevel world, BlockPos pos, RandomSource random, float luck,  @ZenCodeType.Nullable LootRarity rarity){
       return item.createBoss(world,pos,random,luck, rarity);
    }

    @ZenCodeType.Method
    public static void initBoss(BossItem item, RandomSource rand, Mob entity, float luck, @ZenCodeType.Nullable LootRarity rarity){
        item.initBoss(rand,entity,luck,rarity);
    }

    @ZenCodeType.Method
    public static void enchantBossItem(BossItem item, RandomSource rand, ItemStack stack, int level, boolean treasure){
        int i = item.getWeight();
        BossItem.enchantBossItem(rand, stack, level, treasure);
    }
    @ZenCodeType.Method
    public static ItemStack modifyBossItem(BossItem item, ItemStack stack, RandomSource rand, @ZenCodeType.Nullable Component bossName, float luck, LootRarity rarity, BossStats stats){
        int i = item.getWeight();
       return BossItem.modifyBossItem(stack, rand, bossName, luck, rarity, stats);
    }
}
