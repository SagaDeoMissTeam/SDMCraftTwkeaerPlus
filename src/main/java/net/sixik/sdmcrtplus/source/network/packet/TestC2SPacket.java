package net.sixik.sdmcrtplus.source.network.packet;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class TestC2SPacket {
    public TestC2SPacket(){

    }

    public TestC2SPacket(FriendlyByteBuf buf){

    }

    public void  toBytes(FriendlyByteBuf buf){

    }

    public boolean handler(Supplier<NetworkEvent.Context> supplier){
        NetworkEvent.Context context = supplier.get();

        context.enqueueWork(() -> {
            //SERVER
            ServerPlayer player = context.getSender();
            ServerLevel level = player.getLevel();

            EntityType.COW.spawn(level, null, null, player.blockPosition(), MobSpawnType.COMMAND, true, false);

        });
        return true;
    }
}
