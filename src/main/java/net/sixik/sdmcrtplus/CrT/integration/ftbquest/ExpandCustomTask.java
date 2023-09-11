package net.sixik.sdmcrtplus.CrT.integration.ftbquest;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.task.CustomTask;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/CustomTask")
@NativeTypeRegistration(value = CustomTask.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.CustomTask")
public class ExpandCustomTask {

    public static long getMaxProgress(CustomTask customTask){
        return customTask.maxProgress;
    }
}
