package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyEquipmentArmor")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyEquipmentArmor")
public class ItemLootPropertyEquipmentArmor extends ItemLootPropertyBase{
    public IItemStack helmet;
    public IItemStack chestPlate;
    public IItemStack leggings;
    public IItemStack boots;
    @ZenCodeType.Constructor
    public ItemLootPropertyEquipmentArmor(IItemStack helmet,IItemStack chestPlate,IItemStack leggings,IItemStack boots) {
        this.helmet =helmet;
        this.chestPlate =chestPlate;
        this.leggings = leggings;
        this.boots = boots;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("helmet")
    public IItemStack getHelmet() {
        return helmet;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("chestplate")
    public IItemStack getChestPlate() {
        return chestPlate;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("leggings")
    public IItemStack getLeggings() {
        return leggings;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("boots")
    public IItemStack getBoots() {
        return boots;
    }
}
