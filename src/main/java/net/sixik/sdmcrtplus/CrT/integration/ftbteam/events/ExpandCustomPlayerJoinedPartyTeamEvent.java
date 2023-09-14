package net.sixik.sdmcrtplus.CrT.integration.ftbteam.events;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbteams.data.PlayerTeam;
import net.minecraft.server.level.ServerPlayer;
import net.sixik.sdmcrtplus.source.integration.ftbteam.events.CustomPlayerJoinedPartyTeamEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/events/CustomPlayerJoinedPartyTeamEvent")
@NativeTypeRegistration(value = CustomPlayerJoinedPartyTeamEvent.class,zenCodeName = "mods.sdmcrtplus.integration.ftbteams.events.CustomPlayerJoinedPartyTeamEvent")
public class ExpandCustomPlayerJoinedPartyTeamEvent {
    @ZenCodeType.Method
    public static PlayerTeam getPreviousTeam(CustomPlayerJoinedPartyTeamEvent event){
        return event.getPreviousTeam();
    }
    @ZenCodeType.Method
    public static ServerPlayer getPlayer(CustomPlayerJoinedPartyTeamEvent event){
        return event.getPlayer();
    }
}
