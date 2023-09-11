package net.sixik.sdmcrtplus.CrT.integration.ftbquest;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.Chapter;
import dev.ftb.mods.ftbquests.quest.ChapterGroup;
import dev.ftb.mods.ftbquests.quest.TeamData;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/ChapterGroup")
@NativeTypeRegistration(value = ChapterGroup.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.ChapterGroup")
public class ExpandChapterGroup {

    @ZenCodeType.Method
    public static List<Chapter> getChapters(ChapterGroup chapterGroup){
        return chapterGroup.chapters;
    }
    @ZenCodeType.Method
    public static List<Chapter> getChapters(ChapterGroup chapterGroup, TeamData teamData){
        return chapterGroup.getVisibleChapters(teamData);
    }
    @ZenCodeType.Method
    public static int getIndex(ChapterGroup chapterGroup, TeamData teamData){
        return chapterGroup.getIndex();
    }
}
