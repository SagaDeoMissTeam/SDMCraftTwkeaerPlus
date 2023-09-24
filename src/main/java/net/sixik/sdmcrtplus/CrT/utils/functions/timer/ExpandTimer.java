package net.sixik.sdmcrtplus.CrT.utils.functions.timer;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.sixik.sdmcrtplus.source.timer.SDMTimer;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/timer/Timer")
@NativeTypeRegistration(value = SDMTimer.class, zenCodeName = "mods.sdmcrtplus.utils.functions.timer.Timer",
        constructors = @NativeConstructor(value = {
                @NativeConstructor.ConstructorParameter(
                        name = "id", type = int.class
                ),
                @NativeConstructor.ConstructorParameter(
                        name = "time", type = long.class
                )}
        ))
public class ExpandTimer {

    @ZenCodeType.Method
    public static long getId(SDMTimer timer){
        return timer.getId();
    }
    @ZenCodeType.Method
    public static long getCurrentTime(SDMTimer timer){
        return timer.getCurrentTime();
    }
@ZenCodeType.Method
    public static long getEndTime(SDMTimer timer) {
        return timer.getEndTime();
    }
    @ZenCodeType.Method
    public static void setEnd(SDMTimer timer,boolean end) {
        timer.setEnd(end);
    }
    @ZenCodeType.Method
    public static void setStart(SDMTimer timer,boolean start) {
        timer.setStart(start);
    }
    @ZenCodeType.Method
    public static boolean isEnd(SDMTimer timer) {
        return timer.isEnd();
    }
    @ZenCodeType.Method
    public static boolean isStart(SDMTimer timer) {
        return timer.isStart();
    }
    @ZenCodeType.Method
    public static void addTime(SDMTimer timer){
        timer.addTime();
    }

    @ZenCodeType.Method
    public static void setCurrentTime(SDMTimer timer,long currentTime) {
        timer.setCurrentTime(currentTime);
    }
    @ZenCodeType.Method
    public static void setEndTime(SDMTimer timer, long endTime) {
        timer.setEndTime(endTime);
    }
    @ZenCodeType.Method
    public static void setId(SDMTimer timer,long id) {
        timer.setId(id);
    }
}
