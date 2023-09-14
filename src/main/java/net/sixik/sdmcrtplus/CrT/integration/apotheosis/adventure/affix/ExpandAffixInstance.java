package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.affix;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;
import shadows.apotheosis.adventure.affix.Affix;
import shadows.apotheosis.adventure.affix.AffixInstance;
import shadows.apotheosis.adventure.affix.AffixType;
import shadows.apotheosis.adventure.loot.LootRarity;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/affix/AffixInstance")
@NativeTypeRegistration(value = AffixInstance.class,zenCodeName = "mods.sdmcrtplus.integration.apotheosis.adventure.affix.AffixInstance", constructors =
        @NativeConstructor(value = {@NativeConstructor.ConstructorParameter(
            name = "affix", type = AffixType.class),
        @NativeConstructor.ConstructorParameter(
            name = "stack", type = ItemStack.class
        ),
        @NativeConstructor.ConstructorParameter(
            name = "rarity", type = LootRarity.class
        ),
        @NativeConstructor.ConstructorParameter(
            name = "level", type = Float.class
        )
    })
)
public class ExpandAffixInstance {

    @ZenCodeType.Method
    public static Affix affix(AffixInstance instance){
        return  instance.affix();
    }
    @ZenCodeType.Method
    public static boolean enablesTelepathy(AffixInstance instance){
        return  instance.enablesTelepathy();
    }
    @ZenCodeType.Method
    public static boolean equals(AffixInstance instance, Object object){
        return instance.equals(object);
    }
    @ZenCodeType.Method
    public static float getDamageBonus(AffixInstance instance, MobType type){
        return instance.getDamageBonus(type);
    }
    @ZenCodeType.Method
    public static float getDurabilityBonusPercentage(AffixInstance instance, ServerPlayer player){
        return instance.getDurabilityBonusPercentage(player);
    }
    @ZenCodeType.Method
    public static float level(AffixInstance instance){
        return instance.level();
    }
    @ZenCodeType.Method
    public static ItemStack stack(AffixInstance instance){
        return instance.stack();
    }
}
