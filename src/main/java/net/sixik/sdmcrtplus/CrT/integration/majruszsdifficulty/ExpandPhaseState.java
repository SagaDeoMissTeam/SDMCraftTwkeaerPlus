package net.sixik.sdmcrtplus.CrT.integration.majruszsdifficulty;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.majruszsdifficulty.undeadarmy.data.Phase;

@ZenRegister(modDeps = "majruszsdifficulty")
@Document("mods/sdmcrtplus/integration/majruszsdifficulty/PhaseState")
@NativeTypeRegistration(value = Phase.State.class,zenCodeName = "mods.sdmcrtplus.integration.majruszsdifficulty.PhaseState")
@BracketEnum("majruszsdifficulty:phase/state")
public class ExpandPhaseState {

}
