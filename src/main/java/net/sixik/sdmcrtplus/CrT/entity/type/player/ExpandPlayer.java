package net.sixik.sdmcrtplus.CrT.entity.type.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.PlayerEnderChestContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.openzen.zencode.java.ZenCodeType;

/**
 * @docParam this player
 */
@ZenRegister
@Document("mods/sdmcrtplus/entity/type/player/ExpandPlayer")
@ZenCodeType.Expansion("crafttweaker.api.entity.type.player.Player")
public class ExpandPlayer {

    /**
     Throws an item out of the player's inventory.
     * @param index Slot Index
     * @param isEvent Should the event be called ItemTossEvent ?
     */
    @ZenCodeType.Method
    public static void dropItemFromSlot(Player player, int index, boolean isEvent) {
        player.drop(player.getInventory().getItem(index), isEvent);
        player.getInventory().setItem(index, new ItemStack(Items.AIR));
    }

    /**
     Throws an item in front of the player
     * @param stack The item that will be thrown away
     * @param isEvent Should the event be called ItemTossEvent ?
     */
    @ZenCodeType.Method
    public static void dropItem(Player player, IItemStack stack, boolean isEvent) {
        player.drop(stack.getInternal(), isEvent);
    }

    /**
     Returns the player's ender chest
     */
    @ZenCodeType.Getter("enderChest")
    @ZenCodeType.Method
    public static PlayerEnderChestContainer getEnterChest(Player player){
        return player.getEnderChestInventory();
    }

    @ZenCodeType.Getter("isShiftKeyDown")
    @ZenCodeType.Method
    public static boolean isShiftKeyDown(Player player) {
        return player.isShiftKeyDown();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("xRot")
    public static float getXRot(Player player) {
        return player.xRotO;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("yRot")
    public static float getYRot(Player player) {
        return player.yRotO;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("yHeadRot")
    public static float getYHeadRot(Player player) {
        return player.yHeadRot;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("yBodyRot")
    public static float getYBodyRot(Player player) {
        return player.yBodyRot;
    }

    @ZenCodeType.Method
    @ZenCodeType.Setter("xRot")
    public static void setXRot(Player player, float rot) {
        player.xRotO = rot;
    }

    @ZenCodeType.Method
    @ZenCodeType.Setter("yRot")
    public static void setYRot(Player player, float yaw) {
        player.yRotO = yaw;
    }

    @ZenCodeType.Method
    @ZenCodeType.Setter("yHeadRot")
    public static void setYHeadRot(Player player, float yaw) {
        player.yHeadRot = yaw;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("yHeadRotO")
    public static void setYHeadRotO(Player player, float yaw) {
        player.yHeadRotO = yaw;
    }

    @ZenCodeType.Method
    @ZenCodeType.Setter("yBodyRot")
    public static void setYBodyRot(Player player, float yaw) {
        player.yBodyRot = yaw;
    }

    @ZenCodeType.Method
    @ZenCodeType.Setter("YBodyRotO")
    public static void setYBodyRotO(Player player, float yaw) {
        player.yBodyRotO = yaw;
    }

}
