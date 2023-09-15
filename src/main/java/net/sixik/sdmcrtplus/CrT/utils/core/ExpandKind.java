package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Holder;

@ZenRegister
@Document("mods/sdmcrtplus/utils/core/Kind")
@NativeTypeRegistration(value = Holder.Kind.class, zenCodeName = "mods.sdmcrtplus.utils.core.Kind")
@BracketEnum("sdmutils:holder/kind")
public class ExpandKind {
}
