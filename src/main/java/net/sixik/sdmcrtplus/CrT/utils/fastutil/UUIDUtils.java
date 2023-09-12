package net.sixik.sdmcrtplus.CrT.utils.fastutil;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

import java.util.UUID;

@ZenRegister
@Document("mods/sdmcrtplus/utils/fastutil/UUIDUtils")
@ZenCodeType.Name("mods.sdmcrtplus.utils.fastutils.UUIDUtils")
public class UUIDUtils {

    @ZenCodeType.Method
    public static UUID fromString(String uuid){
        return UUID.fromString(uuid);
    }
    @ZenCodeType.Method
    public static UUID randomUUID(){
        return UUID.randomUUID();
    }
    @ZenCodeType.Method
    public static UUID nameUUIDFromBytes(byte[] name){
        return UUID.nameUUIDFromBytes(name);
    }
}
