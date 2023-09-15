package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.util.Tuple;
import org.openzen.zencode.java.ZenCodeType;

/**
 * @param <A>
 * @param <B>
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/core/Tuple")
@NativeTypeRegistration(value = Tuple.class, zenCodeName = "mods.sdmcrtplus.utils.core.Tuple")
public class ExpandTuple<A, B>{

    @ZenCodeType.Method
    @ZenCodeType.Getter("a")
    public static <A, B> Object getA(Tuple<A, B> tuple){
        Tuple<Object, Object> n = new Tuple<>(1,2);
        return tuple.getA();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("b")
    public static <A, B> Object getB(Tuple<A, B> tuple){
        return tuple.getB();
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("a")
    public static <A, B> void setA(Tuple<A, B> tuple, A A){
         tuple.setA(A);
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("b")
    public static <A, B> void setB(Tuple<A, B> tuple, B B){
         tuple.setB(B);
    }
}
