package net.sixik.sdmcrtplus.CrT.world.level.levelgen.structure;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/levelgen/structure/StructurePiece")
@NativeTypeRegistration(value = StructurePiece.class, zenCodeName = "mods.sdmcrtplus.world.level.levelgen.structure.StructurePiece")
public class ExpandStructurePiece {

    @ZenCodeType.Method
    @ZenCodeType.Getter("boundingBox")
    public static BoundingBox getBoundingBox(StructurePiece structurePiece){
        return structurePiece.getBoundingBox();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("genDeth")
    public static int getGenDepth(StructurePiece structurePiece){
        return structurePiece.getGenDepth();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("orientation")
    public static Direction getOrientation(StructurePiece structurePiece){
        return structurePiece.getOrientation();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("locatorPosition")
    public static BlockPos getLocatorPosition(StructurePiece structurePiece){
        return structurePiece.getLocatorPosition();
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("locatorPosition")
    public static void setOrientation(StructurePiece structurePiece, Direction direction){
        structurePiece.setOrientation(direction);
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("orientation")
    public static void setOrientation(StructurePiece structurePiece, int Depth){
        structurePiece.setGenDepth(Depth);
    }
}
