package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.managers.interfaces;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.managers.interfaces.IRaiderManager;
import com.minecolonies.api.colony.managers.interfaces.IReproductionManager;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/managers/interfaces/IReproductionManager")
@NativeTypeRegistration(value = IReproductionManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.managers.interfaces.IReproductionManager")
public class ExpandIReproductionManager {

    @ZenCodeType.Method
    public static void onColonyTick(IReproductionManager iReproductionManager, IColony var1){
        iReproductionManager.onColonyTick(var1);
    }
}
