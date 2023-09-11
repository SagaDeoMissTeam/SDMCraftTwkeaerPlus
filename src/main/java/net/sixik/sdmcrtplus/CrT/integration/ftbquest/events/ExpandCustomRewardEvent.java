package net.sixik.sdmcrtplus.CrT.integration.ftbquest.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbquests.quest.reward.CustomReward;
import net.minecraft.server.level.ServerPlayer;
import net.sixik.sdmcrtplus.source.integration.ftbquest.events.SDMCustomRewardEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbquests")
@Document("mods/sdmcrtplus/integration/ftbquest/events/CustomRewardEvent")
@NativeTypeRegistration(value = SDMCustomRewardEvent.class, zenCodeName = "mods.sdmcrtplus.integration.ftbquest.events.CustomRewardEvent")
public class ExpandCustomRewardEvent {

    @ZenCodeType.Method
    public static ServerPlayer getPlayer(SDMCustomRewardEvent event){
        return event.getPlayer();
    }
    @ZenCodeType.Method
    public static CustomReward getReward(SDMCustomRewardEvent event){
        return event.getReward();
    }

    @ZenCodeType.Method
    public static boolean isNotify(SDMCustomRewardEvent event){
      return event.isNotify();
    }
}
