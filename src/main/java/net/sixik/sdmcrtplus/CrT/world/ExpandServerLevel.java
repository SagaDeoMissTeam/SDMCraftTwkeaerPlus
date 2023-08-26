package net.sixik.sdmcrtplus.CrT.world;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.ResourceLocationException;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.SectionPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.StructureBlockEntity;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockRotProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.minecraftforge.common.world.ForgeChunkManager;
import net.sixik.sdmcrtplus.Sdmcrtplus;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @docParam this serverLevel
 */
@ZenRegister
@Document("mods/sdmcrtplus/world/ExpandServerLevel")
@ZenCodeType.Expansion("crafttweaker.api.world.ServerLevel")
public class ExpandServerLevel {

    /**
     Checks if a level has any forced chunks. Mainly used for seeing if a level should continue ticking with no players in it.
     */
    @ZenCodeType.Method
    public static boolean hasForcedChunks(ServerLevel level){
        return ForgeChunkManager.hasForcedChunks(level);
    }

    /**
     Forces a chunk to be loaded for the given mod with the "owner" of the ticket being a given block position.
     You will also need to unload chunks for optimization. So don't forget the coordinates.
     * @param positionOwner - The position that will load the chunk. This is the actual owner.
     * @param position - The position that will be loaded.
     * @param add - true to force the chunk, false to unforce the chunk.
     * @param tick – true to make the chunk receive full chunk ticks even if there is no player nearby.
     */
    @ZenCodeType.Method
    public static boolean forceChunk(ServerLevel level, BlockPos positionOwner, BlockPos position, boolean add, boolean tick){
       return ForgeChunkManager.forceChunk(level, Sdmcrtplus.MODID, positionOwner, level.getChunk(position).getPos().x, level.getChunk(position).getPos().z, add, tick);
    }

    /**
     Forces a chunk to be loaded for the given mod with the "owner" of the ticket being a given block position.
     You will also need to unload chunks for optimization. So don't forget the coordinates.
     * @param position - The position that will be loaded.
     * @param add - true to force the chunk, false to unforce the chunk.
     * @param tick – true to make the chunk receive full chunk ticks even if there is no player nearby.
     */
    @ZenCodeType.Method
    public static boolean forceChunk(ServerLevel level, BlockPos position, boolean add, boolean tick){
       return ForgeChunkManager.forceChunk(level, Sdmcrtplus.MODID, position, level.getChunk(position).getPos().x, level.getChunk(position).getPos().z, add, tick);
    }

    /**
     Forces a chunk to be loaded for the given mod with the "owner" of the ticket being the UUID of the given entity.
     * @param entity - The creature that will load the chunk
     * @param position - The position that will be loaded.
     * @param add - true to force the chunk, false to unforce the chunk.
     * @param tick - true to make the chunk receive full chunk ticks even if there is no player nearby.
     */
    @ZenCodeType.Method
    public static boolean forceChunk(ServerLevel level, Entity entity, BlockPos position, boolean add, boolean tick){
       return ForgeChunkManager.forceChunk(level, Sdmcrtplus.MODID, entity, level.getChunk(position).getPos().x, level.getChunk(position).getPos().z, add, tick);
    }

    /**
     Forces a chunk to be loaded for the given mod with the "owner" of the ticket being a given UUID.
     * @param uuid - The UUID of the creature that is responsible for loading the chunk.
     * @param position - The position that will be loaded
     * @param add - true to force the chunk, false to unforce the chunk.
     * @param tick - true to make the chunk receive full chunk ticks even if there is no player nearby.
     */
    @ZenCodeType.Method
    public static boolean forceChunk(ServerLevel level, String uuid, BlockPos position, boolean add, boolean tick){
       return ForgeChunkManager.forceChunk(level, Sdmcrtplus.MODID, UUID.fromString(uuid), level.getChunk(position).getPos().x, level.getChunk(position).getPos().z, add, tick);
    }

    /**
     Allows you to generate a structure in the same way as it would be possible with the place command
     * @param name - ID of the structure to be generated.
     * @param position - The position where the structure will be generated.
     */
    @ZenCodeType.Method
    public static boolean placeStructure(ServerLevel level, ResourceLocation name, BlockPos position) {
        ServerPlayer player = level.getServer().getPlayerList().getPlayers().get(0);
        ForgeChunkManager.forceChunk(level, Sdmcrtplus.MODID, player, position.getX(), position.getZ(), true, true);
        Registry<Structure> registry = level.registryAccess().registryOrThrow(Registry.STRUCTURE_REGISTRY);
        for (Structure structure : registry) {
            if (registry.getKey(structure).equals(name)) {
                ChunkGenerator chunkgenerator = level.getChunkSource().getGenerator();
                StructureStart structurestart = structure.generate(level.registryAccess(), chunkgenerator, chunkgenerator.getBiomeSource(), level.getChunkSource().randomState(),
                        level.getStructureManager(), level.getSeed(), new ChunkPos(position), 0, level, (v) -> {
                            return true;
                        });
                if (!structurestart.isValid()) {
                    CraftTweakerAPI.LOGGER.info("The structure could not be generated ! \nCheck if the coordinates are specified correctly and are they loaded ?");
                    return false;
                } else {
                    BoundingBox boundingbox = structurestart.getBoundingBox();
                    ChunkPos chunkpos = new ChunkPos(SectionPos.blockToSectionCoord(boundingbox.minX()), SectionPos.blockToSectionCoord(boundingbox.minZ()));
                    ChunkPos chunkpos1 = new ChunkPos(SectionPos.blockToSectionCoord(boundingbox.maxX()), SectionPos.blockToSectionCoord(boundingbox.maxZ()));

                    if(checkLoaded(level, chunkpos, chunkpos1) || level.isLoaded(position)) {
                        ChunkPos.rangeClosed(chunkpos, chunkpos1).forEach((p_214558_) -> {
                            structurestart.placeInChunk(level, level.structureManager(), chunkgenerator, level.getRandom(), new BoundingBox(p_214558_.getMinBlockX(), level.getMinBuildHeight(), p_214558_.getMinBlockZ(), p_214558_.getMaxBlockX(), level.getMaxBuildHeight(), p_214558_.getMaxBlockZ()), p_214558_);
                        });
                        return true;
                    } else {
                        CraftTweakerAPI.LOGGER.info("The structure could not be generated ! \nCheck if the coordinates are specified correctly and are they loaded ?");
                    }
                }
            }
        }
        ForgeChunkManager.forceChunk(level, Sdmcrtplus.MODID, player, position.getX(), position.getZ(), false, false);
        return false;
    }

    /**
     Allows you to generate a template in the same way as it would be possible with the place command
     * @param name - ID of the template to be generated.
     * @param position - The position where the template will be generated.
     * @param seed - Unique SEED. Which answers how the template will be generated
     */
    @ZenCodeType.Method
    public static boolean placeTemplate(ServerLevel serverlevel, ResourceLocation name, BlockPos position, int seed){
        return placeTemplate(serverlevel,name,position, 2, seed);
    }

    /**
     Allows you to generate a template in the same way as it would be possible with the place command
     * @param name - ID of the template to be generated.
     * @param position - The position where the template will be generated.
     * @param seed - Unique SEED. Which answers how the template will be generated
     * @param integrity - In fact, this is the same as rotation. But it seems like no. I don't know (MAX 1.0F)
     */
    @ZenCodeType.Method
    public static boolean placeTemplate(ServerLevel serverlevel, ResourceLocation name, BlockPos position, int integrity, int seed) {

        StructureTemplateManager structuretemplatemanager = serverlevel.getStructureManager();

        Optional<StructureTemplate> optional;

        try {
            optional = structuretemplatemanager.get(name);
        } catch (ResourceLocationException resourcelocationexception) {
            CraftTweakerAPI.LOGGER.info("Template not found ! Check whether the template is written correctly.");
            return false;
        }

        if (optional.isEmpty()) {
            CraftTweakerAPI.LOGGER.info("Template not found ! Check whether the template is written correctly.");
            return false;
        } else {
            StructureTemplate structuretemplate = optional.get();
            checkLoaded(serverlevel, new ChunkPos(position), new ChunkPos(position.offset(structuretemplate.getSize())));
            StructurePlaceSettings structureplacesettings = (new StructurePlaceSettings()).setMirror(Mirror.NONE).setRotation(Rotation.NONE);
            if (integrity < 1.0F) {
                structureplacesettings.clearProcessors().addProcessor(new BlockRotProcessor(integrity)).setRandom(StructureBlockEntity.createRandom((long) seed));
            }
            boolean flag = structuretemplate.placeInWorld(serverlevel, position, position, structureplacesettings, StructureBlockEntity.createRandom((long) seed), 2);
            if (!flag) {
                CraftTweakerAPI.LOGGER.info("Template not found ! Check whether the template is written correctly.");
                return false;
            } else {
                return true;
            }
        }
    }

    public static boolean reGenerateChunk(ServerLevel serverlevel){

        return false;
    }

    /**
     Allows you to set a standard rebirth point for the world. That is, if a player dies and he does not have a bed, then he will be reborn in the place where you set the point.
     * @param dimension- The dimension in which the point will be set
     * @param pos - Coordinates by which the point will be set.
     * @param spawnAngle - The angle of rotation of the player during respawn.
     */
    @ZenCodeType.Method
    public static boolean setDefaultSpawnPos(ServerLevel level, ResourceLocation dimension, BlockPos pos, float spawnAngle){
        for(ResourceKey<Level> levelKey : level.getServer().levelKeys()){
            if(levelKey.registry().equals(dimension) || levelKey.registry() == dimension){
                level.getServer().getLevel(levelKey).setDefaultSpawnPos(pos, spawnAngle);
                return true;
            }
        }
        return false;
    }

    /**
     Returns a list of all structures located at these coordinates
     * @param pos coordinates
     */
    @ZenCodeType.Method
    public static List<ResourceLocation> getStructuresNameOnPos(ServerLevel level, BlockPos pos){
        List<ResourceLocation> list = new ArrayList<>();
        Registry<Structure> registry = level.registryAccess().registryOrThrow(Registry.STRUCTURE_REGISTRY);
        for(Structure struct : registry){
            if(level.structureManager().getStructureWithPieceAt(pos, struct).isValid()) list.add(registry.getKey(struct));
        }
        return list;
    }
    /**
     Returns a list of all structures located at these coordinates
     * @param pos coordinates
     */
    @ZenCodeType.Method
    public static List<Structure> getStructuresOnPos(ServerLevel level, BlockPos pos){
        List<Structure> list = new ArrayList<>();
        Registry<Structure> registry = level.registryAccess().registryOrThrow(Registry.STRUCTURE_REGISTRY);
        for(Structure struct : registry){
            if(level.structureManager().getStructureWithPieceAt(pos, struct).isValid()) list.add(struct);
        }
        return list;
    }

    @ZenCodeType.Method
    public static StructureManager getStructureManager(ServerLevel level){
        return level.structureManager();
    }
    @ZenCodeType.Method
    public static StructureTemplateManager getStructureTemplateManager(ServerLevel level){
        return level.getStructureManager();
    }

    private static boolean checkLoaded(ServerLevel p_214544_, ChunkPos p_214545_, ChunkPos p_214546_) {
        if (ChunkPos.rangeClosed(p_214545_, p_214546_).filter((worldPosition) -> {
            return !p_214544_.isLoaded(worldPosition.getWorldPosition());
        }).findAny().isPresent()) {
            return false;
        }
        return true;
    }
}
