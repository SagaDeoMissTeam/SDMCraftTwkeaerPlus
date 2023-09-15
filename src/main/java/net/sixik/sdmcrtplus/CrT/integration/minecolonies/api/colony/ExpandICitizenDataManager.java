package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizen;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.ICitizenDataManager;
import com.minecolonies.api.colony.IColony;
import net.minecraft.nbt.CompoundTag;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/ICitizenDataManager")
@NativeTypeRegistration(value = ICitizenDataManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.ICitizenDataManager")
public class ExpandICitizenDataManager {

    @ZenCodeType.Method
    public static ICitizenData createFromNBT(ICitizenDataManager iCitizenDataManager, CompoundTag var1, IColony var2){
        return iCitizenDataManager.createFromNBT(var1,var2);
    }
}
