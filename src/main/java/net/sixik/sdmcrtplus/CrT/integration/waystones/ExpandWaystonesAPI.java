package net.sixik.sdmcrtplus.CrT.integration.waystones;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.mojang.datafixers.util.Either;
import net.blay09.mods.waystones.api.*;
import net.blay09.mods.waystones.core.WarpMode;
import net.blay09.mods.waystones.core.WaystoneTeleportContext;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@ZenRegister(modDeps = "waystones")
@Document("mods/sdmcrtplus/integration/waystones/WaystonesAPI")
@ZenCodeType.Name("mods.sdmcrtplus.integration.waystones.WaystonesAPI")
public class ExpandWaystonesAPI {

    @ZenCodeType.Method
    public static Either<IWaystoneTeleportContext, WaystoneTeleportError> createDefaultTeleportContext(Entity entity, IWaystone waystone, WarpMode warpMode, @Nullable IWaystone fromWaystone) {
        return WaystonesAPI.createDefaultTeleportContext(entity, waystone, warpMode, fromWaystone);
    }
    @ZenCodeType.Method
    public static Either<IWaystoneTeleportContext, WaystoneTeleportError> createCustomTeleportContext(Entity entity, IWaystone waystone) {
        return WaystonesAPI.createCustomTeleportContext(entity, waystone);
    }
    @ZenCodeType.Method
    public static Either<List<Entity>, WaystoneTeleportError> tryTeleportToWaystone(Entity entity, IWaystone waystone, WarpMode warpMode, @Nullable IWaystone fromWaystone) {
        return WaystonesAPI.tryTeleportToWaystone(entity, waystone, warpMode, fromWaystone);
    }
    @ZenCodeType.Method
    public static Either<List<Entity>, WaystoneTeleportError> tryTeleport(WaystoneTeleportContext context) {
        return WaystonesAPI.tryTeleport(context);
    }
    @ZenCodeType.Method
    public static Either<List<Entity>, WaystoneTeleportError> forceTeleportToWaystone(Entity entity, IWaystone waystone) {
        return WaystonesAPI.forceTeleportToWaystone(entity, waystone);
    }
    @ZenCodeType.Method
    public static List<Entity> forceTeleport(WaystoneTeleportContext context) {
        return WaystonesAPI.forceTeleport(context);
    }
    @ZenCodeType.Method
    public static Optional<IWaystone> getWaystoneAt(ServerLevel level, BlockPos pos) {
        return WaystonesAPI.getWaystoneAt(level, pos);
    }
    @ZenCodeType.Method
    public static Optional<IWaystone> getWaystone(Level level, UUID uuid) {
        return WaystonesAPI.getWaystone(level, uuid);
    }
    @ZenCodeType.Method
    public static Optional<IWaystone> placeWaystone(Level level, BlockPos pos, WaystoneStyle style) {
        return WaystonesAPI.placeWaystone(level, pos, style);
    }
    @ZenCodeType.Method
    public static Optional<IWaystone> placeSharestone(Level level, BlockPos pos, @Nullable DyeColor color) {
        return WaystonesAPI.placeSharestone(level, pos, color);
    }
    @ZenCodeType.Method
    public static Optional<IWaystone> placeWarpPlate(Level level, BlockPos pos) {
        return WaystonesAPI.placeWarpPlate(level, pos);
    }
    @ZenCodeType.Method
    public static ItemStack createAttunedShard(IWaystone warpPlate) {
        return WaystonesAPI.createAttunedShard(warpPlate);
    }
    @ZenCodeType.Method
    public static ItemStack createBoundScroll(IWaystone waystone) {
        return WaystonesAPI.createBoundScroll(waystone);
    }
}
