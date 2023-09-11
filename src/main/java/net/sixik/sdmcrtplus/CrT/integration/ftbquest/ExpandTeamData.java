package net.sixik.sdmcrtplus.CrT.integration.ftbquest;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.*;
import dev.ftb.mods.ftbquests.quest.task.Task;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Date;
import java.util.List;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/TeamData")
@NativeTypeRegistration(value = TeamData.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.TeamData")
public class ExpandTeamData {

    @ZenCodeType.Method
    public static QuestFile getFile(TeamData teamData){
        return teamData.file;
    }
    @ZenCodeType.Method
    public static String getName(TeamData teamData){
        return teamData.name;
    }
    @ZenCodeType.Method
    public static String getUUID(TeamData teamData){
        return teamData.uuid.toString();
    }
    @ZenCodeType.Method
    public static boolean areDependenciesComplete(TeamData teamData, Quest quest){
        return teamData.areDependenciesComplete(quest);
    }
    @ZenCodeType.Method
    public static boolean canStartTasks(TeamData teamData, Quest quest){
        return teamData.canStartTasks(quest);
    }
    @ZenCodeType.Method
    public static boolean canStartTasks(TeamData teamData, QuestObject quest){
        return teamData.isCompleted(quest);
    }
    @ZenCodeType.Method
    public static long getProgress(TeamData teamData, Task quest){
        return teamData.getProgress(quest);
    }
    @ZenCodeType.Method
    public static long getProgress(TeamData teamData, long quest){
        return teamData.getProgress(quest);
    }
    @ZenCodeType.Method
    public static void addProgress(TeamData teamData, Task task,long progress){
        teamData.addProgress(task, progress);
    }
    @ZenCodeType.Method
    public static void addProgress(TeamData teamData, QuestObject task){
        teamData.getRelativeProgress(task);
    }
    @ZenCodeType.Method
    public static List<ServerPlayer> getOnlineMembers(TeamData teamData){
        return teamData.getOnlineMembers();
    }
    @ZenCodeType.Method
    public static @Nullable Date getCompletedTime(TeamData teamData, long task){
        return teamData.getCompletedTime(task);
    }
}
