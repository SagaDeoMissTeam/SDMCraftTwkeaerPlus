package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen.citizenhandlers;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenChatHandler;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenColonyHandler;
import net.minecraft.network.syncher.EntityDataAccessor;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/citizenhandlers/ICitizenColonyHandler")
@NativeTypeRegistration(value = ICitizenColonyHandler.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.citizenhandlers.ICitizenColonyHandler")
public class ExpandICitizenColonyHandler {
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IBuilding getWorkBuilding(ICitizenColonyHandler internal){
        return internal.getWorkBuilding();
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IBuilding getHomeBuilding(ICitizenColonyHandler internal){
        return internal.getHomeBuilding();
    }
    @ZenCodeType.Method
    public static void registerWithColony(ICitizenColonyHandler internal,int var1, int var2){
        internal.registerWithColony(var1,var2);
    }
    @ZenCodeType.Method
    public static void updateColonyClient(ICitizenColonyHandler internal){
        internal.updateColonyClient();
    }
    @ZenCodeType.Method
    public static double getPerBuildingFoodCost(ICitizenColonyHandler internal){
        return internal.getPerBuildingFoodCost();
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IColony getColony(ICitizenColonyHandler internal){
        return internal.getColony();
    }
    @ZenCodeType.Method
    public static int getColonyId(ICitizenColonyHandler internal){
        return internal.getColonyId();
    }
    @ZenCodeType.Method
    public static void setColonyId(ICitizenColonyHandler internal,int var1){
        internal.setColonyId(var1);
    }
    @ZenCodeType.Method
    public static void onCitizenRemoved(ICitizenColonyHandler internal){
        internal.onCitizenRemoved();
    }
}
