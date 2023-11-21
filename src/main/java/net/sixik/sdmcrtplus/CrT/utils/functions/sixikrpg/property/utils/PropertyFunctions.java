package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.utils;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/utils/PropertyFunctions")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.utils.PropertyFunctions")
@BracketEnum("sdm:propertyfunction")
public enum PropertyFunctions {
    SUBTRACT,
    MULTIPLY,
    DIVIDE,
    ADD;
}
