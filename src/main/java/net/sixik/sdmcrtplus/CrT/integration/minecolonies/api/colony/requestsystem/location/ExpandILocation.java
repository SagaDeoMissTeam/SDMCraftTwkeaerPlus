package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.requestsystem.location;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.requestsystem.location.ILocation;
import com.minecolonies.api.colony.requestsystem.requester.IRequester;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/requestsystem/location/ILocation")
@NativeTypeRegistration(value = ILocation.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.requestsystem.location.ILocation")
public class ExpandILocation {

    @ZenCodeType.Method
     public static BlockPos getInDimensionLocation(ILocation iLocation){
         return iLocation.getInDimensionLocation();
     }

     @ZenCodeType.Method
     public static ResourceKey<Level> getDimension(ILocation iLocation){
        return iLocation.getDimension();
     }
    @ZenCodeType.Method
    public static boolean isReachableFromLocation(ILocation iLocation, ILocation var1){
        return iLocation.isReachableFromLocation(var1);
    }
}
