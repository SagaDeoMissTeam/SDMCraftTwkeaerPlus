package net.sixik.sdmcrtplus.CrT.world.level.border;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.border.BorderStatus;
import net.minecraft.world.level.border.WorldBorder;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/border/WorldBorder")
@NativeTypeRegistration(value = WorldBorder.class, zenCodeName = "mods.sdmcrtplus.world.level.border.WorldBorder")
public class ExpandWorldBorder {

    @ZenCodeType.Method
    public static void applySettings(WorldBorder border, WorldBorder.Settings settings){
        border.applySettings(settings);
    }
    @ZenCodeType.Method
    public static void setCenter(WorldBorder border, double x, double z){
        border.setCenter(x,z);
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("damagePerBlock")
    public static void setDamagePerBlock(WorldBorder border, double damage){
        border.setDamagePerBlock(damage);
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("warningBlocks")
    public static void setWarningBlocks(WorldBorder border, int distance){
        border.setWarningBlocks(distance);
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("size")
    public static void setSize(WorldBorder border, double size){
        border.setSize(size);
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("absoluteMaxSize")
    public static void setAbsoluteMaxSize(WorldBorder border, int size){
        border.setAbsoluteMaxSize(size);
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("damageSafeZone")
    public static void setDamageSafeZone(WorldBorder border, double zone){
        border.setDamageSafeZone(zone);
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("warningTime")
    public static void setWarningTime(WorldBorder border, int time){
        border.setWarningTime(time);
    }
    @ZenCodeType.Method
    public static boolean isInsideCloseToBorder(WorldBorder border, Entity entity, AABB aabb){
       return border.isInsideCloseToBorder(entity, aabb);
    }
    @ZenCodeType.Method
    public static boolean isWithinBounds(WorldBorder border, AABB aabb){
        return border.isWithinBounds(aabb);
    }
    @ZenCodeType.Method
    public static boolean isWithinBounds(WorldBorder border, BlockPos pos){
        return border.isWithinBounds(pos);
    }
    @ZenCodeType.Method
    public static boolean isWithinBounds(WorldBorder border, ChunkPos pos){
        return border.isWithinBounds(pos);
    }
    @ZenCodeType.Method
    public static boolean isWithinBounds(WorldBorder border, double x, double z){
        return border.isWithinBounds(x,z);
    }
    @ZenCodeType.Method
    public static boolean isWithinBounds(WorldBorder border, double x, double y, double z){
        return border.isWithinBounds(x, y,z);
    }
    @ZenCodeType.Method
    public static double getDistanceToBorder(WorldBorder border, Entity entity){
        return border.getDistanceToBorder(entity);
    }
    @ZenCodeType.Method
    public static double getDistanceToBorder(WorldBorder border, double x, double z){
        return border.getDistanceToBorder(x,z);
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("centerX")
    public static double getCenterX(WorldBorder border){
        return border.getCenterX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("centerZ")
    public static double getCenterZ(WorldBorder border){
        return border.getCenterZ();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("maxX")
    public static double getMaxX(WorldBorder border){
        return border.getMaxX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("maxZ")
    public static double getMaxZ(WorldBorder border){
        return border.getMaxZ();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("absoluteMaxSize")
    public static int getAbsoluteMaxSize(WorldBorder border){
        return border.getAbsoluteMaxSize();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("warningBlocks")
    public static int getWarningBlocks(WorldBorder border){
        return border.getWarningBlocks();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("warningTime")
    public static int getWarningTime(WorldBorder border){
        return border.getWarningTime();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("damagePerBlock")
    public static double getDamagePerBlock(WorldBorder border){
        return border.getDamagePerBlock();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("damageSafeZone")
    public static double getDamageSafeZone(WorldBorder border){
        return border.getDamageSafeZone();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("minX")
    public static double getMinX(WorldBorder border){
        return border.getMinX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("minZ")
    public static double getMinZ(WorldBorder border){
        return border.getMinZ();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("lerpRemainingTime")
    public static long getLerpRemainingTime(WorldBorder border){
        return border.getLerpRemainingTime();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("lerpSpeed")
    public static double getLerpSpeed(WorldBorder border){
        return border.getLerpSpeed();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("lerpTarget")
    public static double getLerpTarget(WorldBorder border){
        return border.getLerpTarget();
    }
//    @ZenCodeType.Method
//    @ZenCodeType.Getter("collision")
//    public static VoxelShape getCollisionShape(WorldBorder border){
//        return border.getCollisionShape();
//    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("status")
    public static BorderStatus getStatus(WorldBorder border){
        return border.getStatus();
    }
}
