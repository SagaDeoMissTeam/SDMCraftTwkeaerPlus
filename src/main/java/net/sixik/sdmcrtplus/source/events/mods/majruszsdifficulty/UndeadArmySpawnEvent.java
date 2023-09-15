package net.sixik.sdmcrtplus.source.events.mods.majruszsdifficulty;


import com.majruszsdifficulty.undeadarmy.UndeadArmy;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class UndeadArmySpawnEvent extends Event {
    private UndeadArmy undeadArmy;
    private @Nullable Player player;
    public UndeadArmySpawnEvent(UndeadArmy undeadArmy){
        this.undeadArmy = undeadArmy;
        this.player = UndeadArmyEventHelper.getPlayer();
    }

    public UndeadArmy getUndeadArmy() {
        return undeadArmy;
    }

    @Nullable
    public Player getPlayer() {
        return player;
    }
}
