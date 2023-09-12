package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.permissions;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.permissions.Action;
import com.minecolonies.api.colony.permissions.ColonyPlayer;
import com.minecolonies.api.colony.permissions.IPermissions;
import com.minecolonies.api.colony.permissions.Rank;
import com.mojang.authlib.GameProfile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/permissions/IPermissions")
@NativeTypeRegistration(value = IPermissions.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.permissions.IPermissions")
public class ExpandIPermissions {

    @ZenCodeType.Method
    public static boolean hasPermission(IPermissions iPermissions, Rank var1,  Action var2){
        return iPermissions.hasPermission(var1,var2);
    }
    @ZenCodeType.Method
    public static Set<ColonyPlayer> getPlayersByRank(IPermissions iPermissions,Rank var1){
        return iPermissions.getPlayersByRank(var1);
    }
    @ZenCodeType.Method
    public static Set<ColonyPlayer> getPlayersByRank(IPermissions iPermissions, Set<Rank> var1){
        return iPermissions.getPlayersByRank(var1);
    }
    @ZenCodeType.Method
    public static Map<Integer, Rank> getRanks(IPermissions iPermissions){
        return iPermissions.getRanks();
    }
    @ZenCodeType.Method
    public static Rank getRank(IPermissions iPermissions,int var1){
        return iPermissions.getRank(var1);
    }
    @ZenCodeType.Method
    public static Rank getRankOwner(IPermissions iPermissions){
        return iPermissions.getRankOwner();
    }
    @ZenCodeType.Method
    public static Rank getRankOfficer(IPermissions iPermissions){
        return iPermissions.getRankOfficer();
    }
    @ZenCodeType.Method
    public static Rank getRankHostile(IPermissions iPermissions){
        return iPermissions.getRankHostile();
    }
    @ZenCodeType.Method
    public static Rank getRankNeutral(IPermissions iPermissions){
        return iPermissions.getRankNeutral();
    }
    @ZenCodeType.Method
    public static Rank getRankFriend(IPermissions iPermissions){
        return iPermissions.getRankFriend();
    }
    @ZenCodeType.Method
    public static boolean hasPermission(IPermissions iPermissions,Player var1, Action var2){
        return iPermissions.hasPermission(var1,var2);
    }
    @ZenCodeType.Method
    public static boolean addPlayer(IPermissions iPermissions, String var1, Rank var2, Level var3){
        return iPermissions.addPlayer(var1,var2,var3);
    }
    @ZenCodeType.Method
    public static boolean addPlayer(IPermissions iPermissions, String var1, String var2, Rank var3){
        return iPermissions.addPlayer(UUID.fromString(var1),var2,var3);
    }
    @ZenCodeType.Method
    public static  String getOwnerName(IPermissions iPermissions){
        return iPermissions.getOwnerName();
    }
    @ZenCodeType.Method
    public static boolean isSubscriber(IPermissions iPermissions, Player var1){
        return iPermissions.isSubscriber(var1);
    }
    @ZenCodeType.Method
    public static boolean isColonyMember(IPermissions iPermissions, Player var1){
        return iPermissions.isColonyMember(var1);
    }
    @ZenCodeType.Method
    public static boolean alterPermission(IPermissions iPermissions,Rank var1, Rank var2,  Action var3, boolean var4){
        return iPermissions.alterPermission(var1,var2,var3,var4);
    }
    @ZenCodeType.Method
    public static Map.@ZenCodeType.Nullable Entry<UUID, ColonyPlayer> getOwnerEntry(IPermissions iPermissions){
        return iPermissions.getOwnerEntry();
    }
    @ZenCodeType.Method
    public static boolean setOwner(IPermissions iPermissions,Player var1){
        return iPermissions.setOwner(var1);
    }
    @ZenCodeType.Method
    public static boolean canAlterPermission(IPermissions iPermissions,Rank var1, Rank var2,  Action var3){
        return iPermissions.canAlterPermission(var1,var2,var3);
    }
    @ZenCodeType.Method
    public static void setOwnerAbandoned(IPermissions iPermissions){
        iPermissions.setOwnerAbandoned();
    }
    @ZenCodeType.Method
    public static String getOwner(IPermissions iPermissions){
        return iPermissions.getOwner().toString();
    }
    @ZenCodeType.Method
    public static  Map<UUID, ColonyPlayer> getPlayers(IPermissions iPermissions){
        return iPermissions.getPlayers();
    }
    @ZenCodeType.Method
    public static boolean setPlayerRank(IPermissions iPermissions,UUID var1, Rank var2, Level var3){
        return iPermissions.setPlayerRank(var1,var2,var3);
    }
    @ZenCodeType.Method
    public static boolean addPlayer(IPermissions iPermissions, GameProfile var1, Rank var2){
        return iPermissions.addPlayer(var1,var2);
    }
    @ZenCodeType.Method
    public static  Rank getRank(IPermissions iPermissions,UUID var1){
        return iPermissions.getRank(var1);
    }
    @ZenCodeType.Method
    public static Rank getRank(IPermissions iPermissions,Player var1){
        return iPermissions.getRank(var1);
    }
    @ZenCodeType.Method
    public static void restoreOwnerIfNull(IPermissions iPermissions){
        iPermissions.restoreOwnerIfNull();
    }
    @ZenCodeType.Method
    public static boolean setPermission(IPermissions iPermissions,Rank var1, Action var2, boolean var3){
        return iPermissions.setPermission(var1,var2,var3);
    }
    @ZenCodeType.Method
    public static boolean removePlayer(IPermissions iPermissions,UUID var1){
        return iPermissions.removePlayer(var1);
    }
    @ZenCodeType.Method
    public static void addRank(IPermissions iPermissions,String var1){
        iPermissions.addRank(var1);
    }
    @ZenCodeType.Method
    public static void removeRank(IPermissions iPermissions,Rank var1){
        iPermissions.removeRank(var1);
    }
    @ZenCodeType.Method
    public static Set<ColonyPlayer> getFilteredPlayers(IPermissions iPermissions, Predicate<Rank> var1){
        return iPermissions.getFilteredPlayers(var1);
    }
}
