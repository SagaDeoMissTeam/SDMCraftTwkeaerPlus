package net.sixik.sdmcrtplus.CrT.integration.ftbteam;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbteams.data.PlayerTeam;
import dev.ftb.mods.ftbteams.data.Team;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/PlayerTeam")
@NativeTypeRegistration(value = PlayerTeam.class,zenCodeName = "mods.sdmcrtplus.integration.ftbteams.PlayerTeam")
public class ExpandPlayerTeam {

    @ZenCodeType.Method
    public static Team getActualTeam(PlayerTeam team){
        return team.actualTeam;
    }
    @ZenCodeType.Method
    public static boolean isOnline(PlayerTeam team){
        return team.online;
    }
    @ZenCodeType.Method
    public static String getPlayerName(PlayerTeam team){
        return team.playerName;
    }
}
