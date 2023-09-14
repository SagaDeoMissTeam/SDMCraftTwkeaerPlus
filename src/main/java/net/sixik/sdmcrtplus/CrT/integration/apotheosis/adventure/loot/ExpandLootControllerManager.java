package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.loot;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ServerLevelAccessor;
import org.openzen.zencode.java.ZenCodeType;
import shadows.apotheosis.adventure.loot.LootCategory;
import shadows.apotheosis.adventure.loot.LootController;
import shadows.apotheosis.adventure.loot.LootRarity;

import javax.annotation.Nullable;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/loot/LootControllerManager")
@ZenCodeType.Name("mods.sdmcrtplus.integration.apotheosis.adventure.loot.LootControllerManager")
public class ExpandLootControllerManager {

    @ZenCodeType.Method
    public static ItemStack createRandomLootItem(RandomSource rand, @ZenCodeType.Nullable LootRarity rarity, Player player, ServerLevel level){
        return LootController.createRandomLootItem(rand, rarity, player, level);
    }
    @ZenCodeType.Method
    public static ItemStack createLootItem(ItemStack stack, LootRarity rarity, RandomSource rand){
        return LootController.createLootItem(stack, rarity, rand);
    }
    @ZenCodeType.Method
    public static ItemStack createLootItem(ItemStack stack, LootCategory cat, LootRarity rarity, RandomSource rand){
        return LootController.createLootItem(stack,cat, rarity, rand);
    }
}
