package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/block/BlockPropertyStage")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.block.BlockPropertyStage")
public class BlockPropertyStage extends BlockPropertyBase {
    public String stage;

    @ZenCodeType.Constructor
    public BlockPropertyStage(String stage){
        this.stage = stage;
    }

    @ZenCodeType.Method
    public String getStage() {
        return stage;
    }
}
