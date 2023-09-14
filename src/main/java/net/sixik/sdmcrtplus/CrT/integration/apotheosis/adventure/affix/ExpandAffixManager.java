package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.affix;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import shadows.apotheosis.adventure.affix.AffixManager;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/affix/InstanceAffixManager")
@NativeTypeRegistration(value = AffixManager.class,zenCodeName = "mods.sdmcrtplus.integration.apotheosis.adventure.affix.InstanceAffixManager", constructors = {})
public class ExpandAffixManager {

}
