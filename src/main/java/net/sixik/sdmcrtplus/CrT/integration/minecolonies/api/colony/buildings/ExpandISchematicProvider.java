package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.ldtteam.structurize.blockentities.interfaces.IBlueprintDataProviderBE;
import com.minecolonies.api.colony.buildings.ISchematicProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Tuple;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/ISchematicProvider")
@NativeTypeRegistration(value = ISchematicProvider.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.ISchematicProvider")
public class ExpandISchematicProvider {

    @ZenCodeType.Method
   public static BlockPos getPosition(ISchematicProvider iSchematicProvider){
       return iSchematicProvider.getPosition();
   }
    @ZenCodeType.Method
   public static void setCorners(ISchematicProvider iSchematicProvider,BlockPos var1, BlockPos var2){
        iSchematicProvider.setCorners(var2,var2);
    }
    @ZenCodeType.Method
   public static Tuple<BlockPos, BlockPos> getCorners(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.getCorners();
    }
    @ZenCodeType.Method
   public static BlockPos getID(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.getID();
    }
    @ZenCodeType.Method
   public static BlockPos getParent(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.getParent();
    }
    @ZenCodeType.Method
   public static boolean hasParent(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.hasParent();
    }
    @ZenCodeType.Method
   public static void setParent(ISchematicProvider iSchematicProvider,BlockPos var1){
        iSchematicProvider.setParent(var1);
    }
    @ZenCodeType.Method
   public static List<BlockPos> getChildren(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.getChildren().stream().toList();
    }
    @ZenCodeType.Method
   public static int getRotation(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.getRotation();
    }
    @ZenCodeType.Method
   public static String getStructurePack(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.getStructurePack();
    }
    @ZenCodeType.Method
   public static void setStructurePack(ISchematicProvider iSchematicProvider,String var1){
        iSchematicProvider.setStructurePack(var1);
    }
    @ZenCodeType.Method
   public static String getBlueprintPath(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.getBlueprintPath();
    }
    @ZenCodeType.Method
   public static void setBlueprintPath(ISchematicProvider iSchematicProvider,String var1){
        iSchematicProvider.setBlueprintPath(var1);
    }
    @ZenCodeType.Method
   public static int getBuildingLevel(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.getBuildingLevel();
    }
    @ZenCodeType.Method
   public static void setBuildingLevel(ISchematicProvider iSchematicProvider,int var1){
        iSchematicProvider.setBuildingLevel(var1);
    }
    @ZenCodeType.Method
   public static boolean isDirty(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.isDirty();
    }
    @ZenCodeType.Method
   public static void clearDirty(ISchematicProvider iSchematicProvider){
        iSchematicProvider.clearDirty();
    }
    @ZenCodeType.Method
   public static void markDirty(ISchematicProvider iSchematicProvider){
        iSchematicProvider.markDirty();
    }
    @ZenCodeType.Method
   public static void setIsMirrored(ISchematicProvider iSchematicProvider,boolean var1){
        iSchematicProvider.setIsMirrored(var1);
    }
    @ZenCodeType.Method
   public static boolean isMirrored(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.isMirrored();
    }
    @ZenCodeType.Method
   public static String getSchematicName(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.getSchematicName();
    }
    @ZenCodeType.Method
   public static int getMaxBuildingLevel(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.getMaxBuildingLevel();
    }
    @ZenCodeType.Method
   public static boolean isDeconstructed(ISchematicProvider iSchematicProvider){
        return iSchematicProvider.isDeconstructed();
    }
    @ZenCodeType.Method
   public static void setDeconstructed(ISchematicProvider iSchematicProvider){
        iSchematicProvider.setDeconstructed();
    }
    @ZenCodeType.Method
   public static void onUpgradeSchematicTo(ISchematicProvider iSchematicProvider,String var1, String var2, IBlueprintDataProviderBE var3){
        iSchematicProvider.onUpgradeSchematicTo(var2,var2,var3);
    }
}
