package net.sixik.sdmcrtplus.source.integration.ftbteam;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import dev.architectury.event.EventResult;
import dev.ftb.mods.ftbteams.event.*;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.sdmcrtplus.source.integration.ftbteam.events.*;

public class FTBTeamsIntegration {

    public static void init(){
        //TeamEvent.ADD_ALLY.register(FTBTeamsIntegration::ADD_ALLY_Event);
        TeamEvent.CREATED.register(FTBTeamsIntegration::CREATED);
        TeamEvent.DELETED.register(FTBTeamsIntegration::DELETED);
        TeamEvent.PLAYER_CHANGED.register(FTBTeamsIntegration::PLAYER_CHANGED);
        TeamEvent.PLAYER_JOINED_PARTY.register(FTBTeamsIntegration::PLAYER_JOINED_PARTY);
        TeamEvent.PLAYER_LEFT_PARTY.register(FTBTeamsIntegration::PLAYER_LEFT_PARTY);
        TeamEvent.PROPERTIES_CHANGED.register(FTBTeamsIntegration::PROPERTIES_CHANGED);
        TeamEvent.PLAYER_LOGGED_IN.register(FTBTeamsIntegration::PLAYER_LOGGED_IN);
//        TeamEvent.REMOVE_ALLY.register();
        CraftTweakerAPI.LOGGER.info("FTB Teams LOADED !");
    }

    private static EventResult ADD_ALLY_Event(TeamAllyEvent event){
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new CustomTeamAllyEvent(event.getTeam(), event.getPlayers().stream().toList(), event.isAdding())));
    }

    private static EventResult CREATED(TeamCreatedEvent event){
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new CustomTeamCreatedEvent(event.getTeam(), event.getCreator())));
    }

    private static EventResult DELETED(TeamEvent event){
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new CustomTeamDeleteEvent(event.getTeam())));
    }

    private static EventResult PLAYER_CHANGED(PlayerChangedTeamEvent event){
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new CustomPlayerChangedTeamEvent(event.getTeam(), event.getPreviousTeam(), event.getPlayerId(), event.getPlayer())));
    }

    private static EventResult PLAYER_JOINED_PARTY(PlayerJoinedPartyTeamEvent event){
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new CustomPlayerJoinedPartyTeamEvent(event.getTeam(), event.getPreviousTeam(), event.getPlayer())));
    }

    private static EventResult PLAYER_LEFT_PARTY(PlayerLeftPartyTeamEvent event){
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new CustomPlayerLeftPartyTeamEvent(event.getTeam(), event.getNewTeam(), event.getPlayerId(), event.getPlayer(), event.getTeamDeleted())));
    }

    private static EventResult PROPERTIES_CHANGED(TeamPropertiesChangedEvent event){
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new CustomTeamPropertiesChangedEvent(event.getTeam(),event.getOldProperties())));
    }
    private static EventResult PLAYER_LOGGED_IN(PlayerLoggedInAfterTeamEvent event){
        return EventResult.interrupt(MinecraftForge.EVENT_BUS.post(new CustomPlayerLoggedInAfterTeamEvent(event.getTeam(),event.getPlayer())));
    }
}
