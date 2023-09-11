package net.sixik.sdmcrtplus.source.integration.ftbquest.events;

import dev.ftb.mods.ftbquests.quest.Quest;
import dev.ftb.mods.ftbquests.quest.TeamData;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.eventbus.api.Event;

import java.util.Date;
import java.util.List;

public class SDMQuestStartedEvent extends Event {

    private Quest quest;
    private Quest object;
    private TeamData data;
    private List<ServerPlayer> onlineMembers;
    private List<ServerPlayer> notifiedPlayers;
    private Date time;
    public SDMQuestStartedEvent(Quest object, Quest quest, TeamData data, List<ServerPlayer> onlineMembers, List<ServerPlayer> notifiedPlayers, Date time){
        this.quest = quest;
        this.object = object;
        this.data = data;
        this.onlineMembers = onlineMembers;
        this.notifiedPlayers = notifiedPlayers;
        this.time = time;
    }

    public Quest getObject(){
        return this.object;
    }

    public Quest getQuest(){
        return this.quest;
    }

    public TeamData getTeam(){
        return this.data;
    }

    public List<ServerPlayer> getNotifyMembers() {
        return notifiedPlayers;
    }

    public List<ServerPlayer> getOnlineMembers() {
        return onlineMembers;
    }

    public Date getTime() {
        return time;
    }
}
