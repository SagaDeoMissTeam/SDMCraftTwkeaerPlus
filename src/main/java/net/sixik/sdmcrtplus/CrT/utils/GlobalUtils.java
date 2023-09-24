package net.sixik.sdmcrtplus.CrT.utils;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraftforge.server.ServerLifecycleHooks;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ZenRegister
@Document("mods/sdmcrtplus/utils/GlobalUtils")
@ZenCodeType.Name("mods.sdmcrtplus.utils.GlobalUtils")
public class GlobalUtils {

    /**
     Allows you to get the Server from anywhere in the script.
     */
    @ZenCodeType.Method
    public static MinecraftServer getServer(){
        return ServerLifecycleHooks.getCurrentServer();
    }

    @ZenCodeType.Method
    public static List<ResourceLocation> getStructuresName(){
        List<ResourceLocation> strucutres = new ArrayList<>();
        Registry<Structure> registry = ServerLifecycleHooks.getCurrentServer().registryAccess().registryOrThrow(Registry.STRUCTURE_REGISTRY);
        for(Structure structure : registry){
            strucutres.add(registry.getKey(structure));
        }
        return strucutres;
    }
    @ZenCodeType.Method
    public static List<Structure> getStructures(){
        List<Structure> strucutres = new ArrayList<>();
        Registry<Structure> registry = ServerLifecycleHooks.getCurrentServer().registryAccess().registryOrThrow(Registry.STRUCTURE_REGISTRY);
        for(Structure structure : registry){
            strucutres.add(structure);
        }
        return strucutres;
    }

    @ZenCodeType.Method
    public static String UUIDToString(UUID uuid){
        return uuid.toString();
    }

    @ZenCodeType.Method
    public static UUID UUIDFromString(String uuid){
        return UUID.fromString(uuid);
    }
    @ZenCodeType.Method
    public static UUID UUIDRandomUUID(){
        return UUID.randomUUID();
    }
}
