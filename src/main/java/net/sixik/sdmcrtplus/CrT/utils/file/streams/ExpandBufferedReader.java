package net.sixik.sdmcrtplus.CrT.utils.file.streams;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.stream.Stream;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/streams/BufferedReader")
@NativeTypeRegistration(
        value = BufferedReader.class,
        zenCodeName = "mods.sdmcrtplus.utils.file.streams.BufferedReader",
        constructors = {@NativeConstructor(value = @NativeConstructor.ConstructorParameter(name = "reader",
                type = Reader.class
)),
                @NativeConstructor(value = @NativeConstructor.ConstructorParameter(name = "", type = short.class))
        })
public class ExpandBufferedReader {

        @ZenCodeType.Method
        public static List<String> lines(BufferedReader bufferedReader){
                return bufferedReader.lines().toList();
        }
        @ZenCodeType.Method
        public static String readLine(BufferedReader bufferedReader){
                try {
                        return bufferedReader.readLine();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }
}
