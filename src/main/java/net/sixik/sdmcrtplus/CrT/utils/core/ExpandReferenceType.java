package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Holder;

@ZenRegister
@Document("mods/sdmcrtplus/utils/core/ReferenceType")
@NativeTypeRegistration(value = Holder.Reference.Type.class, zenCodeName = "mods.sdmcrtplus.utils.core.ReferenceType")
@BracketEnum("sdmutils:holder/reference/type")
public class ExpandReferenceType {
}
