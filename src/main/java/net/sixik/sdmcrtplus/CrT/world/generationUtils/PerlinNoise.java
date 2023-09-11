package net.sixik.sdmcrtplus.CrT.world.generationUtils;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.sixik.sdmcrtplus.CrT.action.logic.ActionCustomPerlinNoice;
import net.sixik.sdmcrtplus.CustomParameters;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/generationUtils/PerlinNoise")
@ZenCodeType.Name("mods.sdmcrtplus.world.generationUtils.PerlinNoise")
public class PerlinNoise {

    @ZenCodeType.Method
    public static void setPerlinNose(double num){
        CraftTweakerAPI.apply(new ActionCustomPerlinNoice(num));
    }
    @ZenCodeType.Method
    public static double getCustomPelinNoise(){
        return CustomParameters.customPerlinProperty;
    }
}
