package net.sixik.sdmcrtplus.CrT.events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.sixik.sdmcrtplus.source.events.players.PlayerSendMessageEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/player/PlayerSendMessageEvent")
@NativeTypeRegistration(value = PlayerSendMessageEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.player.PlayerSendMessageEvent")
public class ExpandPlayerSendMessageEvent {

    @ZenCodeType.Getter("message")
    @ZenCodeType.Method
    public static String getMessage(PlayerSendMessageEvent event){
        return event.getMessage();
    }
}
