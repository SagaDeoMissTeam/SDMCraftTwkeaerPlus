package net.sixik.sdmcrtplus.CrT.integration.ftbteam;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import dev.ftb.mods.ftbteams.data.Team;
import dev.ftb.mods.ftbteams.data.TeamManager;
import dev.ftb.mods.ftbteams.data.TeamMessage;
import dev.ftb.mods.ftbteams.net.SendMessageResponseMessage;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/Team")
@NativeTypeRegistration(value = Team.class,zenCodeName = "mods.sdmcrtplus.integration.ftbteams.Team")
public class ExpandTeam {

    @ZenCodeType.Method
    public static TeamManager getManager(Team team){
        return team.manager;
    }
    @ZenCodeType.Method
    public static List<ServerPlayer> getOnlineMembers(Team team){
        return team.getOnlineMembers();
    }
    @ZenCodeType.Method
    public static String getOwner(Team team){
        return team.getOwner().toString();
    }
    @ZenCodeType.Method
    public static boolean isValid(Team team){
        return team.isValid();
    }
    @ZenCodeType.Method
    public static int msg(Team team, ServerPlayer player, String message){
        try {
            return team.msg(player, message);
        } catch (CommandSyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @ZenCodeType.Method
    public static void sendMessage(Team team, ServerPlayer player, String message){
        team.addMessage(new TeamMessage(player.getUUID(), System.currentTimeMillis(),Component.literal(message)));
        (new SendMessageResponseMessage(player.getUUID(), Component.literal(message))).sendTo(player);
        team.save();
    }
}
