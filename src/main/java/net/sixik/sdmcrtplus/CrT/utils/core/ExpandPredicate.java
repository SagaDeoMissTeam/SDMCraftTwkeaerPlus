package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.util.function.Predicate;

@ZenRegister
@Document("mods/sdmcrtplus/utils/core/Predicate")
@NativeTypeRegistration(value = Predicate.class, zenCodeName = "mods.sdmcrtplus.utils.core.Predicate")
public class ExpandPredicate {

    @ZenCodeType.Method
    public static <T> Predicate<T> and(Predicate<T> predicate, Predicate<T> predicate2){
        return predicate.and(predicate2);
    }
    @ZenCodeType.Method
    public static <T> Predicate<T> or(Predicate<T> predicate, Predicate<T> predicate2){
        return predicate.or(predicate2);
    }
    @ZenCodeType.Method
    public static <T> Predicate<T> negate(Predicate<T> predicate){
        return predicate.negate();
    }
    @ZenCodeType.Method
    public static <T> boolean test(Predicate<T> predicate, T T){
        return predicate.test(T);
    }
    @ZenCodeType.Method
    public static <T> boolean equals(Predicate<T> predicate, Predicate<T> T){
        return predicate.equals(T);
    }
}
