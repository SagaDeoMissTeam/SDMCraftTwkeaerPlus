package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.boss;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;
import shadows.apotheosis.adventure.boss.BossStats;
import shadows.apotheosis.util.ChancedEffectInstance;
import shadows.placebo.json.RandomAttributeModifier;

import java.util.List;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/boss/BossStats")
@NativeTypeRegistration(value = BossStats.class,zenCodeName = "mods.sdmcrtplus.integration.apotheosis.adventure.boss.BossStats")
public class ExpandBossStats {

    @ZenCodeType.Method
    public static List<ChancedEffectInstance> effects(BossStats bossStats){
        return bossStats.effects();
    }
    @ZenCodeType.Method
    public static float enchantChance(BossStats bossStats){
        return bossStats.enchantChance();
    }
    @ZenCodeType.Method
    public static int[] enchLevels(BossStats bossStats){
        return bossStats.enchLevels();
    }
    @ZenCodeType.Method
    public static List<RandomAttributeModifier> modifiers(BossStats bossStats){
        return bossStats.modifiers();
    }
}
