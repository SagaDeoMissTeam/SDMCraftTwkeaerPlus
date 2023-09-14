package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.managers.interfaces;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.managers.interfaces.IReproductionManager;
import com.minecolonies.api.colony.managers.interfaces.IStatisticsManager;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Set;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/managers/interfaces/IStatisticsManager")
@NativeTypeRegistration(value = IStatisticsManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.managers.interfaces.IStatisticsManager")
public class ExpandIStatisticsManager {
    @ZenCodeType.Method
   public static void increment(IStatisticsManager iStatisticsManager, String var1){
       iStatisticsManager.increment(var1);
   }
    @ZenCodeType.Method
   public static void incrementBy(IStatisticsManager iStatisticsManager, String var1, int var2){
       iStatisticsManager.incrementBy(var1,var2);
   }
    @ZenCodeType.Method
   public static int getStatTotal(IStatisticsManager iStatisticsManager, String var1){
       return iStatisticsManager.getStatTotal(var1);
   }
    @ZenCodeType.Method
   public static int getStatsInPeriod(IStatisticsManager iStatisticsManager, String var1, int var2, int var3){
       return iStatisticsManager.getStatsInPeriod(var1,var3,var2);
   }

//   public static void serialize(IStatisticsManager iStatisticsManager, FriendlyByteBuf var1){
//       iStatisticsManager.serialize();
//   }

//   public static void deserialize(IStatisticsManager iStatisticsManager, FriendlyByteBuf var1);

//   public static void readFromNBT(IStatisticsManager iStatisticsManager, CompoundTag var1);
//
//   public static void writeToNBT(IStatisticsManager iStatisticsManager, CompoundTag var1);

    @ZenCodeType.Method
   public static Set<String> getStatTypes(IStatisticsManager iStatisticsManager){
       return iStatisticsManager.getStatTypes();
   }
}
