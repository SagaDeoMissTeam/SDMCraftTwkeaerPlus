package net.sixik.sdmcrtplus.CrT.resources;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Holder;
import net.minecraft.core.IdMap;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;

/**
 * @param <T>
 */
@ZenRegister
@Document("mods/sdmcrtplus/resource/ResourceKey")
@NativeTypeRegistration(value = Registry.class, zenCodeName = "mods.sdmcrtplus.resource.Registry")
public class ExpandRegistry<T> {

    @ZenCodeType.Method
    public static Registry<?> getRegistry(Registry<?> registry){
        Registry<?> t = registry;
        return Registry.REGISTRY;
    }
    @ZenCodeType.Method
    public static <T> T getRegistry(Registry<T> registry, ResourceLocation resourceLocation){
        return registry.get(resourceLocation);
    }
    @ZenCodeType.Method
    public static <T> T getRegistry(Registry<T> registry, ResourceKey<T> resourceKey){
        return registry.get(resourceKey);
    }
    @ZenCodeType.Method
    public static <T> ResourceLocation getKey(Registry<T> registry, T key){
        return registry.getKey(key);
    }
    @ZenCodeType.Method
    public static <T> boolean containsKey(Registry<T> registry, ResourceLocation resourceLocation){
        return registry.containsKey(resourceLocation);
    }
    @ZenCodeType.Method
    public static <T> boolean containsKey(Registry<T> registry, ResourceKey<T> resourceKey){
        return registry.containsKey(resourceKey);
    }
    @ZenCodeType.Method
    public static <T> IdMap<Holder<T>> asHolderIdMap(Registry<T> registry){
        return registry.asHolderIdMap();
    }
}
