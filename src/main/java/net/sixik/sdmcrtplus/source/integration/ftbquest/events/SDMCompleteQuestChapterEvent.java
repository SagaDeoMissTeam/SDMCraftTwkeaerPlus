package net.sixik.sdmcrtplus.source.integration.ftbquest.events;

import dev.ftb.mods.ftbquests.quest.Chapter;
import dev.ftb.mods.ftbquests.quest.TeamData;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.eventbus.api.Event;

import java.util.Date;
import java.util.List;

public class SDMCompleteQuestChapterEvent extends Event {

    private Chapter object;
    private Chapter chapter;
    private TeamData teamData;
    private List<ServerPlayer> onlineMembers;
    private List<ServerPlayer> notifyMembers;
    private Date time;
    public SDMCompleteQuestChapterEvent(Chapter object, Chapter chapter, TeamData teamData, List<ServerPlayer> notifyMembers, List<ServerPlayer> onlineMembers, Date time){
        this.object = object;
        this.chapter = chapter;
        this.teamData = teamData;
        this.onlineMembers = onlineMembers;
        this.notifyMembers = notifyMembers;
        this.time = time;
    }

    public Chapter getObject(){
        return this.object;
    }

    public Chapter getChapter(){
        return this.chapter;
    }

    public TeamData getTeam(){
        return this.teamData;
    }

    public List<ServerPlayer> getNotifyMembers() {
        return notifyMembers;
    }

    public List<ServerPlayer> getOnlineMembers() {
        return onlineMembers;
    }

    public Date getTime() {
        return time;
    }
}
