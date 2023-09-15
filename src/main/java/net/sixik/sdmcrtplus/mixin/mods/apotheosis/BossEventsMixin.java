package net.sixik.sdmcrtplus.mixin.mods.apotheosis;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.sixik.sdmcrtplus.source.integration.apotheosis.events.SpawnBossEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import shadows.apotheosis.adventure.boss.BossEvents;

@Mixin(value = BossEvents.class, remap = false, priority = 5000)
public class BossEventsMixin {

//    @Inject(method = "naturalBosses", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/ServerLevelAccessor;addFreshEntityWithPassengers(Lnet/minecraft/world/entity/Entity;)V"), remap = false, cancellable = true)
//    public void sdm$naturalBosses(LivingSpawnEvent.SpecialSpawn e, CallbackInfo ci){
//        SpawnBossEvent event = new SpawnBossEvent(e.getEntity(), e.getEntity().blockPosition(), e.getEntity().getTarget());
//        MinecraftForge.EVENT_BUS.post(event);
//        if(event.isCanceled()) ci.cancel();
//    }
}
