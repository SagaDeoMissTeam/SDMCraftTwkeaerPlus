package net.sixik.sdmcrtplus.CrT.utils.file.streams;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/streams/FileOutputStream")
@NativeTypeRegistration(
        value = FileOutputStream.class,
        zenCodeName = "mods.sdmcrtplus.utils.file.streams.FileOutputStream",
        constructors = {@NativeConstructor(value = @NativeConstructor.ConstructorParameter(name = "name",
                type = String.class
        ))})
public class ExpandFileOutputStream {

    /**
     Returns the FileDescriptor object that represents the connection to the actual file in the file system being used by this FileInputStream.
     */
    @ZenCodeType.Method
    public static FileDescriptor getFD(FileOutputStream fileOutputStream){
        try {
            return fileOutputStream.getFD();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     The initial position of the returned channel will be equal to the number of bytes read from the file so far. Reading bytes from this stream will increment the channel's position. Changing the channel's position, either explicitly or by reading, will change this stream's file position.
     */
    @ZenCodeType.Method
    public static FileChannel getChannel(FileOutputStream fileOutputStream){
        return fileOutputStream.getChannel();
    }
}
