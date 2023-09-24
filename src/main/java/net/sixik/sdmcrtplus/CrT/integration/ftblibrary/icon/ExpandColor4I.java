package net.sixik.sdmcrtplus.CrT.integration.ftblibrary.icon;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftblibrary.icon.Color4I;
import org.openzen.zencode.java.ZenCodeType;

/**
 * @docParam this Color4I
 */
@ZenRegister(modDeps = "ftblibrary")
@Document("mods/sdmcrtplus/integration/ftblibrary/icon/Color4I")
@NativeTypeRegistration(value = Color4I.class, zenCodeName = "mods.sdmcrtplus.integration.ftblibrary.icon.Color4I")
public class ExpandColor4I {

    @ZenCodeType.Method
    public static Color4I copy(Color4I color4I){
        return color4I.copy();
    }
    @ZenCodeType.Method
    public static Color4I lerp(Color4I color4I, Color4I col, float m){
        return color4I.lerp(col, m);
    }
    @ZenCodeType.Method
    public static int rgb(Color4I color4I){
        return color4I.rgb();
    }
    @ZenCodeType.Method
    public static int alphai(Color4I color4I){
        return color4I.alphai();
    }
    @ZenCodeType.Method
    public static int rgba(Color4I color4I){
        return color4I.rgba();
    }
    @ZenCodeType.Method
    public static Color4I addBrightness(Color4I color4I, float percent){
        return color4I.addBrightness(percent);
    }
    @ZenCodeType.Method
    public static Color4I withAlpha(Color4I color4I, int percent){
        return color4I.withAlpha(percent);
    }
    @ZenCodeType.Method
    public static Color4I withAlphaf(Color4I color4I, float percent){
        return color4I.withAlphaf(percent);
    }
    @ZenCodeType.Method
    public static Color4I withTint(Color4I color4I, Color4I col){
        return color4I.withTint(col);
    }
}
