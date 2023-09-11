package net.sixik.sdmcrtplus.source.integration.ftbquest.events;

import dev.ftb.mods.ftbquests.quest.reward.CustomReward;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.eventbus.api.Event;

public class SDMCustomRewardEvent extends Event {
    private CustomReward reward;
    private ServerPlayer player;
    private boolean notify;
    public SDMCustomRewardEvent(CustomReward reward, ServerPlayer player, boolean notify){
        this.reward = reward;
        this.player = player;
        this.notify = notify;
    }

    public CustomReward getReward() {
        return reward;
    }

    public ServerPlayer getPlayer() {
        return player;
    }

    public boolean isNotify() {
        return notify;
    }

}
