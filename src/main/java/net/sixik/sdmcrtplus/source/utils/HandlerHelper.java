package net.sixik.sdmcrtplus.source.utils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.sixik.sdmcrtplus.source.register.ModSounds;

public class HandlerHelper {

    public static SoundEvent registerSound(String soundName) {
        ResourceLocation location = new ResourceLocation("sdmcrtplus", soundName);
        SoundEvent event = new SoundEvent(location);
        ModSounds.registrySoundEvents(event);
        return event;
    }
}
