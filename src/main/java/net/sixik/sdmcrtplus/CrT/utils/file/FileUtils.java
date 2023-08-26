package net.sixik.sdmcrtplus.CrT.utils.file;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.CraftTweakerConstants;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.client.Minecraft;
import org.openzen.zencode.java.ZenCodeType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/FileUtils")
@ZenCodeType.Name("mods.sdmcrtplus.utils.file.FileUtils")
public class FileUtils {

    @ZenCodeType.Method
    public static Path getScriptsDirectory(){
        return CraftTweakerAPI.getScriptsDirectory();
    }
    @ZenCodeType.Method
    public static Path getScriptsDirectoryCT(){
        return Path.of(CraftTweakerConstants.SCRIPTS_DIRECTORY);
    }
    @ZenCodeType.Method
    public static Path getCraftTweakerLogFile(){
        return Path.of(CraftTweakerConstants.LOG_PATH);
    }
    @ZenCodeType.Method
    public static Path getMinecraftDirectory(){
        return Path.of(Minecraft.getInstance().gameDirectory.getPath());
    }
    @ZenCodeType.Method
    public static Path getMinecraftResourcePackDirectory(){
        return Path.of(Minecraft.getInstance().getResourcePackDirectory().getPath());
    }

    /**
     Reads all the bytes from a file. The method ensures that the file is closed when all bytes have been read or an I/O error, or other runtime exception, is thrown.
     */
    @ZenCodeType.Method
    public static byte[] readAllBytes(Path path){
        try {
            return Files.readAllBytes(path);
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Read all lines from a file. Bytes from the file are decoded into characters using the UTF-8 charset.
     This method works as if invoking it were equivalent to evaluating the expression:
     */
    @ZenCodeType.Method
    public static List<String> readAllLines(Path path){
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Reads all content from a file into a string, decoding from bytes to characters using the UTF-8 charset. The method ensures that the file is closed when all content have been read or an I/O error, or other runtime exception, is thrown.
     */
    @ZenCodeType.Method
    public static String readString(Path path){
        try {
            return Files.readString(path);
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Tests whether a file is readable. This method checks that a file exists and that this Java virtual machine has appropriate privileges that would allow it open the file for reading. Depending on the implementation, this method may require to read file permissions, access control lists, or other file attributes in order to check the effective access to the file. Consequently, this method may not be atomic with respect to other file system operations.
     */
    @ZenCodeType.Method
    public static boolean isReadable(Path path){
        return Files.isReadable(path);
    }

    @ZenCodeType.Method
    public static Path getPath(String path) {
        return Path.of(path);
    }
}
