package net.sixik.sdmcrtplus.source.integration.ftbteam.events;

import dev.ftb.mods.ftbteams.data.PlayerTeam;
import dev.ftb.mods.ftbteams.data.Team;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class CustomPlayerLeftPartyTeamEvent extends CustomTeamEvent{
    private final PlayerTeam newTeam;
    private final UUID playerId;
    private final ServerPlayer player;
    private final boolean teamDeleted;
    public CustomPlayerLeftPartyTeamEvent(Team team, PlayerTeam newTeam, UUID playerId, ServerPlayer player, boolean teamDeleted) {
        super(team);
        this.newTeam = newTeam;
        this.playerId = playerId;
        this.player = player;
        this.teamDeleted = teamDeleted;
    }

    public PlayerTeam getNewTeam() {
        return this.newTeam;
    }

    public UUID getPlayerId() {
        return this.playerId;
    }

    public @Nullable ServerPlayer getPlayer() {
        return this.player;
    }

    public boolean getTeamDeleted() {
        return this.teamDeleted;
    }
}
