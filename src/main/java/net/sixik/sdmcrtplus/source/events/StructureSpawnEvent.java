package net.sixik.sdmcrtplus.source.events;

import net.minecraft.core.SectionPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraftforge.event.level.LevelEvent;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Cancelable
public class StructureSpawnEvent extends Event {

     Structure structure;
     StructureManager structureManager;
     ChunkPos chunkpos;
     SectionPos sectionpos;
     Level level;
     @Nullable
      Player player;
    public StructureSpawnEvent(Structure structure, StructureManager structureManager, ChunkPos chunkpos, SectionPos sectionpos, Level level, Player player){
        this.structure = structure;
        this.structureManager = structureManager;
        this.chunkpos = chunkpos;
        this.sectionpos = sectionpos;
        this.level = level;
        this.player =player;
    }

    public ChunkPos getChunkpos() {
        return this.chunkpos;
    }

    public SectionPos getSectionpos() {
        return this.sectionpos;
    }

    public Structure getStructure() {
        return this.structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    public StructureManager getStructureManager() {
        return this.structureManager;
    }

    public Level getLevel() {
        return level;
    }

    @Nullable
    public Player getPlayer() {
        return player;
    }

    @Override
    public boolean isCancelable() {
        return true;
    }
}
