package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICivilianData;
import com.minecolonies.api.entity.citizen.AbstractCivilianEntity;
import com.minecolonies.api.sounds.SoundManager;
import net.minecraft.world.entity.player.Player;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/AbstractCivilianEntity")
@NativeTypeRegistration(value = AbstractCivilianEntity.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.AbstractCivilianEntity")
public class ExpandAbstractCivilianEntity {


}
