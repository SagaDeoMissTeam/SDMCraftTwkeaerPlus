package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.research;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.research.IGlobalResearch;
import com.minecolonies.api.research.ILocalResearch;
import com.minecolonies.api.research.ILocalResearchTree;
import com.minecolonies.api.research.IResearchManager;
import com.minecolonies.api.research.effects.IResearchEffectManager;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/research/ILocalResearchTree")
@NativeTypeRegistration(value = ILocalResearchTree.class, zenCodeName = "mods.sdmcrtplus.integration.api.research.ILocalResearchTree")
public class ExpandILocalResearchTree {
    @ZenCodeType.Method
   public static ILocalResearch getResearch(ILocalResearchTree iLocalResearchTree, ResourceLocation var1, ResourceLocation var2){
        return iLocalResearchTree.getResearch(var1,var2);
   }
    @ZenCodeType.Method
   public static void addResearch(ILocalResearchTree iLocalResearchTree,ResourceLocation var1, ILocalResearch var2){
       iLocalResearchTree.addResearch(var1,var2);
   }
    @ZenCodeType.Method
   public static boolean branchFinishedHighestLevel(ILocalResearchTree iLocalResearchTree,ResourceLocation var1){
       return iLocalResearchTree.branchFinishedHighestLevel(var1);
   }
    @ZenCodeType.Method
   public static List<ILocalResearch> getResearchInProgress(ILocalResearchTree iLocalResearchTree){
       return iLocalResearchTree.getResearchInProgress();
   }
    @ZenCodeType.Method
   public static boolean hasCompletedResearch(ILocalResearchTree iLocalResearchTree,ResourceLocation var1){
       return iLocalResearchTree.hasCompletedResearch(var1);
   }
    @ZenCodeType.Method
   public static void finishResearch(ILocalResearchTree iLocalResearchTree,ResourceLocation var1){
       iLocalResearchTree.finishResearch(var1);
   }
    @ZenCodeType.Method
   public static void attemptBeginResearch(ILocalResearchTree iLocalResearchTree,Player var1, IColony var2, IGlobalResearch var3){
       iLocalResearchTree.attemptBeginResearch(var1,var2,var3);
   }
    @ZenCodeType.Method
   public static void attemptResetResearch(ILocalResearchTree iLocalResearchTree, Player var1, @ZenCodeType.Nullable IColony var2, ILocalResearch var3){
       iLocalResearchTree.attemptResetResearch(var1,var2,var3);
   }

//   public static void writeToNBT(CompoundTag var1);
//
//   public static void readFromNBT(CompoundTag var1, IResearchEffectManager var2);
}
