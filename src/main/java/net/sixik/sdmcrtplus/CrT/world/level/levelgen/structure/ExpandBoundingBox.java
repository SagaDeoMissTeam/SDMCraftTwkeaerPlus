package net.sixik.sdmcrtplus.CrT.world.level.levelgen.structure;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/levelgen/structure/BoundingBox")
@NativeTypeRegistration(value = BoundingBox.class, zenCodeName = "mods.sdmcrtplus.world.level.levelgen.structure.BoundingBox",
        constructors = {@NativeConstructor(value = @NativeConstructor.ConstructorParameter(
                name = "position", type = BlockPos.class
        )),
        @NativeConstructor(
        value = {@NativeConstructor.ConstructorParameter(
        name = "x1", type = int.class
        ),
        @NativeConstructor.ConstructorParameter(
                name = "y1", type = int.class
        ),
        @NativeConstructor.ConstructorParameter(
                name = "z1", type = int.class
        ),
        @NativeConstructor.ConstructorParameter(
                name = "x2", type = int.class
        ),
        @NativeConstructor.ConstructorParameter(
                name = "y2", type = int.class
        ),
        @NativeConstructor.ConstructorParameter(
                name = "z2", type = int.class
        ),
        })
        })
public class ExpandBoundingBox {

    @ZenCodeType.Method
    @ZenCodeType.Getter("center")
    public static BlockPos getCenter(BoundingBox boundingBox){
        return boundingBox.getCenter();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("minX")
    public static int minX(BoundingBox boundingBox){
        return boundingBox.minX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("minY")
    public static int minY(BoundingBox boundingBox){
        return boundingBox.minY();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("minZ")
    public static int minZ(BoundingBox boundingBox){
        return boundingBox.minZ();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("maxX")
    public static int maxX(BoundingBox boundingBox){
        return boundingBox.maxX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("maxY")
    public static int maxY(BoundingBox boundingBox){
        return boundingBox.maxY();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("maxZ")
    public static int maxZ(BoundingBox boundingBox){
        return boundingBox.maxZ();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("XSpan")
    public static int getXSpan(BoundingBox boundingBox){
        return boundingBox.getXSpan();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("YSpan")
    public static int getYSpan(BoundingBox boundingBox){
        return boundingBox.getYSpan();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("ZSpan")
    public static int getZSpan(BoundingBox boundingBox){
        return boundingBox.getZSpan();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("length")
    public static Vec3i getLength(BoundingBox boundingBox){
        return boundingBox.getLength();
    }
    @ZenCodeType.Method
    public static boolean isInside(BoundingBox boundingBox, BlockPos pos){
        return boundingBox.isInside(pos);
    }
    @ZenCodeType.Method
    public static boolean intersects(BoundingBox boundingBox, BoundingBox box) {
        return boundingBox.intersects(box);
    }
}
