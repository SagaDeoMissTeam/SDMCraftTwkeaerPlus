package net.sixik.sdmcrtplus.mixin.mods.majruszsdifficulty;

import com.majruszsdifficulty.undeadarmy.UndeadArmy;
import com.majruszsdifficulty.undeadarmy.UndeadArmyManager;
import com.majruszsdifficulty.undeadarmy.data.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.sdmcrtplus.source.events.mods.majruszsdifficulty.UndeadArmyEventHelper;
import net.sixik.sdmcrtplus.source.events.mods.majruszsdifficulty.UndeadArmySpawnEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;
import java.util.Optional;

@Mixin(value = UndeadArmyManager.class, remap = false)
public class UndeadArmyManagerMixin {

    @Shadow private List<UndeadArmy> undeadArmies;


    @Inject(method = "Lcom/majruszsdifficulty/undeadarmy/UndeadArmyManager;tryToSpawn(Lnet/minecraft/world/entity/player/Player;)Z", at = @At("HEAD"))
    public void sdm$tryToSpawn(Player player, CallbackInfoReturnable<Boolean> cir){
        UndeadArmyEventHelper.setPlayer(player);
    }
    @Inject(method = "Lcom/majruszsdifficulty/undeadarmy/UndeadArmyManager;tryToSpawn(Lnet/minecraft/world/entity/player/Player;)Z", at = @At("TAIL"))
    public void sdm$tryToSpawn2(Player player, CallbackInfoReturnable<Boolean> cir){
        UndeadArmyEventHelper.setPlayer(null);
    }

    @Inject(
            method = "Lcom/majruszsdifficulty/undeadarmy/UndeadArmyManager;setupNewArmy(Lnet/minecraft/core/BlockPos;Ljava/util/Optional;)Lcom/majruszsdifficulty/undeadarmy/UndeadArmy;",
            at = @At("RETURN")
    )
    public void sdm$tryToSpawn(BlockPos position, Optional<Direction> direction, CallbackInfoReturnable<UndeadArmy> cir){
        MinecraftForge.EVENT_BUS.post(new UndeadArmySpawnEvent(cir.getReturnValue()));
    }
}
