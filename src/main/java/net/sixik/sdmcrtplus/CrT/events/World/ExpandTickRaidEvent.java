package net.sixik.sdmcrtplus.CrT.events.World;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.level.Level;
import net.sixik.sdmcrtplus.source.events.RaidEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;

@ZenRegister
@Document("mods/sdmcrtplus/events/level/TickRaidEvent")
@NativeTypeRegistration(value = RaidEvent.TickRaidEvent.class, zenCodeName = "mods.sdmcrtplus.events.level.TickRaidEvent")
public class ExpandTickRaidEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("raid")
    public static Raid getRaid(RaidEvent.TickRaidEvent event){
        return event.getRaid();
    }

    @ZenCodeType.Method
    public static boolean isCancelable(RaidEvent.TickRaidEvent event){
        return event.isCancelable();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("world")
    public static Level getWorld(RaidEvent.TickRaidEvent event){
        return event.getWorld();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("raidMap")
    public static Map<Integer, Raid> getRaidMap(RaidEvent.TickRaidEvent event) {
        return event.getRaidMap();
    }
}
