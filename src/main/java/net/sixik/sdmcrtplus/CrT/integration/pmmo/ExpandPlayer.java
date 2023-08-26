package net.sixik.sdmcrtplus.CrT.integration.pmmo;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import harmonised.pmmo.api.APIUtils;
import net.minecraft.world.entity.player.Player;
import org.openzen.zencode.java.ZenCodeType;

/**
 * @docParam this player
 */
@ZenRegister(modDeps = "pmmo")
@Document("mods/sdmcrtplus/integration/pmmo/ExpandPlayer")
@ZenCodeType.Expansion("crafttweaker.api.entity.type.player.Player")
public class ExpandPlayer {

    @ZenCodeType.Method
    public static void setPMMOLevel(Player player, String skill, int level) {
        APIUtils.setLevel(skill, player, level);
    }

    @ZenCodeType.Method
    public static int getPMMOLevel(Player player, String skill) {
        return APIUtils.getLevel(skill, player);
    }

    @ZenCodeType.Method
    public static boolean addPMMOLevel(Player player, String skill, int levelChange) {
        return APIUtils.addLevel(skill, player, levelChange);
    }
    @ZenCodeType.Method
    public static long getPMMOXp(Player player, String skill) {
        return APIUtils.getXp(skill, player);
    }
    @ZenCodeType.Method
    public static void setPMMOXp(Player player, String skill, long xpRaw) {
        APIUtils.setXp(skill, player, xpRaw);

    }
    @ZenCodeType.Method
    public static void addPMMOXp(Player player, String skill, long change) {
        APIUtils.addXp(skill, player, change);

    }
}
