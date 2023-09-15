package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.research.effects;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.research.effects.IResearchEffect;
import com.minecolonies.api.research.effects.IResearchEffectManager;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/research/effects/IResearchEffectManager")
@NativeTypeRegistration(value = IResearchEffectManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.research.effects.IResearchEffectManager")
public class ExpandIResearchEffectManager {

    @ZenCodeType.Method
   public static <W extends IResearchEffect<?>> W getEffect(IResearchEffectManager iResearchEffectManager, ResourceLocation var1, Class<W> var2){
       return iResearchEffectManager.getEffect(var1,var2);
   }
    @ZenCodeType.Method
   public static double getEffectStrength(IResearchEffectManager iResearchEffectManager,ResourceLocation var1){
       return iResearchEffectManager.getEffectStrength(var1);
   }
    @ZenCodeType.Method
   public static <T> void applyEffect(IResearchEffectManager iResearchEffectManager,IResearchEffect<T> var1){
       iResearchEffectManager.applyEffect(var1);
   }
    @ZenCodeType.Method
   public static void removeAllEffects(IResearchEffectManager iResearchEffectManager){
       iResearchEffectManager.removeAllEffects();
   }
}
