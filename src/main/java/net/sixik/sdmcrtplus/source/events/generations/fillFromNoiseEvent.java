package net.sixik.sdmcrtplus.source.events.generations;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class fillFromNoiseEvent extends Event {
    private int numX;
    private int numY;
    private int numZ;
    private @Nullable Player player;

    public fillFromNoiseEvent(int numX, int numY, int numZ, Player player){
        this.numX = numX;
        this.numY = numY;
        this.numZ = numZ;
        this.player = player;
    }

    public int getNumX() {
        return numX;
    }

    public int getNumY() {
        return numY;
    }

    public int getNumZ() {
        return numZ;
    }

    public void setNumX(int numX) {
        this.numX = numX;
    }

    public void setNumY(int numY) {
        this.numY = numY;
    }

    public void setNumZ(int numZ) {
        this.numZ = numZ;
    }

    @Nullable
    public Player getPlayer() {
        return player;
    }

    @Override
    public boolean isCancelable() {
        return false;
    }
}
