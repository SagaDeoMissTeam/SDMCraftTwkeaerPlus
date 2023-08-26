package net.sixik.sdmcrtplus.CrT.events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.BabyEntitySpawnEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/living/BabyEntitySpawnEvent")
@NativeTypeRegistration(value = BabyEntitySpawnEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.living.BabyEntitySpawnEvent")
public class ExpandBabyEntitySpawnEvent {

    @ZenCodeType.Getter("entity")
    @ZenCodeType.Method
    public static Entity getChildEntity(BabyEntitySpawnEvent event){
       return event.getChild();
    }
    @ZenCodeType.Getter("age")
    @ZenCodeType.Method
    public static int getChildEntityAge(BabyEntitySpawnEvent event){
       return event.getChild().getAge();
    }
    @ZenCodeType.Setter("entity")
    @ZenCodeType.Method
    public static void setChildEntityBaby(BabyEntitySpawnEvent event, boolean bool){
        event.getChild().setBaby(bool);
    }
    @ZenCodeType.Getter("parentA")
    @ZenCodeType.Method
    public static Entity getParentA(BabyEntitySpawnEvent event){
       return event.getParentA();
    }
    @ZenCodeType.Getter("parentB")
    @ZenCodeType.Method
    public static Entity getParentB(BabyEntitySpawnEvent event){
       return event.getParentB();
    }
    @ZenCodeType.Getter("player")
    @ZenCodeType.Method
    public static Player getCausedByPlayer(BabyEntitySpawnEvent event){
       return event.getCausedByPlayer();
    }
}
