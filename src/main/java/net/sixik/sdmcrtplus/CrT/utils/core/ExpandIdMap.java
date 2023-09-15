package net.sixik.sdmcrtplus.CrT.utils.core;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.IdMap;
import org.openzen.zencode.java.ZenCodeType;

/**
 * @param <T>
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/core/IdMap")
@NativeTypeRegistration(value = IdMap.class, zenCodeName = "mods.sdmcrtplus.utils.core.IdMap")
public class ExpandIdMap<T> {

    @ZenCodeType.Method
    public static <T> int size(IdMap<T> idMap){
        return idMap.size();
    }
    @ZenCodeType.Method
    public static <T> T byIdOrThrow(IdMap<T> idMap, int id){
        return idMap.byIdOrThrow(id);
    }
    @ZenCodeType.Method
    public static <T> T byId(IdMap<T> idMap, int id){
        return idMap.byId(id);
    }
    @ZenCodeType.Method
    public static <T> int getId(IdMap<T> idMap, T T){
        return idMap.getId(T);
    }
}
