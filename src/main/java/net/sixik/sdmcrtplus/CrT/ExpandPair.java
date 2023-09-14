package net.sixik.sdmcrtplus.CrT;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.util.Tuple;
import org.openzen.zencode.java.ZenCodeType;
import org.apache.commons.lang3.tuple.Pair;

@ZenRegister
@Document("mods/sdmcrtplus/Tuple")
@NativeTypeRegistration(value = Pair.class, zenCodeName = "mods.sdmcrtplus.world.Pair")
public class ExpandPair<L, R> {


    @ZenCodeType.Method
    public static Object getB(Pair tuple){
        return tuple.getKey();
    }
    @ZenCodeType.Method
    public static Object getA(Pair tuple){
        return tuple.getValue();
    }
    @ZenCodeType.Method
    public static Object getLeft(Pair tuple){
        return tuple.getLeft();
    }
    @ZenCodeType.Method
    public static Object getRight(Pair tuple){
        return tuple.getRight();
    }
}
