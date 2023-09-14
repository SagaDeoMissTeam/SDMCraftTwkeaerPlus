package net.sixik.sdmcrtplus.CrT.integration.ftbteam.events;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.server.level.ServerPlayer;
import net.sixik.sdmcrtplus.source.integration.ftbteam.events.CustomPlayerLoggedInAfterTeamEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/events/CustomPlayerLoggedInAfterTeamEvent")
@NativeTypeRegistration(value = CustomPlayerLoggedInAfterTeamEvent.class,zenCodeName = "mods.sdmcrtplus.integration.ftbteams.events.CustomPlayerLoggedInAfterTeamEvent")
public class ExpandCustomPlayerLoggedInAfterTeamEvent {

    @ZenCodeType.Method
    public static ServerPlayer getPlayer(CustomPlayerLoggedInAfterTeamEvent event){
        return event.getPlayer();
    }
}
