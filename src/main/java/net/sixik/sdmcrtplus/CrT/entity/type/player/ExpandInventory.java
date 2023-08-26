package net.sixik.sdmcrtplus.CrT.entity.type.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.openzen.zencode.java.ZenCodeType;

/**
 * @docParam this inventory
 */
@ZenRegister
@Document("mods/sdmcrtplus/entity/type/player/ExpandInventory")
@ZenCodeType.Expansion("crafttweaker.api.entity.type.player.Inventory")
public class ExpandInventory {


    /**
     Allows you to get the index of the slot that the player has now selected.
     */
    @ZenCodeType.Getter("indexSelected")
    @ZenCodeType.Method
    public static int getSelectedSlotIndex(Inventory inventory){
        return inventory.selected;
    }

    /**
     Forcibly installs an item into the armor slot
     * @param slot slot index
     * @param item the item to be used
     */
    @ZenCodeType.Method
    public static void setArmorItem(Inventory inventory, int slot, IItemStack item){
        inventory.armor.set(slot, item.getInternal());
    }

    /**
     Returns an item that is equipped in a specific armor slot.
     * @param slot slot index
     * @return
     */
    @ZenCodeType.Method
    public static IItemStack getArmorItem(Inventory inventory, int slot){
        return new MCItemStack(inventory.armor.get(slot));
    }

    /**
     Returns the index of the slot in which the item is located.
     * @param item The item we are looking for
     */
    @ZenCodeType.Method
    public static int getItemSlot(Inventory inventory, IItemStack item){
        for(int i = 0; i < inventory.getContainerSize(); i++){
            if(inventory.getItem(i).equals(item.getInternal())){
                return i;
            }
        }
        return -1;
    }

}
