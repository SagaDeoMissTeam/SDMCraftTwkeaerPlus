package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block.interact;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.level.block.state.BlockState;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/block/interact/BlockTransmutation")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.block.interact.BlockTransmutation")
public class BlockTransmutation {

    public BlockState transmutable;

    @ZenCodeType.Constructor
    public BlockTransmutation(BlockState transmutable){
        this.transmutable = transmutable;
    }

    @ZenCodeType.Method
    public BlockState getTransmutable() {
        return transmutable;
    }
}
