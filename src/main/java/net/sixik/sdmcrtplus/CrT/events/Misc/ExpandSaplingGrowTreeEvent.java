package net.sixik.sdmcrtplus.CrT.events.Misc;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.level.SaplingGrowTreeEvent;
import net.minecraftforge.eventbus.api.Event;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Random;

@ZenRegister
@Document("mods/sdmcrtplus/events/misc/SaplingGrowTreeEvent")
@NativeTypeRegistration(value = SaplingGrowTreeEvent.class, zenCodeName = "mods.sdmcrtplus.events.misc.SaplingGrowTreeEvent")
public class ExpandSaplingGrowTreeEvent {

    @ZenCodeType.Method
    public static Level getWorld(SaplingGrowTreeEvent event){
        return (Level) event.getLevel();
    }
    @ZenCodeType.Method
    public static BlockPos getPos(SaplingGrowTreeEvent event){
        return event.getPos();
    }
    @ZenCodeType.Method
    public static RandomSource getRand(SaplingGrowTreeEvent event){
        return event.getRandomSource();
    }
    @ZenCodeType.Method
    public static Event.Result getResult(SaplingGrowTreeEvent event){
        return event.getResult();
    }
}
