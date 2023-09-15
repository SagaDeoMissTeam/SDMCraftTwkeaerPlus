package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.managers.interfaces;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.colonyEvents.IColonyEvent;
import com.minecolonies.api.colony.managers.interfaces.ICitizenManager;
import com.minecolonies.api.colony.managers.interfaces.IEventManager;
import com.minecolonies.api.colony.managers.interfaces.IEventStructureManager;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/managers/interfaces/IEventManager")
@NativeTypeRegistration(value = IEventManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.managers.interfaces.IEventManager")
public class ExpandIEventManager {

    @ZenCodeType.Method
   public static void addEvent(IEventManager iEventManager, IColonyEvent var1){
       iEventManager.addEvent(var1);
   }
    @ZenCodeType.Method
   public static int getAndTakeNextEventID(IEventManager iEventManager){
        return iEventManager.getAndTakeNextEventID();
   }
    @ZenCodeType.Method
   public static void registerEntity(IEventManager iEventManager, Entity var1, int var2){
        iEventManager.registerEntity(var1,var2);
   }
    @ZenCodeType.Method
   public static void unregisterEntity(IEventManager iEventManager, Entity var1, int var2){
        iEventManager.unregisterEntity(var1,var2);
   }
    @ZenCodeType.Method
   public static void onEntityDeath(IEventManager iEventManager,LivingEntity var1, int var2){
        iEventManager.onEntityDeath(var1,var2);
   }
    @ZenCodeType.Method
   public static void onNightFall(IEventManager iEventManager){
        iEventManager.onNightFall();
   }
    @ZenCodeType.Method
   public static void onTileEntityBreak(IEventManager iEventManager,int var1, BlockEntity var2){
        iEventManager.onTileEntityBreak(var1,var2);
   }
    @ZenCodeType.Method
   public static void onColonyTick(IEventManager iEventManager, IColony var1){
        iEventManager.onColonyTick(var1);
   }
    @ZenCodeType.Method
   public static IColonyEvent getEventByID(IEventManager iEventManager,int var1){
       return iEventManager.getEventByID(var1);
   }
    @ZenCodeType.Method
   public static Map<Integer, IColonyEvent> getEvents(IEventManager iEventManager){
        return  iEventManager.getEvents();
   }

    @ZenCodeType.Method
   public static void readFromNBT(IEventManager iEventManager, CompoundTag var1){
        iEventManager.readFromNBT(var1);
   }

   @ZenCodeType.Method
   public static void writeToNBT(IEventManager iEventManager, CompoundTag var1){
        iEventManager.writeToNBT(var1);
   }
    @ZenCodeType.Method
   public static IEventStructureManager getStructureManager(IEventManager iEventManager){
        return iEventManager.getStructureManager();
   }
}
