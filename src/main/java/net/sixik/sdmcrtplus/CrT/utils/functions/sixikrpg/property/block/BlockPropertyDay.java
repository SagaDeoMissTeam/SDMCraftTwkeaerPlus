package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/block/BlockPropertyDay")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.block.BlockPropertyDay")
public class BlockPropertyDay extends BlockPropertyBase {
    public long day;

    @ZenCodeType.Constructor
    public BlockPropertyDay(long day){
        this.day = day;
    }

    @ZenCodeType.Method
    public long getDay() {
        return day;
    }
}
