package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IColonyTagCapability;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.chunk.LevelChunk;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.Map;
import java.util.Set;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/IColonyTagCapability")
@NativeTypeRegistration(value = IColonyTagCapability.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.IColonyTagCapability")
public class ExpandIColonyTagCapability {

    @ZenCodeType.Method
   public static void removeColony(IColonyTagCapability ic, int var1, LevelChunk var2){
        ic.removeColony(var1,var2);
    }
    @ZenCodeType.Method
   public static void addColony(IColonyTagCapability ic,int var1, LevelChunk var2){
        ic.addColony(var1,var2);
    }
    @ZenCodeType.Method
   public static List<Integer> getStaticClaimColonies(IColonyTagCapability ic){
        return ic.getStaticClaimColonies();
    }
    @ZenCodeType.Method
   public static void setOwningColony(IColonyTagCapability ic,int var1, LevelChunk var2){
        ic.setOwningColony(var1,var2);
    }
    @ZenCodeType.Method
   public static int getOwningColony(IColonyTagCapability ic){
        return ic.getOwningColony();
    }
    @ZenCodeType.Method
   public static void reset(IColonyTagCapability ic,LevelChunk var1){
        ic.reset(var1);
    }
    @ZenCodeType.Method
   public static void addBuildingClaim(IColonyTagCapability ic,int var1, BlockPos var2, LevelChunk var3){
        ic.addBuildingClaim(var1,var2,var3);
    }
    @ZenCodeType.Method
   public static void removeBuildingClaim(IColonyTagCapability ic,int var1, BlockPos var2, LevelChunk var3){
        ic.removeBuildingClaim(var1,var2,var3);
    }
    @ZenCodeType.Method
   public static void setCloseColonies(IColonyTagCapability ic,List<Integer> var1){
        ic.setCloseColonies(var1);
    }
    @ZenCodeType.Method
   public static Map<Integer, Set<BlockPos>> getAllClaimingBuildings(IColonyTagCapability ic){
        return ic.getAllClaimingBuildings();
    }
}
