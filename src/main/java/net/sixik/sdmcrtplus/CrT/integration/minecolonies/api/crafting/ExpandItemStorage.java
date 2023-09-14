package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.crafting;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.CitizenNameFile;
import com.minecolonies.api.crafting.ImmutableItemStorage;
import com.minecolonies.api.crafting.ItemStorage;
import com.minecolonies.api.util.ItemStackUtils;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/crafting/ItemStorage")
@NativeTypeRegistration(value = ItemStorage.class, zenCodeName = "mods.sdmcrtplus.integration.api.crafting.ItemStorage", constructors = {
        @NativeConstructor(value = {@NativeConstructor.ConstructorParameter(name = "item", type = ItemStack.class)}
        ),
        @NativeConstructor(value = {@NativeConstructor.ConstructorParameter(name = "amount", type = Integer.class)}
        ),
        @NativeConstructor(value = {@NativeConstructor.ConstructorParameter(name = "ignoreDamageValue", type = Boolean.class)}
        )
})
public class ExpandItemStorage {

    @ZenCodeType.Method
    public  static ItemStack getItemStack(ItemStorage itemStorage) {
        return itemStorage.getItemStack();
    }
    @ZenCodeType.Method
    public static int getAmount(ItemStorage itemStorage) {
        return itemStorage.getAmount();
    }
    @ZenCodeType.Method
    public static void setAmount(ItemStorage itemStorage, int amount) {
        itemStorage.setAmount(amount);
    }
    @ZenCodeType.Method
    public static boolean ignoreDamageValue(ItemStorage itemStorage) {
        return itemStorage.ignoreDamageValue();
    }
    @ZenCodeType.Method
    public static boolean ignoreNBT(ItemStorage itemStorage) {
        return itemStorage.ignoreNBT();
    }
    @ZenCodeType.Method
    public static List<Integer> getCreativeTabIndex(ItemStorage itemStorage) {
        return itemStorage.getCreativeTabIndex();
    }
    @ZenCodeType.Method
    public static int getPrimaryCreativeTabIndex(ItemStorage itemStorage) {
        return itemStorage.getPrimaryCreativeTabIndex();
    }
    @ZenCodeType.Method
    public static String toString(ItemStorage itemStorage) {
        return itemStorage.toString();
    }
    @ZenCodeType.Method
    public static int hashCode(ItemStorage itemStorage) {
        return itemStorage.hashCode();
    }
    @ZenCodeType.Method
    public static boolean equals(ItemStorage itemStorage, Object o) {
        return itemStorage.equals(o);
    }
    @ZenCodeType.Method
    public static boolean matchDefinitionEquals(ItemStorage itemStorage,ItemStorage that) {
        return itemStorage.matchDefinitionEquals(that);
    }
    @ZenCodeType.Method
    public static Item getItem(ItemStorage itemStorage) {
       return itemStorage.getItem();
    }
    @ZenCodeType.Method
    public static int getDamageValue(ItemStorage itemStorage) {
        return itemStorage.getDamageValue();
    }
    @ZenCodeType.Method
    public static int getRemainingDurablityValue(ItemStorage itemStorage) {
        return itemStorage.getRemainingDurablityValue();
    }
    @ZenCodeType.Method
    public static boolean isEmpty(ItemStorage itemStorage) {
        return itemStorage.isEmpty();
    }
    @ZenCodeType.Method
    public static ItemStorage copy(ItemStorage itemStorage) {
        return itemStorage.copy();
    }
//    @ZenCodeType.Method
//    public static ImmutableItemStorage toImmutable(ItemStorage itemStorage) {
//        return itemStorage.toImmutable();
//    }
}
