package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Holder;

import java.util.function.BiPredicate;

/**
 * @param <T>
 * @param <U>
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/core/BiPredicate")
@NativeTypeRegistration(value = BiPredicate.class, zenCodeName = "mods.sdmcrtplus.utils.core.BiPredicate")
public class ExpandBiPredicate<T, U> {
}
