package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen.citizenhandlers;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenInventoryHandler;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenItemHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/citizenhandlers/ICitizenItemHandler")
@NativeTypeRegistration(value = ICitizenItemHandler.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.citizenhandlers.ICitizenItemHandler")
public class ExpandICitizenItemHandler {

    @ZenCodeType.Method
   public static void tryPickupItemEntity(ICitizenItemHandler iCitizenItemHandler, ItemEntity var1){
        iCitizenItemHandler.tryPickupItemEntity(var1);
    }
    @ZenCodeType.Method
   public static void removeHeldItem(ICitizenItemHandler iCitizenItemHandler){
        iCitizenItemHandler.removeHeldItem();
    }
    @ZenCodeType.Method
   public static void setHeldItem(ICitizenItemHandler iCitizenItemHandler,InteractionHand var1, int var2){
        iCitizenItemHandler.setHeldItem(var1,var2);
    }
    @ZenCodeType.Method
   public static void setMainHeldItem(ICitizenItemHandler iCitizenItemHandler,int var1){
        iCitizenItemHandler.setMainHeldItem(var1);
    }
    @ZenCodeType.Method
   public static void hitBlockWithToolInHand(ICitizenItemHandler iCitizenItemHandler,@ZenCodeType.Nullable BlockPos var1){
        iCitizenItemHandler.hitBlockWithToolInHand(var1);
    }
    @ZenCodeType.Method
   public static void hitBlockWithToolInHand(ICitizenItemHandler iCitizenItemHandler,@ZenCodeType.Nullable BlockPos var1, boolean var2){
        iCitizenItemHandler.hitBlockWithToolInHand(var1,var2);
    }
    @ZenCodeType.Method
   public static void damageItemInHand(ICitizenItemHandler iCitizenItemHandler,InteractionHand var1, int var2){
        iCitizenItemHandler.damageItemInHand(var1,var2);
    }
    @ZenCodeType.Method
   public static void pickupItems(ICitizenItemHandler iCitizenItemHandler){
        iCitizenItemHandler.pickupItems();
    }
    @ZenCodeType.Method
   public static void breakBlockWithToolInHand(ICitizenItemHandler iCitizenItemHandler,@ZenCodeType.Nullable BlockPos var1){
        iCitizenItemHandler.breakBlockWithToolInHand(var1);
    }
    @ZenCodeType.Method
   public static ItemEntity entityDropItem(ICitizenItemHandler iCitizenItemHandler, ItemStack var1){
        return iCitizenItemHandler.entityDropItem(var1);
    }
    @ZenCodeType.Method
   public static void updateArmorDamage(ICitizenItemHandler iCitizenItemHandler,double var1){
        iCitizenItemHandler.updateArmorDamage(var1);
    }
    @ZenCodeType.Method
   public static double applyMending(ICitizenItemHandler iCitizenItemHandler,double var1){
        return iCitizenItemHandler.applyMending(var1);
    }
}
