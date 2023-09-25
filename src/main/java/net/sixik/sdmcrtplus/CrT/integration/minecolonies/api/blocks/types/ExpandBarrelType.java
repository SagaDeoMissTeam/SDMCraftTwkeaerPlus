package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.blocks.types;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.blocks.types.BarrelType;
import net.minecraft.world.level.material.MaterialColor;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/blocks/types/BarrelType")
@NativeTypeRegistration(value = BarrelType.class, zenCodeName = "mods.sdmcrtplus.integration.api.blocks.types.BarrelType")
@BracketEnum("minecolonies:building/barrel/type")
public class ExpandBarrelType {

    @ZenCodeType.Method
    public static MaterialColor getMaterialColor(BarrelType type){
        return type.getMaterialColor();
    }
    @ZenCodeType.Method
    public static int getMetadata(BarrelType type){
        return type.getMetadata();
    }
    @ZenCodeType.Method
    public static String getName(BarrelType type){
        return type.getName();
    }
    @ZenCodeType.Method
    public static String getTranslationKey(BarrelType type){
        return type.getTranslationKey();
    }
    @ZenCodeType.Method
    public static String getSerializedName(BarrelType type){
        return type.getSerializedName();
    }
}
