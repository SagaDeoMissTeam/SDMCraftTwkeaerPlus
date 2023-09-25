package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.blocks.types;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.blocks.types.GraveType;
import com.minecolonies.api.blocks.types.RackType;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/blocks/types/RackType")
@NativeTypeRegistration(value = RackType.class, zenCodeName = "mods.sdmcrtplus.integration.api.blocks.types.RackType")
@BracketEnum("minecolonies:building/rack/type")
public class ExpandRackType {

    @ZenCodeType.Method
    public static String toString(RackType rackType) {
        return rackType.toString();
    }
    @ZenCodeType.Method
    public static String getName(RackType rackType) {
        return rackType.getName();
    }
    @ZenCodeType.Method
    public static String getTranslationKey(RackType rackType) {
        return rackType.getTranslationKey();
    }
    @ZenCodeType.Method
    public static boolean isDoubleVariant(RackType rackType) {
        return rackType.isDoubleVariant();
    }
    @ZenCodeType.Method
    public static RackType getInvBasedVariant(RackType rackType,boolean empty) {
        return rackType.getInvBasedVariant(empty);
    }


    public static String getSerializedName(RackType rackType) {
        return rackType.getSerializedName();
    }
}
