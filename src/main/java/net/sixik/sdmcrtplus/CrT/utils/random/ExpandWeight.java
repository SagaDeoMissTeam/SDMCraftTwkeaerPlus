package net.sixik.sdmcrtplus.CrT.utils.random;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.util.random.Weight;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/random/Weight")
@NativeTypeRegistration(value = Weight.class, zenCodeName = "mods.sdmcrtplus.utils.random.Weight")
public class ExpandWeight {

    @ZenCodeType.Method
    public static int asInt(Weight weight){
        return weight.asInt();
    }
}
