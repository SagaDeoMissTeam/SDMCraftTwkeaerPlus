package net.sixik.sdmcrtplus.source.integration.ftbteam.events;

import dev.ftb.mods.ftbteams.data.Team;
import net.minecraftforge.eventbus.api.Event;


public class CustomTeamEvent extends Event {
    private final Team team;

    public CustomTeamEvent(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }
}
