package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.IColonyManager;
import com.minecolonies.api.colony.IColonyTagCapability;
import com.minecolonies.api.util.Log;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.chunk.LevelChunk;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import java.util.*;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/IColonyTagCapabilityImpl")
@NativeTypeRegistration(value = IColonyTagCapability.Impl.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.IColonyTagCapabilityImpl")
public class ExpandIColonyTagCapabilityImpl {

    @ZenCodeType.Method
    public static List<Integer> getStaticClaimColonies(IColonyTagCapability.Impl ic){
        return ic.getStaticClaimColonies();
    }
    @ZenCodeType.Method
    public static int getOwningColony(IColonyTagCapability.Impl ic){
        return ic.getOwningColony();
    }
    @ZenCodeType.Method
    public static  Map<Integer, Set<BlockPos>> getAllClaimingBuildings(IColonyTagCapability.Impl ic){
        return ic.getAllClaimingBuildings();
    }
    @ZenCodeType.Method
    public static void addColony(IColonyTagCapability.Impl ic,int id, LevelChunk chunk) {
        ic.addColony(id,chunk);
    }
    @ZenCodeType.Method
    public static void removeColony(IColonyTagCapability.Impl ic,int id, LevelChunk chunk) {
        ic.removeColony(id,chunk);
    }
    @ZenCodeType.Method
    public static void setCloseColonies(IColonyTagCapability.Impl ic,List<Integer> colonies) {
        ic.setCloseColonies(colonies);
    }
    @ZenCodeType.Method
    public static void reset(IColonyTagCapability.Impl ic,LevelChunk chunk) {
        ic.reset(chunk);
    }
    @ZenCodeType.Method
    public static void addBuildingClaim(IColonyTagCapability.Impl ic,int colonyId, BlockPos pos, LevelChunk chunk) {
        ic.addBuildingClaim(colonyId,pos,chunk);
    }
    @ZenCodeType.Method
    public static void removeBuildingClaim(IColonyTagCapability.Impl ic,int colonyId, BlockPos pos, LevelChunk chunk) {
        ic.removeBuildingClaim(colonyId,pos,chunk);
    }
    @ZenCodeType.Method
    public static void setOwningColony(IColonyTagCapability.Impl ic,int id, LevelChunk chunk) {
        ic.setOwningColony(id,chunk);
    }


}
