package net.sixik.sdmcrtplus.CrT.integration.ftbteam;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import dev.ftb.mods.ftblibrary.icon.Color4I;
import dev.ftb.mods.ftbteams.data.PartyTeam;
import dev.ftb.mods.ftbteams.data.PlayerTeam;
import dev.ftb.mods.ftbteams.data.Team;
import dev.ftb.mods.ftbteams.data.TeamManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import org.apache.commons.lang3.tuple.Pair;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/TeamManager")
@NativeTypeRegistration(value = TeamManager.class,zenCodeName = "mods.sdmcrtplus.integration.ftbteams.TeamManager", constructors = {})
public class ExpandTeamManager {
    @ZenCodeType.Method
    public static MinecraftServer getServer(TeamManager teamManager){
         return teamManager.server;
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Team getTeamByID(TeamManager teamManager, String uuid){
         return teamManager.getTeamByID(UUID.fromString(uuid));
    }
    @ZenCodeType.Method
    public static Collection<Team> getTeams(TeamManager teamManager){
         return teamManager.getTeams();
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Team getPlayerTeam(TeamManager teamManager, String uuid){
         return teamManager.getPlayerTeam(UUID.fromString(uuid));
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Team getPlayerTeam(TeamManager teamManager, ServerPlayer player){
         return teamManager.getPlayerTeam(player);
    }
    @ZenCodeType.Method
    public static PlayerTeam getInternalPlayerTeam(TeamManager teamManager, String uuid){
         return teamManager.getInternalPlayerTeam(UUID.fromString(uuid));
    }
    @ZenCodeType.Method
    public static PlayerTeam getInternalPlayerTeam(TeamManager teamManager, ServerPlayer player){
         return teamManager.getInternalPlayerTeam(player.getUUID());
    }
    @ZenCodeType.Method
    public static Pair<Integer, PartyTeam> createParty(TeamManager teamManager, ServerPlayer player, String name){
        try {
            return teamManager.createParty(player,name );
        } catch (CommandSyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @ZenCodeType.Method
    public static Pair<Integer, PartyTeam> createParty(TeamManager tteamManager, ServerPlayer player, String name, @ZenCodeType.Nullable String description, Color4I color4I){
        try {
            return tteamManager.createParty(player, name,description, color4I);
        } catch (CommandSyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Map<String, PlayerTeam> getKnownPlayers(TeamManager teamManager){
        Map<String, PlayerTeam> map = new HashMap<>();
        for(Map.Entry<UUID, PlayerTeam> i : teamManager.getKnownPlayers().entrySet()){
            map.put(i.getKey().toString(), i.getValue());
        }
        return map;
    }
}
