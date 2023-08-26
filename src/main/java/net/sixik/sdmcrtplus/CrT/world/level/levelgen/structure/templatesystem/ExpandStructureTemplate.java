package net.sixik.sdmcrtplus.CrT.world.level.levelgen.structure.templatesystem;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Vec3i;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/levelgen/structure/templatesystem/StructureTemplate")
@NativeTypeRegistration(value = StructureTemplate.class, zenCodeName = "mods.sdmcrtplus.world.level.levelgen.structure.templatesystem.StructureTemplate")
public class ExpandStructureTemplate {

    @ZenCodeType.Method
    public static String getAuthor(StructureTemplate structureTemplate){
        return structureTemplate.getAuthor();
    }
    @ZenCodeType.Method
    public static Vec3i getSize(StructureTemplate structureTemplate){
        return structureTemplate.getSize();
    }
}
