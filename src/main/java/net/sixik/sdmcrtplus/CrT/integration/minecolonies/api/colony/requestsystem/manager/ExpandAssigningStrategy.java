package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.requestsystem.manager;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.requestsystem.manager.AssigningStrategy;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/requestsystem/manager/AssigningStrategy")
@NativeTypeRegistration(value = AssigningStrategy.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.requestsystem.manager.AssigningStrategy")
@BracketEnum("minecolonies:assigstrategy")
public class ExpandAssigningStrategy {

}
