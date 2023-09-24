package net.sixik.sdmcrtplus.CrT.integration.waystones;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.blay09.mods.waystones.core.Waystone;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/Waystone")
@NativeTypeRegistration(value = Waystone.class,zenCodeName = "mods.sdmcrtplus.integration.waystones.Waystone")
public class ExpandWaystone {

    @ZenCodeType.Method
    public static String getOwnerUid(Waystone waystone){
       return waystone.getOwnerUid().toString();
    }
    @ZenCodeType.Method
    public static String getWaystoneUid(Waystone waystone){
       return waystone.getWaystoneUid().toString();
    }
    @ZenCodeType.Method
    public static ResourceLocation getWaystoneType(Waystone waystone){
       return waystone.getWaystoneType();
    }
    @ZenCodeType.Method
    public static ResourceKey<Level> getDimension(Waystone waystone){
       return waystone.getDimension();
    }
    @ZenCodeType.Method
    public static String getName(Waystone waystone){
       return waystone.getName();
    }
    @ZenCodeType.Method
    public static BlockPos getPos(Waystone waystone){
       return waystone.getPos();
    }
}
