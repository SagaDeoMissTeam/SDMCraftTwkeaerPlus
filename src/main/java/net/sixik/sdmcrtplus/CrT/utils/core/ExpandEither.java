package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.mojang.datafixers.util.Either;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * @param <L>
 * @param <R>
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/core/Either")
@NativeTypeRegistration(value = Either.class, zenCodeName = "mods.sdmcrtplus.utils.core.Either")
public class ExpandEither<L,R> {

    @ZenCodeType.Method
    public static <L,R> Optional<L> left(Either<L,R> either){
        return either.left();
    }
    @ZenCodeType.Method
    public static <L,R> Optional<R> right(Either<L,R> either){
        return either.right();
    }
    @ZenCodeType.Method
    public static <L,R> Either<R, L> swap(Either<L,R> either){
        return either.swap();
    }
}
