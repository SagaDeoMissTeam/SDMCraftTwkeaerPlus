package net.sixik.sdmcrtplus.CrT.world.level;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/StructureManager")
@NativeTypeRegistration(value = StructureManager.class, zenCodeName = "mods.sdmcrtplus.world.level.StructureManager")
public class ExpandStructureManager {

    @ZenCodeType.Method
    public static Map<Structure, LongSet> getAllStructuresAt(StructureManager structureManager, BlockPos position){
        return structureManager.getAllStructuresAt(position);
    }
    @ZenCodeType.Method
    public static StructureStart getStructureAt(StructureManager structureManager, Structure structure, BlockPos position){
        return structureManager.getStructureAt(position, structure);
    }
    @ZenCodeType.Method
    public static StructureStart getStructureWithPieceAt(StructureManager structureManager, Structure structure, BlockPos position){
        return structureManager.getStructureWithPieceAt(position, structure);
    }
}
