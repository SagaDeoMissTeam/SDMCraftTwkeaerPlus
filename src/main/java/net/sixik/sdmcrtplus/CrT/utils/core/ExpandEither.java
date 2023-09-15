package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.mojang.datafixers.util.Either;
import net.minecraft.core.Holder;

/**
 * @param <L>
 * @param <R>
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/core/Either")
@NativeTypeRegistration(value = Either.class, zenCodeName = "mods.sdmcrtplus.utils.core.Either")
public class ExpandEither<L,R> {
}
