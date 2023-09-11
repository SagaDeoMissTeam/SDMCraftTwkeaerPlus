package net.sixik.sdmcrtplus.CrT.integration.ftbquest.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.Chapter;
import dev.ftb.mods.ftbquests.quest.TeamData;
import net.minecraft.server.level.ServerPlayer;
import net.sixik.sdmcrtplus.source.integration.ftbquest.events.SDMChapterStartedEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Date;
import java.util.List;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/events/ChapterStartedEvent")
@NativeTypeRegistration(value = SDMChapterStartedEvent.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.events.ChapterStartedEvent")
public class ExpandChapterStartedEvent {


//    @ZenCodeType.Method
//    @ZenCodeType.Getter("object")
//    public static Chapter getObject(SDMChapterStartedEvent event){
//        return event.getObject();
//    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("chapter")
    public static Chapter getChapter(SDMChapterStartedEvent event){
        return event.getChapter();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("team")
    public static TeamData getTeam(SDMChapterStartedEvent event){
        return event.getTeam();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("notifyMembers")
    public static List<ServerPlayer> getNotifyMembers(SDMChapterStartedEvent event) {
        return event.getNotifyMembers();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("onlineMembers")
    public static List<ServerPlayer> getOnlineMembers(SDMChapterStartedEvent event) {
        return event.getOnlineMembers();
    }
    @ZenCodeType.Method
    public static Date getTime(SDMChapterStartedEvent event) {
        return event.getTime();
    }
}
