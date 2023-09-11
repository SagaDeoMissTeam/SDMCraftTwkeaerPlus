package net.sixik.sdmcrtplus.CrT.utils.file.json.google;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.google.gson.stream.JsonToken;

import javax.json.JsonValue;

@ZenRegister
@Document("mods/sdmcrtplus/utils/file/json/google/JsonToken")
@NativeTypeRegistration(value = JsonToken.class, zenCodeName = "mods.sdmcrtplus.utils.file.json.google.JsonToken")
@BracketEnum("json:token")
public class ExpandJsonToken {

}
