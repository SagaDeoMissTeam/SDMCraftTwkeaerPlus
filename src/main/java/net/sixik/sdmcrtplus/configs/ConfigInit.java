package net.sixik.sdmcrtplus.configs;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import net.sixik.sdmcrtplus.Sdmcrtplus;

import java.nio.file.Path;

public class ConfigInit {

    public static Path path = FMLPaths.CONFIGDIR.get();
    public static void init(){

        ModLoadingContext.get().registerConfig(
                ModConfig.Type.COMMON,
                ConfigBase.SPEC
        );
        ConfigBase.init(path.resolve(Sdmcrtplus.MODID + "-common.toml"));
    }
}
