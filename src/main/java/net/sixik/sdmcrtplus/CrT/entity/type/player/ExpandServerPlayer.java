package net.sixik.sdmcrtplus.CrT.entity.type.player;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.openzen.zencode.java.ZenCodeType;

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
    public static boolean setRespawnPosition(ServerPlayer player, BlockPos position, ResourceLocation dimension, int respawnAngle, boolean respawnForced, boolean sendSetSpawnMessage){
        for(ResourceKey<Level> levelKey : player.getServer().levelKeys()){
            if(levelKey.registry().equals(dimension) || levelKey.registry() == dimension){
                player.setRespawnPosition(levelKey, position, respawnAngle, respawnForced, sendSetSpawnMessage);
                return true;
            }
        }
        return false;
    }

    /**
     Will allow you to get the player's rebirth point. If there is a bed, then the coordinates of the bed, if not, then the global point in the world.
     */
    @ZenCodeType.Getter("respawnPosition")
    @ZenCodeType.Method
    public static BlockPos getRespawnPosition(ServerPlayer player){
        return player.getRespawnPosition();
    }


    /**
     Allows you to get a dimension in which the player will be reborn after death or after teleportation from the ender world
     */
    @ZenCodeType.Getter("respawnDimension")
    @ZenCodeType.Method
    public static ResourceLocation getRespawnDimension(ServerPlayer player) {
        return player.getRespawnDimension().registry();
    }

    /**
     Returns the last time the player moved
     */
    @ZenCodeType.Getter("lastActionTime")
    @ZenCodeType.Method
    public static long getLastActionTime(ServerPlayer player) {
        return player.getLastActionTime();
    }
}
