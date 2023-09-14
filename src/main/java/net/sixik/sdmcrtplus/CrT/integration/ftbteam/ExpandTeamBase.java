package net.sixik.sdmcrtplus.CrT.integration.ftbteam;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbteams.data.TeamBase;
import dev.ftb.mods.ftbteams.data.TeamMessage;
import net.minecraft.network.chat.Component;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/TeamBase")
@NativeTypeRegistration(value = TeamBase.class,zenCodeName = "mods.sdmcrtplus.integration.ftbteams.TeamBase")
public class ExpandTeamBase {

    @ZenCodeType.Method
    public static Component getName(TeamBase teamBase){
        return teamBase.getName();
    }
    @ZenCodeType.Method
    public static Component getColoredName(TeamBase teamBase){
        return teamBase.getColoredName();
    }
    @ZenCodeType.Method
    public static int getColor(TeamBase teamBase){
        return teamBase.getColor();
    }
    @ZenCodeType.Method
    public static int getMaxMessageHistorySize(TeamBase teamBase){
        return teamBase.getMaxMessageHistorySize();
    }
    @ZenCodeType.Method
    public static String getDescription(TeamBase teamBase){
        return teamBase.getDescription();
    }
    @ZenCodeType.Method
    public static String getUUID(TeamBase teamBase){
        return teamBase.getId().toString();
    }
    @ZenCodeType.Method
    public static String getStringID(TeamBase teamBase){
        return teamBase.getStringID();
    }
    @ZenCodeType.Method
    public static List<String> getMembers(TeamBase teamBase){
        List<String> UUIDLISt = new ArrayList<>();
        for(UUID i : teamBase.getMembers()){
            UUIDLISt.add(i.toString());
        }
        return UUIDLISt;
    }

    @ZenCodeType.Method
    public static void addMessage(TeamBase teamBase, ExpandTeamMessage message){
        teamBase.addMessage(message.create());
    }
    @ZenCodeType.Method
    public static boolean isMember(TeamBase teamBase, String uuid){
        return teamBase.isMember(UUID.fromString(uuid));
    }
    @ZenCodeType.Method
    public static boolean isAlly(TeamBase teamBase, String uuid){
        return teamBase.isAlly(UUID.fromString(uuid));
    }
    @ZenCodeType.Method
    public static boolean isInvited(TeamBase teamBase, String uuid){
        return teamBase.isInvited(UUID.fromString(uuid));
    }
    @ZenCodeType.Method
    public static boolean isOfficer(TeamBase teamBase, String uuid){
        return teamBase.isOfficer(UUID.fromString(uuid));
    }
    @ZenCodeType.Method
    public static boolean isFreeToJoin(TeamBase teamBase){
        return teamBase.isFreeToJoin();
    }

    @ZenCodeType.Method
    public static List<ExpandTeamMessage> getMessage(TeamBase teamBase){
        List<ExpandTeamMessage> teamMessages = new ArrayList<>();
        for(TeamMessage teamMessage : teamBase.getMessageHistory()){
            teamMessages.add(new ExpandTeamMessage(teamMessage.sender, teamMessage.date, teamMessage.text));
        }
        return teamMessages;
    }
}
