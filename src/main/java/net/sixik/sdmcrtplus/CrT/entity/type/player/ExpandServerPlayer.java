package net.sixik.sdmcrtplus.CrT.entity.type.player;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.commands.arguments.ResourceLocationArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.network.protocol.game.ClientboundCustomSoundPacket;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerPlayerGameMode;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * @docParam this serverPlayer
 */
@ZenRegister
@Document("mods/sdmcrtplus/entity/type/player/ExpandServerPlayers")
@ZenCodeType.Expansion("crafttweaker.api.entity.type.player.ServerPlayer")
public class ExpandServerPlayer {

    /**
     Modifies the player's objection point.
     * @param position - Coordinates on which the player will appear
     * @param dimension - The dimension in which the player will appear
     * @param respawnAngle - The angle of rotation of the character's body when respawn
     * @param respawnForced - This objection is forced. Using the respawn() method ?
     * @param sendSetSpawnMessage - Send a notification to the player that his respawn point has been changed ?
     * @return
     */
    @ZenCodeType.Method
    public static boolean setRespawnPosition(ServerPlayer player, ResourceLocation dimension, @ZenCodeType.Nullable BlockPos position, int respawnAngle, boolean respawnForced, boolean sendSetSpawnMessage){
        @SuppressWarnings("deprecation")
        Map<ResourceKey<Level>, ServerLevel> map = player.server.forgeGetWorldMap();

        ResourceKey<Level> worldKey = ResourceKey.create(ResourceKey.createRegistryKey(new ResourceLocation("minecraft", "dimension")), dimension);

        if(map.containsKey(worldKey)){
            player.setRespawnPosition(worldKey, position, respawnAngle, respawnForced, sendSetSpawnMessage);
            return true;
        }
        return false;
    }

    /**
     Will allow you to get the player's rebirth point. If there is a bed, then the coordinates of the bed, if not, then the global point in the world.
     */
    @ZenCodeType.Getter("respawnPosition")
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable BlockPos getRespawnPosition(ServerPlayer player){
        return player.getRespawnPosition();
    }


    /**
     Allows you to get a dimension in which the player will be reborn after death or after teleportation from the ender world
     */
    @ZenCodeType.Getter("respawnDimension")
    @ZenCodeType.Method
    public static ResourceLocation getRespawnDimension(ServerPlayer player) {
        return player.getRespawnDimension().location();
    }

    /**
     Returns the last time the player moved
     */
    @ZenCodeType.Getter("lastActionTime")
    @ZenCodeType.Method
    public static long getLastActionTime(ServerPlayer player) {
        return player.getLastActionTime();
    }

    @ZenCodeType.Method
    public static void playNotifySound(ServerPlayer player, ResourceLocation sound, float volume, float pitch){
        player.playNotifySound(new SoundEvent(sound), SoundSource.PLAYERS, volume, pitch);
    }

    @ZenCodeType.Method
    public static void setPlayerInput(ServerPlayer player, float posX, float posY, boolean jump, boolean shiftKey){
        player.setPlayerInput(posX,posY,jump,shiftKey);
    }

    @ZenCodeType.Method
    public static void trackStartFallingPosition(ServerPlayer player){
        player.trackStartFallingPosition();
    }

    /**
     * Moves the player to the specified coordinates
     * Use it if you want to change the player's spawn point
     * @param world - world where player will be respawn
     */
    @ZenCodeType.Method
    public static void spawnIn(ServerPlayer pl, ServerLevel world){
        pl.teleportTo(world, pl.getX(), pl.getY(), pl.getZ(), pl.getYRot(), pl.getXRot());
        BlockPos spawn = pl.getRespawnPosition();
        boolean forced = pl.isRespawnForced();
        Optional<Vec3> optional;
        if(spawn!=null && Level.isInSpawnableBounds(spawn))
        {
            optional = Player.findRespawnPositionAndUseSpawnBlock(world, spawn, 0, forced, true);
        }
        else
        {
            optional = Optional.empty();
        }
        BlockPos worldSpawn = world.getSharedSpawnPos();
        Vec3 spawnPos = optional.orElse(new Vec3(worldSpawn.getX() + 0.5, worldSpawn.getY() + 0.2, worldSpawn.getZ() + 0.5));
        pl.teleportTo(world, spawnPos.get(Direction.Axis.X), spawnPos.get(Direction.Axis.Y), spawnPos.get(Direction.Axis.Z), pl.getXRot(), pl.getYRot());
        pl.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 5, 20, true, false));
    }

//    /**
//     * @param sound - ID of the sound to be played
//     * @param volume - Volume
//     * @param pitch - Speed
//     * @param minVolume - MinVolume
//     */
//    @ZenCodeType.Method
//    public static boolean playSound(ServerPlayer player, ResourceLocation sound, float volume, float pitch, float minVolume){
//
//        Registry<SoundEvent> register = player.getServer().registryAccess().registryOrThrow(Registry.SOUND_EVENT_REGISTRY);
//        for(SoundEvent soundEvent : register){
//            ResourceLocationArgument.getId(sound, "sound");
//            if(Objects.equals(register.get(sound), soundEvent)){
//                float f = volume;
//                long j = player.getLevel().getRandom().nextLong();
//
//                if((minVolume <= 0.0f)){
//                    f = minVolume;
//                }
//
//                player.connection.send(new ClientboundCustomSoundPacket(
//                        sound,
//                        SoundSource.PLAYERS,
//                        new Vec3(player.getX(),player.getY(),player.getZ()),
//                        f,
//                        pitch,
//                        j
//                ));
//                return true;
//            }
//        }
//        return false;
//    }
}
