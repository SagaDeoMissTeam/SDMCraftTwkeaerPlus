package net.sixik.sdmcrtplus.CrT.integration.majruszsdifficulty.events;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.majruszsdifficulty.undeadarmy.UndeadArmy;
import net.minecraft.world.entity.player.Player;
import net.sixik.sdmcrtplus.source.events.mods.majruszsdifficulty.UndeadArmySpawnEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "majruszsdifficulty")
@Document("mods/sdmcrtplus/integration/majruszsdifficulty/events/UndeadArmySpawnEvent")
@NativeTypeRegistration(value = UndeadArmySpawnEvent.class,zenCodeName = "mods.sdmcrtplus.integration.majruszsdifficulty.events.UndeadArmySpawnEvent")
public class ExpandUndeadArmySpawnEvent {
    @ZenCodeType.Method
    public static UndeadArmy getUndeadArmy(UndeadArmySpawnEvent event){
        return event.getUndeadArmy();
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Player getPlayer(UndeadArmySpawnEvent event){
        return event.getPlayer();
    }
}
