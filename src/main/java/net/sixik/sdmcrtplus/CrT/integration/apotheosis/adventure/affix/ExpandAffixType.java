package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.affix;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;
import shadows.apotheosis.adventure.affix.AffixType;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/affix/AffixType")
@NativeTypeRegistration(value = AffixType.class,zenCodeName = "mods.sdmcrtplus.integration.apotheosis.adventure.affix.AffixType")
@BracketEnum("apotheosis:affix/type")
public class ExpandAffixType {

    @ZenCodeType.Method
    public static boolean needsValidation(AffixType affixType){
        return affixType.needsValidation();
    }
}
