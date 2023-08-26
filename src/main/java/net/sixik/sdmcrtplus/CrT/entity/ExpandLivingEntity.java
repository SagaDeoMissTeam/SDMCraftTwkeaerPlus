package net.sixik.sdmcrtplus.CrT.entity;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ChunkHolder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;
import org.openzen.zencode.java.ZenCodeType;
import xaero.pac.common.server.claims.protection.group.ChunkProtectionExceptionGroupLoader;

import java.util.*;

/**
 * @docParam this livingEntity
 */
@ZenRegister
@Document("mods/sdmcrtplus/entity/ExpandLivingEntity")
@ZenCodeType.Expansion("crafttweaker.api.entity.LivingEntity")
public class ExpandLivingEntity {

    /**
     This method is equivalent to teleport, but still slightly different.
     It prevents the entity from getting into the blocks. He checks whether the entity can stand there in full growth.
     * @param position The position to which the entity will be teleported.
     * @param isEvent Will it trigger an event ?
     */
    @ZenCodeType.Method
    public static void teleportWithCheck(LivingEntity player, BlockPos position, boolean isEvent){
        player.randomTeleport(position.getX(), position.getY(), position.getZ(), isEvent);
    }

    @ZenCodeType.Method
    public static void teleportWithCheck(LivingEntity player, double posX, double posY, double posZ, boolean isEvent){
        player.randomTeleport(posX, posY, posZ, isEvent);
    }

    /**
     Teleports to random coordinates in the zone. If the creature cannot stand on the coordinates, it will not be teleported and will return false
     * @param zone the area around the creature in which the teleport will be carried out.
     */
    @ZenCodeType.Method
    public static boolean randomTeleport(LivingEntity entity, int zone){
        ServerLevel level = (ServerLevel) entity.level;

        double d0 = entity.getX();
        double d1 = entity.getY();
        double d2 = entity.getZ();
        for(int i = 0; i < zone; ++i) {
            double d3 = entity.getX() + (entity.getRandom().nextDouble() - 0.5D) * zone;
            double d4 = Mth.clamp(entity.getY() + (double)(entity.getRandom().nextInt(zone) - 8), (double)level.getMinBuildHeight(), (double)(level.getMinBuildHeight() + (level).getLogicalHeight() - 1));
            double d5 = entity.getZ() + (entity.getRandom().nextDouble() - 0.5D) * zone;
            if (entity.isPassenger()) {
                entity.stopRiding();
            }
            if(entity.randomTeleport(d3,d4,d5, true)){
                return true;
            }
        }
        return false;
    }

    /**
     Teleports to random coordinates in the zone. If the creature cannot stand on the coordinates, it will not be teleported and will return false
     * @param zone the area around the creature in which the teleport will be carried out.
     */
    @ZenCodeType.Method
    public static boolean randomTeleport(LivingEntity entity,BlockPos position, int zone){
        ServerLevel level = (ServerLevel) entity.level;

        double d0 = position.getX();
        double d1 = position.getY();
        double d2 = position.getZ();
        for(int i = 0; i < zone; ++i) {
            double d3 = position.getX() + (entity.getRandom().nextDouble() - 0.5D) * zone;
            double d4 = Mth.clamp(entity.getY() + (double)(entity.getRandom().nextInt(zone) - 8), (double)level.getMinBuildHeight(), (double)(level.getMinBuildHeight() + (level).getLogicalHeight() - 1));
            double d5 = position.getZ() + (entity.getRandom().nextDouble() - 0.5D) * zone;
            if (entity.isPassenger()) {
                entity.stopRiding();
            }
            if(entity.randomTeleport(d3,d4,d5, true)){
                return true;
            }
        }
        return false;
    }

    /**
     Allows you to move the entity to the desired dimension
     * @param dimension The dimension to which the entity will be moved
     */
    @ZenCodeType.Method
    public static boolean changeDimension(LivingEntity entity, ResourceLocation dimension){
        for(ResourceKey<Level> levelKey : entity.getServer().levelKeys()){
            if(levelKey.registry().equals(dimension) || levelKey.registry() == dimension){
                entity.changeDimension(entity.getServer().getLevel(levelKey));
                return true;
            }

        }
        return false;
    }

    /**
     Allows you to move the entity to the desired dimension
     * @param level A more effective option than the top one
     */
    @ZenCodeType.Method
    public static boolean changeDimension(LivingEntity entity, ServerLevel level){
        if(level != null){
            entity.changeDimension(level);
            return true;
        }
        else return false;
    }

    /**
     Checks. Whether the entity is in the structure or not.
     * @param structure Structure name
     */
    @ZenCodeType.Method
    public static boolean onStructure(LivingEntity entity, ResourceLocation structure){
        Registry<Structure> registry = entity.level.registryAccess().registryOrThrow(Registry.STRUCTURE_REGISTRY);
        ServerLevel level = (ServerLevel) entity.level;
        for(Structure struct : registry){
            if(Objects.equals(registry.getKey(struct), structure)){
                return level.structureManager().getStructureWithPieceAt(entity.blockPosition(), struct).isValid();
            }
        }
        return false;
    }

    /**
     Checks. Whether the entity is in the structure or not.
     * @param structure Structure name
     */
    @ZenCodeType.Method
    public static boolean onStructure(LivingEntity entity, Structure structure){
        Registry<Structure> registry = entity.level.registryAccess().registryOrThrow(Registry.STRUCTURE_REGISTRY);
        ServerLevel level = (ServerLevel) entity.level;
        for(Structure struct : registry){
            if(Objects.equals(struct, structure)){
                return level.structureManager().getStructureWithPieceAt(entity.blockPosition(), struct).isValid();
            }
        }
        return false;
    }

    /**
     Returns a list of structures in which the entity is currently located.
     * @return
     */
    @ZenCodeType.Method
    public static List<ResourceLocation> getStructuresNameWhereEntity(LivingEntity entity){
        List<ResourceLocation> list = new ArrayList<>();
        ServerLevel level = (ServerLevel) entity.level;
        Registry<Structure> registry = level.registryAccess().registryOrThrow(Registry.STRUCTURE_REGISTRY);
        for(Structure struct : registry){
            if(level.structureManager().getStructureWithPieceAt(entity.blockPosition(), struct).isValid()) list.add(registry.getKey(struct));
        }
        return list;
    }

    /**
     Returns a list of structures in which the entity is currently located.
     * @return
     */
    @ZenCodeType.Method
    public static List<Structure> getStructuresWhereEntity(LivingEntity entity){
        List<Structure> list = new ArrayList<>();
        ServerLevel level = (ServerLevel) entity.level;
        Registry<Structure> registry = level.registryAccess().registryOrThrow(Registry.STRUCTURE_REGISTRY);
        for(Structure struct : registry){
            if(level.structureManager().getStructureWithPieceAt(entity.blockPosition(), struct).isValid()) list.add(struct);
        }
        return list;
    }

    @ZenCodeType.Getter("isFriendly")
    @ZenCodeType.Method
    public static boolean isFriendly(LivingEntity entity){
        return entity.getType().getCategory().isFriendly();
    }
    @ZenCodeType.Getter("isPersistent")
    @ZenCodeType.Method
    public static boolean isPersistent(LivingEntity entity){
        return entity.getType().getCategory().isPersistent();
    }
    @ZenCodeType.Getter("despawnDistance")
    @ZenCodeType.Method
    public static int getDespawnDistance(LivingEntity entity){
        return entity.getType().getCategory().getDespawnDistance();
    }
    @ZenCodeType.Getter("noDespawnDistance")
    @ZenCodeType.Method
    public static int getNoDespawnDistance(LivingEntity entity){
        return entity.getType().getCategory().getNoDespawnDistance();
    }
    @ZenCodeType.Getter("maxInstancesPerChunk")
    @ZenCodeType.Method
    public static int getMaxInstancesPerChunk(LivingEntity entity){
        return entity.getType().getCategory().getMaxInstancesPerChunk();
    }
    @ZenCodeType.Getter("arrowCount")
    @ZenCodeType.Method
    public static int getArrowCount(LivingEntity entity){
        return entity.getArrowCount();
    }
    @ZenCodeType.Getter("armorValue")
    @ZenCodeType.Method
    public static int getArmorValue(LivingEntity entity){
        return entity.getArmorValue();
    }

}
