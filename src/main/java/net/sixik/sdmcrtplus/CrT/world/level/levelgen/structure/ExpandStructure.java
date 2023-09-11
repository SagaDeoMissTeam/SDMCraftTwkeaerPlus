package net.sixik.sdmcrtplus.CrT.world.level.levelgen.structure;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraftforge.server.ServerLifecycleHooks;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;

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
}
