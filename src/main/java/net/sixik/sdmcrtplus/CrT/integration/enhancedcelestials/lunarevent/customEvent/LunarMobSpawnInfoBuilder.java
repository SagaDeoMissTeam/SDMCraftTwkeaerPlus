package net.sixik.sdmcrtplus.CrT.integration.enhancedcelestials.lunarevent.customEvent;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import corgitaco.enhancedcelestials.api.lunarevent.LunarMobSpawnInfo;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.sixik.sdmcrtplus.SDMConstants;
import org.openzen.zencode.java.ZenCodeType;

@Document("mods/sdmcrtplus/integration/enhancedcelestials/lunarevent/customEvent/LunarMobSpawnInfoBuilder")
@ZenCodeType.Name("mods.sdmcrtplus.integration.enhancedcelestials.lunarevent.customEvent.LunarMobSpawnInfoBuilder")
@ZenRegister(modDeps = "enhancedcelestials", loaders = SDMConstants.CT_LOADER)
public class LunarMobSpawnInfoBuilder {
    public LunarMobSpawnInfo lunarMobSpawnInfo;

    @ZenCodeType.Constructor
    public LunarMobSpawnInfoBuilder(){

    }

    @ZenCodeType.Method
    public LunarMobSpawnInfoBuilder build(boolean useBiomeSpawnSettings, boolean forceSurfaceSpawning, boolean slimesSpawnEverywhere){
        this.lunarMobSpawnInfo = new LunarMobSpawnInfo(useBiomeSpawnSettings, forceSurfaceSpawning, slimesSpawnEverywhere, MobSpawnSettings.EMPTY);
        return this;
    }

    public LunarMobSpawnInfo getLunarMobSpawnInfo(){
        return this.lunarMobSpawnInfo;
    }
}
