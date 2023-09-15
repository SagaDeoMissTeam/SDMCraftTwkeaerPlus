package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;

import java.util.Optional;

/**
 * @param <T>
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/core/Optional")
@NativeTypeRegistration(value = Optional.class, zenCodeName = "mods.sdmcrtplus.utils.core.Optional")
public class ExpandOptional<T> {

    public static <T> T get(Optional<T> optional){
        return optional.get();
    }
}
