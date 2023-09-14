package net.sixik.sdmcrtplus.mixin.mods.apotheosis;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.ServerLevelAccessor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import shadows.apotheosis.adventure.boss.BossItem;
import shadows.apotheosis.adventure.loot.LootRarity;
import shadows.apotheosis.util.SupportingEntity;

import javax.annotation.Nullable;
import java.util.function.Function;

@Mixin(value = BossItem.class,remap = false)
public abstract class BossItemMixin {

//    @Shadow @Final @Nullable protected SupportingEntity mount;
//
//    @Shadow public abstract void initBoss(RandomSource rand, Mob entity, float luck, @org.jetbrains.annotations.Nullable LootRarity rarity);
//
//    @Shadow @Final @Nullable protected CompoundTag nbt;
//
//    @Shadow @Final protected EntityType<?> entity;

//    @Inject(method = "Lshadows/apotheosis/adventure/boss/BossItem;createBoss(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;FLshadows/apotheosis/adventure/loot/LootRarity;)Lnet/minecraft/world/entity/Mob;",
//    at = @At(value = "HEAD"), cancellable = true)
//    public void sdm$createBoss(ServerLevelAccessor world, BlockPos pos, RandomSource random, float luck, LootRarity rarity, CallbackInfoReturnable<Mob> cir){
//        cir.cancel();
//        CompoundTag fakeNbt = this.nbt == null ? new CompoundTag() : this.nbt;
//        fakeNbt.putString("id", EntityType.getKey(this.entity).toString());
//        Mob entity = (Mob)EntityType.loadEntityRecursive(fakeNbt, world.getLevel(), Function.identity());
//        if (this.nbt != null) {
//            entity.load(this.nbt);
//        }
//
//        this.initBoss(random, entity, luck, rarity);
//        if (this.nbt != null) {
//            entity.readAdditionalSaveData(this.nbt);
//        }
//
//        if (this.mount != null) {
//            Mob mountedEntity = this.mount.create(world.getLevel(), (double)pos.getX() + 0.5, (double)pos.getY(), (double)pos.getZ() + 0.5);
//            entity.startRiding(mountedEntity, true);
//            entity = mountedEntity;
//        }
//
//        entity.moveTo((double)pos.getX() + 0.5, (double)pos.getY(), (double)pos.getZ() + 0.5, random.nextFloat() * 360.0F, 0.0F);
//        cir.setReturnValue(entity);
//    }
//
//    @Inject(method = "initBoss", at = @At(value = "RETURN"))
//    public void sdm$initBoss(RandomSource rand, Mob entity, float luck, LootRarity rarity, CallbackInfo ci){
//
//    }
}
