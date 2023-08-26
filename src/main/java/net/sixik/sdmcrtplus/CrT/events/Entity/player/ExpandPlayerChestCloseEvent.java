package net.sixik.sdmcrtplus.CrT.events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.sixik.sdmcrtplus.source.events.players.PlayerChestCloseEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/player/PlayerChestCloseEvent")
@NativeTypeRegistration(value = PlayerChestCloseEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.player.PlayerChestCloseEvent")
public class ExpandPlayerChestCloseEvent {



    @ZenCodeType.Method
    @ZenCodeType.Getter("block")
    public static BlockEntity getBlockEntity(PlayerChestCloseEvent event){
        return event.getBlock();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("openCount")
    public static int getOpenCount(PlayerChestCloseEvent event){
        return event.getOpenCount();
    }
}
