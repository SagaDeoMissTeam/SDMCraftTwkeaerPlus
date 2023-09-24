package net.sixik.sdmcrtplus.source.integration.majruszsdifficulty;

import com.majruszsdifficulty.undeadarmy.Config;
import com.majruszsdifficulty.undeadarmy.UndeadArmy;
import net.minecraft.server.level.ServerLevel;

public class CustomUndeadArmy extends UndeadArmy {
    public CustomUndeadArmy(ServerLevel level, Config config) {
        super(level, config);
    }
}
