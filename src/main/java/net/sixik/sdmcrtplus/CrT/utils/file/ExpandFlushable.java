package net.sixik.sdmcrtplus.CrT.utils.file;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/Flushable")
@NativeTypeRegistration(value = Flushable.class, zenCodeName = "mods.sdmcrtplus.utils.file.Flushable")
public class ExpandFlushable {

    /**
     Flushes the stream.
     */
    @ZenCodeType.Method
    public static void flush(Flushable flushable){
        try {
            flushable.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
