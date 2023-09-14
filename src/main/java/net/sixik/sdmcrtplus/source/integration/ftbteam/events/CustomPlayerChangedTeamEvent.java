package net.sixik.sdmcrtplus.source.integration.ftbteam.events;

import dev.ftb.mods.ftbteams.data.Team;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.UUID;

public class CustomPlayerChangedTeamEvent extends CustomTeamEvent{

    private final Optional<Team> previousTeam;
    private final UUID playerId;
    private final ServerPlayer player;
    public CustomPlayerChangedTeamEvent(Team team, Optional<Team> previousTeam, UUID playerId, ServerPlayer player) {
        super(team);
        this.previousTeam = previousTeam;
        this.playerId = playerId;
        this.player = player;
    }

    public Optional<Team> getPreviousTeam() {
        return this.previousTeam;
    }

    public UUID getPlayerId() {
        return this.playerId;
    }

    public @Nullable ServerPlayer getPlayer() {
        return this.player;
    }
}
