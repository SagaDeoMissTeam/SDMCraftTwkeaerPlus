package net.sixik.sdmcrtplus.CrT.utils.file;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import javax.swing.plaf.PanelUI;
import java.io.FileDescriptor;
import java.io.SyncFailedException;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/FileDescriptor")
@NativeTypeRegistration(value = FileDescriptor.class, zenCodeName = "mods.sdmcrtplus.utils.file.FileDescriptor")
public class ExpandFileDescriptor {

    /**
     Tests if this file descriptor object is valid.
     * @param fileDescriptor - true if the file descriptor object represents a valid, open file, socket, or other active I/O connection; false otherwise.
     */
    @ZenCodeType.Method
    public static boolean valid(FileDescriptor fileDescriptor){
        return fileDescriptor.valid();
    }
}
