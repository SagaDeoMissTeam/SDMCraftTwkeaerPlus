package net.sixik.sdmcrtplus.CrT.integration.curios;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.CuriosApi;

import java.util.ArrayList;
import java.util.List;

/**
 * @docParam this player
 */
@ZenRegister(modDeps = "curios")
@Document("mods/sdmcrtplus/integration/curios/ExpandPlayer")
@ZenCodeType.Expansion("crafttweaker.api.entity.type.player.Player")
public class ExpandPlayer {

    @ZenCodeType.Method
    @ZenCodeType.Getter("curioItems")
    public static List<IItemStack> getCurioItems(Player player) {
        List<IItemStack> curioItems = new ArrayList<>();
        CuriosApi.getCuriosHelper().getEquippedCurios(player).ifPresent((handler) -> {
            for (int i = 0; i < handler.getSlots(); i++) {
                curioItems.add(new MCItemStack(handler.getStackInSlot(i)));
            }
        });
        if(curioItems.isEmpty()) return null;
        return curioItems;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("curioSlots")
    public static int getCurioSlots(Player player){
        int[] slots = new int[1];
        CuriosApi.getCuriosHelper().getEquippedCurios(player).ifPresent((handler) ->{
            handler.getSlots();
            slots[0] = handler.getSlots();
        });
        return slots[0];
    }
    @ZenCodeType.Method
    public static IItemStack getStCurioackInSlot(Player player,int slot){
        ItemStack[] item = new ItemStack[1];
        CuriosApi.getCuriosHelper().getEquippedCurios(player).ifPresent((handler) ->{
            item[0] = handler.getStackInSlot(slot);
        });
        if(item[0] == null) return null;
        return new MCItemStack(item[0]);
    }

    @ZenCodeType.Method
    public static int findCurioItemInSlots(Player player,IItemStack item){
        List<Integer> list = new ArrayList<>();
        CuriosApi.getCuriosHelper().getEquippedCurios(player).ifPresent((handler) ->{
            for(int i = 0; i < handler.getSlots(); i++){
                if(handler.getStackInSlot(i) == item.getInternal()){
                    list.add(i);
                    return;
                }
            }
            list.add(-1);
        });

        return list.get(0);
    }
    @ZenCodeType.Method
    public static void setCurioStackInSlot(Player player, IItemStack IItem, int slot){
        CuriosApi.getCuriosHelper().getEquippedCurios(player).ifPresent((handler) ->{
            handler.setStackInSlot(slot, IItem.getInternal());
        });
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("curioVisibleSlots")
    public static int getCurioVisibleSlots(Player player){
        int[] slots = new int[1];
        CuriosApi.getCuriosHelper().getCuriosHandler(player).ifPresent((handler) -> {
            slots[0] = handler.getVisibleSlots();
        });
        return slots[0];
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("curioFortuneBonus")
    public static int getCurioFortuneBonus(Player player){
        int[] slots = new int[1];
        CuriosApi.getCuriosHelper().getCuriosHandler(player).ifPresent((handler) -> {
            slots[0] = handler.getFortuneBonus();
        });
        return slots[0];
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("curioLootingBonus")
    public static int getCurioLootingBonus(Player player){
        int[] slots = new int[1];
        CuriosApi.getCuriosHelper().getCuriosHandler(player).ifPresent((handler) -> {
            slots[0] = handler.getLootingBonus();
        });
        return slots[0];
    }
}
