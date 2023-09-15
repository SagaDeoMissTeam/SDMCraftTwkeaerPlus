package net.sixik.sdmcrtplus.CrT.world.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraftforge.common.world.ModifiableStructureInfo;
import net.minecraftforge.common.world.StructureModifier;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/ModifiableStructureInfo")
@NativeTypeRegistration(value = ModifiableStructureInfo.class, zenCodeName = "mods.sdmcrtplus.world.level.ModifiableStructureInfo")
public class ExpandModifiableStructureInfo {

    @ZenCodeType.Method
    public static ModifiableStructureInfo.StructureInfo getStructureInfo(ModifiableStructureInfo structureInfo){
        return structureInfo.get();
    }
    @ZenCodeType.Method
    public static ModifiableStructureInfo.StructureInfo getModifiedStructureInfo(ModifiableStructureInfo structureInfo){
        return structureInfo.getModifiedStructureInfo();
    }
    @ZenCodeType.Method
    public static ModifiableStructureInfo.StructureInfo getOriginalStructureInfo(ModifiableStructureInfo structureInfo){
        return structureInfo.getOriginalStructureInfo();
    }
    @ZenCodeType.Method
    public static void applyStructureModifiers(ModifiableStructureInfo structureInfo, Holder<Structure> structure, List<StructureModifier> structureModifiers){
        structureInfo.applyStructureModifiers(structure, structureModifiers);
    }
}
