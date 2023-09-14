package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.affix;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;
import shadows.apotheosis.adventure.affix.AffixHelper;
import shadows.apotheosis.adventure.affix.AffixManager;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/affix/AffixManager")
@ZenCodeType.Name("mods.sdmcrtplus.integration.apotheosis.adventure.affix.AffixManager")
public class SDMAffixManager {

    @ZenCodeType.Method
    public static AffixManager getAffixManager() {
        return AffixManager.INSTANCE;
    }
}
