package net.sixik.sdmcrtplus.CrT.integration.ftbquest;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.QuestObjectType;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/QuestObjectType")
@NativeTypeRegistration(value = QuestObjectType.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.QuestObjectType")
@BracketEnum("ftbquest:questtype")
public class ExpandQuestObjectType {

    @ZenCodeType.Method
    public static String getId(QuestObjectType questObjectType){
        return questObjectType.id;
    }
}
