package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.effect.MobEffectInstance;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyMobEffectInstance")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyMobEffectInstance")
public class ItemLootPropertyMobEffectInstance extends ItemLootPropertyBase{

    public MobEffectInstance[] effectInstance;
    @ZenCodeType.Constructor
    public ItemLootPropertyMobEffectInstance(MobEffectInstance[] effectInstance) {
        this.effectInstance = effectInstance;
    }

    @ZenCodeType.Getter("effect")
    @ZenCodeType.Method
    public MobEffectInstance[] getEffect() {
        return effectInstance;
    }
}
