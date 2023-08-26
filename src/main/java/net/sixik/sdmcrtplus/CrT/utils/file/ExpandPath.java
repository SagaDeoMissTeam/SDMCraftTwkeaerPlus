package net.sixik.sdmcrtplus.CrT.utils.file;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.File;
import java.nio.file.Path;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/Path")
@NativeTypeRegistration(value = Path.class, zenCodeName = "mods.sdmcrtplus.utils.file.Path")
public class ExpandPath {

    /**
     Returns the string representation of this path.
     */
    @ZenCodeType.Method
    public static String toString(Path path){
       return path.toString();
    }

    /**
     Returns a File object representing this path. Where this Path is associated with the default provider, then this method is equivalent to returning a File object constructed with the String representation of this path.
     */
    @ZenCodeType.Method
    public static File toFile(Path path) {
        return path.toFile();
    }

    /**
     Returns the name of the file or directory denoted by this path as a Path object. The file name is the farthest element from the root in the directory hierarchy.
     */
    @ZenCodeType.Method
    public static Path getFileName(Path path) {
        return path.getFileName();
    }

    /**
     Returns the parent path, or null if this path does not have a parent.
     */
    @ZenCodeType.Method
    public static Path getParent(Path path) {
        return path.getParent();
    }

    /**
     Returns the root component of this path as a Path object, or null if this path does not have a root component.
     */
    @ZenCodeType.Method
    public static Path getRoot(Path path) {
        return path.getRoot();
    }

    /**
     Returns the number of name elements in the path.
     Returns: the number of elements in the path, or 0 if this path only represents a root component
     */
    @ZenCodeType.Method
    public static int getNameCount(Path path) {
        return path.getNameCount();
    }

    /**
     Tests if this path ends with a Path, constructed by converting the given path string, in exactly the manner specified by the endsWith(Path) method. On UNIX for example, the path "foo/bar" ends with "foo/bar" and "bar". It does not end with "r" or "/bar". Note that trailing separators are not taken into account, and so invoking this method on the Path"foo/bar" with the String "bar/" returns true.
     */
    @ZenCodeType.Method
    public static boolean endsWith(Path path, String other) {
        return path.endsWith(other);
    }

    /**
     If the given path has N elements, and no root component, and this path has N or more elements, then this path ends with the given path if the last N elements of each path, starting at the element farthest from the root, are equal.
     */
    @ZenCodeType.Method
    public static boolean endsWith(Path path, Path other) {
        return path.endsWith(other);
    }

    /**
     Tests if this path starts with a Path, constructed by converting the given path string, in exactly the manner specified by the startsWith(Path) method. On UNIX for example, the path "foo/bar" starts with "foo" and "foo/bar". It does not start with "f" or "fo".
     */
    @ZenCodeType.Method
    public static boolean startsWith(Path path, String other) {
        return path.startsWith(other);
    }

    /**
     This path starts with the given path if this path's root component starts with the root component of the given path, and this path starts with the same name elements as the given path. If the given path has more name elements than this path then false is returned.
     */
    @ZenCodeType.Method
    public static boolean startsWith(Path path, Path other) {
        return path.startsWith(other);
    }

}
