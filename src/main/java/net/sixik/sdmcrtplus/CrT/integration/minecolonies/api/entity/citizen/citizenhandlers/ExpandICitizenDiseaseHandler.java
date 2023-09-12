package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen.citizenhandlers;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.entity.citizen.AbstractEntityCitizen;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenChatHandler;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenDiseaseHandler;
import net.minecraft.nbt.CompoundTag;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/citizenhandlers/ICitizenDiseaseHandler")
@NativeTypeRegistration(value = ICitizenDiseaseHandler.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.citizenhandlers.ICitizenDiseaseHandler")
public class ExpandICitizenDiseaseHandler {

    @ZenCodeType.Method
    public static void tick(ICitizenDiseaseHandler internal){
        internal.tick();
    }
    @ZenCodeType.Method
    public static boolean isSick(ICitizenDiseaseHandler internal){
        return internal.isSick();
    }
    @ZenCodeType.Method
    public static String getDisease(ICitizenDiseaseHandler internal){
        return internal.getDisease();
    }
    @ZenCodeType.Method
    public static void cure(ICitizenDiseaseHandler internal){
        internal.cure();
    }
    @ZenCodeType.Method
    public static void onCollission(ICitizenDiseaseHandler internal, AbstractEntityCitizen var1){
        internal.onCollission(var1);
    }
    @ZenCodeType.Method
    public static boolean isHurt(ICitizenDiseaseHandler internal){
        return internal.isHurt();
    }
    @ZenCodeType.Method
    public static boolean sleepsAtHospital(ICitizenDiseaseHandler internal){
        return internal.sleepsAtHospital();
    }
    @ZenCodeType.Method
    public static void setSleepsAtHospital(ICitizenDiseaseHandler internal){
        internal.setSleepsAtHospital();
    }
}
