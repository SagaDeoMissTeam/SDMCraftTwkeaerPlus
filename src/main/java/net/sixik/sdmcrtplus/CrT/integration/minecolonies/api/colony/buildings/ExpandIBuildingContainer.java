package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.colony.buildings.IBuildingContainer;
import com.minecolonies.api.tileentities.AbstractTileEntityColonyBuilding;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import javax.annotation.Nonnull;
import java.util.List;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/IBuildingContainer")
@NativeTypeRegistration(value = IBuildingContainer.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.IBuildingContainer")
public class ExpandIBuildingContainer {

    @ZenCodeType.Method
    public static void deserializeNBT(IBuildingContainer iBuildingContainer, CompoundTag var1){
        iBuildingContainer.deserializeNBT(var1);
    }
    @ZenCodeType.Method
    public static CompoundTag serializeNBT(IBuildingContainer iBuildingContainer){
        return iBuildingContainer.serializeNBT();
    }

    @ZenCodeType.Method
   public static int getPickUpPriority(IBuildingContainer iBuildingContainer){
       return iBuildingContainer.getPickUpPriority();
   }
    @ZenCodeType.Method
   public static void alterPickUpPriority(IBuildingContainer iBuildingContainer,int var1){
        iBuildingContainer.alterPickUpPriority(var1);
    }
    @ZenCodeType.Method
   public static void addContainerPosition(IBuildingContainer iBuildingContainer, BlockPos var1){
        iBuildingContainer.addContainerPosition(var1);
    }
    @ZenCodeType.Method
   public static void removeContainerPosition(IBuildingContainer iBuildingContainer,BlockPos var1){
        iBuildingContainer.removeContainerPosition(var1);
    }
    @ZenCodeType.Method
   public static List<BlockPos> getContainers(IBuildingContainer iBuildingContainer){
        return iBuildingContainer.getContainers();
    }
    @ZenCodeType.Method
   public static void registerBlockPosition(IBuildingContainer iBuildingContainer, BlockState var1,  BlockPos var2,  Level var3){
        iBuildingContainer.registerBlockPosition(var1,var2,var3);
    }
    @ZenCodeType.Method
   public static void registerBlockPosition(IBuildingContainer iBuildingContainer, Block var1,  BlockPos var2,  Level var3){
        iBuildingContainer.registerBlockPosition(var1,var2,var3);
    }
    @ZenCodeType.Method
   public static AbstractTileEntityColonyBuilding getTileEntity(IBuildingContainer iBuildingContainer){
        return iBuildingContainer.getTileEntity();
    }
    @ZenCodeType.Method
   public static void setTileEntity(IBuildingContainer iBuildingContainer,AbstractTileEntityColonyBuilding var1){
        iBuildingContainer.setTileEntity(var1);
    }

//    /**
//     * @return The found capability. Can't be null !
//     */
//    @ZenCodeType.Method
//   @Nonnull
//   public static <T> LazyOptional<T> getCapability(IBuildingContainer iBuildingContainer, Capability<T> var1, Direction var2){
//        return iBuildingContainer.getCapability(var1,var2);
//    }
}
