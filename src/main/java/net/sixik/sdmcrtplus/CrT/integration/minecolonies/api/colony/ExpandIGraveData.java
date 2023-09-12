package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IGraveData;
import net.minecraft.nbt.CompoundTag;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/IGraveData")
@NativeTypeRegistration(value = IGraveData.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.IGraveData")
public class ExpandIGraveData {

//    @ZenCodeType.Method
//    @ZenCodeType.Nullable CompoundTag getCitizenDataNBT(IGraveData iGraveData){
//        return iGraveData.getCitizenDataNBT();
//    }
//    @ZenCodeType.Method
//    void setCitizenDataNBT(IGraveData iGraveData,@ZenCodeType.Nullable CompoundTag var1){
//        iGraveData.setCitizenDataNBT(var1);
//    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable String getCitizenName(IGraveData iGraveData){
        return iGraveData.getCitizenName();
    }
    @ZenCodeType.Method
    public static void setCitizenName(IGraveData iGraveData,@ZenCodeType.Nullable String var1){
        iGraveData.setCitizenName(var1);
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable String getCitizenJobName(IGraveData iGraveData){
        return iGraveData.getCitizenJobName();
    }
    @ZenCodeType.Method
    public static void setCitizenJobName(IGraveData iGraveData,@ZenCodeType.Nullable String var1){
        iGraveData.setCitizenJobName(var1);
    }
}
