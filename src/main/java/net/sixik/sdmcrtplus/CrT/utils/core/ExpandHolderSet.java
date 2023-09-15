package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;

@ZenRegister
@Document("mods/sdmcrtplus/utils/core/HolderSet")
@NativeTypeRegistration(value = HolderSet.class, zenCodeName = "mods.sdmcrtplus.utils.core.HolderSet")
public class ExpandHolderSet<T> {
}
