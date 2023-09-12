package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.permissions;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.permissions.Explosions;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/permissions/Explosions")
@NativeTypeRegistration(value = Explosions.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.permissions.Explosions")
@BracketEnum("minecolonies:permissions/explosion")
public class ExpandExplosions {
}
