package net.sixik.sdmcrtplus.CrT.integration.ftbquest.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.TeamData;
import dev.ftb.mods.ftbquests.quest.task.Task;
import net.minecraft.server.level.ServerPlayer;
import net.sixik.sdmcrtplus.source.integration.ftbquest.events.SDMTaskStartedEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Date;
import java.util.List;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/events/TaskStartedEvent")
@NativeTypeRegistration(value = SDMTaskStartedEvent.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.events.TaskStartedEvent")
public class ExpandTaskStartedEvent {

    @ZenCodeType.Method
    public static Date getTime(SDMTaskStartedEvent event) {
        return event.getTime();
    }
    @ZenCodeType.Method
    public static List<ServerPlayer> getOnlineMembers(SDMTaskStartedEvent event) {
        return event.getOnlineMembers();
    }
    @ZenCodeType.Method
    public static Task getTask(SDMTaskStartedEvent event) {
        return event.getTask();
    }
//    @ZenCodeType.Method
//    public static Task getObject(SDMTaskStartedEvent event) {
//        return event.getObject();
//    }
    @ZenCodeType.Method
    public static List<ServerPlayer> getNotifiedPlayers(SDMTaskStartedEvent event) {
        return event.getNotifiedPlayers();
    }
    @ZenCodeType.Method
    public static TeamData getTeamData(SDMTaskStartedEvent event) {
        return event.getTeamData();
    }
}
