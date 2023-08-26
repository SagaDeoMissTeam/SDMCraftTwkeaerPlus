package net.sixik.sdmcrtplus.CrT.utils.file;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStreamWriter;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/Closeable")
@NativeTypeRegistration(value = Closeable.class, zenCodeName = "mods.sdmcrtplus.utils.file.Closeable")
public class ExpandCloseable {

    /**
     Closes this stream and releases any system resources associated with it. If the stream is already closed then invoking this method has no effect.
     */
    @ZenCodeType.Method
    public static void close(Closeable closeable){
        try {
            closeable.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
