package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.CitizenNameFile;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/CitizenNameFile")
@NativeTypeRegistration(value = CitizenNameFile.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.CitizenNameFile")
public class ExpandCitizenNameFile {

    @ZenCodeType.Method
    public static List<String> getFemaleFirstNames(CitizenNameFile citizenNameFile){
        return citizenNameFile.femalefirstNames;
    }
    @ZenCodeType.Method
    public static void setFemaleFirstNames(CitizenNameFile citizenNameFile, List<String> list){
        citizenNameFile.femalefirstNames = list;
    }
    @ZenCodeType.Method
    public static List<String> getMaleFirstNames(CitizenNameFile citizenNameFile){
        return citizenNameFile.maleFirstNames;
    }
    @ZenCodeType.Method
    public static void setMaleFirstNames(CitizenNameFile citizenNameFile, List<String> list){
         citizenNameFile.maleFirstNames = list;
    }
    @ZenCodeType.Method
    public static List<String> getSurnames(CitizenNameFile citizenNameFile){
        return citizenNameFile.surnames;
    }
    @ZenCodeType.Method
    public static void setSurnames(CitizenNameFile citizenNameFile, List<String> list){
        citizenNameFile.surnames = list;
    }
    @ZenCodeType.Method
    public static int getParts(CitizenNameFile citizenNameFile){
        return citizenNameFile.parts;
    }
}
