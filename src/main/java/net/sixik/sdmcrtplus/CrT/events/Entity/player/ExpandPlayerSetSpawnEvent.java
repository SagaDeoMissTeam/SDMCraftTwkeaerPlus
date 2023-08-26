package net.sixik.sdmcrtplus.CrT.events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerSetSpawnEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/player/PlayerSetSpawnEvent")
@NativeTypeRegistration(value = PlayerSetSpawnEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.player.PlayerSetSpawnEvent")
public class ExpandPlayerSetSpawnEvent {

    @ZenCodeType.Getter("newSpawn")
    @ZenCodeType.Method
    public static BlockPos getNewSpawn(PlayerSetSpawnEvent event){
        return event.getNewSpawn();
    }
    @ZenCodeType.Getter("worldSpawn")
    @ZenCodeType.Method
    public static String getWorldSpawn(PlayerSetSpawnEvent event){
        return event.getSpawnLevel().toString();
    }
}
