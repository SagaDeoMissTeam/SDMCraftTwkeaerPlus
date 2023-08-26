package net.sixik.sdmcrtplus.CrT.world.level.levelgen.structure;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/levelgen/structure/StructureStart")
@NativeTypeRegistration(value = StructureStart.class, zenCodeName = "mods.sdmcrtplus.world.level.levelgen.structure.StructureStart")
public class ExpandStructureStart {

    @ZenCodeType.Method
    @ZenCodeType.Getter("isValid")
    public static boolean isValid(StructureStart structureStart){
        return structureStart.isValid();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("structure")
    public static Structure getStructure(StructureStart structureStart){
        return structureStart.getStructure();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("references")
    public static int getReferences(StructureStart structureStart){
        return structureStart.getReferences();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("boundingBox")
    public static BoundingBox getBoundingBox(StructureStart structureStart){
        return structureStart.getBoundingBox();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("pieces")
    public static List<StructurePiece> getPieces(StructureStart structureStart){
        return structureStart.getPieces();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("canBeReferenced")
    public static boolean canBeReferenced(StructureStart structureStart){
        return structureStart.canBeReferenced();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("chunkPos")
    public static ChunkPos getChunkPos(StructureStart structureStart){
        return structureStart.getChunkPos();
    }
}
