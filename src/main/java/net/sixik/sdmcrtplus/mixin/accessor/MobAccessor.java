package net.sixik.sdmcrtplus.mixin.accessor;

import net.minecraft.core.Vec3i;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Mob.class)
public interface MobAccessor {

    @Accessor
    boolean isCanPickUpLoot();
//    @Accessor
//    ResourceLocation getLootTable();
//    @Accessor
//    void setLootTable(ResourceLocation resourceLocation);
    @Accessor
    Entity getLeashHolder();
    @Accessor
    int getXpReward();
}
