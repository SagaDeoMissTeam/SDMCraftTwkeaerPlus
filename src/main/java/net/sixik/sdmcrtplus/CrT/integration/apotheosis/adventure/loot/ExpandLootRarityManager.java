package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.util.RandomSource;
import org.openzen.zencode.java.ZenCodeType;
import shadows.apotheosis.adventure.loot.LootRarity;

import java.util.ArrayList;
import java.util.List;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/loot/LootRarityManager")
@ZenCodeType.Name("mods.sdmcrtplus.integration.apotheosis.adventure.loot.LootRarityManager")
public class ExpandLootRarityManager {

    @ZenCodeType.Method
    public static List<LootRarity> getListRarity(){
        List<LootRarity> list = new ArrayList<>(LootRarity.LIST);
        return list;
    }

    @ZenCodeType.Field
    public static final LootRarity COMMON = LootRarity.COMMON;
    @ZenCodeType.Field
    public static final LootRarity UNCOMMON = LootRarity.UNCOMMON;
    @ZenCodeType.Field
    public static final LootRarity RARE = LootRarity.RARE;
    @ZenCodeType.Field
    public static final LootRarity EPIC = LootRarity.EPIC;
    @ZenCodeType.Field
    public static final LootRarity MYTHIC = LootRarity.MYTHIC;
    @ZenCodeType.Field
    public static final LootRarity ANCIENT = LootRarity.ANCIENT;

    @ZenCodeType.Method
    public static LootRarity random(RandomSource rand, float luck){
        return LootRarity.random(rand, luck);
    }

}
