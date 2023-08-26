package net.sixik.sdmcrtplus.CrT.utils.file;


import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/FileReader")
@NativeTypeRegistration(value = FileReader.class, zenCodeName = "mods.sdmcrtplus.utils.file.FileReader",
        constructors = {@NativeConstructor(
                value = {@NativeConstructor.ConstructorParameter(
                name = "path", type = String.class
        )}
        ), @NativeConstructor(value = {@NativeConstructor.ConstructorParameter(
                name = "file", type = File.class
        )})
})
public class ExpandFileReader {

    /**
     Reads a single character.
     */
    @ZenCodeType.Method
    public static int read(FileReader fileReader){
        try {
            return fileReader.read();
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Reads characters into an array. This method will block until some input is available, an I/O error occurs, or the end of the stream is reached.
     */
    @ZenCodeType.Method
    public static int read(FileReader fileReader, char[] c){
        try {
            return fileReader.read(c);
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Reads characters into a portion of an array. This method will block until some input is available, an I/O error occurs, or the end of the stream is reached.
     */
    @ZenCodeType.Method
    public static int read(FileReader fileReader, char[] i, int off, int len){
        try {
            return fileReader.read(i,off,len);
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Skips characters. This method will block until some characters are available, an I/O error occurs, or the end of the stream is reached. If the stream is already at its end before this method is invoked, then no characters are skipped and zero is returned
     */
    @ZenCodeType.Method
    public static long read(FileReader fileReader, long l){
        try {
            return fileReader.skip(l);
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }
    @ZenCodeType.Method
    public static void close(FileReader fileWriter){
        try {
            fileWriter.close();
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Returns the name of the character encoding being used by this stream.
     */
    @ZenCodeType.Method
    public static String getEncoding(FileReader fileWriter){
        return fileWriter.getEncoding();
    }
}
