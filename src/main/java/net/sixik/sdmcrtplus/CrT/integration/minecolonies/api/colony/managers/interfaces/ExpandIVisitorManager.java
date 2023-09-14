package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.managers.interfaces;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IVisitorData;
import com.minecolonies.api.colony.managers.interfaces.IVisitorManager;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/managers/interfaces/IVisitorManager")
@NativeTypeRegistration(value = IVisitorManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.managers.interfaces.IVisitorManager")
public class ExpandIVisitorManager {

    @ZenCodeType.Method
    public static <T extends IVisitorData> T getVisitor(IVisitorManager iVisitorManager, int var1){
        return iVisitorManager.getVisitor(var1);
    }
}
