package net.sixik.sdmcrtplus.CrT.utils.core;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.mojang.datafixers.util.Either;

/**
 * @param <R>
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/core/EitherMu")
@NativeTypeRegistration(value = Either.Mu.class, zenCodeName = "mods.sdmcrtplus.utils.core.EitherMu"
)
public class ExpandMu<R> {

//    public static void get(){
//        Either.Mu<Object> t = new Either.Mu<>();
//    }
}
