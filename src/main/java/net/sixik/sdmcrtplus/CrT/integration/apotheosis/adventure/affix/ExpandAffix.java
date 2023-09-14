package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.affix;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.enchantment.Enchantment;
import org.openzen.zencode.java.ZenCodeType;
import shadows.apotheosis.adventure.affix.Affix;
import shadows.apotheosis.adventure.affix.AffixType;
import shadows.apotheosis.adventure.loot.LootCategory;
import shadows.apotheosis.adventure.loot.LootRarity;

import java.util.Map;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/affix/Affix")
@NativeTypeRegistration(value = Affix.class,zenCodeName = "mods.sdmcrtplus.integration.apotheosis.adventure.affix.Affix", constructors = {
        @NativeConstructor(value = {@NativeConstructor.ConstructorParameter(
        name = "type", type = AffixType.class)
        })
})
public class ExpandAffix {

    @ZenCodeType.Method
    public static AffixType getType(Affix affix){
        return affix.getType();
    }
    @ZenCodeType.Method
    public static float onShieldBlock(Affix affix, ItemStack stack, LootRarity rarity, float level, LivingEntity entity, DamageSource source, float amount){
        return affix.onShieldBlock(stack, rarity, level, entity, source, amount);
    }
    @ZenCodeType.Method
    public static InteractionResult onItemUse(Affix affix, ItemStack stack, LootRarity rarity, float level, UseOnContext ctx){
        return affix.onItemUse(stack, rarity, level, ctx);
    }
    @ZenCodeType.Method
    public static float onHurt(Affix affix, ItemStack stack, LootRarity rarity, float level, DamageSource src, LivingEntity ent, float amount){
        return affix.onHurt(stack, rarity, level, src, ent, amount);
    }
    @ZenCodeType.Method
    public static boolean equals(Affix affix, Object object){
        return affix.equals(object);
    }
    @ZenCodeType.Method
    public static boolean enablesTelepathy(Affix affix){
        return affix.enablesTelepathy();
    }
    @ZenCodeType.Method
    public static boolean canApplyTo(Affix affix, ItemStack var1, LootCategory var2, LootRarity var3){
        return affix.canApplyTo(var1,var2,var3);
    }
    @ZenCodeType.Method
    public static float getDurabilityBonusPercentage(Affix affix, ItemStack stack, LootRarity rarity, float level, @ZenCodeType.Nullable ServerPlayer user){
        return affix.getDurabilityBonusPercentage(stack, rarity, level, user);
    }
    @ZenCodeType.Method
    public static int getDamageProtection(Affix affix, ItemStack stack, LootRarity rarity, float level, DamageSource source){
        return affix.getDamageProtection(stack, rarity, level, source);
    }
    @ZenCodeType.Method
    public static void getEnchantmentLevels(Affix affix, ItemStack stack, LootRarity rarity, float level, Map<Enchantment, Integer> enchantments){
        affix.getEnchantmentLevels(stack,rarity,level,enchantments);
    }
    @ZenCodeType.Method
    public static float getType(Affix affix, ItemStack stack, LootRarity rarity, float level, MobType creatureType){
        return affix.getDamageBonus(stack, rarity, level, creatureType);
    }
    @ZenCodeType.Method
    public static Component getName(Affix affix, ItemStack stack, LootRarity rarity, float level, boolean prefix){
        return affix.getName(stack, rarity, level, prefix);
    }
}
