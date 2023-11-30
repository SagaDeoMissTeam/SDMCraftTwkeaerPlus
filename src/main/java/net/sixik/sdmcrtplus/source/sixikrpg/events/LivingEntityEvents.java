package net.sixik.sdmcrtplus.source.sixikrpg.events;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sixik.sdmcrtplus.Sdmcrtplus;
import net.sixik.sdmcrtplus.configs.ConfigBase;
import net.sixik.sdmcrtplus.source.cinematic.Commands.StartVideoCommand;
import net.sixik.sdmcrtplus.source.sixikrpg.events.logic.BlockLogic;
import net.sixik.sdmcrtplus.source.sixikrpg.register.EntityRegisters;

@Mod.EventBusSubscriber(modid = "sdmcrtplus", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.DEDICATED_SERVER)
public class LivingEntityEvents {

    @SubscribeEvent
    public static void onEntityDead(LivingDeathEvent event) {
        if (ConfigBase.RPG_MODULE.get() && ConfigBase.ELEMENTS_MOBS.get()) {
            if (event.getEntity().level.isClientSide) return;
            EntityElements.logicEntityElements(event.getEntity(), event.getSource().getDirectEntity(), event.getSource().getEntity());
        }
    }

    @SubscribeEvent
    public static void onPlayerBlockBreak(BlockEvent.BreakEvent event){
        if(ConfigBase.BLOCK_SKILL.get()){
            if (EntityRegisters.BLOCK_SKILL_BASES_LIST.isEmpty()) return;
            if(event.getPlayer().level.isClientSide) return;
            BlockLogic.logicBlockSkillBreak(event.getState(), event);
        }
    }

    @SubscribeEvent
    public static void onPlayerBlockBreakSpeed(PlayerEvent.BreakSpeed event){
        if(ConfigBase.BLOCK_SKILL.get()) {
            if (EntityRegisters.BLOCK_SKILL_BASES_LIST.isEmpty()) return;
            BlockLogic.logicBlockSkillBreakSpeed(event.getState(), event);
        }
    }



    @SubscribeEvent
    public void onCommandRegister(RegisterCommandsEvent e){
        StartVideoCommand.register(e.getDispatcher());
    }
}
