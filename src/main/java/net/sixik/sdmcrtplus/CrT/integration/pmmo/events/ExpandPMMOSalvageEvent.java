package net.sixik.sdmcrtplus.CrT.integration.pmmo.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import harmonised.pmmo.api.events.SalvageEvent;
import net.minecraft.core.BlockPos;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "pmmo")
@Document("mods/sdmcrtplus/integration/pmmo/events/SalvageEvent")
@NativeTypeRegistration(value = SalvageEvent.class,zenCodeName = "mods.sdmcrtplus.integration.pmmo.events.SalvageEvent")
public class ExpandPMMOSalvageEvent {
    @ZenCodeType.Method
    @ZenCodeType.Getter("pos")
    public static BlockPos getBlockPos(SalvageEvent salvageEvent){
        return salvageEvent.getBlockPos();
    }
    @ZenCodeType.Method
    public static boolean isCancelable(SalvageEvent salvageEvent){
        return salvageEvent.isCancelable();
    }
}
