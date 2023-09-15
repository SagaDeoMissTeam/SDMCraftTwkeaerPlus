package net.sixik.sdmcrtplus.CrT.world.biome;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.util.random.WeightedRandomList;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.MobSpawnSettings;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Set;

@ZenRegister
@Document("mods/sdmcrtplus/world/MobSpawnSettings")
@NativeTypeRegistration(value = MobSpawnSettings.class, zenCodeName = "mods.sdmcrtplus.world.MobSpawnSettings")
public class ExpandMobSpawnSettings {

    @ZenCodeType.Method
    public static Set<EntityType<?>> getEntityTypes(MobSpawnSettings mobSettings){
        return mobSettings.getEntityTypes();
    }
    @ZenCodeType.Method
    public static Set<MobCategory> getSpawnerTypes(MobSpawnSettings mobSettings){
        return mobSettings.getSpawnerTypes();
    }
    @ZenCodeType.Method
    public static float getCreatureProbability(MobSpawnSettings mobSettings){
        return mobSettings.getCreatureProbability();
    }
    @ZenCodeType.Method
    public static MobSpawnSettings.MobSpawnCost getCreatureProbability(MobSpawnSettings mobSettings, EntityType<?> entityType){
        return mobSettings.getMobSpawnCost(entityType);
    }
    @ZenCodeType.Method
    public static WeightedRandomList<MobSpawnSettings.SpawnerData> getMobs(MobSpawnSettings mobSettings, MobCategory mobCategory){
        return mobSettings.getMobs(mobCategory);
    }
}
