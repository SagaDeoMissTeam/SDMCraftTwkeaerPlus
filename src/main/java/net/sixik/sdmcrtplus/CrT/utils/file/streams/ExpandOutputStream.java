package net.sixik.sdmcrtplus.CrT.utils.file.streams;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/streams/OutputStream")
@NativeTypeRegistration(value = OutputStream.class, zenCodeName = "mods.sdmcrtplus.utils.file.streams.OutputStream")
public class ExpandOutputStream {

    /**
     Writes the specified byte to this output stream. The general contract for write is that one byte is written to the output stream. The byte to be written is the eight low-order bits of the argument b. The 24 high-order bits of b are ignored.
     */
    @ZenCodeType.Method
    public static void write(OutputStream outputStream, int d){
        try {
            outputStream.write(d);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Writes b.length bytes from the specified byte array to this output stream. The general contract for write(b) is that it should have exactly the same effect as the call write(b, 0, b.length).
     */
    @ZenCodeType.Method
    public static void write(OutputStream outputStream, byte[] d){
        try {
            outputStream.write(d);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     Writes len bytes from the specified byte array starting at offset off to this output stream. The general contract for write(b, off, len) is that some of the bytes in the array b are written to the output stream in order; element b[off] is the first byte written and b[off+len-1] is the last byte written by this operation.
     * @param d - the data
     * @param off - the start offset
     * @param len - the number of bytes to write
     */
    @ZenCodeType.Method
    public static void write(OutputStream outputStream, byte[] d, int off, int len){
        try {
            outputStream.write(d, off ,len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
