package net.sixik.sdmcrtplus.source.events.players;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class PlayerChestCloseEvent  extends PlayerEvent {

    public static BlockEntity block;
    public PlayerChestCloseEvent(Player player, BlockEntity block) {
        super(player);
    }

    public BlockEntity getBlock() {
        return block;
    }

    @Override
    public Player getEntity() {
        return super.getEntity();
    }

    public int getOpenCount(){
        if(block instanceof ChestBlockEntity chest){
            ChestBlockEntity.getOpenCount(chest.getLevel(),chest.getBlockPos());
        }
        return -404;
    }
}
