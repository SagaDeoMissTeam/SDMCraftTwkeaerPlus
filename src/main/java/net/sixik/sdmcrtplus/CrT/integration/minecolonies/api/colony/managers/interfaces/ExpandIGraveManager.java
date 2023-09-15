package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.managers.interfaces;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.managers.interfaces.IGraveManager;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/managers/interfaces/IGraveManager")
@NativeTypeRegistration(value = IGraveManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.managers.interfaces.IGraveManager")
public class ExpandIGraveManager {

    @ZenCodeType.Method
   public static void onColonyTick(IGraveManager iGraveManager, IColony var1){
       iGraveManager.onColonyTick(var1);
   }
    @ZenCodeType.Method
   public static boolean reserveGrave(IGraveManager iGraveManager,BlockPos var1){
       return iGraveManager.reserveGrave(var1);
   }
    @ZenCodeType.Method
   public static void unReserveGrave(IGraveManager iGraveManager,BlockPos var1){
       iGraveManager.unReserveGrave(var1);
   }
    @ZenCodeType.Method
   public static BlockPos reserveNextFreeGrave(IGraveManager iGraveManager){
       return iGraveManager.reserveNextFreeGrave();
   }
    @ZenCodeType.Method
   public static void createCitizenGrave(IGraveManager iGraveManager,Level var1, BlockPos var2, ICitizenData var3){
       iGraveManager.createCitizenGrave(var1,var2,var3);
   }
    @ZenCodeType.Method
   public static Map<BlockPos, Boolean> getGraves(IGraveManager iGraveManager){
       return iGraveManager.getGraves();
   }
    @ZenCodeType.Method
   public static @ZenCodeType.Nullable boolean addNewGrave(IGraveManager iGraveManager, BlockPos var1){
       return iGraveManager.addNewGrave(var1);
   }
    @ZenCodeType.Method
   public static void removeGrave(IGraveManager iGraveManager, BlockPos var1){
       iGraveManager.removeGrave(var1);
   }

    @ZenCodeType.Method
   public static void read(IGraveManager iGraveManager, CompoundTag var1){
        iGraveManager.read(var1);
   }

   @ZenCodeType.Method
   public static void write(IGraveManager iGraveManager, CompoundTag var1){
        iGraveManager.write(var1);
   }
}
