package net.sixik.sdmcrtplus.CrT.world.biome;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.biome.MobSpawnSettings;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/SpawnerData")
@NativeTypeRegistration(value = MobSpawnSettings.SpawnerData.class, zenCodeName = "mods.sdmcrtplus.world.SpawnerData")
public class ExpandSpawnerData {

    @ZenCodeType.Method
    public static int getMaxCount(MobSpawnSettings.SpawnerData spawnerData){
        return spawnerData.maxCount;
    }
    @ZenCodeType.Method
    public static int getMinCount(MobSpawnSettings.SpawnerData spawnerData){
        return spawnerData.minCount;
    }
    @ZenCodeType.Method
    public static EntityType<?> getType(MobSpawnSettings.SpawnerData spawnerData){
        return spawnerData.type;
    }
}
