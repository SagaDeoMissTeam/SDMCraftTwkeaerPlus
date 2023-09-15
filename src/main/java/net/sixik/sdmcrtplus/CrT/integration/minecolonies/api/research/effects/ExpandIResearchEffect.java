package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.research.effects;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.research.effects.IResearchEffect;
import com.minecolonies.api.research.effects.registry.ResearchEffectEntry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/research/effects/IResearchEffect")
@NativeTypeRegistration(value = IResearchEffect.class, zenCodeName = "mods.sdmcrtplus.integration.api.research.effects.IResearchEffect")
public class ExpandIResearchEffect<T> {

    @ZenCodeType.Method
   public static <T> T getEffect(IResearchEffect<T> iResearchEffect){
       return iResearchEffect.getEffect();
   }
    @ZenCodeType.Method
   public static <T> void setEffect(IResearchEffect<T> iResearchEffect, T var1){
       iResearchEffect.setEffect(var1);
   }
    @ZenCodeType.Method
   public static <T> ResourceLocation getId(IResearchEffect<T> iResearchEffect){
       return iResearchEffect.getId();
   }
    @ZenCodeType.Method
   public static <T> TranslatableContents getDesc(IResearchEffect<T> iResearchEffect){
       return iResearchEffect.getDesc();
   }
    @ZenCodeType.Method
   public static <T> TranslatableContents getSubtitle(IResearchEffect<T> iResearchEffect){
       return iResearchEffect.getSubtitle();
   }
    @ZenCodeType.Method
   public static <T> boolean overrides(IResearchEffect<T> iResearchEffect, IResearchEffect<T> var1){
       return iResearchEffect.overrides(var1);
   }
    @ZenCodeType.Method
   public static <T> ResearchEffectEntry getRegistryEntry(IResearchEffect<T> iResearchEffect){
       return iResearchEffect.getRegistryEntry();
   }

   @ZenCodeType.Method
   public static <T> CompoundTag writeToNBT(IResearchEffect<T> iResearchEffect){
        return iResearchEffect.writeToNBT();
   }
}
