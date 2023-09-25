package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.blocks;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.blocks.AbstractBlockBarrel;
import com.minecolonies.api.blocks.AbstractBlockMinecolonies;
import com.minecolonies.api.tileentities.AbstractTileEntityBarrel;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/blocks/AbstractBlockBarrel")
@NativeTypeRegistration(value = AbstractBlockBarrel.class, zenCodeName = "mods.sdmcrtplus.integration.api.blocks.AbstractBlockBarrel")
public class ExpandAbstractBlockBarrel {

}
