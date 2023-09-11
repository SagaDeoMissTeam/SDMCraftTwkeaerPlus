package net.sixik.sdmcrtplus.CrT.integration.ftbquest;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.Quest;
import dev.ftb.mods.ftbquests.quest.reward.Reward;
import dev.ftb.mods.ftbquests.quest.task.Task;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/Quest")
@NativeTypeRegistration(value = Quest.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.Quest")
public class ExpandQuest {

    @ZenCodeType.Method
    public static List<Task> getTasks(Quest quest){
        return quest.tasks;
    }
    @ZenCodeType.Method
    public static List<Reward> getRewards(Quest quest){
        return quest.rewards;
    }
}
