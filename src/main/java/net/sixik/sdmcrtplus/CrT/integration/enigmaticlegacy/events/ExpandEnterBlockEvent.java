package net.sixik.sdmcrtplus.CrT.integration.enigmaticlegacy.events;


import com.aizistral.enigmaticlegacy.api.events.EnterBlockEvent;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.block.state.BlockState;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "enigmaticlegacy")
@Document("mods/sdmcrtplus/integration/enigmaticlegacy/events/EnterBlockEvent")
@NativeTypeRegistration(value = EnterBlockEvent.class, zenCodeName = "mods.sdmcrtplus.integration.enigmaticlegacy.events.EnterBlockEvent")
public class ExpandEnterBlockEvent {

    @ZenCodeType.Method
    public static BlockState getBlockState(EnterBlockEvent event){
        return event.getBlockState();
    }
}
