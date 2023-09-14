package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.sounds;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.sounds.SoundManager;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/sounds/SoundManager")
@NativeTypeRegistration(value = SoundManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.sounds.SoundManager")
public class ExpandSoundManager {

    @ZenCodeType.Method
    public static void addToQueue(SoundManager soundManager, SoundEvent soundEvent, SoundSource source, int repetitions, int length, BlockPos pos, float volume, float pitch){
        soundManager.addToQueue(soundEvent, source, repetitions, length, pos, volume, pitch);
    }
    @ZenCodeType.Method
    public static void tick(SoundManager soundManager){
        soundManager.tick();
    }
}
