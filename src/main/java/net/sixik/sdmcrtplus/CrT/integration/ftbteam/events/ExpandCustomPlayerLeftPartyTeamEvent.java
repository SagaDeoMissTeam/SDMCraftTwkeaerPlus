package net.sixik.sdmcrtplus.CrT.integration.ftbteam.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbteams.data.PlayerTeam;
import net.minecraft.server.level.ServerPlayer;
import net.sixik.sdmcrtplus.source.integration.ftbteam.events.CustomPlayerLeftPartyTeamEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/events/CustomPlayerLeftPartyTeamEvent")
@NativeTypeRegistration(value = CustomPlayerLeftPartyTeamEvent.class,zenCodeName = "mods.sdmcrtplus.integration.ftbteams.events.CustomPlayerLeftPartyTeamEvent")
public class ExpandCustomPlayerLeftPartyTeamEvent {

    @ZenCodeType.Method
    public static String getPlayerId(CustomPlayerLeftPartyTeamEvent event){
        return event.getPlayerId().toString();
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable ServerPlayer getPlayer(CustomPlayerLeftPartyTeamEvent event){
        return event.getPlayer();
    }
    @ZenCodeType.Method
    public static PlayerTeam getNewTeam(CustomPlayerLeftPartyTeamEvent event){
        return event.getNewTeam();
    }
    @ZenCodeType.Method
    public static boolean getTeamDeleted(CustomPlayerLeftPartyTeamEvent event){
        return event.getTeamDeleted();
    }
}
