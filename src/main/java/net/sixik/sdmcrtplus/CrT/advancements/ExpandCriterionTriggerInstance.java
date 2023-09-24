package net.sixik.sdmcrtplus.CrT.advancements;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.google.gson.JsonObject;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.critereon.SerializationContext;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.AgeableMob;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/advancements/CriterionTriggerInstance")
@NativeTypeRegistration(value = CriterionTriggerInstance.class, zenCodeName = "mods.sdmcrtplus.advancements.CriterionTriggerInstance")
public class ExpandCriterionTriggerInstance {

    @ZenCodeType.Method
   public static ResourceLocation getCriterion(CriterionTriggerInstance criterionTriggerInstance){
       return criterionTriggerInstance.getCriterion();
   }
   @ZenCodeType.Method
   public static JsonObject serializeToJson(CriterionTriggerInstance criterionTriggerInstance,SerializationContext context){
       return criterionTriggerInstance.serializeToJson(context);
   }
}
