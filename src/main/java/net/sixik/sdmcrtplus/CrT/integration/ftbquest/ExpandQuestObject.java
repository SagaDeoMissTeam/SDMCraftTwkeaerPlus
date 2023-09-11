package net.sixik.sdmcrtplus.CrT.integration.ftbquest;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.QuestObject;
import dev.ftb.mods.ftbquests.quest.TeamData;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/QuestObject")
@NativeTypeRegistration(value = QuestObject.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.QuestObject")
public class ExpandQuestObject {

    @ZenCodeType.Method
    public static boolean isVisible(QuestObject questObject, TeamData teamData){
        return questObject.isVisible(teamData);
    }
    @ZenCodeType.Method
    public static boolean isCompletedRaw(QuestObject questObject, TeamData teamData) {
        return questObject.isCompletedRaw(teamData);
    }
}
