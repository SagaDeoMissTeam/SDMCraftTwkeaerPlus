package net.sixik.sdmcrtplus.source.integration.ftbteam.events;

import dev.ftb.mods.ftbteams.data.Team;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.eventbus.api.Event;

public class CustomTeamCreatedEvent extends CustomTeamEvent {

    private final ServerPlayer creator;

    public CustomTeamCreatedEvent(Team t, ServerPlayer p) {
        super(t);
        this.creator = p;
    }

    public ServerPlayer getCreator() {
        return this.creator;
    }
}
