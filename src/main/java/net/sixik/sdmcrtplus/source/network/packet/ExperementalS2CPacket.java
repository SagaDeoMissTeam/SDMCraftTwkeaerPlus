package net.sixik.sdmcrtplus.source.network.packet;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraftforge.network.NetworkEvent;
import net.sixik.sdmcrtplus.source.client.SDMClientUtils;

import java.util.function.Supplier;

public class ExperementalS2CPacket {
    public ExperementalS2CPacket(){

    }

    public ExperementalS2CPacket(FriendlyByteBuf buf){

    }

    public void toBytes(FriendlyByteBuf buf){

    }

    public boolean handler(Supplier<NetworkEvent.Context> supplier){
        NetworkEvent.Context context = supplier.get();


        context.enqueueWork(() -> {
            SDMClientUtils.test(20);
        });
        return true;
    }
}
