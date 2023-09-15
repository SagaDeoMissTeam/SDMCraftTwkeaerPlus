package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.happiness;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.entity.citizen.AbstractCivilianEntity;
import com.minecolonies.api.entity.citizen.happiness.IHappinessModifier;
import net.minecraft.nbt.CompoundTag;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/happiness/IHappinessModifier")
@NativeTypeRegistration(value = IHappinessModifier.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.happiness.IHappinessModifier")
public class ExpandIHappinessModifier {

@ZenCodeType.Method
   public static String getId(IHappinessModifier iHappinessModifier){
       return iHappinessModifier.getId();
   }
    @ZenCodeType.Method
   public static double getFactor(IHappinessModifier iHappinessModifier,@Nullable ICitizenData var1){
       return iHappinessModifier.getFactor(var1);
   }
    @ZenCodeType.Method
   public static double getWeight(IHappinessModifier iHappinessModifier){
       return iHappinessModifier.getWeight();
   }
    @ZenCodeType.Method
    public static void read(IHappinessModifier iHappinessModifier,CompoundTag var1){
        iHappinessModifier.read(var1);
    }
    @ZenCodeType.Method
    public static void write(IHappinessModifier iHappinessModifier,CompoundTag var1){
        iHappinessModifier.write(var1);
    }

}
