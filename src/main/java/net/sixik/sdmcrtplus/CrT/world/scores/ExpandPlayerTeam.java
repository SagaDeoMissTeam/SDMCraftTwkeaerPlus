package net.sixik.sdmcrtplus.CrT.world.scores;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.scores.PlayerTeam;

@ZenRegister
@Document("mods/sdmcrtplus/world/scores/PlayerTeam")
@NativeTypeRegistration(value = PlayerTeam.class, zenCodeName = "mods.sdmcrtplus.world.scores.PlayerTeam")
public class ExpandPlayerTeam {
}
