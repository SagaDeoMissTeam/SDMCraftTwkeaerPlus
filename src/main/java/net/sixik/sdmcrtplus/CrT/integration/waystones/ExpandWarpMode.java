package net.sixik.sdmcrtplus.CrT.integration.waystones;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.blay09.mods.waystones.api.IWaystone;
import net.blay09.mods.waystones.core.WarpMode;
import net.minecraft.world.entity.Entity;

import java.util.function.BiPredicate;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/WarpMode")
@NativeTypeRegistration(value = WarpMode.class,zenCodeName = "mods.sdmcrtplus.integration.waystones.WarpMode")
@BracketEnum("waystones:warpmode")
public class ExpandWarpMode {

    public static double getXpCostMultiplier(WarpMode warpMode){
        return warpMode.getXpCostMultiplier();
    }
    public static boolean consumesItem(WarpMode warpMode){
        return warpMode.consumesItem();
    }
    public static BiPredicate<Entity, IWaystone> getAllowTeleportPredicate(WarpMode warpMode){
        return warpMode.getAllowTeleportPredicate();
    }
}
