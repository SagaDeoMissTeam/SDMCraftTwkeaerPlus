package net.sixik.sdmcrtplus.CrT.resources;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceKey;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
//@Document("mods/sdmcrtplus/resource/ResourceKey")
@NativeTypeRegistration(value = ResourceKey.class, zenCodeName = "mods.sdmcrtplus.resource.ResourceKey")
public class ExpandResourceKey<T>{

}
