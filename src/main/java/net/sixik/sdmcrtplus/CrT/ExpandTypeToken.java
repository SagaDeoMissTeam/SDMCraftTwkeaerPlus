package net.sixik.sdmcrtplus.CrT;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.google.common.reflect.TypeToken;

@ZenRegister
@Document("mods/sdmcrtplus/TypeToken")
@NativeTypeRegistration(value = TypeToken.class, zenCodeName = "mods.sdmcrtplus.world.TypeToken")
public class ExpandTypeToken<T> {
}
