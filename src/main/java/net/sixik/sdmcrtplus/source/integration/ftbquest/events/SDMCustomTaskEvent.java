package net.sixik.sdmcrtplus.source.integration.ftbquest.events;

import dev.ftb.mods.ftbquests.quest.task.CustomTask;
import net.minecraftforge.eventbus.api.Event;

public class SDMCustomTaskEvent extends Event {

    private CustomTask task;
    public SDMCustomTaskEvent(CustomTask task){
        this.task = task;
    }

    public CustomTask getTask() {
        return task;
    }
}
