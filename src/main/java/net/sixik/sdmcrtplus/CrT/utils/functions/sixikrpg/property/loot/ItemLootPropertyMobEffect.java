package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyMobEffect")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyMobEffect")
public class ItemLootPropertyMobEffect extends ItemLootPropertyBase {

    public MobEffect[] effect;
    @ZenCodeType.Constructor
    public ItemLootPropertyMobEffect(MobEffect[] effect) {
        this.effect = effect;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("effect")
    public MobEffect[] getEffect() {
        return effect;
    }
}
