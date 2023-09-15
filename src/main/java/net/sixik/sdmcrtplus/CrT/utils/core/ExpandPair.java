package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.util.Tuple;
import org.openzen.zencode.java.ZenCodeType;
import org.apache.commons.lang3.tuple.Pair;

/**
 * @param <L>
 * @param <R>
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/core/Pair")
@NativeTypeRegistration(value = Pair.class, zenCodeName = "mods.sdmcrtplus.utils.core.Pair")
public class ExpandPair<L,R> {

    private ExpandPair(){

    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("b")
    public static <L,R> Object getB(Pair<L,R> tuple){
        return tuple.getKey();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("a")
    public static <L,R> Object getA(Pair<L,R> tuple){
        return tuple.getValue();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("left")
    public static <L,R> Object getLeft(Pair<L,R> tuple){
        return tuple.getLeft();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("right")
    public static <L,R> Object getRight(Pair<L,R> tuple){
        return tuple.getRight();
    }
}
