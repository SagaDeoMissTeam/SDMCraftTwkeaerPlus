package net.sixik.sdmcrtplus.source.integration.ftbteam.events;

import com.mojang.authlib.GameProfile;
import dev.ftb.mods.ftbteams.data.Team;
import net.minecraftforge.eventbus.api.Event;

import java.util.Collection;
import java.util.List;

public class CustomTeamAllyEvent extends CustomTeamEvent {
    private final List<GameProfile> players;
    private final boolean adding;
    public CustomTeamAllyEvent(Team team, List<GameProfile> players, boolean adding){
        super(team);
        this.players = players;
        this.adding = adding;
    }


    public Collection<GameProfile> getPlayers() {
        return this.players;
    }

    public boolean isAdding() {
        return this.adding;
    }
}
