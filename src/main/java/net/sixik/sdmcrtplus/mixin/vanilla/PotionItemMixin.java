package net.sixik.sdmcrtplus.mixin.vanilla;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.sdmcrtplus.source.events.players.PlayerPotionEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PotionItem.class)
public class PotionItemMixin {

    @Inject(at = @At("HEAD"),
            method = "Lnet/minecraft/world/item/PotionItem;finishUsingItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/item/ItemStack;")
    public void potionConsumeEventCall(ItemStack stack, Level p_42985_, LivingEntity entity, CallbackInfoReturnable<?> ci) {
        if (entity instanceof Player)
            MinecraftForge.EVENT_BUS.post(new PlayerPotionEvent(((Player)entity), stack));
    }
}
