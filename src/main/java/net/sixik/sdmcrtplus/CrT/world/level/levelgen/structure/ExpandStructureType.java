package net.sixik.sdmcrtplus.CrT.world.level.levelgen.structure;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import net.minecraft.world.level.levelgen.structure.StructureType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/levelgen/structure/StructureType")
@NativeTypeRegistration(value = StructureType.class, zenCodeName = "mods.sdmcrtplus.world.level.levelgen.structure.StructureType")
public class ExpandStructureType <S extends Structure> {

}
