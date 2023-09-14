package net.sixik.sdmcrtplus.CrT.integration.ftbteam.events;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbteams.data.Team;
import net.sixik.sdmcrtplus.source.integration.ftbteam.events.CustomTeamEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/events/CustomTeamEvent")
@NativeTypeRegistration(value = CustomTeamEvent.class,zenCodeName = "mods.sdmcrtplus.integration.ftbteams.events.CustomTeamEvent")
public class ExpandCustomTeamEvent {

    @ZenCodeType.Method
    public static Team getTeam(CustomTeamEvent event){
        return event.getTeam();
    }
}
