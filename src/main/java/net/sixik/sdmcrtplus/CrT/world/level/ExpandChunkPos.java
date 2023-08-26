package net.sixik.sdmcrtplus.CrT.world.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/ChunkPos")
@NativeTypeRegistration(value = ChunkPos.class, zenCodeName = "mods.sdmcrtplus.world.level.ChunkPos")
public class ExpandChunkPos {

    @ZenCodeType.Getter("x")
    @ZenCodeType.Method
    public static int getX(ChunkPos chunkPos){
        return chunkPos.x;
    }
    @ZenCodeType.Getter("z")
    @ZenCodeType.Method
    public static int getz(ChunkPos chunkPos){
        return chunkPos.z;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("maxBlockX")
    public static int getMaxBlockX(ChunkPos chunkPos){
        return chunkPos.getMaxBlockX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("maxBlockZ")
    public static int getMaxBlockZ(ChunkPos chunkPos){
        return chunkPos.getMaxBlockZ();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("minBlockX")
    public static int getMinBlockX(ChunkPos chunkPos){
        return chunkPos.getMinBlockX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("minBlockZ")
    public static int getMinBlockZ(ChunkPos chunkPos){
        return chunkPos.getMinBlockZ();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("middleBlockX")
    public static int getMiddleBlockX(ChunkPos chunkPos){
        return chunkPos.getMiddleBlockX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("middleBlockZ")
    public static int getMiddleBlockZ(ChunkPos chunkPos){
        return chunkPos.getMiddleBlockZ();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("regionLocalX")
    public static int getRegionLocalX(ChunkPos chunkPos){
        return chunkPos.getRegionLocalX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("regionLocalZ")
    public static int getRegionLocalZ(ChunkPos chunkPos){
        return chunkPos.getRegionLocalZ();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("regionX")
    public static int getRegionX(ChunkPos chunkPos){
        return chunkPos.getRegionX();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("regionZ")
    public static int getRegionZ(ChunkPos chunkPos){
        return chunkPos.getRegionZ();
    }
    @ZenCodeType.Method
    public static BlockPos getMiddleBlockPosition(ChunkPos chunkPos, int pos){
        return chunkPos.getMiddleBlockPosition(pos);
    }
    @ZenCodeType.Method
    public static BlockPos getWorldPosition(ChunkPos chunkPos){
        return chunkPos.getWorldPosition();
    }
}
