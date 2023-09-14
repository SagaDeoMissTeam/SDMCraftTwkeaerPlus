package net.sixik.sdmcrtplus.CrT.events.World.generation;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.sixik.sdmcrtplus.source.events.generations.PernilNoiseEvent;
import org.openzen.zencode.java.ZenCodeType;


/**
 * The event can be canceled
 *
 * Event is called every time the perlin noise is called . In 90% of cases, these are terrain generation.
 */
@ZenRegister
@Document("mods/sdmcrtplus/events/level/generation/PernilNoiseEvent")
@NativeTypeRegistration(value = PernilNoiseEvent.class, zenCodeName = "mods.sdmcrtplus.events.level.generation.PernilNoiseEvent")
public class ExpandPerlinNoiseEvent {

    @ZenCodeType.Method
    public static double getNumX(PernilNoiseEvent event){
        return event.getNumX();
    }
    @ZenCodeType.Method
    public static double getNumZ(PernilNoiseEvent event){
        return event.getNumZ();
    }
    @ZenCodeType.Method
    public static double getTotalNum(PernilNoiseEvent event){
        return event.getTotalNum();
    }
    @ZenCodeType.Method
    public static void setNumX(PernilNoiseEvent event, double num){
        event.setNumX(num);
    }
    @ZenCodeType.Method
    public static void setNumZ(PernilNoiseEvent event, double num){
        event.setNumZ(num);
    }
    @ZenCodeType.Method
    public static void setTotalNum(PernilNoiseEvent event, double num){
        event.setTotalNum(num);
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Player getPlayer(PernilNoiseEvent event){
       return event.getPlayer();
    }
}
