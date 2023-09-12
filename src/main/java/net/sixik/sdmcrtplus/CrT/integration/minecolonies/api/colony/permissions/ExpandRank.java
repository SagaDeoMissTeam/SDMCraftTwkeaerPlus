package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.permissions;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.permissions.Action;
import com.minecolonies.api.colony.permissions.Rank;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/permissions/Rank")
@NativeTypeRegistration(value = Rank.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.permissions.Rank",
constructors = @NativeConstructor(value = {
        @NativeConstructor.ConstructorParameter(
            name = "id", type = Integer.class
        ),
        @NativeConstructor.ConstructorParameter(
            name = "name", type = String.class
        ),
        @NativeConstructor.ConstructorParameter(
                name = "isSubscriber", type = Boolean.class
        ),
        @NativeConstructor.ConstructorParameter(
                name = "isInitial", type = Boolean.class
        ),
        @NativeConstructor.ConstructorParameter(
                name = "isColonyManager", type = Boolean.class
        ),
        @NativeConstructor.ConstructorParameter(
                name = "isHostile", type = Boolean.class
        )
}))
public class ExpandRank {
    @ZenCodeType.Method
    public static boolean addPermission(Rank rank, Action action){
        return rank.addPermission(action);
    }
    @ZenCodeType.Method
    public static boolean isInitial(Rank rank){
        return rank.isInitial();
    }
    @ZenCodeType.Method
    public static boolean isColonyManager(Rank rank){
        return rank.isColonyManager();
    }
    @ZenCodeType.Method
    public static boolean isHostile(Rank rank){
        return rank.isHostile();
    }
    @ZenCodeType.Method
    public static boolean isSubscriber(Rank rank){
        return rank.isSubscriber();
    }
    @ZenCodeType.Method
    public static boolean isInitial(Rank rank, Action action){
        return rank.removePermission(action);
    }
    @ZenCodeType.Method
    public static int compareTo(Rank rank, Rank rank2){
        return rank.compareTo(rank2);
    }
    @ZenCodeType.Method
    public static int getId(Rank rank){
        return rank.getId();
    }
    @ZenCodeType.Method
    public static String getName(Rank rank){
        return rank.getName();
    }
    @ZenCodeType.Method
    public static long getPermissions(Rank rank){
        return rank.getPermissions();
    }
    @ZenCodeType.Method
    public static void setColonyManager(Rank rank, boolean var1) {
        rank.setColonyManager(var1);
    }
    @ZenCodeType.Method
    public static void setHostile(Rank rank, boolean var1){
         rank.setHostile(var1);
    }
    @ZenCodeType.Method
    public static void setSubscriber(Rank rank, boolean var1){
         rank.setSubscriber(var1);
    }
}
