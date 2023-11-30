package net.sixik.sdmcrtplus.CrT.world.level.border;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.border.WorldBorder;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/border/WorldBorderSettings")
@NativeTypeRegistration(value = WorldBorder.Settings.class, zenCodeName = "mods.sdmcrtplus.world.level.border.WorldBorderSettings")
public class ExpandWorldBorderSettings {

    @ZenCodeType.Method
    @ZenCodeType.Getter("centerX")
    public static double getCenterX(WorldBorder.Settings border){
        return border.getCenterX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("centerZ")
    public static double getCenterZ(WorldBorder.Settings border){
        return border.getCenterZ();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("warningBlocks")
    public static int getWarningBlocks(WorldBorder.Settings border){
        return border.getWarningBlocks();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("warningTime")
    public static int getWarningTime(WorldBorder.Settings border){
        return border.getWarningTime();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("damagePerBlock")
    public static double getDamagePerBlock(WorldBorder.Settings border){
        return border.getDamagePerBlock();
    }


    @ZenCodeType.Method
    @ZenCodeType.Getter("sizeLerpTime")
    public static double getSizeLerpTime(WorldBorder.Settings border){
        return border.getSizeLerpTime();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("sizeLerpTarget")
    public static double getLerpTarget(WorldBorder.Settings border){
        return border.getSizeLerpTarget();
    }
}
