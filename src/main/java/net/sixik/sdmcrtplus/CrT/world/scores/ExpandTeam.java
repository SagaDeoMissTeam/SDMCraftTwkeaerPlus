package net.sixik.sdmcrtplus.CrT.world.scores;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.scores.Team;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Collection;

@ZenRegister
@Document("mods/sdmcrtplus/world/scores/Team")
@NativeTypeRegistration(value = Team.class, zenCodeName = "mods.sdmcrtplus.world.scores.Team")
public class ExpandTeam {

    @ZenCodeType.Method
    public static String getName(Team team){
        return team.getName();
    }
    @ZenCodeType.Method
    public static MutableComponent getFormattedName(Team team, Component component){
        return team.getFormattedName(component);
    }
    @ZenCodeType.Method
    public static boolean canSeeFriendlyInvisibles(Team team){
        return team.canSeeFriendlyInvisibles();
    }
    @ZenCodeType.Method
    public static boolean isAllowFriendlyFire(Team team){
        return team.isAllowFriendlyFire();
    }
    @ZenCodeType.Method
    public static Team.Visibility getNameTagVisibility(Team team){
        return team.getNameTagVisibility();
    }
    @ZenCodeType.Method
    public static ChatFormatting getColor(Team team){
        return team.getColor();
    }
    @ZenCodeType.Method
    public static Collection<String> getPlayers(Team team){
        return team.getPlayers();
    }
    @ZenCodeType.Method
    public static Team.Visibility getDeathMessageVisibility(Team team){
        return team.getDeathMessageVisibility();
    }
    @ZenCodeType.Method
    public static Team.CollisionRule getCollisionRule(Team team){
        return team.getCollisionRule();
    }

    @ZenCodeType.Method
    public static boolean isAlliedTo(Team team, Team team2){
        return team.isAlliedTo(team);
    }


    @ZenRegister
    @Document("mods/sdmcrtplus/world/scores/teams/CollisionRule")
    @NativeTypeRegistration(value = Team.CollisionRule.class, zenCodeName = "mods.sdmcrtplus.world.scores.teams.CollisionRule")
    @BracketEnum("sdmcrt:team/collisionrule")
    public static class ExpandCollisionRule{
        @ZenCodeType.Method
        public static int getID(Team.CollisionRule visibility){
            return visibility.id;
        }
        @ZenCodeType.Method
        public static String getName(Team.CollisionRule visibility){
            return visibility.name;
        }
        @ZenCodeType.Method
        public static Component getDisplayName(Team.CollisionRule visibility){
            return visibility.getDisplayName();
        }

    }

    @ZenRegister
    @Document("mods/sdmcrtplus/world/scores/teams/Visibility")
    @NativeTypeRegistration(value = Team.Visibility.class, zenCodeName = "mods.sdmcrtplus.world.scores.teams.Visibility")
    @BracketEnum("sdmcrt:team/visibility")
    public static class ExpandVisibility{
        @ZenCodeType.Method
        public static int getID(Team.Visibility visibility){
            return visibility.id;
        }
        @ZenCodeType.Method
        public static String getName(Team.Visibility visibility){
            return visibility.name;
        }
        @ZenCodeType.Method
        public static Component getDisplayName(Team.Visibility visibility){
            return visibility.getDisplayName();
        }
    }
}
