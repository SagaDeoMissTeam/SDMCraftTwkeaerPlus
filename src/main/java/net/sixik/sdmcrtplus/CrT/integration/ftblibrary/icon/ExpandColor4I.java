package net.sixik.sdmcrtplus.CrT.integration.ftblibrary.icon;


import com.aizistral.enigmaticlegacy.objects.Vector3;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.mojang.math.Vector3d;
import dev.ftb.mods.ftblibrary.icon.Color4I;
import net.minecraft.world.phys.Vec3;
import org.openzen.zencode.java.ZenCodeType;

/**
 * @docParam this Color4I
 */
@ZenRegister(modDeps = "ftblibrary")
@Document("mods/sdmcrtplus/integration/ftblibrary/icon/Color4I")
@NativeTypeRegistration(value = Color4I.class, zenCodeName = "mods.sdmcrtplus.integration.ftblibrary.icon.Color4I")
public class ExpandColor4I {

    @ZenCodeType.Method
    public static Color4I copy(Color4I color4I, float h, float s, float b){
        return color4I.copy();
    }
//    @ZenCodeType.Method
//    public static Color4I withAlpha(Color4I color4I, int alpha){
//        return color4I.withAlpha(alpha);
//    }
//    @ZenCodeType.Method
//    public static Color4I get256(Color4I color4I, int id){
//        return Color4I.get256(id);
//    }
//    @ZenCodeType.Method
//    public static Color4I addBrightness(Color4I color4I, String string){
//        return Color4I.fromString(string);
//    }
//    @ZenCodeType.Method
//    public static Color4I rgb(Color4I color4I, int col){
//        return Color4I.rgb(col);
//    }
//    @ZenCodeType.Method
//    public static Color4I rgb(Color4I color4I, int r, int g, int b){
//        return Color4I.rgb(r,g,b);
//    }
//    @ZenCodeType.Method
//    public static Color4I rgba(Color4I color4I, int col){
//        return Color4I.rgba(col);
//    }
//    @ZenCodeType.Method
//    public static Color4I rgba(Color4I color4I, int r, int g, int b, int a){
//        return Color4I.rgba(r,g,b, a);
//    }
//    @ZenCodeType.Method
//    public static Color4I rgb(Color4I color4I, Vec3 color){
//        return Color4I.rgb(color);
//    }
}
