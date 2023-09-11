package net.sixik.sdmcrtplus.CrT.integration.ftbquest;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.TeamData;
import dev.ftb.mods.ftbquests.quest.task.Task;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/Task")
@NativeTypeRegistration(value = Task.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.Task")
public class ExpandTask {

}
