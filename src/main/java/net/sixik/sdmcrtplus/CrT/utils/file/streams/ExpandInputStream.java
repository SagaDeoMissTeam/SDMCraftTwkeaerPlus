package net.sixik.sdmcrtplus.CrT.utils.file.streams;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/streams/InputStream")
@NativeTypeRegistration(
        value = InputStream.class,
        zenCodeName = "mods.sdmcrtplus.utils.file.streams.InputStream",
        constructors = {@NativeConstructor(value = @NativeConstructor.ConstructorParameter(name = "name",
                type = String.class
        ))})
public class ExpandInputStream {

    /**
     Returns an estimate of the number of bytes that can be read (or skipped over) from this input stream without blocking, which may be 0, or 0 when end of stream is detected. The read might be on the same thread or another thread. A single read or skip of this many bytes will not block, but may read or skip fewer bytes.
     */
    @ZenCodeType.Method
    public static int available(InputStream inputStream){
        try {
            return inputStream.available();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Reads the next byte of data from the input stream. The value byte is returned as an int in the range 0 to 255. If no byte is available because the end of the stream has been reached, the value -1 is returned. This method blocks until input data is available, the end of the stream is detected, or an exception is thrown.
     */
    @ZenCodeType.Method
    public static int read(InputStream inputStream){
        try {
            return inputStream.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     Reads the next byte of data from the input stream. The value byte is returned as an int in the range 0 to 255. If no byte is available because the end of the stream has been reached, the value -1 is returned. This method blocks until input data is available, the end of the stream is detected, or an exception is thrown.
     */
    @ZenCodeType.Method
    public static int read(InputStream inputStream, byte[] b){
        try {
            return inputStream.read(b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     Reads the next byte of data from the input stream. The value byte is returned as an int in the range 0 to 255. If no byte is available because the end of the stream has been reached, the value -1 is returned. This method blocks until input data is available, the end of the stream is detected, or an exception is thrown.
     */
    @ZenCodeType.Method
    public static int read(InputStream inputStream, byte[] b, int off, int len){
        try {
            return inputStream.read(b, off, len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Reads the requested number of bytes from the input stream into the given byte array. This method blocks until len bytes of input data have been read, end of stream is detected, or an exception is thrown. The number of bytes actually read, possibly zero, is returned. This method does not close the input stream.
     * @param off - the start offset in b at which the data is written
     * @param len – the maximum number of bytes to read
     */
    @ZenCodeType.Method
    public static int readNBytes(InputStream inputStream, byte[] b, int off, int len){
        try {
            return inputStream.readNBytes(b, off, len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Reads all remaining bytes from the input stream. This method blocks until all remaining bytes have been read and end of stream is detected, or an exception is thrown. This method does not close the input stream.
     */
    @ZenCodeType.Method
    public static byte[] readAllBytes(InputStream inputStream){
        try {
            return inputStream.readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Reads up to a specified number of bytes from the input stream. This method blocks until the requested number of bytes has been read, end of stream is detected, or an exception is thrown. This method does not close the input stream.
     * @param len - the maximum number of bytes to read
     */
    @ZenCodeType.Method
    public static byte[] readAllBytes(InputStream inputStream, int len){
        try {
            return inputStream.readNBytes(len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Repositions this stream to the position at the time the mark method was last called on this input stream.
     */
    @ZenCodeType.Method
    public static void reset(InputStream inputStream){
        try {
            inputStream.reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Marks the current position in this input stream. A subsequent call to the reset method repositions this stream at the last marked position so that subsequent reads re-read the same bytes.
     * @param readLimit - the maximum limit of bytes that can be read before the mark position becomes invalid.
     */
    @ZenCodeType.Method
    public static void mark(InputStream inputStream, int readLimit){
        inputStream.mark(readLimit);
    }

    /**
     Tests if this input stream supports the mark and reset methods. Whether or not mark and reset are supported is an invariant property of a particular input stream instance. The markSupported method of InputStream returns false.
     * @return true if this stream instance supports the mark and reset methods; false otherwise.
     */
    @ZenCodeType.Method
    public static boolean markSupported(InputStream inputStream){
       return inputStream.markSupported();
    }

    /**
     Skips over and discards n bytes of data from this input stream. The skip method may, for a variety of reasons, end up skipping over some smaller number of bytes, possibly 0. This may result from any of a number of conditions; reaching end of file before n bytes have been skipped is only one possibility. The actual number of bytes skipped is returned. If n is negative, the skip method for class InputStream always returns 0, and no bytes are skipped. Subclasses may handle the negative value differentl
     * @param n - the number of bytes to be skipped.
     */
    @ZenCodeType.Method
    public static long skip(InputStream inputStream, long n){
        try {
            return inputStream.skip(n);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Skips over and discards exactly n bytes of data from this input stream. If n is zero, then no bytes are skipped. If n is negative, then no bytes are skipped. Subclasses may handle the negative value differently.
     * @param n - the number of bytes to be skipped.
     */
    @ZenCodeType.Method
    public static void skipNBytes(InputStream inputStream, long n){
        try {
            inputStream.skipNBytes(n);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Reads all bytes from this input stream and writes the bytes to the given output stream in the order that they are read. On return, this input stream will be at end of stream. This method does not close either stream.
     * @param outputStream – the output stream, non-null
     */
    @ZenCodeType.Method
    public static void transferTo(InputStream inputStream, OutputStream outputStream){
        try {
            inputStream.transferTo(outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
