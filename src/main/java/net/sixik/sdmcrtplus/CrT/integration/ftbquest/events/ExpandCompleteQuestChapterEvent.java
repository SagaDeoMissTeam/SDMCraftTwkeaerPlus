package net.sixik.sdmcrtplus.CrT.integration.ftbquest.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.Chapter;
import dev.ftb.mods.ftbquests.quest.TeamData;
import net.minecraft.server.level.ServerPlayer;
import net.sixik.sdmcrtplus.source.integration.ftbquest.events.SDMCompleteQuestChapterEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Date;
import java.util.List;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/events/CompleteChapterEvent")
@NativeTypeRegistration(value = SDMCompleteQuestChapterEvent.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.events.CompleteChapterEvent")
public class ExpandCompleteQuestChapterEvent {

//    @ZenCodeType.Method
//    public static Chapter getObject(SDMCompleteQuestChapterEvent event){
//        return event.getObject();
//    }
    @ZenCodeType.Method
    public static Chapter getChapter(SDMCompleteQuestChapterEvent event){
        return event.getChapter();
    }
    @ZenCodeType.Method
    public static TeamData getTeam(SDMCompleteQuestChapterEvent event){
        return event.getTeam();
    }
    @ZenCodeType.Method
    public static List<ServerPlayer> getNotifyMembers(SDMCompleteQuestChapterEvent event) {
        return event.getNotifyMembers();
    }
    @ZenCodeType.Method
    public static List<ServerPlayer> getOnlineMembers(SDMCompleteQuestChapterEvent event) {
        return event.getOnlineMembers();
    }
    @ZenCodeType.Method
    public static Date getTime(SDMCompleteQuestChapterEvent event) {
        return event.getTime();
    }
}
