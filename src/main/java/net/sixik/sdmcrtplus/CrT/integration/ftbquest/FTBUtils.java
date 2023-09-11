package net.sixik.sdmcrtplus.CrT.integration.ftbquest;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import dev.ftb.mods.ftbquests.FTBQuests;
import dev.ftb.mods.ftbquests.quest.Quest;
import dev.ftb.mods.ftbquests.quest.QuestFile;
import dev.ftb.mods.ftbquests.quest.QuestObjectBase;
import dev.ftb.mods.ftbquests.quest.TeamData;
import dev.ftb.mods.ftbquests.quest.task.Task;
import net.minecraft.world.entity.player.Player;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/FTBUtils")
@ZenCodeType.Name("mods.sdmcrtplus.integration.ftbquest.FTBUtils")
public class FTBUtils {

    @ZenCodeType.Method
    public static QuestFile getQuestFile(boolean isClient){
        return FTBQuests.PROXY.getQuestFile(isClient);
    }

    @ZenCodeType.Method
    public static long parseQuestCodeString(String id){
        return QuestObjectBase.parseCodeString(id);
    }
    @ZenCodeType.Method
    public static long parseTaskCodeString(String id){
        return Task.parseCodeString(id);
    }

    @ZenCodeType.Method
    public static TeamData getData(Player player) {
        return TeamData.get(player);
    }
}
