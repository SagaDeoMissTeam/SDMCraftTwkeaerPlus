package net.sixik.sdmcrtplus.source.methods;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerListener;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.sdmcrtplus.source.events.players.PlayerInventoryChangedEvent;

public class InventoryListenerMethod implements ContainerListener {
    public final ServerPlayer player;
    public InventoryListenerMethod(ServerPlayer player){

        this.player = player;
    }

    public void slotChanged(AbstractContainerMenu container, int index, ItemStack stack) {
        if (!stack.isEmpty() && container.getSlot(index).container == this.player.getInventory()) {
            MinecraftForge.EVENT_BUS.post(new PlayerInventoryChangedEvent(player, (Container) container, index, stack));
        }

    }

    public void dataChanged(AbstractContainerMenu container, int id, int value) {
    }
}
