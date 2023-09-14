package net.sixik.sdmcrtplus.source.integration.ftbteam.events;

import dev.ftb.mods.ftbteams.data.Team;
import net.minecraft.server.level.ServerPlayer;

public class CustomPlayerLoggedInAfterTeamEvent extends CustomTeamEvent{
    private final ServerPlayer player;
    public CustomPlayerLoggedInAfterTeamEvent(Team team, ServerPlayer player) {
        super(team);
        this.player = player;
    }

    public ServerPlayer getPlayer() {
        return this.player;
    }
}
