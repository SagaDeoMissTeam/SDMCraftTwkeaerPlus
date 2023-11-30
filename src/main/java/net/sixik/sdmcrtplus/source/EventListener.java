package net.sixik.sdmcrtplus.source;

import net.minecraft.client.Minecraft;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.sixik.sdmcrtplus.Sdmcrtplus;
import net.sixik.sdmcrtplus.source.cinematic.Commands.StartVideoCommand;
import net.sixik.sdmcrtplus.source.client.Screens.TestGUI;
import net.sixik.sdmcrtplus.source.events.LivingEnityKillByPlayerEvent;
import net.sixik.sdmcrtplus.source.events.PortalSpawnEvent;

@Mod.EventBusSubscriber(modid = "sdmcrtplus", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.DEDICATED_SERVER)
public class EventListener {

    @SubscribeEvent
    public static void onEntityDied(LivingDeathEvent event){
        LivingEntity entity = event.getEntity();
        DamageSource damageSource = event.getSource();
        if(damageSource.getDirectEntity() == null || damageSource.getEntity() == null) return;
        if(damageSource.getDirectEntity() instanceof Player || damageSource.getEntity() instanceof Player){
            Player player = (Player) damageSource.getEntity();
            MinecraftForge.EVENT_BUS.post(new LivingEnityKillByPlayerEvent(entity, player, player.getInventory().getSelected()));
        }
    }
    @SubscribeEvent
    public static void onPortalSpawn(BlockEvent.PortalSpawnEvent event){
        if(event.getLevel() == null) return;
        MinecraftForge.EVENT_BUS.post(new PortalSpawnEvent(event.getLevel(), event.getPos(), event.getState(), event.getPortalSize()));
    }
}
