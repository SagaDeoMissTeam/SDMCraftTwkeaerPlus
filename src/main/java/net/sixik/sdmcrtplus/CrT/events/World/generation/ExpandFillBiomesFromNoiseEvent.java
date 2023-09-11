package net.sixik.sdmcrtplus.CrT.events.World.generation;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ChunkPos;
import net.sixik.sdmcrtplus.source.events.generations.fillBiomesFromNoiseEvent;
import org.openzen.zencode.java.ZenCodeType;



/**
 * The event can be canceled
 *
 * An event is called whenever a biome is created.
 */
@ZenRegister
@Document("mods/sdmcrtplus/events/generation/FillBiomesFromNoiseEvent")
@NativeTypeRegistration(value = fillBiomesFromNoiseEvent.class, zenCodeName = "mods.sdmcrtplus.events.generation.FillBiomesFromNoiseEvent")
public class ExpandFillBiomesFromNoiseEvent {

    @ZenCodeType.Method
    public static ResourceLocation getBiome(fillBiomesFromNoiseEvent event){
        return event.getBiome();
    }
    @ZenCodeType.Method
    public static void setBiome(fillBiomesFromNoiseEvent event, ResourceLocation biome){
        event.setBiome(biome);
    }
    @ZenCodeType.Method
    public static ChunkPos getChunkpos(fillBiomesFromNoiseEvent event){
        return event.getChunkpos();
    }
    @ZenCodeType.Method
    public static Player getPlayer(fillBiomesFromNoiseEvent event){
        return event.getPlayer();
    }
}
