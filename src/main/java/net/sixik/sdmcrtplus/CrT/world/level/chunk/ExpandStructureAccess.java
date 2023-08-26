package net.sixik.sdmcrtplus.CrT.world.level.chunk;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.world.level.chunk.StructureAccess;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/chunk/StructureAccess")
@NativeTypeRegistration(value = StructureAccess.class, zenCodeName = "mods.sdmcrtplus.world.level.StructureAccess")
public class ExpandStructureAccess {

    @ZenCodeType.Method
    public static LongSet getReferencesForStructure(StructureAccess structureAccess, Structure structure){
       return structureAccess.getReferencesForStructure(structure);
    }
    @ZenCodeType.Method
    public static StructureStart getStartForStructure(StructureAccess structureAccess, Structure structure){
       return structureAccess.getStartForStructure(structure);
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("allReferences")
    public static Map<Structure, LongSet> getAllReferences(StructureAccess structureAccess){
       return structureAccess.getAllReferences();
    }
}
