package net.sixik.sdmcrtplus.CrT.utils.file;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.File;
import java.io.IOException;
import java.io.Writer;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/File")
@NativeTypeRegistration(value = File.class, zenCodeName = "mods.sdmcrtplus.utils.file.File",
        constructors = @NativeConstructor(value = {@NativeConstructor.ConstructorParameter(
                name = "path", type = String.class
        )}
        ))

public class ExpandFile {

    /**
     Returns the absolute form of this abstract pathname. Equivalent to new File(this.getAbsolutePath).
     */
    @ZenCodeType.Method
    public static File getAbsoluteFile(File file){
        return file.getAbsoluteFile();
    }

    /**
     Returns the canonical form of this abstract pathname. Equivalent to new File(this.getCanonicalPath).
     */
    @ZenCodeType.Method
    public static File getCanonicalFile(File file) {
        try {
            return file.getCanonicalFile();
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Returns the abstract pathname of this abstract pathname's parent, or null if this pathname does not name a parent directory.
     */
    @ZenCodeType.Method
    public static File getParentFile(File file){
        return file.getParentFile();
    }

    /**
     Returns the pathname string of this abstract pathname's parent, or null if this pathname does not name a parent directory.
     */
    @ZenCodeType.Method
    public static String getParent(File file){
        return file.getParent();
    }

    /**
     Returns the name of the file or directory denoted by this abstract pathname. This is just the last name in the pathname's name sequence. If the pathname's name sequence is empty, then the empty string is returned.
     */
    @ZenCodeType.Method
    public static String getName(File file){
        return file.getName();
    }

    /**
     Converts this abstract pathname into a pathname string. The resulting string uses the default name-separator character to separate the names in the name sequence.
     */
    @ZenCodeType.Method
    public static String getPath(File file){
        return file.getPath();
    }

    /**
     Returns the absolute pathname string of this abstract pathname.
     */
    @ZenCodeType.Method
    public static String getAbsolutePath(File file){
        return file.getAbsolutePath();
    }

    /**
     Returns the canonical pathname string of this abstract pathname.
     */
    @ZenCodeType.Method
    public static String getCanonicalPath(File file){
        try {
            return file.getCanonicalPath();
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Returns the number of unallocated bytes in the partition named by this abstract path name. If the number of unallocated bytes in the partition is greater than Long.MAX_VALUE, then Long.MAX_VALUE will be returned.
     */
    @ZenCodeType.Method
    public static long getFreeSpace(File file){
        return file.getFreeSpace();
    }

    /**
     Returns the size of the partition named by this abstract pathname. If the total number of bytes in the partition is greater than Long.MAX_VALUE, then Long.MAX_VALUE will be returned.
     */
    @ZenCodeType.Method
    public static long getTotalSpace(File file){
        return file.getTotalSpace();
    }

    /**
     Returns the number of bytes available to this virtual machine on the partition named by this abstract pathname. If the number of available bytes in the partition is greater than Long.MAX_VALUE, then Long.MAX_VALUE will be returned. When possible, this method checks for write permissions and other operating system restrictions and will therefore usually provide a more accurate estimate of how much new data can actually be written than getFreeSpace.
     */
    @ZenCodeType.Method
    public static long getUsableSpace(File file){
        return file.getUsableSpace();
    }

    /**
     A convenience method to set the owner's write permission for this abstract pathname. On some platforms it may be possible to start the Java virtual machine with special privileges that allow it to modify files that disallow write operations.
     */
    @ZenCodeType.Method
    public static boolean setWritable(File file, boolean parameter){
        return file.setWritable(parameter);
    }
}
