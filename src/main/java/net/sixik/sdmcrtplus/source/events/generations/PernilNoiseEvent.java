package net.sixik.sdmcrtplus.source.events.generations;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Cancelable
public class PernilNoiseEvent extends Event {
    private @Nullable Player player;
    private double numX;
    private double numZ;
    private double totalNum = 0.0D;
    public PernilNoiseEvent(Player player, double numX, double numZ){
        this.player = player;
        this.numX = numX;
        this.numZ = numZ;
    }

    public double getNumX() {
        return numX;
    }

    public double getNumZ() {
        return numZ;
    }

    public void setNumX(double numX) {
        this.numX = numX;
    }

    public void setNumZ(double numZ) {
        this.numZ = numZ;
    }

    public void setTotalNum(double totalNum) {
        this.totalNum = totalNum;
    }

    public double getTotalNum() {
        return totalNum;
    }

    @Override
    public boolean isCancelable() {
        return true;
    }

    public @Nullable Player getPlayer() {
        return player;
    }
}
