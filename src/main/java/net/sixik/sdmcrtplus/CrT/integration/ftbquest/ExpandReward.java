package net.sixik.sdmcrtplus.CrT.integration.ftbquest;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.Quest;
import dev.ftb.mods.ftbquests.quest.reward.Reward;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/Reward")
@NativeTypeRegistration(value = Reward.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.Reward")
public class ExpandReward {

    @ZenCodeType.Method
    public static Quest getQuest(Reward reward){
        return reward.quest;
    }
}
