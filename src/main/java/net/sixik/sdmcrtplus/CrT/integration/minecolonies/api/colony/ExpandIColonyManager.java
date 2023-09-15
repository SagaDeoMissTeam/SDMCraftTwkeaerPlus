package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.IColonyManager;
import com.minecolonies.api.colony.IColonyView;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.colony.buildings.views.IBuildingView;
import com.minecolonies.api.compatibility.ICompatibilityManager;
import com.minecolonies.api.crafting.IRecipeManager;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.UUID;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/IColonyManager")
@NativeTypeRegistration(value = IColonyManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.IColonyManager")
public class ExpandIColonyManager {

    @ZenCodeType.Method
    public static void write(IColonyManager iColonyManager, CompoundTag var1){
        iColonyManager.write(var1);
    }
    @ZenCodeType.Method
    public static void read(IColonyManager iColonyManager, CompoundTag var1){
        iColonyManager.read(var1);
    }

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IColony createColony(IColonyManager iColonyManager, Level var1, BlockPos var2, Player var3,  String var4,  String var5){
        return iColonyManager.createColony(var1,var2,var3,var4,var5);
    }

    @ZenCodeType.Method
    public static void deleteColonyByWorld(IColonyManager iColonyManager,int var1, boolean var2, Level var3){
        iColonyManager.deleteColonyByWorld(var1,var2,var3);
    }

    @ZenCodeType.Method
    public static void deleteColonyByDimension(IColonyManager iColonyManager,int var1, boolean var2, ResourceKey<Level> var3){
        iColonyManager.deleteColonyByDimension(var1,var2,var3);
    }

    @ZenCodeType.Method
    public static void removeColonyView(IColonyManager iColonyManager,int var1, ResourceKey<Level> var2){
        iColonyManager.removeColonyView(var1,var2);
    }

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IColony getColonyByWorld(IColonyManager iColonyManager, int var1, Level var2){
        return iColonyManager.getColonyByWorld(var1,var2);
    }

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IColony getColonyByDimension(IColonyManager iColonyManager,int var1, ResourceKey<Level> var2){
        return iColonyManager.getColonyByDimension(var1,var2);
    }

    @ZenCodeType.Method
    public static IBuilding getBuilding(IColonyManager iColonyManager, Level var1,  BlockPos var2){
        return iColonyManager.getBuilding(var1,var2);
    }

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IColony getColonyByPosFromWorld(IColonyManager iColonyManager, Level var1, BlockPos var2){
        return iColonyManager.getColonyByPosFromWorld(var1,var2);
    }

    @ZenCodeType.Method
    public static IColony getColonyByPosFromDim(IColonyManager iColonyManager, ResourceKey<Level> var1,  BlockPos var2){
        return iColonyManager.getColonyByPosFromDim(var1,var2);
    }

    @ZenCodeType.Method
    public static boolean isFarEnoughFromColonies(IColonyManager iColonyManager, Level var1, BlockPos var2){
        return iColonyManager.isFarEnoughFromColonies(var1,var2);
    }

    @ZenCodeType.Method
    public static List<IColony> getColonies(IColonyManager iColonyManager, Level var1){
        return iColonyManager.getColonies(var1);
    }

    @ZenCodeType.Method
    public static  List<IColony> getAllColonies(IColonyManager iColonyManager){
        return iColonyManager.getAllColonies();
    }

    @ZenCodeType.Method
    public static  List<IColony> getColoniesAbandonedSince(IColonyManager iColonyManager,int var1){
        return iColonyManager.getColoniesAbandonedSince(var1);
    }

    @ZenCodeType.Method
    public static IBuildingView getBuildingView(IColonyManager iColonyManager,ResourceKey<Level> var1, BlockPos var2){
        return iColonyManager.getBuildingView(var1,var2);
    }

    @ZenCodeType.Method
    public static  IColony getIColony(IColonyManager iColonyManager, Level var1,  BlockPos var2){
        return iColonyManager.getIColony(var1,var2);
    }

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IColony getClosestIColony(IColonyManager iColonyManager, Level var1, BlockPos var2){
        return iColonyManager.getClosestIColony(var1,var2);
    }

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IColonyView getClosestColonyView(IColonyManager iColonyManager, Level var1,  BlockPos var2){
        return iColonyManager.getClosestColonyView(var1,var2);
    }

    @ZenCodeType.Method
    public static  IColony getClosestColony(IColonyManager iColonyManager, Level var1, BlockPos var2){
        return iColonyManager.getClosestColony(var1,var2);
    }

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IColony getIColonyByOwner(IColonyManager iColonyManager, Level var1, Player var2){
        return iColonyManager.getIColonyByOwner(var1,var2);
    }

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IColony getIColonyByOwner(IColonyManager iColonyManager, Level var1, String  var2){
        return iColonyManager.getIColonyByOwner(var1,UUID.fromString(var2));
    }

    @ZenCodeType.Method
    public static int getMinimumDistanceBetweenTownHalls(IColonyManager iColonyManager){
        return iColonyManager.getMinimumDistanceBetweenTownHalls();
    }

    @ZenCodeType.Method
    public static String getServerUUID(IColonyManager iColonyManager){
        return iColonyManager.getServerUUID().toString();
    }


    @ZenCodeType.Method
    public static IColonyView getColonyView(IColonyManager iColonyManager,int var1, ResourceKey<Level> var2){
        return iColonyManager.getColonyView(var1,var2);
    }

    @ZenCodeType.Method
    public static boolean isSchematicDownloaded(IColonyManager iColonyManager){
        return iColonyManager.isSchematicDownloaded();
    }

    @ZenCodeType.Method
    public static void setSchematicDownloaded(IColonyManager iColonyManager,boolean var1){
        iColonyManager.setSchematicDownloaded(var1);
    }

    @ZenCodeType.Method
    public static boolean isCoordinateInAnyColony(IColonyManager iColonyManager, Level var1, BlockPos var2){
        return iColonyManager.isCoordinateInAnyColony(var1,var2);
    }

    @ZenCodeType.Method
    public static ICompatibilityManager getCompatibilityManager(IColonyManager iColonyManager){
        return iColonyManager.getCompatibilityManager();
    }

    @ZenCodeType.Method
    public static IRecipeManager getRecipeManager(IColonyManager iColonyManager){
        return iColonyManager.getRecipeManager();
    }

    @ZenCodeType.Method
    public static int getTopColonyId(IColonyManager iColonyManager){
        return iColonyManager.getTopColonyId();
    }

    @ZenCodeType.Method
    public static void resetColonyViews(IColonyManager iColonyManager){
        iColonyManager.resetColonyViews();
    }
    @ZenCodeType.Method
    public static void openReactivationWindow(IColonyManager iColonyManager,BlockPos var1){
        iColonyManager.openReactivationWindow(var1);
    }
}
