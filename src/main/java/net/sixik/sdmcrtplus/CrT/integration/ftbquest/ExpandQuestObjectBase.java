package net.sixik.sdmcrtplus.CrT.integration.ftbquest;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.QuestFile;
import dev.ftb.mods.ftbquests.quest.QuestObjectBase;
import net.minecraft.world.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/QuestObjectBase")
@NativeTypeRegistration(value = QuestObjectBase.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.QuestObjectBase")
public class ExpandQuestObjectBase {

    @ZenCodeType.Method
    public static ItemStack getIcon(QuestObjectBase chapter){
        return chapter.icon;
    }
    @ZenCodeType.Method
    public static long getId(QuestObjectBase chapter){
        return chapter.id;
    }
    @ZenCodeType.Method
    public static String getCodeString(QuestObjectBase chapter){
        return chapter.getCodeString();
    }
    @ZenCodeType.Method
    public static String toString(QuestObjectBase chapter){
        return chapter.toString();
    }
    @ZenCodeType.Method
    public static long getParentID(QuestObjectBase chapter){
        return chapter.getParentID();
    }

    @ZenCodeType.Method
    public static QuestFile getQuestFile(QuestObjectBase chapter){
        return chapter.getQuestFile();
    }
}
