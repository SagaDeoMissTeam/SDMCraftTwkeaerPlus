package net.sixik.sdmcrtplus.CrT.world.level.levelgen.structure.templatesystem;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/levelgen/structure/templatesystem/StructureTemplateManager")
@NativeTypeRegistration(value = StructureTemplateManager.class, zenCodeName = "mods.sdmcrtplus.world.level.levelgen.structure.templatesystem.StructureTemplateManager")
public class ExpandStructureTemplateManager {
    @ZenCodeType.Method
    public static List<ResourceLocation> listTemplates(StructureTemplateManager structureTemplateManager){
        return structureTemplateManager.listTemplates().toList();
    }
    @ZenCodeType.Method
    public static StructureTemplate listTemplates(StructureTemplateManager structureTemplateManager, ResourceLocation location){
        return structureTemplateManager.get(location).get();
    }
    @ZenCodeType.Method
    public static StructureTemplate getOrCreate(StructureTemplateManager structureTemplateManager, ResourceLocation location){
        return structureTemplateManager.getOrCreate(location);
    }
}
