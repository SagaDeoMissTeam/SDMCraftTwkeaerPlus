package net.sixik.sdmcrtplus.CrT.utils.file;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.IOException;
import java.nio.channels.FileChannel;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/FileChannel")
@NativeTypeRegistration(value = FileChannel.class, zenCodeName = "mods.sdmcrtplus.utils.file.FileChannel")
public class ExpandFileChannel {

    /**
     This channel's file position, a non-negative integer counting the number of bytes from the beginning of the file to the current position
     */
    @ZenCodeType.Method
    public static long position(FileChannel fileChannel){
        try {
            return fileChannel.position();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Returns the current size of this channel's file.
     */
    @ZenCodeType.Method
    public static long size(FileChannel fileChannel){
        try {
            return fileChannel.size();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @ZenCodeType.Method
    public static boolean isOpen(FileChannel fileChannel){
        return fileChannel.isOpen();
    }
}
