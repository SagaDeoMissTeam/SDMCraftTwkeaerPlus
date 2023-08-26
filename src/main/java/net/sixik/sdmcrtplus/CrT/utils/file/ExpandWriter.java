package net.sixik.sdmcrtplus.CrT.utils.file;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.IOException;
import java.io.Writer;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/Writer")
@NativeTypeRegistration(value = Writer.class, zenCodeName = "mods.sdmcrtplus.utils.file.Writer")
public class ExpandWriter {

    /**
     Writes a string.
     */
    @ZenCodeType.Method
    public static void write(Writer writer, String str){
        try {
            writer.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Writes a portion of a string.
     * @param str - A String
     * @param off - Offset from which to start writing characters
     * @param len - Number of characters to write
     */
    @ZenCodeType.Method
    public static void write(Writer writer, String str, int off, int len){
        try {
            writer.write(str, off, len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Writes a single character. The character to be written is contained in the 16 low-order bits of the given integer value; the 16 high-order bits are ignored.
     */
    @ZenCodeType.Method
    public static void write(Writer writer, char str){
        try {
            writer.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Writes an array of characters.
     */
    @ZenCodeType.Method
    public static void write(Writer writer, char[] str){
        try {
            writer.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Writes a portion of an array of characters
     * @param off - Offset from which to start writing characters
     * @param len – Number of characters to write
     */
    @ZenCodeType.Method
    public static void write(Writer writer, char[] str, int off, int len){
        try {
            writer.write(str, off, len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Writes a single character. The character to be written is contained in the 16 low-order bits of the given integer value; the 16 high-order bits are ignored.
     */
    @ZenCodeType.Method
    public static void write(Writer writer, int str){
        try {
            writer.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Appends the specified character to this writer.
     An invocation of this method of the form out.append(c) behaves in exactly the same way as the invocation
     */
    @ZenCodeType.Method
    public static Writer append(Writer writer, char str){
        try {
            return writer.append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
