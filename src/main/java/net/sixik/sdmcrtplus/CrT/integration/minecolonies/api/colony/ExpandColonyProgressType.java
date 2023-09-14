package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.CitizenNameFile;
import com.minecolonies.api.colony.ColonyProgressType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/ColonyProgressType")
@NativeTypeRegistration(value = ColonyProgressType.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.ColonyProgressType")
@BracketEnum("minecolonies:colony/progresstype")
public class ExpandColonyProgressType {

}
