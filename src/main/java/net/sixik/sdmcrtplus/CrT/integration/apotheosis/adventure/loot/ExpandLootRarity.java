package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.loot;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;
import shadows.apotheosis.adventure.loot.LootRarity;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/loot/LootRarity")
@NativeTypeRegistration(value = LootRarity.class,zenCodeName = "mods.sdmcrtplus.integration.apotheosis.adventure.loot.LootRarity")
public class ExpandLootRarity {
    @ZenCodeType.Method
    public static TextColor getColor(LootRarity rarity){
        return rarity.color();
    }
    @ZenCodeType.Method
    public static String getID(LootRarity rarity){
        return rarity.id();
    }
    @ZenCodeType.Method
    public static float getQuality(LootRarity rarity){
        return rarity.getQuality();
    }
    @ZenCodeType.Method
    public static float getWeight(LootRarity rarity){
        return rarity.getWeight();
    }
    @ZenCodeType.Method
    public static ItemStack getMaterial(LootRarity rarity){
        return rarity.getMaterial();
    }
    @ZenCodeType.Method
    public static boolean isAtLeast(LootRarity lrarity, LootRarity rarity){
        return lrarity.isAtLeast(rarity);
    }
    @ZenCodeType.Method
    public static boolean isAtMost(LootRarity lrarity, LootRarity rarity){
        return lrarity.isAtMost(rarity);
    }
}
