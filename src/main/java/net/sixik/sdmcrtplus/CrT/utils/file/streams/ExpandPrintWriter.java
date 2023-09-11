package net.sixik.sdmcrtplus.CrT.utils.file.streams;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/streams/PrintWriter")
@NativeTypeRegistration(
        value = PrintWriter.class,
        zenCodeName = "mods.sdmcrtplus.utils.file.streams.PrintWriter",
        constructors = {@NativeConstructor(value = @NativeConstructor.ConstructorParameter(name = "file",
                type = File.class
        )),
            @NativeConstructor(
                    value = @NativeConstructor.ConstructorParameter(name = "file",
                    type = FileWriter.class)),

            @NativeConstructor(value = {
            @NativeConstructor.ConstructorParameter(
                    name = "file",
                    type = File.class
            ),
            @NativeConstructor.ConstructorParameter(
                    name = "append",
                    type = boolean.class
            )
            }),
            @NativeConstructor(value = {
            @NativeConstructor.ConstructorParameter(
                    name = "file",
                    type = FileWriter.class
            ),
            @NativeConstructor.ConstructorParameter(
                    name = "append",
                    type = boolean.class
            )
            })
        })
public class ExpandPrintWriter {

    @ZenCodeType.Method
    public static void println(PrintWriter printWriter){
        printWriter.println();
    }
    @ZenCodeType.Method
    public static void println(PrintWriter printWriter, char c){
        printWriter.println(c);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter printWriter, int c){
        printWriter.println(c);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter printWriter, double c){
        printWriter.println(c);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter printWriter, float c){
        printWriter.println(c);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter printWriter, String c){
        printWriter.println(c);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter printWriter, boolean c){
        printWriter.println(c);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter printWriter, long c){
        printWriter.println(c);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter printWriter, char[] c){
        printWriter.println(c);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter printWriter, char c){
        printWriter.print(c);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter printWriter, int c){
        printWriter.print(c);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter printWriter, double c){
        printWriter.print(c);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter printWriter, float c){
        printWriter.print(c);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter printWriter, String c){
        printWriter.print(c);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter printWriter, boolean c){
        printWriter.print(c);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter printWriter, long c){
        printWriter.print(c);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter printWriter, char[] c){
        printWriter.print(c);
    }
}
