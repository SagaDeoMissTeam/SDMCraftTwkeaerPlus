//package net.sixik.sdmcrtplus.CrT.integration.rei;
//
//import com.blamejared.crafttweaker.api.annotation.ZenRegister;
//import com.blamejared.crafttweaker.api.fluid.IFluidStack;
//import com.blamejared.crafttweaker.api.ingredient.IIngredient;
//import com.blamejared.crafttweaker.api.item.IItemStack;
//import dev.latvian.mods.kubejs.integration.rei.REIEvents;
//import me.shedaniel.rei.api.client.REIRuntime;
//import me.shedaniel.rei.api.client.registry.entry.CollapsibleEntryRegistry;
//import me.shedaniel.rei.api.common.entry.EntryStack;
//import me.shedaniel.rei.api.common.util.EntryIngredients;
//import net.minecraft.network.chat.Component;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.crafting.Ingredient;
//import org.openzen.zencode.java.ZenCodeType;
//
//import java.util.List;
//
//@ZenRegister(modDeps = "roughlyenoughitems")
//public class ExpandREI {
//
//    public
//
//    @ZenCodeType.Method
//    public static void groupItems(ResourceLocation groupId, Component description, IItemStack entries){
//        group(groupId, description, EntryIngredients.of(entries.getInternal()));
//    }
//    @ZenCodeType.Method
//    public static void groupFluids(ResourceLocation groupId, Component description, IFluidStack entries){
//        group(groupId, description, EntryIngredients.of(entries.getFluid()));
//    }
//    @ZenCodeType.Method
//    public static void groupItems(ResourceLocation groupId, Component description, IIngredient entries){
//        group(groupId, description, EntryIngredients.ofIngredient(entries.asVanillaIngredient()));
//    }
//    @ZenCodeType.Method
//    public static void groupItems(ResourceLocation groupId, Component description, IItemStack[] entries){
//        for (IItemStack items: entries) {
//            group(groupId, description, EntryIngredients.of(items.getInternal()));
//        }
//    }
//    @ZenCodeType.Method
//    public static void groupItems(ResourceLocation groupId, Component description, IIngredient[] entries){
//        for (IIngredient items: entries) {
//            group(groupId, description, EntryIngredients.ofIngredient(items.asVanillaIngredient()));
//        }
//    }
//
//    public static void group(ResourceLocation groupId, Component description, List<EntryStack<?>> entries){
//        CollapsibleEntryRegistry.getInstance().group(groupId, description, entries);
//    }
//}
