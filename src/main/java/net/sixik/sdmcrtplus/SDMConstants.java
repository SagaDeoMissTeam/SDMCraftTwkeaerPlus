package net.sixik.sdmcrtplus;

import net.minecraft.resources.ResourceLocation;

public class SDMConstants {


    public static final String CT_LOADER = Sdmcrtplus.MODID;
    public static final ResourceLocation PRE_REGISTRY_LOAD_SOURCE = rl("pre_registry");


    private SDMConstants() {}

    public static ResourceLocation rl(final String id) {
        return new ResourceLocation(Sdmcrtplus.MODID, id);
    }
    public static String ln(final String id) {
        return "%s.%s".formatted(Sdmcrtplus.MODID, id);
    }
}
