package net.sixik.sdmcrtplus.source.register;

import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.sixik.sdmcrtplus.Sdmcrtplus;

import java.util.ArrayList;
import java.util.List;

public class ModSounds {

    public static final List<SoundEvent> REGISTER = new ArrayList<>();
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Sdmcrtplus.MODID);

    public static void registrySoundEvents(SoundEvent soundEvent){
        if(REGISTER.contains(soundEvent)) return;
        REGISTER.add(soundEvent);
        SOUND_EVENTS.register(soundEvent.getLocation().getPath(), () -> soundEvent);
    }

    public static void  register(IEventBus bus){
        SOUND_EVENTS.register(bus);
    }
}
