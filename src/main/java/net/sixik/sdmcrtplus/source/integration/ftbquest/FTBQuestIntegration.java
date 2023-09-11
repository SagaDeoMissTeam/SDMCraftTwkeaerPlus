package net.sixik.sdmcrtplus.source.integration.ftbquest;

import dev.architectury.event.EventResult;
import dev.ftb.mods.ftbquests.events.CustomRewardEvent;
import dev.ftb.mods.ftbquests.events.CustomTaskEvent;
import dev.ftb.mods.ftbquests.events.ObjectCompletedEvent;
import dev.ftb.mods.ftbquests.events.ObjectStartedEvent;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.sdmcrtplus.source.integration.ftbquest.events.*;

public class FTBQuestIntegration {

    public static void init(){
        CustomTaskEvent.EVENT.register(FTBQuestIntegration::onCustomTask);
        CustomRewardEvent.EVENT.register(FTBQuestIntegration::onCustomRewardEvent);
        ObjectCompletedEvent.QUEST.register(FTBQuestIntegration::onCompleteQuestEvent);
        ObjectCompletedEvent.CHAPTER.register(FTBQuestIntegration::onCompleteQuestChapterEvent);
        ObjectCompletedEvent.TASK.register(FTBQuestIntegration::onTaskCompletedEvent);
        ObjectStartedEvent.QUEST.register(FTBQuestIntegration::onQuestStartedEvent);
        ObjectStartedEvent.CHAPTER.register(FTBQuestIntegration::onChapterStartedEvent);
        ObjectStartedEvent.TASK.register(FTBQuestIntegration::onTaskStartedEvent);
    }

    private static EventResult onTaskCompletedEvent(ObjectCompletedEvent.TaskEvent event) {
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new SDMTaskCompletedEvent(
                event.getObject(),
                event.getTask(),
                event.getData(),
                event.getOnlineMembers(),
                event.getNotifiedPlayers(),
                event.getTime()
        )));
    }

    private static EventResult onTaskStartedEvent(ObjectStartedEvent.TaskEvent event) {
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new SDMTaskStartedEvent(
                event.getObject(),
                event.getTask(),
                event.getData(),
                event.getOnlineMembers(),
                event.getNotifiedPlayers(),
                event.getTime()
        )));
    }

    private static EventResult onChapterStartedEvent(ObjectStartedEvent.ChapterEvent event) {
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new SDMChapterStartedEvent(
                event.getObject(),
                event.getChapter(),
                event.getData(),
                event.getOnlineMembers(),
                event.getNotifiedPlayers(),
                event.getTime()
        )));
    }

    private static EventResult onQuestStartedEvent(ObjectStartedEvent.QuestEvent event) {
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new SDMQuestStartedEvent(
                event.getObject(),
                event.getQuest(),
                event.getData(),
                event.getOnlineMembers(),
                event.getNotifiedPlayers(),
                event.getTime()
        )));
    }

    private static EventResult onCompleteQuestEvent(ObjectCompletedEvent.QuestEvent event) {
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(
                new SDMCompleteQuestEvent(
                        event.getQuest(),
                        event.getObject(),
                        event.getData(),
                        event.getOnlineMembers(),
                        event.getNotifiedPlayers(),
                        event.getTime()
                )));
    }

    public static EventResult onCustomTask(CustomTaskEvent customTaskEvent) {
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new SDMCustomTaskEvent(customTaskEvent.getTask())));
    }

    public static EventResult onCompleteQuestChapterEvent(ObjectCompletedEvent.ChapterEvent event){
        return  EventResult.interrupt(MinecraftForge.EVENT_BUS.post(
                new SDMCompleteQuestChapterEvent(event.getObject(),
                        event.getChapter(),
                        event.getData(),
                        event.getNotifiedPlayers(),
                        event.getOnlineMembers(),
                        event.getTime()
                )));
    }

    public static EventResult onCustomRewardEvent(CustomRewardEvent event){
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(
                new SDMCustomRewardEvent(event.getReward(),
                        event.getPlayer(),
                        event.getNotify()
                )));
    }
}
