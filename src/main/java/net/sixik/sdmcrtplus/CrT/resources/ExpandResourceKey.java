package net.sixik.sdmcrtplus.CrT.resources;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/resource/ResourceKey")
@NativeTypeRegistration(value = ResourceKey.class, zenCodeName = "mods.sdmcrtplus.resource.ResourceKey")
public class ExpandResourceKey<T>{

    @ZenCodeType.Method
    public static ResourceLocation getRegistry(ResourceKey<?> resourceKey){
        return resourceKey.registry();
    }
    @ZenCodeType.Method
    public static ResourceLocation getLocation(ResourceKey<?> resourceKey){
        return resourceKey.location();
    }
    @ZenCodeType.Method
    public static String toString(ResourceKey<?> resourceKey){
        return resourceKey.toString();
    }
}
