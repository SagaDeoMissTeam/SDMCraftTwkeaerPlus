package net.sixik.sdmcrtplus.CrT.integration.apotheosis.events;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.sixik.sdmcrtplus.source.integration.apotheosis.events.SpawnBossEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/events/SpawnBossEvent")
@NativeTypeRegistration(value = SpawnBossEvent.class,zenCodeName = "mods.sdmcrtplus.integration.apotheosis.events.SpawnBossEvent")
public class ExpandSpawnBossEvent {

    @ZenCodeType.Method
    public static BlockPos getPosSpawn(SpawnBossEvent spawnBossEvent){
        return spawnBossEvent.getPosSpawn();
    }
    @ZenCodeType.Method
    public static LivingEntity getTarget(SpawnBossEvent spawnBossEvent) {
        return spawnBossEvent.getTarget();
    }
}
