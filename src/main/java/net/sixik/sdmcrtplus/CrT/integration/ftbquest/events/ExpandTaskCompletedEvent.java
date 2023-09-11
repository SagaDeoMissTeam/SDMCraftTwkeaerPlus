package net.sixik.sdmcrtplus.CrT.integration.ftbquest.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.TeamData;
import dev.ftb.mods.ftbquests.quest.task.Task;
import net.minecraft.server.level.ServerPlayer;
import net.sixik.sdmcrtplus.source.integration.ftbquest.events.SDMTaskCompletedEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Date;
import java.util.List;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/events/TaskCompletedEvent")
@NativeTypeRegistration(value = SDMTaskCompletedEvent.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.events.TaskCompletedEvent")
public class ExpandTaskCompletedEvent {

    @ZenCodeType.Method
    public static Date getTime(SDMTaskCompletedEvent event) {
        return event.getTime();
    }
    @ZenCodeType.Method
    public static List<ServerPlayer> getOnlineMembers(SDMTaskCompletedEvent event) {
        return event.getOnlineMembers();
    }
    @ZenCodeType.Method
    public static Task getTask(SDMTaskCompletedEvent event) {
        return event.getTask();
    }
//    @ZenCodeType.Method
//    public static Task getObject(SDMTaskCompletedEvent event) {
//        return event.getObject();
//    }
    @ZenCodeType.Method
    public static List<ServerPlayer> getNotifiedPlayers(SDMTaskCompletedEvent event) {
        return event.getNotifiedPlayers();
    }
    @ZenCodeType.Method
    public static TeamData getTeam(SDMTaskCompletedEvent event) {
        return event.getTeamData();
    }
}
