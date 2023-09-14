package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.boss;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import org.openzen.zencode.java.ZenCodeType;
import shadows.apotheosis.adventure.boss.BossItem;
import shadows.apotheosis.adventure.boss.BossItemManager;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/boss/BossItemManager")
@NativeTypeRegistration(value = BossItemManager.class,zenCodeName = "mods.sdmcrtplus.integration.apotheosis.adventure.boss.BossItemManager")
public class ExpandBossItemManager {

    @ZenCodeType.Method
    public static BossItem getValue(BossItemManager itemManager, ResourceLocation id){
        return itemManager.getValue(id);
    }
    @ZenCodeType.Method
    public static BossItem getRandomItem(BossItemManager itemManager, RandomSource rand){
        return itemManager.getRandomItem(rand);
    }
    @ZenCodeType.Method
    public static BossItem getRandomItem(BossItemManager itemManager, RandomSource rand, float luck){
        return itemManager.getRandomItem(rand, luck);
    }
}
