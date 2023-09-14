package net.sixik.sdmcrtplus.source.integration.ftbteam.events;

import dev.ftb.mods.ftbteams.data.Team;

public class CustomTeamDeleteEvent extends CustomTeamEvent{
    public CustomTeamDeleteEvent(Team team) {
        super(team);
    }
}
