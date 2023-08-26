package net.sixik.sdmcrtplus.CrT.events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.sixik.sdmcrtplus.source.events.players.PlayerEatFoodEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/player/PlayerEatFoodEvent")
@NativeTypeRegistration(value = PlayerEatFoodEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.player.PlayerEatFoodEvent")
public class ExpandPlayerEatEvent{


    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static IItemStack getItem(PlayerEatFoodEvent event){
        return new MCItemStack(event.getFood());
    }


    @ZenCodeType.Method
    public static boolean isCancelable(PlayerEatFoodEvent event){
        return event.isCancelable();
    }
    @ZenCodeType.Getter("isFastFood")
    @ZenCodeType.Method
    public static boolean isFastFood(PlayerEatFoodEvent event){return event.isFastFood();}
    @ZenCodeType.Method
    @ZenCodeType.Getter("canAlwaysEat")
    public static boolean canAlwaysEat(PlayerEatFoodEvent event){return event.canAlwaysEat();}
    @ZenCodeType.Method
    @ZenCodeType.Getter("isMeat")
    public static boolean isMeat(PlayerEatFoodEvent event){return event.isMeat();}
    @ZenCodeType.Method
    @ZenCodeType.Getter("nutrition")
    public static int getNutrition(PlayerEatFoodEvent event){return event.getNutrition();}
    @ZenCodeType.Method
    @ZenCodeType.Getter("saturation")
    public static float getSaturationModifier(PlayerEatFoodEvent event){return event.getSaturationModifier();}
}