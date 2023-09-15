package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.mojang.datafixers.util.Either;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import org.openzen.zencode.java.ZenCodeType;
import xaero.pac.common.entity.IItemEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @param <T>
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/core/Holder")
@NativeTypeRegistration(value = Holder.class, zenCodeName = "mods.sdmcrtplus.utils.core.Holder")
public class ExpandHolder<T>{
    @ZenCodeType.Method
    @ZenCodeType.Getter("value")
    public static <T> T value(Holder<T> holder){
//        Holder.Direct<Map<Object, Object>> t = new Holder.Direct<>(new HashMap<>());
        return holder.value();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("isBound")
    public static <T> boolean isBound(Holder<T> holder){
        return holder.isBound();
    }
    @ZenCodeType.Method
    public static <T> boolean contain(Holder<T> holder, ResourceLocation resourceLocation){
        return holder.is(resourceLocation);
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("tags")
    public static <T> Stream<? extends TagKey<? extends T>> tags(Holder< T> holder){
        return holder.tags();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("unwrap")
    public static <T> Either<? extends ResourceKey<? extends T>, ? extends T> unwrap(Holder< T> holder){
        return holder.unwrap();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("unwrapKey")
    public static <T> Optional<? extends ResourceKey<? extends T>> unwrapKey(Holder< T> holder){
        return holder.unwrapKey();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("kind")
    public static <T> Holder.Kind kind(Holder<T> holder){
        return holder.kind();
    }
//    @ZenCodeType.Method
//    public static <T> boolean isValidInRegistry(Holder<T> holder, Registry<T> registry){
//        return holder.isValidInRegistry(registry);
//    }
}
