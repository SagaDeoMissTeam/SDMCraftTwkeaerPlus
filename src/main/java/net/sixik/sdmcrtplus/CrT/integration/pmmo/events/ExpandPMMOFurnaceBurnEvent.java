package net.sixik.sdmcrtplus.CrT.integration.pmmo.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import harmonised.pmmo.api.events.FurnaceBurnEvent;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "pmmo")
@Document("mods/sdmcrtplus/integration/pmmo/events/FurnaceBurnEvent")
@NativeTypeRegistration(value = FurnaceBurnEvent.class,zenCodeName = "mods.sdmcrtplus.integration.pmmo.events.FurnaceBurnEvent")
public class ExpandPMMOFurnaceBurnEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("input")
    public static ItemStack getInput(FurnaceBurnEvent furnaceBurnEvent){
        return furnaceBurnEvent.getInput();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("level")
    public static Level getLevel(FurnaceBurnEvent furnaceBurnEvent){
        return furnaceBurnEvent.getLevel();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("pos")
    public static BlockPos getPos(FurnaceBurnEvent furnaceBurnEvent){
        return furnaceBurnEvent.getPos();
    }
    @ZenCodeType.Method
    public static boolean isCancelable(FurnaceBurnEvent furnaceBurnEvent){
        return furnaceBurnEvent.isCancelable();
    }
}
