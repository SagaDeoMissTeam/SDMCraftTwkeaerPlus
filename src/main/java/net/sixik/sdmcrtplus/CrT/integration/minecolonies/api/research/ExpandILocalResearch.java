package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.research;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.research.ILocalResearch;
import com.minecolonies.api.research.ILocalResearchTree;
import com.minecolonies.api.research.effects.IResearchEffectManager;
import com.minecolonies.api.research.util.ResearchState;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/research/ILocalResearch")
@NativeTypeRegistration(value = ILocalResearch.class, zenCodeName = "mods.sdmcrtplus.integration.api.research.ILocalResearch")
public class ExpandILocalResearch {

    @ZenCodeType.Method
   public static int getProgress(ILocalResearch iLocalResearch){
       return iLocalResearch.getProgress();
   }
    @ZenCodeType.Method
   public static ResourceLocation getId(ILocalResearch iLocalResearch){
       return iLocalResearch.getId();
   }
    @ZenCodeType.Method
   public static ResearchState getState(ILocalResearch iLocalResearch){
       return iLocalResearch.getState();
   }
    @ZenCodeType.Method
   public static ResourceLocation getBranch(ILocalResearch iLocalResearch){
       return iLocalResearch.getBranch();
   }
    @ZenCodeType.Method
   public static int getDepth(ILocalResearch iLocalResearch){
       return iLocalResearch.getDepth();
   }
    @ZenCodeType.Method
   public static void setState(ILocalResearch iLocalResearch,ResearchState var1){
       iLocalResearch.setState(var1);
   }
    @ZenCodeType.Method
   public static void setProgress(ILocalResearch iLocalResearch,int var1){
       iLocalResearch.setProgress(var1);
   }
    @ZenCodeType.Method
   public static boolean research(ILocalResearch iLocalResearch,IResearchEffectManager var1, ILocalResearchTree var2){
       return iLocalResearch.research(var1,var2);
   }
}
