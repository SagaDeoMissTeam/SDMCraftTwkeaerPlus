package net.sixik.sdmcrtplus.CrT.integration.waystones;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.blay09.mods.waystones.api.IWaystone;
import net.blay09.mods.waystones.api.IWaystoneTeleportContext;
import net.blay09.mods.waystones.api.TeleportDestination;
import net.blay09.mods.waystones.core.WarpMode;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/IWaystoneTeleportContext")
@NativeTypeRegistration(value = IWaystoneTeleportContext.class,zenCodeName = "mods.sdmcrtplus.integration.waystones.IWaystoneTeleportContext")
public class ExpandIWaystoneTeleportContext {

    @ZenCodeType.Method
   public static Entity getEntity(IWaystoneTeleportContext iWaystoneTeleportContext){
       return iWaystoneTeleportContext.getEntity();
   }
    @ZenCodeType.Method
   public static TeleportDestination getDestination(IWaystoneTeleportContext iWaystoneTeleportContext){
       return iWaystoneTeleportContext.getDestination();
   }
    @ZenCodeType.Method
   public static void setDestination(IWaystoneTeleportContext iWaystoneTeleportContext,TeleportDestination var1){
       iWaystoneTeleportContext.setDestination(var1);
   }
    @ZenCodeType.Method
   public static List<Mob> getLeashedEntities(IWaystoneTeleportContext iWaystoneTeleportContext){
       return iWaystoneTeleportContext.getLeashedEntities();
   }
    @ZenCodeType.Method
   public static List<Entity> getAdditionalEntities(IWaystoneTeleportContext iWaystoneTeleportContext){
       return iWaystoneTeleportContext.getAdditionalEntities();
   }
    @ZenCodeType.Method
   public static void addAdditionalEntity(IWaystoneTeleportContext iWaystoneTeleportContext,Entity var1){
       iWaystoneTeleportContext.addAdditionalEntity(var1);
   }
    @ZenCodeType.Method
   public static @ZenCodeType.Nullable IWaystone getFromWaystone(IWaystoneTeleportContext iWaystoneTeleportContext){
       return iWaystoneTeleportContext.getFromWaystone();
   }
    @ZenCodeType.Method
   public static void setFromWaystone(IWaystoneTeleportContext iWaystoneTeleportContext, @ZenCodeType.Nullable IWaystone var1){
       iWaystoneTeleportContext.setFromWaystone(var1);
   }
    @ZenCodeType.Method
   public static ItemStack getWarpItem(IWaystoneTeleportContext iWaystoneTeleportContext){
       return iWaystoneTeleportContext.getWarpItem();
   }
    @ZenCodeType.Method
   public static void setWarpItem(IWaystoneTeleportContext iWaystoneTeleportContext, IItemStack var1){
       iWaystoneTeleportContext.setWarpItem(var1.getInternal());
   }
    @ZenCodeType.Method
   public static boolean isDimensionalTeleport(IWaystoneTeleportContext iWaystoneTeleportContext){
       return iWaystoneTeleportContext.isDimensionalTeleport();
   }
    @ZenCodeType.Method
   public static int getXpCost(IWaystoneTeleportContext iWaystoneTeleportContext){
       return iWaystoneTeleportContext.getXpCost();
   }
    @ZenCodeType.Method
   public static void setXpCost(IWaystoneTeleportContext iWaystoneTeleportContext,int var1){
       iWaystoneTeleportContext.setXpCost(var1);
   }
    @ZenCodeType.Method
   public static void setCooldown(IWaystoneTeleportContext iWaystoneTeleportContext,int var1){
       iWaystoneTeleportContext.setCooldown(var1);
   }
    @ZenCodeType.Method
   public static int getCooldown(IWaystoneTeleportContext iWaystoneTeleportContext){
       return iWaystoneTeleportContext.getCooldown();
   }
    @ZenCodeType.Method
   public static WarpMode getWarpMode(IWaystoneTeleportContext iWaystoneTeleportContext){
       return iWaystoneTeleportContext.getWarpMode();
   }
    @ZenCodeType.Method
   public static void setWarpMode(IWaystoneTeleportContext iWaystoneTeleportContext,WarpMode var1){
       iWaystoneTeleportContext.setWarpMode(var1);
   }
    @ZenCodeType.Method
   public static boolean playsSound(IWaystoneTeleportContext iWaystoneTeleportContext){
       return iWaystoneTeleportContext.playsSound();
   }
    @ZenCodeType.Method
   public static void setPlaysSound(IWaystoneTeleportContext iWaystoneTeleportContext,boolean var1){
       iWaystoneTeleportContext.setPlaysSound(var1);
   }
    @ZenCodeType.Method
   public static boolean playsEffect(IWaystoneTeleportContext iWaystoneTeleportContext){
       return iWaystoneTeleportContext.playsEffect();
   }
    @ZenCodeType.Method
   public static void setPlaysEffect(IWaystoneTeleportContext iWaystoneTeleportContext,boolean var1){
       iWaystoneTeleportContext.setPlaysEffect(var1);
   }
   @ZenCodeType.Method
   public static IWaystone getTargetWaystone(IWaystoneTeleportContext iWaystoneTeleportContext){
        return iWaystoneTeleportContext.getTargetWaystone();
    }
}
