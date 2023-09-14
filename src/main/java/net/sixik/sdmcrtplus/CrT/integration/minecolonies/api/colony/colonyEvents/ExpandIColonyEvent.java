package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.colonyEvents;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.colonyEvents.EventStatus;
import com.minecolonies.api.colony.colonyEvents.IColonyEvent;
import com.minecolonies.api.colony.colonyEvents.descriptions.IColonyEventDescription;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/colonyEvents/IColonyEvent")
@NativeTypeRegistration(value = IColonyEvent.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.colonyEvents.IColonyEvent")
public class ExpandIColonyEvent {

    @ZenCodeType.Method
   public static EventStatus getStatus(IColonyEvent iColonyEvent){
       return iColonyEvent.getStatus();
   }
    @ZenCodeType.Method
   public static void setStatus(IColonyEvent iColonyEvent, EventStatus var1){
       iColonyEvent.setStatus(var1);
   }
    @ZenCodeType.Method
   public static int getID(IColonyEvent iColonyEvent){
       return iColonyEvent.getID();
   }
    @ZenCodeType.Method
   public static ResourceLocation getEventTypeID(IColonyEvent iColonyEvent){
       return iColonyEvent.getEventTypeID();
   }
    @ZenCodeType.Method
   public static void setColony(IColonyEvent iColonyEvent, IColony var1){
       iColonyEvent.setColony(var1);
   }
    @ZenCodeType.Method
   public static void onUpdate(IColonyEvent iColonyEvent) {
       iColonyEvent.onUpdate();
   }
    @ZenCodeType.Method
   public static void onStart(IColonyEvent iColonyEvent) {
       iColonyEvent.onStart();
   }
    @ZenCodeType.Method
   public static void onFinish(IColonyEvent iColonyEvent) {
       iColonyEvent.onFinish();
   }
    @ZenCodeType.Method
   public static void onTileEntityBreak(IColonyEvent iColonyEvent, BlockEntity te) {
       iColonyEvent.onTileEntityBreak(te);
   }
    @ZenCodeType.Method
   public static void onNightFall(IColonyEvent iColonyEvent) {
       iColonyEvent.onNightFall();
   }
}
