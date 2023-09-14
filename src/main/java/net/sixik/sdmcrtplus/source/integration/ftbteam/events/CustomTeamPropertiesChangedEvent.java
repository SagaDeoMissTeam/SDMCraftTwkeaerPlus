package net.sixik.sdmcrtplus.source.integration.ftbteam.events;

import dev.ftb.mods.ftbteams.data.Team;
import dev.ftb.mods.ftbteams.property.TeamProperties;

public class CustomTeamPropertiesChangedEvent extends CustomTeamEvent{
    private final TeamProperties old;
    public CustomTeamPropertiesChangedEvent(Team team, TeamProperties old) {
        super(team);
        this.old = old;
    }

    public TeamProperties getOldProperties() {
        return this.old;
    }
}
