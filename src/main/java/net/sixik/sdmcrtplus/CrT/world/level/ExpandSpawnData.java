package net.sixik.sdmcrtplus.CrT.world.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.SpawnData;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Optional;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/SpawnData")
@NativeTypeRegistration(value = SpawnData.class, zenCodeName = "mods.sdmcrtplus.world.level.SpawnData")
public class ExpandSpawnData {

    @ZenCodeType.Method
    public static Optional<SpawnData.CustomSpawnRules> customSpawnRules(SpawnData data){
        return data.customSpawnRules();
    }
    @ZenCodeType.Method
    public static CompoundTag entityToSpawn(SpawnData data){
        return data.entityToSpawn();
    }
    @ZenCodeType.Method
    public static CompoundTag getEntityToSpawn(SpawnData data){
        return data.getEntityToSpawn();
    }
    @ZenCodeType.Method
    public static Optional<SpawnData.CustomSpawnRules> getCustomSpawnRules(SpawnData data){
        return data.getCustomSpawnRules();
    }
}
