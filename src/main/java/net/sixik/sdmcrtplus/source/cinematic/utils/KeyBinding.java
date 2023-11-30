package net.sixik.sdmcrtplus.source.cinematic.utils;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.sixik.sdmcrtplus.Sdmcrtplus;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY = "key.category."+ Sdmcrtplus.MODID+".cinematic";
    public static final String KEY_EXIT = "key."+ Sdmcrtplus.MODID+".exit";

    public static final KeyMapping EXIT_KEY = new KeyMapping(KEY_EXIT, KeyConflictContext.GUI,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_K, KEY_CATEGORY);
}
