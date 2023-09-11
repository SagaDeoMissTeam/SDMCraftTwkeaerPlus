package net.sixik.sdmcrtplus.source.events.generations;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ChunkPos;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Cancelable
public class fillBiomesFromNoiseEvent extends Event {

    private @Nullable ResourceLocation biome;
    private ChunkPos chunkpos;
    private @Nullable Player player;
    public fillBiomesFromNoiseEvent(ChunkPos chunkpos, ResourceLocation biome, Player player){
        this.biome = biome;
        this.chunkpos =chunkpos;
        this.player = player;
    }

    public @Nullable ResourceLocation getBiome() {
        return biome;
    }

    public ChunkPos getChunkpos() {
        return chunkpos;
    }

    public void setBiome(ResourceLocation biome) {
        this.biome = biome;
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
