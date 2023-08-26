package net.sixik.sdmcrtplus.CrT.events.Misc;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.level.ExplosionEvent;
import net.minecraftforge.eventbus.api.Event;
import org.openzen.zencode.java.ZenCodeType;

import java.util.HashMap;
import java.util.Map;

@ZenRegister
@Document("mods/sdmcrtplus/events/misc/ExplosionEvent")
@NativeTypeRegistration(value = ExplosionEvent.class, zenCodeName = "mods.sdmcrtplus.events.misc.ExplosionEvent")
public class ExpandExplosionEvent {
    @ZenCodeType.Method
    public static Explosion getExplosion(ExplosionEvent event){
        return event.getExplosion();
    }
    @ZenCodeType.Method
    public static Level getWorld(ExplosionEvent event){
        return event.getLevel();
    }
    @ZenCodeType.Method
    public static Event.Result getResult(ExplosionEvent event){
        return event.getResult();
    }
    @ZenCodeType.Method
    public static Vec3 getPos(ExplosionEvent event){
        return event.getExplosion().getPosition();

    }
}
