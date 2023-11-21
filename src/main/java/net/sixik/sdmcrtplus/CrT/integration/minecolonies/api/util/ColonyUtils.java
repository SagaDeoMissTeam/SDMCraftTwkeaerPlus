package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.util;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.colony.buildings.views.IBuildingView;
import com.minecolonies.api.crafting.IRecipeManager;
import com.minecolonies.api.util.constant.ColonyManagerConstants;
import com.minecolonies.coremod.colony.ColonyManager;
import com.minecolonies.coremod.colony.buildings.registry.BuildingDataManager;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.UUID;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/utils/ColonyUtils")
@ZenCodeType.Name("mods.sdmcrtplus.integration.api.utils.ColonyUtils")
public class ColonyUtils {

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IColony getIColony(Level w, BlockPos pos){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getIColony(w, pos);
    }
    @ZenCodeType.Method
    public static boolean isCoordinateInAnyColony(Level world, BlockPos pos){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.isCoordinateInAnyColony(world, pos);
    }
    @ZenCodeType.Method
    public static boolean isFarEnoughFromColonies( Level w,  BlockPos pos){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.isFarEnoughFromColonies(w, pos);
    }
    @ZenCodeType.Method
    public static boolean isSchematicDownloaded(){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.isSchematicDownloaded();
    }
    @ZenCodeType.Method
    public static int getMinimumDistanceBetweenTownHalls(){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getMinimumDistanceBetweenTownHalls();
    }
    @ZenCodeType.Method
    public static void setCapLoaded(){
        ColonyManager colonyManager = new ColonyManager();
         colonyManager.setCapLoaded();
    }
    @ZenCodeType.Method
    public static void setCapLoaded(String uuid){
        ColonyManager colonyManager = new ColonyManager();
         colonyManager.setServerUUID(UUID.fromString(uuid));
    }
    @ZenCodeType.Method
    public static void setSchematicDownloaded(boolean b){
        ColonyManager colonyManager = new ColonyManager();
         colonyManager.setSchematicDownloaded(b);
    }
    @ZenCodeType.Method
    public static List<IColony> getAllColonies(){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getAllColonies();
    }
    @ZenCodeType.Method
    public static IBuilding getBuilding(Level w, BlockPos pos){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getBuilding(w, pos);
    }
    @ZenCodeType.Method
    public static IBuildingView getBuilding(ResourceKey<Level> dimension, BlockPos pos){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getBuildingView(dimension, pos);
    }
    @ZenCodeType.Method
    public static int getTopColonyId(){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getTopColonyId();
    }
    @ZenCodeType.Method
    public static IRecipeManager getRecipeManager(){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getRecipeManager();
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IColony getIColonyByOwner(Level var1, String uuid){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getIColonyByOwner(var1, UUID.fromString(uuid));
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IColony getIColonyByOwner(Level var1, Player var2){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getIColonyByOwner(var1, var2);
    }
    @ZenCodeType.Method
    public static String getServerUUID(){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getServerUUID().toString();
    }
    @ZenCodeType.Method
    public static IColony getClosestColony(Level w, BlockPos pos){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getClosestColony(w, pos);
    }
    @ZenCodeType.Method
    public static IColony getColonyByDimension(int id, ResourceKey<Level> registryKey){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getColonyByDimension(id, registryKey);
    }
    @ZenCodeType.Method
    public static IColony getClosestColonyView(Level w, BlockPos pos){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getClosestColonyView(w, pos);
    }
    @ZenCodeType.Method
    public static List<IColony> getColoniesAbandonedSince(int abandonedSince){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getColoniesAbandonedSince(abandonedSince);
    }
    @ZenCodeType.Method
    public static List<IColony> getAllColonies(Level level){
        ColonyManager colonyManager = new ColonyManager();
        return colonyManager.getColonies(level);
    }
}
