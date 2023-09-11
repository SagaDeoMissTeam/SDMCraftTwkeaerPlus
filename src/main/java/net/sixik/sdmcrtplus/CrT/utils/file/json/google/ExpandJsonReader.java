package net.sixik.sdmcrtplus.CrT.utils.file.json.google;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import org.openjdk.nashorn.internal.parser.JSONParser;
import org.openzen.zencode.java.ZenCodeType;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/json/google/JsonReader")
@NativeTypeRegistration(value = JsonReader.class, zenCodeName = "mods.sdmcrtplus.utils.file.json.google.JsonReader",
constructors = @NativeConstructor(value = {@NativeConstructor.ConstructorParameter(
        name = "InputStream", type = Reader.class
)}))
public class ExpandJsonReader {


        /**
         Consumes the next token from the JSON stream and asserts that it is the beginning of a new array.
         */
        @ZenCodeType.Method
        public static void beginArray(JsonReader jsonReader){
                try {
                        jsonReader.beginArray();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        /**
         Consumes the next token from the JSON stream and asserts that it is the beginning of a new object.
         */
        @ZenCodeType.Method
        public static void beginObject(JsonReader jsonReader){
                try {
                        jsonReader.beginObject();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        /**
         Consumes the next token from the JSON stream and asserts that it is the end of the current object.
         */
        @ZenCodeType.Method
        public static void endObject(JsonReader jsonReader){
                try {
                        jsonReader.endObject();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        /**
         Consumes the next token from the JSON stream and asserts that it is the end of the current array.
         */
        @ZenCodeType.Method
        public static void endArray(JsonReader jsonReader){
                try {
                        jsonReader.endArray();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        @ZenCodeType.Method
        public static String toString(JsonReader jsonReader){
                return jsonReader.toString();
        }

        /**
         Returns the string value of the next token, consuming it. If the next token is a number, this method will return its string form.
         */
        @ZenCodeType.Method
        public static String nextString(JsonReader jsonReader){
                try {
                        return jsonReader.nextString();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        /**
         Returns true if the current array or object has another element.
         */
        @ZenCodeType.Method
        public static boolean hasNext(JsonReader jsonReader){
                try {
                        return jsonReader.hasNext();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        /**
         Returns true if this parser is liberal in what it accepts.
         */
        @ZenCodeType.Method
        public static boolean isLenient(JsonReader jsonReader){
                return jsonReader.isLenient();
        }

        /**
         Returns the boolean value of the next token, consuming it
         */
        @ZenCodeType.Method
        public static boolean nextBoolean(JsonReader jsonReader){
                try {
                        return jsonReader.nextBoolean();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        /**
         Returns the int value of the next token, consuming it. If the next token is a string, this method will attempt to parse it as an int. If the next token's numeric value cannot be exactly represented by a Java int, this method throws.
         */
        @ZenCodeType.Method
        public static int nextInt(JsonReader jsonReader){
                try {
                        return jsonReader.nextInt();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        /**
         Returns the double value of the next token, consuming it. If the next token is a string, this method will attempt to parse it as a double;
         */
        @ZenCodeType.Method
        public static double nextDouble(JsonReader jsonReader){
                try {
                        return jsonReader.nextDouble();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        /**
         Returns the long value of the next token, consuming it. If the next token is a string, this method will attempt to parse it as a long. If the next token's numeric value cannot be exactly represented by a Java long, this method throws.
         */
        @ZenCodeType.Method
        public static long nextLong(JsonReader jsonReader){
                try {
                        return jsonReader.nextLong();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        /**
         Consumes the next token from the JSON stream and asserts that it is a literal null.
         */
        @ZenCodeType.Method
        public static void nextNull(JsonReader jsonReader){
                try {
                        jsonReader.nextNull();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        /**
         Returns the next token, a property name, and consumes it.
         */
        @ZenCodeType.Method
        public static String nextName(JsonReader jsonReader){
                try {
                        return jsonReader.nextName();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        /**
         Skips the next value recursively. If it is an object or array, all nested elements are skipped. This method is intended for use when the JSON token stream contains unrecognized or unhandled values.
         */
        @ZenCodeType.Method
        public static void skipValue(JsonReader jsonReader){
                try {
                         jsonReader.skipValue();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }
        @ZenCodeType.Method
        public static void setLenient(JsonReader jsonReader, boolean set){
                jsonReader.setLenient(set);
        }

        /**
         Returns the type of the next token without consuming it.
         */
        @ZenCodeType.Method
        public static JsonToken peek(JsonReader jsonReader, boolean set){
                try {
                      return  jsonReader.peek();
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        /**
         Returns a JsonPath  to the current location in the JSON value.
         */
        @ZenCodeType.Method
        public static String getPath(JsonReader jsonReader, boolean set){
                return  jsonReader.getPath();
        }

        /**
         Indicates whether some other object is "equal to" this one.
         */
        @ZenCodeType.Method
        public static boolean equal(JsonReader jsonReader, Object object){
                return jsonReader.equals(object);
        }
}
