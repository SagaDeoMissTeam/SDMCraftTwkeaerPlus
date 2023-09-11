package net.sixik.sdmcrtplus.CrT.utils.file;


import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/FileWriter")
@NativeTypeRegistration(value = FileWriter.class, zenCodeName = "mods.sdmcrtplus.utils.file.FileWriter",
        constructors = {@NativeConstructor(value = {@NativeConstructor.ConstructorParameter(
                name = "path", type = String.class
        ),
        @NativeConstructor.ConstructorParameter(
                name = "append",
                type = boolean.class
        )}
        ),
                @NativeConstructor(value = {
        @NativeConstructor.ConstructorParameter(
            name = "file", type = File.class
        ),
        @NativeConstructor.ConstructorParameter(
                name = "append",
                type = boolean.class
        )
        })
})
public class ExpandFileWriter {
    /**
     Writes a single character.
     */
    @ZenCodeType.Method
    public static void write(FileWriter fileWriter, int i){
        try {
            fileWriter.write(i);
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Writes a string.
     */
    @ZenCodeType.Method
    public static void write(FileWriter fileWriter, String i){
        try {
            fileWriter.write(i);
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Writes a single character.
     */
    @ZenCodeType.Method
    public static void write(FileWriter fileWriter, char i){
        try {
            fileWriter.write(i);
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Writes an array of characters.
     */
    @ZenCodeType.Method
    public static void write(FileWriter fileWriter, char[] i){
        try {
            fileWriter.write(i);
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Writes a portion of an array of characters.
     */
    @ZenCodeType.Method
    public static void write(FileWriter fileWriter, char[] i, int off, int len){
        try {
            fileWriter.write(i, off, len);
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Returns the name of the character encoding being used by this stream.
     */
    @ZenCodeType.Method
    public static String getEncoding(FileWriter fileWriter){
        return fileWriter.getEncoding();
    }

    /**
     Appends the specified character to this writer.
     An invocation of this method of the form out.append(c) behaves in exactly the same way as the invocation
     */
    @ZenCodeType.Method
    public static void append(FileWriter fileWriter, char i){
        try {
            fileWriter.append(i);
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }
    @ZenCodeType.Method
    public static void close(FileWriter fileWriter){
        try {
            fileWriter.close();
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }

    /**
     Flushes the stream.
     */
    @ZenCodeType.Method
    public static void flush(FileWriter fileWriter){
        try {
            fileWriter.flush();
        } catch (IOException e) {
            CraftTweakerAPI.LOGGER.info("Unable to find or read the file !");
            throw new RuntimeException(e);
        }
    }
}
