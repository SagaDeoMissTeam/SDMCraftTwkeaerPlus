package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.research.effects;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.research.effects.IResearchEffect;
import com.minecolonies.api.research.effects.registry.ResearchEffectEntry;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/research/effects/IResearchEffect")
@NativeTypeRegistration(value = IResearchEffect.class, zenCodeName = "mods.sdmcrtplus.integration.api.research.effects.IResearchEffect")
public class ExpandIResearchEffect<T> {

    @ZenCodeType.Method
   public static Object getEffect(IResearchEffect<?> iResearchEffect){
       return iResearchEffect.getEffect();
   }
    @ZenCodeType.Method
   public static void setEffect(IResearchEffect<Object> iResearchEffect, Object var1){
       iResearchEffect.setEffect(var1);
   }
    @ZenCodeType.Method
   public static ResourceLocation getId(IResearchEffect<?> iResearchEffect){
       return iResearchEffect.getId();
   }
    @ZenCodeType.Method
   public static TranslatableContents getDesc(IResearchEffect<?> iResearchEffect){
       return iResearchEffect.getDesc();
   }
    @ZenCodeType.Method
   public static TranslatableContents getSubtitle(IResearchEffect<?> iResearchEffect){
       return iResearchEffect.getSubtitle();
   }
    @ZenCodeType.Method
   public static boolean overrides(IResearchEffect<?> iResearchEffect, IResearchEffect<?> var1){
       return iResearchEffect.overrides(var1);
   }
    @ZenCodeType.Method
   public static ResearchEffectEntry getRegistryEntry(IResearchEffect<?> iResearchEffect){
       return iResearchEffect.getRegistryEntry();
   }

//   public static CompoundTag writeToNBT(IResearchEffect iResearchEffect);
}
