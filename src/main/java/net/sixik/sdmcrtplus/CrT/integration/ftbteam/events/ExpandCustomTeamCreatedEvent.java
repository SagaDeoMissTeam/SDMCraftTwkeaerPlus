package net.sixik.sdmcrtplus.CrT.integration.ftbteam.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.server.level.ServerPlayer;
import net.sixik.sdmcrtplus.source.integration.ftbteam.events.CustomTeamCreatedEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/events/CustomTeamCreatedEvent")
@NativeTypeRegistration(value = CustomTeamCreatedEvent.class,zenCodeName = "mods.sdmcrtplus.integration.ftbteams.events.CustomTeamCreatedEvent")
public class ExpandCustomTeamCreatedEvent {

    @ZenCodeType.Method
    public static ServerPlayer getCreator(CustomTeamCreatedEvent event){
        return event.getCreator();
    }
}
