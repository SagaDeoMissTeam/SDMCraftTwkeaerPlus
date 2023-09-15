package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.util;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.util.Tuple;
import org.openzen.zencode.java.ZenCodeType;

/**
 * @param <A>
 * @param <B>
 */
@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/utils/Tuple")
@NativeTypeRegistration(value = Tuple.class, zenCodeName = "mods.sdmcrtplus.integration.api.utils.Tuple")
public class ExpandTuple<A, B> {

    @ZenCodeType.Method
    public static <A, B> A getA(Tuple<A, B> tuple){
        return tuple.getA();
    }
    @ZenCodeType.Method
    public static <A, B> B getB(Tuple<A,B> tuple){
        return tuple.getB();
    }
}
