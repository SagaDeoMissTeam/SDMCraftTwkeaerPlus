package net.sixik.sdmcrtplus.mixin.accessor;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(AbstractArrow.class)
public interface AbstractArrowAccessor {

    @Accessor
    boolean getInGround();
    @Accessor
    int getInGroundTime();
    @Accessor
    BlockState getLastState();
    @Accessor
    int getLife();
    @Accessor
    int getKnockback();
    @Accessor
    List<Entity> getPiercedAndKilledEntities();
}
