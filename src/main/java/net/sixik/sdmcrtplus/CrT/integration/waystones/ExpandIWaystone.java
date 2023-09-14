package net.sixik.sdmcrtplus.CrT.integration.waystones;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.blay09.mods.waystones.api.IWaystone;
import net.blay09.mods.waystones.api.TeleportDestination;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/IWaystone")
@NativeTypeRegistration(value = IWaystone.class,zenCodeName = "mods.sdmcrtplus.integration.waystones.IWaystone")
public class ExpandIWaystone {

    @ZenCodeType.Method
   public static String getWaystoneUid(IWaystone iWaystone){
       return iWaystone.getWaystoneUid().toString();
   }
    @ZenCodeType.Method
   public static String getName(IWaystone iWaystone){
       return iWaystone.getName();
   }
    @ZenCodeType.Method
   public static ResourceKey<Level> getDimension(IWaystone iWaystone){
       return iWaystone.getDimension();
   }
    @ZenCodeType.Method
   public static boolean wasGenerated(IWaystone iWaystone){
       return iWaystone.wasGenerated();
   }
    @ZenCodeType.Method
   public static boolean isGlobal(IWaystone iWaystone){
       return iWaystone.isGlobal();
   }
    @ZenCodeType.Method
   public static boolean isOwner(IWaystone iWaystone,Player var1){
       return iWaystone.isOwner(var1);
   }
    @ZenCodeType.Method
   public static BlockPos getPos(IWaystone iWaystone){
       return iWaystone.getPos();
   }
    @ZenCodeType.Method
   public static boolean isValid(IWaystone iWaystone){
       return iWaystone.isValid();
   }
    @ZenCodeType.Method
   public static @ZenCodeType.Nullable String getOwnerUid(IWaystone iWaystone){
       return iWaystone.getOwnerUid().toString();
   }
    @ZenCodeType.Method
   public static ResourceLocation getWaystoneType(IWaystone iWaystone){
       return iWaystone.getWaystoneType();
   }
    @ZenCodeType.Method
   public static boolean hasName(IWaystone iWaystone) {
       return iWaystone.hasName();
    }
    @ZenCodeType.Method
   public static boolean hasOwner(IWaystone iWaystone) {
        return iWaystone.hasOwner();
   }
    @ZenCodeType.Method
   public static boolean isValidInLevel(IWaystone iWaystone,ServerLevel level) {
       return iWaystone.isValidInLevel(level);
   }
    @ZenCodeType.Method
   public static TeleportDestination resolveDestination(IWaystone iWaystone,ServerLevel level) {
       return iWaystone.resolveDestination(level);
   }
}
