package net.sixik.sdmcrtplus.CrT.integration.ftbquest;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.FTBQuests;
import dev.ftb.mods.ftbquests.FTBQuestsCommon;
import dev.ftb.mods.ftbquests.quest.*;
import dev.ftb.mods.ftbquests.quest.reward.Reward;
import dev.ftb.mods.ftbquests.quest.task.Task;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Collection;
import java.util.List;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/QuestFile")
@NativeTypeRegistration(value = QuestFile.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.QuestFile")
public class ExpandQuestFile {


    @ZenCodeType.Method
    public static boolean isServerSide(QuestFile questFile){
        return questFile.isServerSide();
    }
    @ZenCodeType.Method
    public static @Nullable Quest getQuest(QuestFile questFile, long id){
        return questFile.getQuest(id);
    }
    @ZenCodeType.Method
    public static @Nullable QuestObject getObject(QuestFile questFile, long id){
        return questFile.get(id);
    }
    @ZenCodeType.Method
    public static @Nullable Chapter getChapter(QuestFile questFile, long id){
        return questFile.getChapter(id);
    }
    @ZenCodeType.Method
    public static @Nullable QuestObjectBase getBase(QuestFile questFile, long id){
        return questFile.getBase(id);
    }
    @ZenCodeType.Method
    public static @Nullable ChapterGroup getChapterGroup(QuestFile questFile, long id){
        return questFile.getChapterGroup(id);
    }
    @ZenCodeType.Method
    public static @Nullable Reward getReward(QuestFile questFile, long id){
        return questFile.getReward(id);
    }
    @ZenCodeType.Method
    public static Collection<TeamData> getAllData(QuestFile questFile){
        return questFile.getAllData();
    }
    @ZenCodeType.Method
    public static List<Chapter> getAllChapters(QuestFile questFile){
        return questFile.getAllChapters();
    }
    @ZenCodeType.Method
    public static Collection<QuestObjectBase> getAllObjects(QuestFile questFile){
        return questFile.getAllObjects();
    }
    @ZenCodeType.Method
    public static List<Task> getAllTasks(QuestFile questFile){
        return questFile.getAllTasks();
    }
}
