package net.sixik.sdmcrtplus.CrT.events.World.generation;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.sixik.sdmcrtplus.source.events.generations.fillFromNoiseEvent;
import org.openzen.zencode.java.ZenCodeType;

/**
 * The event can be canceled
 *
 * The event is called when the terrain is created. You can change the generation conditions with it.
 */
@ZenRegister
@Document("mods/sdmcrtplus/events/generation/FillFromNoiseEvent")
@NativeTypeRegistration(value = fillFromNoiseEvent.class, zenCodeName = "mods.sdmcrtplus.events.generation.FillFromNoiseEvent")
public class ExpandFillFromNoiseEvent {


    /**
     * The upper threshold of the world.
     */
    @ZenCodeType.Method
    public static int getNumX(fillFromNoiseEvent event){
        return event.getNumX();
    }

    /**
     * The height of the lower border of the world
     */
    @ZenCodeType.Method
    public static int getNumY(fillFromNoiseEvent event){
        return event.getNumY();
    }

    /**
     * Span height from the lower border
     */
    @ZenCodeType.Method
    public static int getNumZ(fillFromNoiseEvent event){
        return event.getNumZ();
    }
    @ZenCodeType.Method
    public static void setNumZ(fillFromNoiseEvent event, int num){
        event.setNumZ(num);
    }
    @ZenCodeType.Method
    public static void setNumY(fillFromNoiseEvent event, int num){
         event.setNumY(num);
    }
    @ZenCodeType.Method
    public static void setNumX(fillFromNoiseEvent event, int num){
         event.setNumX(num);
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Player getPlayer(fillFromNoiseEvent event){
        return event.getPlayer();
    }
}
