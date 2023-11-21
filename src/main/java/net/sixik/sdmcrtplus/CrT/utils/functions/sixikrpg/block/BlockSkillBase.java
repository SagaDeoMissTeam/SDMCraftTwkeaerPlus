package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.block;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.level.block.state.BlockState;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block.BlockPropertyBase;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/block/BlockSkillBase")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.block.BlockSkillBase")
public class BlockSkillBase {

    public BlockState block;
    public BlockPropertyBase[] property;

    @ZenCodeType.Constructor
    public BlockSkillBase(BlockState block, BlockPropertyBase[] property){
        this.block = block;
        this.property = property;
    }

    @ZenCodeType.Method
    public BlockState getBlock() {
        return block;
    }
    @ZenCodeType.Method
    public BlockPropertyBase[] getProperty() {
        return property;
    }
}
