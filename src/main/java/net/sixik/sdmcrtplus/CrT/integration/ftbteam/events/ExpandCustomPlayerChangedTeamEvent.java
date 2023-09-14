package net.sixik.sdmcrtplus.CrT.integration.ftbteam.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbteams.data.Team;
import net.minecraft.server.level.ServerPlayer;
import net.sixik.sdmcrtplus.source.integration.ftbteam.events.CustomPlayerChangedTeamEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/events/CustomPlayerChangedTeamEvent")
@NativeTypeRegistration(value = CustomPlayerChangedTeamEvent.class,zenCodeName = "mods.sdmcrtplus.integration.ftbteams.events.CustomPlayerChangedTeamEvent")
public class ExpandCustomPlayerChangedTeamEvent {

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable ServerPlayer getPlayer(CustomPlayerChangedTeamEvent event){
        return event.getPlayer();
    }
    @ZenCodeType.Method
    public static Team getPreviousTeam(CustomPlayerChangedTeamEvent event){
        return event.getPreviousTeam().get();
    }
    @ZenCodeType.Method
    public static String getPlayerId(CustomPlayerChangedTeamEvent event){
        return event.getPlayerId().toString();
    }
}
