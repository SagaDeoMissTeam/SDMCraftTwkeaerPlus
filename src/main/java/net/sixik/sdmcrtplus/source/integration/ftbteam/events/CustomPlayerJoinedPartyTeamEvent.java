package net.sixik.sdmcrtplus.source.integration.ftbteam.events;

import dev.ftb.mods.ftbteams.data.PlayerTeam;
import dev.ftb.mods.ftbteams.data.Team;
import net.minecraft.server.level.ServerPlayer;

public class CustomPlayerJoinedPartyTeamEvent extends CustomTeamEvent{

    private final PlayerTeam previousTeam;
    private final ServerPlayer player;
    public CustomPlayerJoinedPartyTeamEvent(Team team, PlayerTeam previousTeam, ServerPlayer player) {
        super(team);
        this.previousTeam = previousTeam;
        this.player = player;
    }

    public PlayerTeam getPreviousTeam() {
        return this.previousTeam;
    }

    public ServerPlayer getPlayer() {
        return this.player;
    }
}
