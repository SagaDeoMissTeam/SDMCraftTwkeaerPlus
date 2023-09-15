package net.sixik.sdmcrtplus.CrT.world.biome;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.biome.MobSpawnSettings;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/MobSpawnCost")
@NativeTypeRegistration(value = MobSpawnSettings.MobSpawnCost.class, zenCodeName = "mods.sdmcrtplus.world.MobSpawnCost")
public class ExpandMobSpawnCost {

    @ZenCodeType.Method
    public static double getCharge(MobSpawnSettings.MobSpawnCost mobSpawnCost){
        return mobSpawnCost.getCharge();
    }
    @ZenCodeType.Method
    public static double getEnergyBudget(MobSpawnSettings.MobSpawnCost mobSpawnCost){
        return mobSpawnCost.getEnergyBudget();
    }
}
