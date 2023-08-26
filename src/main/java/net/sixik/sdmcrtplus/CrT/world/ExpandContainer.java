package net.sixik.sdmcrtplus.CrT.world;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.HashMap;
import java.util.Map;

/**
 * @docParam this container
 */
@ZenRegister
@Document("mods/sdmcrtplus/world/ExpandContainer")
@ZenCodeType.Expansion("crafttweaker.api.world.Container")
public class ExpandContainer {

    /**
     Fills the contents of the container with a loot table.
     * @param resourceLocation Loot table
     * @param context Loot conditions. At which the content will be selected. It is equivalent to when you create a table with some condition. If a player kills a mob with enchantment, loot and so on.
     */
    @ZenCodeType.Method
    public static boolean fill(Container container, Level level, ResourceLocation resourceLocation, LootContext context){
        try {
            LootTable lootTable = level.getServer().getLootTables().get(resourceLocation);
            lootTable.fill(container, context);
            return true;
        } catch (NullPointerException e){
            return false;
        }
    }

    /**
     Allows you to transfer the contents of a container to another container. Without removing items from the portable.
     * @param target The container to which the transfer should be carried out
     */
    @ZenCodeType.Method
    public static boolean transferringContainer(Container container, Container target) {
        if (!container.isEmpty()) {
            Map<Integer, ItemStack> itemsContainer1 = new HashMap<>();
            for (int i = 0; i < container.getContainerSize(); i++) {
                itemsContainer1.put(i, container.getItem(i));
                container.setChanged();
            }
            for (int i = 0; i < target.getContainerSize(); i++) {
                if (i > container.getContainerSize()) return true;
                target.setItem(i, itemsContainer1.get(i));
                target.setChanged();
            }
            return true;
        }
        return false;
    }

    /**
     Allows you to transfer the contents of a container to another container.
     * @param target The container to which the transfer should be carried out
     * @param removeItems Removes items from the container from which the transfer is being made
     */
    @ZenCodeType.Method
    public static boolean transferringContainer(Container container, Container target, boolean removeItems){
        if(!container.isEmpty()){
            Map<Integer, ItemStack> itemsContainer1 = new HashMap<>();
            for(int i = 0; i < container.getContainerSize(); i++){
                if(i > container.getContainerSize()) return true;
                itemsContainer1.put(i,container.getItem(i));
                if(removeItems){
                    container.setItem(i, Items.AIR.getDefaultInstance());
                    container.setChanged();
                }
            }
            for(int i = 0; i < target.getContainerSize(); i++){
                target.setItem(i,itemsContainer1.get(i));
                target.setChanged();
            }
            return true;
        }
        return false;
    }
}
