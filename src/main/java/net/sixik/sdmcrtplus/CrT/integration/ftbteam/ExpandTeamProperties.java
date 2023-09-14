package net.sixik.sdmcrtplus.CrT.integration.ftbteam;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbteams.property.TeamProperties;
import net.blay09.mods.waystones.api.IWaystone;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/TeamProperties")
@NativeTypeRegistration(value = TeamProperties.class,zenCodeName = "mods.sdmcrtplus.integration.ftbteams.TeamProperties")
public class ExpandTeamProperties {

}
