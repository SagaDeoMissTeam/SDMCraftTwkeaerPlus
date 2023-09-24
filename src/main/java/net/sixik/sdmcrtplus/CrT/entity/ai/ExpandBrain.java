package net.sixik.sdmcrtplus.CrT.entity.ai;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.Brain;

@ZenRegister
@Document("mods/sdmcrtplus/entity/ai/Brain")
@NativeTypeRegistration(value = Brain.class, zenCodeName = "mods.sdmcrtplus.entity.ai.Brain")
public class ExpandBrain<E extends LivingEntity>{
}
