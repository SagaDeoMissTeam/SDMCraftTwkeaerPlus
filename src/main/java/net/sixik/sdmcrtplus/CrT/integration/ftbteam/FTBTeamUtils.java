package net.sixik.sdmcrtplus.CrT.integration.ftbteam;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import dev.ftb.mods.ftbteams.data.TeamManager;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/FTBTeamUtils")
@ZenCodeType.Name("mods.sdmcrtplus.integration.ftbteams.FTBTeamUtils")
public class FTBTeamUtils {

    @ZenCodeType.Method
    public static TeamManager getTeamManager(){
        return TeamManager.INSTANCE;
    }
}
