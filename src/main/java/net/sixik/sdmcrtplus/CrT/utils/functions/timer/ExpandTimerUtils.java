package net.sixik.sdmcrtplus.CrT.utils.functions.timer;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.sixik.sdmcrtplus.source.timer.SDMTimer;
import net.sixik.sdmcrtplus.source.timer.TimerRegister;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/timer/TimerUtils")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.timer.TimerUtils")
public class ExpandTimerUtils {

    @ZenCodeType.Method
    public static Map<Long, SDMTimer> getTimers(){
        return TimerRegister.TIMERS;
    }
}
