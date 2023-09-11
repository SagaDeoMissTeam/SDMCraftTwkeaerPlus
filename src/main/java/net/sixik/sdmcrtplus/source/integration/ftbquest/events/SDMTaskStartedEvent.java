package net.sixik.sdmcrtplus.source.integration.ftbquest.events;

import dev.ftb.mods.ftbquests.quest.TeamData;
import dev.ftb.mods.ftbquests.quest.task.Task;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.eventbus.api.Event;

import java.util.Date;
import java.util.List;

public class SDMTaskStartedEvent extends Event {
    private Task object;
    private Task task;
    private TeamData teamData;
    private List<ServerPlayer> onlineMembers;
    private List<ServerPlayer> notifiedPlayers;
    private Date time;
    public SDMTaskStartedEvent(Task object, Task task, TeamData data, List<ServerPlayer> onlineMembers, List<ServerPlayer> notifiedPlayers, Date time){
        this.object = object;
        this.task = task;
        this.teamData = data;
        this.onlineMembers = onlineMembers;
        this.notifiedPlayers = notifiedPlayers;
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public List<ServerPlayer> getOnlineMembers() {
        return onlineMembers;
    }

    public Task getTask() {
        return task;
    }

    public Task getObject() {
        return  object;
    }

    public List<ServerPlayer> getNotifiedPlayers() {
        return notifiedPlayers;
    }

    public TeamData getTeamData() {
        return teamData;
    }
}
