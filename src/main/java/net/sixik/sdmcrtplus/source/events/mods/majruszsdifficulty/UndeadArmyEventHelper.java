package net.sixik.sdmcrtplus.source.events.mods.majruszsdifficulty;

import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;

public class UndeadArmyEventHelper {

    private static @Nullable Player player = null;

    public static void setPlayer(@Nullable Player _player){
        player = _player;
    }
    public static @Nullable Player getPlayer(){
        return player;
    }
}
