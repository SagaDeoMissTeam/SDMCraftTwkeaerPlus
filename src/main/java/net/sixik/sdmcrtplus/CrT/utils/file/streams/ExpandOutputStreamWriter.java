package net.sixik.sdmcrtplus.CrT.utils.file.streams;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/streams/OutputStreamWriter")
@NativeTypeRegistration(value = OutputStreamWriter.class, zenCodeName = "mods.sdmcrtplus.utils.file.streams.OutputStreamWriter",
constructors = {@NativeConstructor(value = {@NativeConstructor.ConstructorParameter(
        name = "dir", type = OutputStream.class
), @NativeConstructor.ConstructorParameter(
        name = "charsetName", type = String.class
)}
)})
public class ExpandOutputStreamWriter {

    /**
     Returns the name of the character encoding being used by this stream.
     If the encoding has an historical name then that name is returned; otherwise the encoding's canonical name is returned.
     */
    @ZenCodeType.Method
    public static String getEncoding(OutputStreamWriter outputStreamWriter){
       return outputStreamWriter.getEncoding();
    }

}
