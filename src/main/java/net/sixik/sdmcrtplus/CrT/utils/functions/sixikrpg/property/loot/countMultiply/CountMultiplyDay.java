package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot.countMultiply;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/countMultiply/CountMultiplyDay")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.countMultiply.CountMultiplyDay")
public class CountMultiplyDay extends CountMultiplyBase{

    public long day;

    @ZenCodeType.Constructor
    public CountMultiplyDay(long day){
        this.day = day;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("day")
    public long getDay() {
        return day;
    }
}
