package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.managers.interfaces;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.managers.interfaces.IColonyPackageManager;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Set;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/managers/interfaces/IColonyPackageManager")
@NativeTypeRegistration(value = IColonyPackageManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.managers.interfaces.IColonyPackageManager")
public class ExpandIColonyPackageManager {


    @ZenCodeType.Method
   public static int getLastContactInHours(IColonyPackageManager iColonyPackageManager){
       return iColonyPackageManager.getLastContactInHours();
   }
    @ZenCodeType.Method
   public static void setLastContactInHours(IColonyPackageManager iColonyPackageManager,int var1){
       iColonyPackageManager.setLastContactInHours(var1);
   }
    @ZenCodeType.Method
   public static Set<ServerPlayer> getCloseSubscribers(IColonyPackageManager iColonyPackageManager){
       return iColonyPackageManager.getCloseSubscribers();
   }
    @ZenCodeType.Method
   public static void updateSubscribers(IColonyPackageManager iColonyPackageManager){
       iColonyPackageManager.updateSubscribers();
   }
    @ZenCodeType.Method
   public static void updateAwayTime(IColonyPackageManager iColonyPackageManager){
       iColonyPackageManager.updateAwayTime();
   }
    @ZenCodeType.Method
   public static void sendColonyViewPackets(IColonyPackageManager iColonyPackageManager){
       iColonyPackageManager.sendColonyViewPackets();
   }
    @ZenCodeType.Method
   public static void sendPermissionsPackets(IColonyPackageManager iColonyPackageManager){
       iColonyPackageManager.sendPermissionsPackets();
   }
    @ZenCodeType.Method
   public static void sendWorkOrderPackets(IColonyPackageManager iColonyPackageManager){
       iColonyPackageManager.sendWorkOrderPackets();
   }
    @ZenCodeType.Method
   public static void setDirty(IColonyPackageManager iColonyPackageManager){
       iColonyPackageManager.setDirty();
   }
    @ZenCodeType.Method
   public static void addCloseSubscriber(IColonyPackageManager iColonyPackageManager, ServerPlayer var1){
       iColonyPackageManager.addCloseSubscriber(var1);
   }
    @ZenCodeType.Method
   public static void addImportantColonyPlayer(IColonyPackageManager iColonyPackageManager, ServerPlayer var1){
       iColonyPackageManager.addImportantColonyPlayer(var1);
   }
    @ZenCodeType.Method
   public static void removeImportantColonyPlayer(IColonyPackageManager iColonyPackageManager, ServerPlayer var1){
       iColonyPackageManager.removeImportantColonyPlayer(var1);
   }
    @ZenCodeType.Method
   public static void removeCloseSubscriber(IColonyPackageManager iColonyPackageManager, ServerPlayer var1){
       iColonyPackageManager.removeCloseSubscriber(var1);
   }
    @ZenCodeType.Method
   public static Set<ServerPlayer> getImportantColonyPlayers(IColonyPackageManager iColonyPackageManager){
       return iColonyPackageManager.getImportantColonyPlayers();
   }
}
