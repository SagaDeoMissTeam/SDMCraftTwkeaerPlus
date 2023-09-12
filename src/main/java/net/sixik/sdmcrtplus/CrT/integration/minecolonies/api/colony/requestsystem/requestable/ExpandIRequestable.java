package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.requestsystem.requestable;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.requestsystem.requestable.IRequestable;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/requestsystem/requestable/IRequestable")
@NativeTypeRegistration(value = IRequestable.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.requestsystem.requestable.IRequestable")
public class ExpandIRequestable<R extends IRequestable> {
}
