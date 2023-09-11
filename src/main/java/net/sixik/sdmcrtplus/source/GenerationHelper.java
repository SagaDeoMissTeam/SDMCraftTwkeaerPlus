package net.sixik.sdmcrtplus.source;

import net.minecraft.world.entity.player.Player;

public class GenerationHelper {
    private static Player currentPlayer;
    public static void setPlayer(Player player){
        currentPlayer = player;
    }

    public static Player getPlayer() {
        return currentPlayer;
    }
}
