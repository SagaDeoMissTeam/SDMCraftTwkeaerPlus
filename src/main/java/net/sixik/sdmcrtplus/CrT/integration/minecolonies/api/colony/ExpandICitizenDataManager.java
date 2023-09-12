package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizen;
import com.minecolonies.api.colony.ICitizenDataManager;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/ICitizenDataManager")
@NativeTypeRegistration(value = ICitizenDataManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.ICitizenDataManager")
public class ExpandICitizenDataManager {
}
