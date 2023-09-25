package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.blocks.types;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.blocks.types.GraveType;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/blocks/types/GraveType")
@NativeTypeRegistration(value = GraveType.class, zenCodeName = "mods.sdmcrtplus.integration.api.blocks.types.GraveType")
@BracketEnum("minecolonies:building/grave/type")
public class ExpandGraveType {
    @ZenCodeType.Method
    public static int getMetadata(GraveType graveType) {
        return graveType.getMetadata();
    }
    @ZenCodeType.Method
    public static String toString(GraveType graveType) {
        return graveType.toString();
    }
    @ZenCodeType.Method
    public static String getName(GraveType graveType) {
        return graveType.getName();
    }
    @ZenCodeType.Method
    public static String getTranslationKey(GraveType graveType) {
        return graveType.getTranslationKey();
    }
    @ZenCodeType.Method
    public static String getSerializedName(GraveType graveType) {
        return graveType.getSerializedName();
    }
}
