package net.sixik.sdmcrtplus.CrT.events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/player/PlayerCloneEvent")
@NativeTypeRegistration(value = PlayerEvent.Clone.class, zenCodeName = "mods.sdmcrtplus.events.entity.player.PlayerCloneEvent")
public class ExpandPlayerCloneEvent {

    /**
     * The old EntityPlayer that this new entity is a clone of.
     */
    @ZenCodeType.Method
    public static Player getOriginal(PlayerEvent.Clone event){
        return event.getOriginal();
    }

    /**
     * True if this event was fired because the player died. False if it was fired because the entity switched dimensions.
     */
    @ZenCodeType.Method
    public static boolean isWasDeath(PlayerEvent.Clone event){
        return event.isWasDeath();
    }
}
