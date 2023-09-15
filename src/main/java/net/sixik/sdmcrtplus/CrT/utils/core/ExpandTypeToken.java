package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.google.common.reflect.TypeToken;

/**
 * @param <T>
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/core/TypeToken")
@NativeTypeRegistration(value = TypeToken.class, zenCodeName = "mods.sdmcrtplus.utils.core.TypeToken")
public class ExpandTypeToken<T> {

}
