package net.sixik.sdmcrtplus.source.utils;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class EntityHelper {

    public static Entity getEntityByUUID(ServerLevel level, UUID uuid){
        return level.getEntity(uuid);
    }
}
