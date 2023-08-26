//package net.sixik.sdmcrtplus.CrT.world.level.chunk;
//
//import com.blamejared.crafttweaker.api.annotation.ZenRegister;
//import com.blamejared.crafttweaker_annotations.annotations.Document;
//import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
//import net.minecraft.core.BlockPos;
//import net.minecraft.nbt.CompoundTag;
//import net.minecraft.world.level.ChunkPos;
//import net.minecraft.world.level.chunk.ChunkAccess;
//import net.minecraft.world.level.levelgen.structure.Structure;
//import net.minecraft.world.level.levelgen.structure.StructureStart;
//import org.openzen.zencode.java.ZenCodeType;
//
//import java.util.Map;
//import java.util.Set;
//
//@ZenRegister
//@Document("mods/sdmcrtplus/world/level/chunk/ChunkAccess")
//@NativeTypeRegistration(value = ChunkAccess.class, zenCodeName = "mods.sdmcrtplus.world.level.ChunkAccess")
//public class ExpandChunkAccess {
//
//    @ZenCodeType.Method
//    public static Map<Structure, StructureStart> getAllStarts(ChunkAccess chunkAccess){
//        return chunkAccess.getAllStarts();
//    }
//    @ZenCodeType.Method
//    public static CompoundTag getBlockEntityNbt(ChunkAccess chunkAccess, BlockPos pos){
//        return chunkAccess.getBlockEntityNbt(pos);
//    }
//    @ZenCodeType.Method
//    public static Set<BlockPos> getBlockEntitiesPos(ChunkAccess chunkAccess){
//        return chunkAccess.getBlockEntitiesPos();
//    }
//    @ZenCodeType.Method
//    public static ChunkPos getPos(ChunkAccess chunkAccess){
//        return chunkAccess.getPos();
//    }
//}
