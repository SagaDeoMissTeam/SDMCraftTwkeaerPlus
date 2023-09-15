package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import org.openzen.zencode.java.ZenCodeType;

/**
 * @param <T>
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/core/Reference")
@NativeTypeRegistration(value = Holder.Reference.class, zenCodeName = "mods.sdmcrtplus.utils.core.Reference")
public class ExpandReference<T> {

    @ZenCodeType.Method
    @ZenCodeType.Getter("key")
    public static <T> ResourceKey<T> getKey(Holder.Reference<T> reference){
        return reference.key();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("type")
    public static <T> Holder.Reference.Type getType(Holder.Reference<T> reference){
        return reference.getType();
    }
}
