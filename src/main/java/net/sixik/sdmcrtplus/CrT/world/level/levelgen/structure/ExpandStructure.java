package net.sixik.sdmcrtplus.CrT.world.level.levelgen.structure;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.structure.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.minecraftforge.common.world.ModifiableStructureInfo;
import net.minecraftforge.server.ServerLifecycleHooks;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/levelgen/structure/Structure")
@NativeTypeRegistration(value = Structure.class, zenCodeName = "mods.sdmcrtplus.world.level.levelgen.structure.Structure")
public class ExpandStructure {

    @ZenCodeType.Method
    @ZenCodeType.Getter("biomes")
    public static List<Biome> getBiomes(Structure structure){
        List<Biome> list = new ArrayList<>();
        structure.biomes().forEach(s ->{
            list.add(s.get());
        });
        return list;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("registryName")
    public static ResourceLocation getRegistryName(Structure structure){
       Registry<Structure> registry =  ServerLifecycleHooks.getCurrentServer().registryAccess().registryOrThrow(Registry.STRUCTURE_REGISTRY);
       return registry.getKey(structure);
    }
    @ZenCodeType.Method
    public static Map<MobCategory, StructureSpawnOverride> getSpawnOverrides(Structure structure){
        return structure.spawnOverrides();
    }
    @ZenCodeType.Method
    public static Structure.StructureSettings getModifiedStructureSettings(Structure structure){
        return structure.getModifiedStructureSettings();
    }
    @ZenCodeType.Method
    public static ModifiableStructureInfo getModifiableStructureInfo(Structure structure){
        return structure.modifiableStructureInfo();
    }
    @ZenCodeType.Method
    public static StructureStart generate(Structure structure, RegistryAccess registryAccess, ChunkGenerator chunkGenerator, BiomeSource biomeSource, RandomState randomState, StructureTemplateManager structureTemplateManager, long l, ChunkPos chunkPos, int i, LevelHeightAccessor levelHeightAccessor, Predicate<Holder<Biome>> holderPredicate){
        return structure.generate(registryAccess,chunkGenerator,biomeSource, randomState, structureTemplateManager,l, chunkPos,i,levelHeightAccessor,holderPredicate);
    }
    @ZenCodeType.Method
    public static BoundingBox adjustBoundingBox(Structure structure, BoundingBox box){
        return structure.adjustBoundingBox(box);
    }
    @ZenCodeType.Method
    public static GenerationStep.Decoration step(Structure structure){
        return structure.step();
    }
    @ZenCodeType.Method
    public static StructureType<?> type(Structure structure){
        return structure.type();
    }
}
