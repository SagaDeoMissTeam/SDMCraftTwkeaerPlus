package net.sixik.sdmcrtplus.CrT.integration.ftblibrary.icon;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftblibrary.icon.Color4I;
import net.minecraft.world.phys.Vec3;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftblibrary")
@Document("mods/sdmcrtplus/integration/ftblibrary/icon/Color4IBuilder")
@ZenCodeType.Name("mods.sdmcrtplus.integration.ftblibrary.icon.Color4IBuilder")
public class Color4IBuilder {

    @ZenCodeType.Method
    public static Color4I hsb(float h, float s, float b){
        return Color4I.hsb(h,s,b);
    }
    @ZenCodeType.Method
    public static Color4I get256( int id){
        return Color4I.get256(id);
    }
    @ZenCodeType.Method
    public static Color4I addBrightness( String string){
        return Color4I.fromString(string);
    }
    @ZenCodeType.Method
    public static Color4I rgb( int col){
        return Color4I.rgb(col);
    }
    @ZenCodeType.Method
    public static Color4I rgb( int r, int g, int b){
        return Color4I.rgb(r,g,b);
    }
    @ZenCodeType.Method
    public static Color4I rgba( int col){
        return Color4I.rgba(col);
    }
    @ZenCodeType.Method
    public static Color4I rgba( int r, int g, int b, int a){
        return Color4I.rgba(r,g,b, a);
    }
    @ZenCodeType.Method
    public static Color4I rgb(Vec3 color){
        return Color4I.rgb(color);
    }
}
