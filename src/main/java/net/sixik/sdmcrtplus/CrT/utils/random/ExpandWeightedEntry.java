package net.sixik.sdmcrtplus.CrT.utils.random;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.util.random.Weight;
import net.minecraft.util.random.WeightedEntry;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/random/WeightedEntry")
@NativeTypeRegistration(value = WeightedEntry.class, zenCodeName = "mods.sdmcrtplus.utils.random.WeightedEntry")
public class ExpandWeightedEntry {

    @ZenCodeType.Method
    public static Weight getWeight(WeightedEntry weightedEntry){
        return weightedEntry.getWeight();
    }
}

