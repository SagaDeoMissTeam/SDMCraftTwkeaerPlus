package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.permissions;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.permissions.Action;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/permissions/Action")
@NativeTypeRegistration(value = Action.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.permissions.Action")
@BracketEnum("minecolonies:permissions/action")
public class ExpandAction {

    @ZenCodeType.Method
    public static long getFlag(Action action){
        return action.getFlag();
    }
}
