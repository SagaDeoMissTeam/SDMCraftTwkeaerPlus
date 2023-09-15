package net.sixik.sdmcrtplus.CrT.utils.core.kinds;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import net.minecraft.core.Holder;

/**
 * @param <F>
 * @param <A>
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/core/kinds/App")
@NativeTypeRegistration(value = App.class, zenCodeName = "mods.sdmcrtplus.utils.core.kinds.App")
public class ExpandApp<F extends K1, A> {
}
