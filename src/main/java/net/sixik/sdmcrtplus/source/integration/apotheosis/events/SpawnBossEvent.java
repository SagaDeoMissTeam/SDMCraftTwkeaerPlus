package net.sixik.sdmcrtplus.source.integration.apotheosis.events;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.Cancelable;

@Cancelable
public class SpawnBossEvent extends LivingEvent {
    private BlockPos posSpawn;
    private LivingEntity target;
    public SpawnBossEvent(LivingEntity entity, BlockPos posSpawn, LivingEntity target) {
        super(entity);
        this.posSpawn = posSpawn;
        this.target = target;
    }

    public BlockPos getPosSpawn() {
        return posSpawn;
    }

    public LivingEntity getTarget() {
        return target;
    }

    @Override
    public boolean isCancelable() {
        return true;
    }
}
