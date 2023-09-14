package net.sixik.sdmcrtplus.CrT.integration.ftbteam;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbteams.data.TeamMessage;
import net.minecraft.network.chat.Component;
import org.openjdk.nashorn.internal.objects.annotations.Constructor;
import org.openzen.zencode.java.ZenCodeType;

import java.util.UUID;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/TeamMessage")
@ZenCodeType.Name("mods.sdmcrtplus.integration.ftbteams.TeamMessage")
public class ExpandTeamMessage {
    public final UUID sender;
    public final long date;
    public final Component text;

    private TeamMessage teamMessage;

    @ZenCodeType.Constructor
    public ExpandTeamMessage(String uuid, long date, Component text){
        this.date = date;
        this.sender = UUID.fromString(uuid);
        this.text = text;
    }
    public ExpandTeamMessage(UUID uuid, long date, Component text){
        this.date = date;
        this.text = text;
        this.sender = uuid;
    }

    @ZenCodeType.Method
    public String getSender(TeamMessage teamMessage){
        return teamMessage.sender.toString();
    }
    @ZenCodeType.Method
    public Component getText(TeamMessage teamMessage){
        return teamMessage.text;
    }
    @ZenCodeType.Method
    public long getDate(TeamMessage teamMessage){
        return teamMessage.date;
    }
    public TeamMessage create(){
        return new TeamMessage(this.sender, this.date, this.text);
    }
}
