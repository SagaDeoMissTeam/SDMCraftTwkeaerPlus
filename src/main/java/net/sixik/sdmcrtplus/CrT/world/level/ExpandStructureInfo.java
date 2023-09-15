package net.sixik.sdmcrtplus.CrT.world.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraftforge.common.world.ModifiableStructureInfo;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/StructureInfo")
@NativeTypeRegistration(value = ModifiableStructureInfo.StructureInfo.class, zenCodeName = "mods.sdmcrtplus.world.level.StructureInfo")
public class ExpandStructureInfo {

    @ZenCodeType.Method
    public static Structure.StructureSettings getStructureSettings(ModifiableStructureInfo.StructureInfo structureInfo){
        return structureInfo.structureSettings();
    }
}
