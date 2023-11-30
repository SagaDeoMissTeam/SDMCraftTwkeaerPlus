package net.sixik.sdmcrtplus.CrT.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.core.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.LevelChunk;
import org.openzen.zencode.java.ZenCodeType;

/**
 * @docParam this level
 */
@ZenRegister
@Document("mods/sdmcrtplus/world/ExpandLevel")
@ZenCodeType.Expansion("crafttweaker.api.world.Level")
public class ExpandLevel {

//    @ZenCodeType.Method
//    public static ChunkAccess getChunk(Level level, BlockPos pos){
//        return level.getChunk(pos);
//    }
    @ZenCodeType.Method
    public static LevelChunk getChunk(Level level, int x, int z){
        return level.getChunk(x,z);
    }

    /**
     Returns random coordinates from x1,z1 to x2,z2
     */
    @ZenCodeType.Method
    public static BlockPos getBlockRandomPos(Level level, int x1, int z1, int x2, int z2){
        return level.getBlockRandomPos(x1,z1, x2,z2);
    }


    public static void test(MinecraftServer level){

    }

}
