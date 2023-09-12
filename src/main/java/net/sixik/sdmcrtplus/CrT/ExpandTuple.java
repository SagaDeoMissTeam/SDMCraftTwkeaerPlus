package net.sixik.sdmcrtplus.CrT;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.util.Tuple;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/Tuple")
@NativeTypeRegistration(value = Tuple.class, zenCodeName = "mods.sdmcrtplus.world.Tuple")
public class ExpandTuple<A, B> {

    @ZenCodeType.Method
    public static Object getA(Tuple tuple){
        return tuple.getA();
    }
    @ZenCodeType.Method
    public static Object getB(Tuple tuple){
        return tuple.getB();
    }
    @ZenCodeType.Method
    public static void setA(Tuple tuple, Object A){
         tuple.setA(A);
    }
    @ZenCodeType.Method
    public static void setB(Tuple tuple, Object B){
         tuple.setB(B);
    }
}
