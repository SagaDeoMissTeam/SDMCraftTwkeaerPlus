package net.sixik.sdmcrtplus.CrT.world.level.levelgen.structure;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.levelgen.structure.StructureSpawnOverride;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/levelgen/structure/BoundingBoxType")
@NativeTypeRegistration(value = StructureSpawnOverride.BoundingBoxType.class, zenCodeName = "mods.sdmcrtplus.world.level.levelgen.structure.BoundingBoxType")
@BracketEnum("structures:boundingbox/type")
public class ExpandBoundingBoxType {

    @ZenCodeType.Method
    public static String getSerializedName(StructureSpawnOverride.BoundingBoxType boundingBoxType){
       return boundingBoxType.getSerializedName();
    }
}
