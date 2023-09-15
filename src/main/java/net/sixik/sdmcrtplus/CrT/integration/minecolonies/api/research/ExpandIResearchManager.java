package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.research;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.research.ILocalResearchTree;
import com.minecolonies.api.research.IResearchManager;
import com.minecolonies.api.research.effects.IResearchEffectManager;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/research/IResearchManager")
@NativeTypeRegistration(value = IResearchManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.research.IResearchManager")
public class ExpandIResearchManager {
    @ZenCodeType.Method
   public static void readFromNBT(IResearchManager iResearchManager, CompoundTag var1){
       iResearchManager.readFromNBT(var1);
   }

   @ZenCodeType.Method
   public static void writeToNBT(IResearchManager iResearchManager, CompoundTag var1){
       iResearchManager.writeToNBT(var1);
   }

    @ZenCodeType.Method
   public static ILocalResearchTree getResearchTree(IResearchManager iResearchManager){
       return iResearchManager.getResearchTree();
   }
    @ZenCodeType.Method
   public static IResearchEffectManager getResearchEffects(IResearchManager iResearchManager){
       return iResearchManager.getResearchEffects();
   }
    @ZenCodeType.Method
   public static ResourceLocation getResearchEffectIdFrom(IResearchManager iResearchManager,Block var1){
       return iResearchManager.getResearchEffectIdFrom(var1);
   }
    @ZenCodeType.Method
   public static void checkAutoStartResearch(IResearchManager iResearchManager){
       iResearchManager.checkAutoStartResearch();
   }
}
