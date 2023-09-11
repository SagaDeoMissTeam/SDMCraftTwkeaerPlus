package net.sixik.sdmcrtplus.mixin.vanilla.generation;

import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import net.minecraft.world.level.levelgen.structure.pieces.PiecesContainer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import javax.annotation.Nullable;

@Mixin(StructureStart.class)
public abstract class StructureStartMixin {

    @Shadow @Final private PiecesContainer pieceContainer;

    @Shadow @Final private Structure structure;

    @Shadow public abstract Structure getStructure();

    @Shadow @Nullable
    private volatile BoundingBox cachedBoundingBox;

    @Shadow private int references;

//    @Inject(method = "placeInChunk", at = @At("HEAD"), cancellable = true)
//    public void SS$PlaceInChunk(WorldGenLevel worldGenLevel, StructureManager structureManager, ChunkGenerator chunkGenerator, RandomSource randomSource, BoundingBox boundingBox, ChunkPos chunkPos, CallbackInfo ci) {
//        ci.cancel();
//        List<StructurePiece> list = this.pieceContainer.pieces();
//        if (!list.isEmpty()) {
//            BoundingBox boundingbox = (list.get(0)).getBoundingBox();
//            BlockPos blockpos = boundingbox.getCenter();
//            BlockPos blockpos1 = new BlockPos(blockpos.getX(), boundingbox.minY(), blockpos.getZ());
//
//            for(StructurePiece structurepiece : list) {
//                if (structurepiece.getBoundingBox().intersects(boundingBox)) {
//                    structurepiece.postProcess(worldGenLevel, structureManager, chunkGenerator, randomSource, boundingBox, chunkPos, blockpos1);
//                }
//            }
//
//            this.structure.afterPlace(worldGenLevel, structureManager, chunkGenerator, randomSource, boundingBox, chunkPos, this.pieceContainer);
//        }
//    }
}
