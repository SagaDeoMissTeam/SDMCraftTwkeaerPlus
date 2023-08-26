package net.sixik.sdmcrtplus.CrT.utils.file.streams;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.*;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/streams/InputStreamReader")
@NativeTypeRegistration(
        value = InputStreamReader.class,
        zenCodeName = "mods.sdmcrtplus.file.utils.streams.InputStreamReader",
        constructors = {@NativeConstructor(value = {@NativeConstructor.ConstructorParameter(
                name = "in", type = InputStream.class
        ), @NativeConstructor.ConstructorParameter(
                name = "charsetName", type = String.class
)})})
public class ExpandInputStreamReader {


    /**
     Reads a single character.
     */
    @ZenCodeType.Method
    public static int read(InputStreamReader inputStream){
        try {
            return inputStream.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Reads characters into an array. This method will block until some input is available, an I/O error occurs, or the end of the stream is reached

     If the length of cbuf is zero, then no characters are read and 0 is returned; otherwise, there is an attempt to read at least one character. If no character is available because the stream is at its end, the value -1 is returned; otherwise, at least one character is read and stored into cbuf.
     * @param inputStream
     * @param cbuf
     * @return
     */
    @ZenCodeType.Method
    public static int read(InputStreamReader inputStream, char[] cbuf){
        try {
            return inputStream.read(cbuf);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Reads characters into a portion of an array. This method will block until some input is available, an I/O error occurs, or the end of the stream is reached.
     If len is zero, then no characters are read and 0 is returned; otherwise, there is an attempt to read at least one character. If no character is available because the stream is at its end, the value -1 is returned; otherwise, at least one character is read and stored into cbuf.
     * @return
     */
    @ZenCodeType.Method
    public static int read(InputStreamReader inputStream, char[] cbuf, int off, int len){
        try {
            return inputStream.read(cbuf, off, len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Resets the stream. If the stream has been marked, then attempt to reposition it at the mark. If the stream has not been marked, then attempt to reset it in some way appropriate to the particular stream, for example by repositioning it to its starting point. Not all character-input streams support the reset() operation, and some support reset() without supporting mark().
     */
    @ZenCodeType.Method
    public static void reset(InputStreamReader inputStream){
        try {
            inputStream.reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Tells whether this stream is ready to be read. An InputStreamReader is ready if its input buffer is not empty, or if bytes are available to be read from the underlying byte stream.
     */
    @ZenCodeType.Method
    public static boolean ready(InputStreamReader inputStream){
        try {
           return inputStream.ready();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Marks the present position in the stream. Subsequent calls to reset() will attempt to reposition the stream to this point. Not all character-input streams support the mark() operation.
     */
    @ZenCodeType.Method
    public static void mark(InputStreamReader inputStream, int readLimit){
        try {
            inputStream.mark(readLimit);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Tells whether this stream supports the mark() operation. The default implementation always returns false. Subclasses should override this method.
     */
    @ZenCodeType.Method
    public static boolean markSupported(InputStreamReader inputStream){
        return inputStream.markSupported();
    }

    /**
     Skips characters. This method will block until some characters are available, an I/O error occurs, or the end of the stream is reached. If the stream is already at its end before this method is invoked, then no characters are skipped and zero is returned.
     * @param n - the number of bytes to be skipped.
     */
    @ZenCodeType.Method
    public static long skip(InputStreamReader inputStream, long n){
        try {
            return inputStream.skip(n);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Reads all characters from this reader and writes the characters to the given writer in the order that they are read. On return, this reader will be at end of the stream. This method does not close either reader or writer.
     * @param out – the writer, non-null
     */
    @ZenCodeType.Method
    public static void transferTo(InputStreamReader inputStream, Writer out){
        try {
            inputStream.transferTo(out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
