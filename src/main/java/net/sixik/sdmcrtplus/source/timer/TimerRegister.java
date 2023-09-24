package net.sixik.sdmcrtplus.source.timer;


import org.jetbrains.annotations.NotNull;

import java.util.*;

public class TimerRegister {

    public static final Map<Long, SDMTimer> TIMERS = new HashMap<>();

    public static void register(SDMTimer timer){
        if(TIMERS.containsKey(timer.getId())) return;
        TIMERS.put(timer.getId(), timer);
    }
}
