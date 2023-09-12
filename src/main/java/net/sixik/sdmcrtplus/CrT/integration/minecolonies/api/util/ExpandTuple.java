package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.util;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.util.Tuple;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/utils/Tuple")
@NativeTypeRegistration(value = Tuple.class, zenCodeName = "mods.sdmcrtplus.integration.api.utils.Tuple")
public class ExpandTuple {

    @ZenCodeType.Method
    public static Object getA(Tuple tuple){
        return tuple.getA();
    }
    @ZenCodeType.Method
    public static Object getB(Tuple tuple){
        return tuple.getB();
    }
}
