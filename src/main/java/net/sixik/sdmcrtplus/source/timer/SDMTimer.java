package net.sixik.sdmcrtplus.source.timer;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class SDMTimer {

    private long id;
    private long currentTime;
    private long endTime;
    private boolean isEnd = false;
    private boolean isStart = false;

    public SDMTimer(int id, long time) {
        this.id = id;
        this.currentTime = 0;
        this.endTime = time;
        this.isEnd = false;
        this.isStart = true;
        TimerRegister.register(this);
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public boolean isStart() {
        return isStart;
    }

    public void addTime(){
        this.currentTime++;
    }

    public long getId() {
        return id;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void setId(long id) {
        this.id = id;
    }

    @SubscribeEvent
    public void tickEvent(TickEvent.ServerTickEvent event){
        if(this.isStart){

            if(this.currentTime >= endTime){
                setEnd(true);
            }

            addTime();
        }
    }


}
