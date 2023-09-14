package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.affix;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import org.openzen.zencode.java.ZenCodeType;
import shadows.apotheosis.adventure.affix.Affix;
import shadows.apotheosis.adventure.affix.AffixHelper;
import shadows.apotheosis.adventure.affix.AffixInstance;

import java.util.Map;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/affix/AffixHelper")
@ZenCodeType.Name("mods.sdmcrtplus.integration.apotheosis.adventure.affix.AffixHelper")
public class ExpandAffixHelper {

    @ZenCodeType.Method
    public static void applyAffix(IItemStack itemStack, AffixInstance affix){
        AffixHelper.applyAffix(itemStack.getInternal(), affix);
    }
    @ZenCodeType.Method
    public static void applyAffix(IItemStack itemStack, Map<Affix, AffixInstance> affixes){
        AffixHelper.setAffixes(itemStack.getInternal(), affixes);
    }
    @ZenCodeType.Method
    public static void addLore(IItemStack itemStack, Component lore){
        AffixHelper.addLore(itemStack.getInternal(), lore);
    }
    @ZenCodeType.Method
    public static Map<Affix, AffixInstance> getAffixes(IItemStack itemStack){
      return  AffixHelper.getAffixes(itemStack.getInternal());
    }
    @ZenCodeType.Method
    public static Map<Affix, AffixInstance> getAffixes(Entity entity){
       return AffixHelper.getAffixes(entity);
    }
}
