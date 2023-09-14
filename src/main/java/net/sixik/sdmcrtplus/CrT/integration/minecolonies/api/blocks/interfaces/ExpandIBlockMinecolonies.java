package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.blocks.interfaces;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.blocks.interfaces.IBlockMinecolonies;
import com.minecolonies.api.colony.CitizenNameFile;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/blocks/interfaces/IBlockMinecolonies")
@NativeTypeRegistration(value = IBlockMinecolonies.class, zenCodeName = "mods.sdmcrtplus.integration.api.blocks.interfaces.IBlockMinecolonies")
public class ExpandIBlockMinecolonies {

    @ZenCodeType.Method
    public static ResourceLocation getRegistryName(IBlockMinecolonies<?> iBlockMinecolonies){
        return iBlockMinecolonies.getRegistryName();
    }
}
