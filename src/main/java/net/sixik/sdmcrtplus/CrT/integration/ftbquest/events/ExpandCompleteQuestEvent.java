package net.sixik.sdmcrtplus.CrT.integration.ftbquest.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.Quest;
import dev.ftb.mods.ftbquests.quest.TeamData;
import net.minecraft.server.level.ServerPlayer;
import net.sixik.sdmcrtplus.source.integration.ftbquest.events.SDMCompleteQuestEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Date;
import java.util.List;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/events/CompleteQuestEvent")
@NativeTypeRegistration(value = SDMCompleteQuestEvent.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.events.CompleteQuestEvent")
public class ExpandCompleteQuestEvent {

//    @ZenCodeType.Method
//    public static Quest getObject(SDMCompleteQuestEvent event){
//        return event.getObject();
//    }
    @ZenCodeType.Method
    public static Quest getQuest(SDMCompleteQuestEvent event){
        return event.getQuest();
    }
    @ZenCodeType.Method
    public static TeamData getTeam(SDMCompleteQuestEvent event){
        return event.getTeam();
    }
    @ZenCodeType.Method
    public static List<ServerPlayer> getNotifyMembers(SDMCompleteQuestEvent event) {
        return event.getNotifyMembers();
    }
    @ZenCodeType.Method
    public static List<ServerPlayer> getOnlineMembers(SDMCompleteQuestEvent event) {
        return event.getOnlineMembers();
    }

    @ZenCodeType.Method
    public static Date getTime(SDMCompleteQuestEvent event) {
        return event.getTime();
    }
}
