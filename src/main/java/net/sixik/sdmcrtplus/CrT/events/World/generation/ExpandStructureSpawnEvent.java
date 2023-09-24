package net.sixik.sdmcrtplus.CrT.events.World.generation;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Registry;
import net.minecraft.core.SectionPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.sixik.sdmcrtplus.source.events.StructureSpawnEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Objects;

/**
 * The event can be canceled
 *
 * An event is called every time a structure tries to appear in the world.
 */
@ZenRegister
@Document("mods/sdmcrtplus/events/level/generation/StructureSpawnEvent")
@NativeTypeRegistration(value = StructureSpawnEvent.class, zenCodeName = "mods.sdmcrtplus.events.level.generation.StructureSpawnEvent")
public class ExpandStructureSpawnEvent {

    @ZenCodeType.Method
    public static Structure getStructure(StructureSpawnEvent event){
        return event.getStructure();
    }
    @ZenCodeType.Method
    public static void setStructure(StructureSpawnEvent event, ResourceLocation structure){
        Registry<Structure> registry = event.getLevel().registryAccess().registryOrThrow(Registry.STRUCTURE_REGISTRY);
        event.setStructure(registry.get(structure) != null ? registry.get(structure) : event.getStructure());
    }

    @ZenCodeType.Method
    public static ChunkPos getChunkpos(StructureSpawnEvent event){
        return event.getChunkpos();
    }
    @ZenCodeType.Method
    public static SectionPos getSectionpos(StructureSpawnEvent event){
        return event.getSectionpos();
    }
    @ZenCodeType.Method
    public static StructureManager getStructureManager(StructureSpawnEvent event){
        return event.getStructureManager();
    }
    @ZenCodeType.Method
    public static Level getLevel(StructureSpawnEvent event){
        return event.getLevel();
    }    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Player getPlayer(StructureSpawnEvent event){
        return event.getPlayer();
    }


}
