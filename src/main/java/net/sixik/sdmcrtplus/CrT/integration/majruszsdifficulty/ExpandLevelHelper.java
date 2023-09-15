package net.sixik.sdmcrtplus.CrT.integration.majruszsdifficulty;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.mlib.levels.LevelHelper;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "majruszsdifficulty")
@Document("mods/sdmcrtplus/integration/majruszsdifficulty/LevelHelper")
@ZenCodeType.Name("mods.sdmcrtplus.integration.majruszsdifficulty.LevelHelper")
public class ExpandLevelHelper {

    @ZenCodeType.Method
    public static boolean isEntityIn(Entity entity, ResourceKey<Level> worldRegistryKey){
        return LevelHelper.isEntityIn(entity,worldRegistryKey);
    }
    @ZenCodeType.Method
    public static DifficultyInstance getDifficultyAt(Entity entity){
        return LevelHelper.getDifficultyAt(entity);
    }
    @ZenCodeType.Method
    public static DifficultyInstance getDifficultyAt(Level level, BlockPos position){
        return LevelHelper.getDifficultyAt(level,position);
    }
    @ZenCodeType.Method
    public static double getRegionalDifficultyAt(Entity entity){
        return LevelHelper.getRegionalDifficultyAt(entity);
    }
    @ZenCodeType.Method
    public static double getRegionalDifficultyAt(Level level, BlockPos position){
        return LevelHelper.getRegionalDifficultyAt(level, position);
    }
    @ZenCodeType.Method
    public static double getClampedRegionalDifficultyAt(Entity entity){
        return LevelHelper.getClampedRegionalDifficultyAt(entity);
    }
    @ZenCodeType.Method
    public static boolean isEntityOutside(Entity entity){
        return LevelHelper.isEntityOutside(entity);
    }
    @ZenCodeType.Method
    public static boolean isRainingAt(Entity entity){
        return LevelHelper.isRainingAt(entity);
    }
    @ZenCodeType.Method
    public static boolean isDayAt(Entity entity){
        return LevelHelper.isDayAt(entity);
    }
    @ZenCodeType.Method
    public static boolean isNightAt(Entity entity){
        return LevelHelper.isNightAt(entity);
    }
    @ZenCodeType.Method
    public static Pair<Vec3, ServerLevel> getSpawnData(ServerPlayer player){
        return LevelHelper.getSpawnData(player);
    }
    @ZenCodeType.Method
    public static void teleportToSpawnPosition(ServerPlayer player){
         LevelHelper.teleportToSpawnPosition(player);
    }
    @ZenCodeType.Method
    public static void freezeWater(Entity entity, double radius, int minimumIceDuration, int maximumIceDuration){
         LevelHelper.freezeWater(entity, radius, minimumIceDuration, maximumIceDuration);
    }
    @ZenCodeType.Method
    public static void freezeWater(Entity entity, double radius, int minimumIceDuration, int maximumIceDuration, boolean requireOnGround){
         LevelHelper.freezeWater(entity, radius, minimumIceDuration, maximumIceDuration, requireOnGround);
    }
    @ZenCodeType.Method
    public static void spawnItemEntityFlyingTowardsDirection(ItemStack itemStack, Level level, Vec3 from, Vec3 to){
         LevelHelper.spawnItemEntityFlyingTowardsDirection(itemStack, level, from, to);
    }
    @ZenCodeType.Method
    public static void startRaining(Level level, int ticks, boolean withThunder){
         LevelHelper.startRaining(level, ticks, withThunder);
    }
    @ZenCodeType.Method
    public static void startRaining(Level level, int ticks){
         LevelHelper.startRaining(level, ticks);
    }
    @ZenCodeType.Method
    public static void setClearWeather(Level level, int ticks){
         LevelHelper.setClearWeather(level, ticks);
    }
    @ZenCodeType.Method
    public static void teleportNearby(LivingEntity target, ServerLevel level, double offset){
         LevelHelper.teleportNearby(target, level, offset);
    }
    @ZenCodeType.Method
    public static double getClampedRegionalDifficultyAt(Level level, BlockPos position){
        return LevelHelper.getClampedRegionalDifficultyAt(level, position);
    }

}
