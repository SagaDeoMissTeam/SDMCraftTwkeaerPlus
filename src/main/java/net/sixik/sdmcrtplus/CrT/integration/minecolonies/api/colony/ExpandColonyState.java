package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ColonyState;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/ColonyState")
@NativeTypeRegistration(value = ColonyState.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.ColonyState")
@BracketEnum("minecolonies:colony/state")
public class ExpandColonyState {

    @ZenCodeType.Method
    public static boolean isOkayToEat(ColonyState colonyState){
        return colonyState.isOkayToEat();
    }
}
