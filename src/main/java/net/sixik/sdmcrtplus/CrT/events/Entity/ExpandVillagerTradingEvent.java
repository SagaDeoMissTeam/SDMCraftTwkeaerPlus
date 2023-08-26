package net.sixik.sdmcrtplus.CrT.events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraft.world.entity.player.Player;
import net.sixik.sdmcrtplus.source.events.VillagerTradingEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/entity/living/VillagerTradingEvent")
@NativeTypeRegistration(value = VillagerTradingEvent.class, zenCodeName = "mods.sdmcrtplus.events.entity.living.VillagerTradingEvent")
public class ExpandVillagerTradingEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static IItemStack getItem(VillagerTradingEvent event){
        return new MCItemStack(event.getItemStack());
    }
    @ZenCodeType.Getter("type")
    @ZenCodeType.Method
    public static VillagerType getType(VillagerTradingEvent event){
        return event.getType();
    }
    @ZenCodeType.Getter("profession")
    @ZenCodeType.Method
    public static VillagerProfession getProfession(VillagerTradingEvent event){
        return event.getProfession();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("lastPlayer")
    public static Player getLastPlayer(VillagerTradingEvent event){
        return event.getLastPlayer();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(VillagerTradingEvent event){
        return event.getPlayer();
    }
    @ZenCodeType.Method
    public static boolean isCancelable(VillagerTradingEvent event){
        return event.isCancelable();
    }


}
