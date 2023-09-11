package net.sixik.sdmcrtplus.CrT.integration.ftbquest;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.Chapter;
import dev.ftb.mods.ftbquests.quest.ChapterGroup;
import dev.ftb.mods.ftbquests.quest.Quest;
import dev.ftb.mods.ftbquests.quest.QuestFile;
import net.minecraft.world.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/Chapter")
@NativeTypeRegistration(value = Chapter.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.Chapter")
public class ExpandChapter {

    @ZenCodeType.Method
    public static ChapterGroup getGroup(Chapter chapter){
        return chapter.group;
    }

    @ZenCodeType.Method
    public static QuestFile getFile(Chapter chapter){
        return chapter.file;
    }

    @ZenCodeType.Method
    public static List<Quest> getQuests(Chapter chapter){
        return chapter.quests;
    }
}
