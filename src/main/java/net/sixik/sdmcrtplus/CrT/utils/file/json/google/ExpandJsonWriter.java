package net.sixik.sdmcrtplus.CrT.utils.file.json.google;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.google.gson.stream.JsonWriter;
import org.openzen.zencode.java.ZenCodeType;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/json/google/JsonWriter")
@NativeTypeRegistration(value = JsonWriter.class, zenCodeName = "mods.sdmcrtplus.utils.file.json.google.JsonWriter",
constructors = @NativeConstructor(value = {@NativeConstructor.ConstructorParameter(
        name = "OutputStream", type = Writer.class
)}))
public class ExpandJsonWriter {

    /**
     Encodes the property name.
     * @param name – the name of the forthcoming value. May not be null.
     */
    @ZenCodeType.Method
    public static JsonWriter name(JsonWriter jsonWriter, String name){
        try {

            return jsonWriter.name(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Writes value directly to the writer without quoting or escaping.
     * @param value - the literal string value, or null to encode a null literal
     */
    @ZenCodeType.Method
    public static JsonWriter jsonValue(JsonWriter jsonWriter, String value){
        try {
            return jsonWriter.jsonValue(value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Encodes value.
     * @param value - the literal string value, or null to encode a null literal.
     */
    @ZenCodeType.Method
    public static JsonWriter value(JsonWriter jsonWriter, String value){
        try {
            return jsonWriter.value(value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Encodes value.
     * @param value - the literal string value, or null to encode a null literal.
     */
    @ZenCodeType.Method
    public static JsonWriter value(JsonWriter jsonWriter, int value){
        try {
            return jsonWriter.value(value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Encodes value.
     * @param value - the literal string value, or null to encode a null literal.
     */
    @ZenCodeType.Method
    public static JsonWriter value(JsonWriter jsonWriter, char value){
        try {
            return jsonWriter.value(value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     Encodes value.
     * @param value - the literal string value, or null to encode a null literal.
     */
    @ZenCodeType.Method
    public static JsonWriter value(JsonWriter jsonWriter, double value){
        try {
            return jsonWriter.value(value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     Encodes value.
     * @param value - the literal string value, or null to encode a null literal.
     */
    @ZenCodeType.Method
    public static JsonWriter value(JsonWriter jsonWriter, float value){
        try {
            return jsonWriter.value(value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     Encodes value.
     * @param value - the literal string value, or null to encode a null literal.
     */
    @ZenCodeType.Method
    public static JsonWriter value(JsonWriter jsonWriter, boolean value){
        try {
            return jsonWriter.value(value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     Encodes null.
     */
    @ZenCodeType.Method
    public static JsonWriter nullValue(JsonWriter jsonWriter){
        try {
            return jsonWriter.nullValue();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Begins encoding a new array. Each call to this method must be paired with a call to endArray.
     */
    @ZenCodeType.Method
    public static JsonWriter beginArray(JsonWriter jsonWriter){
        try {
            return jsonWriter.beginArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Begins encoding a new object. Each call to this method must be paired with a call to endObject.
     */
    @ZenCodeType.Method
    public static JsonWriter beginObject(JsonWriter jsonWriter){
        try {
            return jsonWriter.beginObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Ends encoding the current array.
     */
    @ZenCodeType.Method
    public static JsonWriter endArray(JsonWriter jsonWriter){
        try {
            return jsonWriter.endArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     Ends encoding the current object.
     */
    @ZenCodeType.Method
    public static JsonWriter endObject(JsonWriter jsonWriter){
        try {
            return jsonWriter.endObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @return true if object members are serialized when their value is null. This has no impact on array elements. The default is true.
     */
    @ZenCodeType.Method
    public static boolean getSerializeNulls(JsonWriter jsonWriter){
        return jsonWriter.getSerializeNulls();
    }

    /**
     * @return true if this writer writes JSON that's safe for inclusion in HTML and XML documents.
     */
    @ZenCodeType.Method
    public static boolean isHtmlSafe(JsonWriter jsonWriter){
        return jsonWriter.isHtmlSafe();
    }

    /**
     * @return true if this writer has relaxed syntax rules.
     */
    @ZenCodeType.Method
    public static boolean isLenient(JsonWriter jsonWriter){
        return jsonWriter.isLenient();
    }

    /**
     Sets the indentation string to be repeated for each level of indentation in the encoded document. If value.isEmpty() the encoded document will be compact. Otherwise the encoded document will be more human-readable.
     * @param value - a string containing only whitespace.
     */
    @ZenCodeType.Method
    public static void setIndent(JsonWriter jsonWriter, String value){
        jsonWriter.setIndent(value);
    }

    /**
     Configure this writer to relax its syntax rules. By default, this writer only emits well-formed JSON as specified by RFC 7159 . Setting the writer to lenient permits the following:
     Top-level values of any type. With strict writing, the top-level value must be an object or an array.
     Numbers may be NaNs or infinities.
     */
    @ZenCodeType.Method
    public static void setLenient(JsonWriter jsonWriter, boolean value){
        jsonWriter.setLenient(value);
    }

    /**
     Sets whether object members are serialized when their value is null. This has no impact on array elements. The default is true.
     */
    @ZenCodeType.Method
    public static void setSerializeNulls(JsonWriter jsonWriter, boolean value){
        jsonWriter.setSerializeNulls(value);
    }
}
