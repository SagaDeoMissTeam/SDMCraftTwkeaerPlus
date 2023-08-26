package net.sixik.sdmcrtplus.CrT.events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.AnimalTameEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/player/AnimalTameEvent")
@NativeTypeRegistration(value = AnimalTameEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.player.AnimalTameEvent")
public class ExpandAnimalTameEvent {
    @ZenCodeType.Getter("loveCause")
    @ZenCodeType.Method
    public static ServerPlayer getLoveCause(AnimalTameEvent event){
        return event.getAnimal().getLoveCause();
    }
    @ZenCodeType.Getter("player")
    @ZenCodeType.Method
    public static Player getPlayer(AnimalTameEvent event){
        return event.getTamer();
    }
    @ZenCodeType.Getter("animal")
    @ZenCodeType.Method
    public static Entity getAnimal(AnimalTameEvent event){
        return event.getAnimal();
    }
    @ZenCodeType.Method
    public static void setCancel(AnimalTameEvent event, boolean bool){
        event.setCanceled(bool);
    }
    @ZenCodeType.Method
    public static boolean isCancel(AnimalTameEvent event){
       return event.isCancelable();
    }
}
