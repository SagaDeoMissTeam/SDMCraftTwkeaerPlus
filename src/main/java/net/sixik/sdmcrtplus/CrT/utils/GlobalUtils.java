package net.sixik.sdmcrtplus.CrT.utils;

import com.blamejared.crafttweaker.api.CraftTweakerConstants;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.game.Game;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.mod.Mod;
import com.blamejared.crafttweaker.api.mod.Mods;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializer;
import com.google.gson.stream.JsonWriter;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.fml.ModLoader;
import net.minecraftforge.server.ServerLifecycleHooks;
import org.openzen.zencode.java.ZenCodeType;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

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

    @ZenCodeType.Method
    public static void exportContent(){
        for (Mod mod :Mods.INSTANCE.getMods()) {
            content(mod);
        }
    }


    protected static void content(Mod d1){
        try {
            BufferedWriter content = Files.newBufferedWriter(Path.of(CraftTweakerConstants.SCRIPTS_DIRECTORY + "/exports/"+ d1.displayName() + "/content.json"));
            BufferedWriter mod = Files.newBufferedWriter(Path.of(CraftTweakerConstants.SCRIPTS_DIRECTORY + "/exports/"+ d1.displayName() + "/mod.json"));

            JsonObject contentJSON = new JsonObject();
            JsonObject modJSON = new JsonObject();

            JsonArray item = new JsonArray();
            JsonArray entity = new JsonArray();
            JsonArray block = new JsonArray();
            JsonArray dimension = new JsonArray();
            JsonArray biome = new JsonArray();

            for (IItemStack itemstack :d1.getItemStacks()) {
                item.add((itemstack.getRegistryName().getNamespace() + itemstack.getRegistryName().getPath()));
            }

            for (Map.Entry<ResourceKey<EntityType<?>>, EntityType<?>> entry : ServerLifecycleHooks.getCurrentServer().registryAccess().registryOrThrow(Registry.ENTITY_TYPE_REGISTRY).entrySet()) {
                entity.add((EntityType.getKey(entry.getValue()).getNamespace() + (EntityType.getKey(entry.getValue()).getPath())));
            }
            for (Block blocks :d1.getBlocks()) {
                IItemStack it = IItemStack.of(blocks.asItem().getDefaultInstance());
                block.add((it.getRegistryName().getNamespace() + it.getRegistryName().getPath()));
            }

            modJSON.addProperty("name", d1.displayName());
            modJSON.addProperty("version", d1.version());

            contentJSON.add("entity", entity);
            contentJSON.add("item", item);
            contentJSON.add("block", block);
            contentJSON.add("dimension", dimension);
            contentJSON.add("biome", biome);

            JsonWriter js = new JsonWriter(content);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
