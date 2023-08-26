package net.sixik.sdmcrtplus.CrT.events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.LivingEntity;
import net.sixik.sdmcrtplus.source.events.LivingItemPickUpEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/living/LivingItemPickUpEvent")
@NativeTypeRegistration(value = LivingItemPickUpEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.living.LivingItemPickUpEvent")
public class ExpandLivingItemPickUp {

    @ZenCodeType.Getter("item")
    @ZenCodeType.Method
    public static IItemStack getItem(LivingItemPickUpEvent event){
        return new MCItemStack(event.getItemStack());
    }
}