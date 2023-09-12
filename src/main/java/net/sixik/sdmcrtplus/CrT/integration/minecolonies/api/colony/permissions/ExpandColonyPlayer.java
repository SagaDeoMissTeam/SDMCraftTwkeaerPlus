package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.permissions;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.permissions.ColonyPlayer;
import com.minecolonies.api.colony.permissions.Rank;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/permissions/ColonyPlayer")
@NativeTypeRegistration(value = ColonyPlayer.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.permissions.ColonyPlayer")
public class ExpandColonyPlayer {

    @ZenCodeType.Method
    public static String getID(ColonyPlayer player){
        return player.getID().toString();
    }
    @ZenCodeType.Method
    public static String getName(ColonyPlayer player){
        return player.getName();
    }
    @ZenCodeType.Method
    public static Rank getRank(ColonyPlayer player){
        return player.getRank();
    }
    @ZenCodeType.Method
    public static void setRank(ColonyPlayer player, Rank rank){
         player.setRank(rank);
    }
}
