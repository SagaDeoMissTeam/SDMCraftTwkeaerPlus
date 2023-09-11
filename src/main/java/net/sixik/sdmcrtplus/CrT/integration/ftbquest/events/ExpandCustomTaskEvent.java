package net.sixik.sdmcrtplus.CrT.integration.ftbquest.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.task.CustomTask;
import net.sixik.sdmcrtplus.source.integration.ftbquest.events.SDMCustomTaskEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/events/CustomTaskEvent")
@NativeTypeRegistration(value = SDMCustomTaskEvent.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.events.CustomTaskEvent")
public class ExpandCustomTaskEvent {

    @ZenCodeType.Method
    public static CustomTask getTask(SDMCustomTaskEvent event){
       return event.getTask();
    }
}
