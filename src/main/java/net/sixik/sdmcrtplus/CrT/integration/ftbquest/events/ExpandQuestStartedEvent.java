package net.sixik.sdmcrtplus.CrT.integration.ftbquest.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.Quest;
import dev.ftb.mods.ftbquests.quest.TeamData;
import net.minecraft.server.level.ServerPlayer;
import net.sixik.sdmcrtplus.source.integration.ftbquest.events.SDMQuestStartedEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Date;
import java.util.List;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/events/QuestStartedEvent")
@NativeTypeRegistration(value = SDMQuestStartedEvent.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.events.QuestStartedEvent")
public class ExpandQuestStartedEvent {
//    @ZenCodeType.Method
//    public static Quest getObject(SDMQuestStartedEvent event){
//        return event.getObject();
//    }
    @ZenCodeType.Method
    public static Quest getQuest(SDMQuestStartedEvent event){
        return event.getQuest();
    }
    @ZenCodeType.Method
    public static TeamData getTeam(SDMQuestStartedEvent event){
        return event.getTeam();
    }
    @ZenCodeType.Method
    public static List<ServerPlayer> getNotifyMembers(SDMQuestStartedEvent event) {
        return event.getNotifyMembers();
    }
    @ZenCodeType.Method
    public static List<ServerPlayer> getOnlineMembers(SDMQuestStartedEvent event) {
        return event.getOnlineMembers();
    }

    @ZenCodeType.Method
    public static Date getTime(SDMQuestStartedEvent event) {
        return event.getTime();
    }
}
