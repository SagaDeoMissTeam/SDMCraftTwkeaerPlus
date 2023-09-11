package net.sixik.sdmcrtplus.CrT.integration.enhancedcelestials.lunarevent.customEvent;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import corgitaco.corgilib.entity.condition.AnyCondition;
import corgitaco.corgilib.entity.condition.Condition;
import corgitaco.corgilib.entity.condition.FlipCondition;
import corgitaco.enhancedcelestials.api.lunarevent.LunarMobSettings;
import corgitaco.enhancedcelestials.api.lunarevent.LunarMobSpawnInfo;
import net.minecraft.world.entity.MobCategory;
import net.sixik.sdmcrtplus.SDMConstants;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Document("mods/sdmcrtplus/integration/enhancedcelestials/lunarevent/customEvent/LunarMobSettingsBuilder")
@ZenCodeType.Name("mods.sdmcrtplus.integration.enhancedcelestials.lunarevent.customEvent.LunarMobSettingsBuilder")
@ZenRegister(modDeps = "enhancedcelestials", loaders = SDMConstants.CT_LOADER)
public class LunarMobSettingsBuilder {

    private Map<MobCategory, Double> spawnCategoryMultiplier = new HashMap<>();
    public LunarMobSettings lunarMobSettings;
    @ZenCodeType.Constructor
    public LunarMobSettingsBuilder(){

    }

    @ZenCodeType.Field
    public static final LunarMobSettings DEFAULT = new LunarMobSettings(new HashMap(), LunarMobSpawnInfo.DEFAULT, new ArrayList(), new FlipCondition(AnyCondition.INSTANCE));

    @ZenCodeType.Method
    public LunarMobSettingsBuilder build(Map<MobCategory, Double> spawnCategoryMultiplier, LunarMobSpawnInfoBuilder lunarMobSpawnInfoBuilder){
        this.lunarMobSettings = new LunarMobSettings(spawnCategoryMultiplier, lunarMobSpawnInfoBuilder.getLunarMobSpawnInfo(), new ArrayList<>(), AnyCondition.INSTANCE);
        return this;
    }

    public LunarMobSettings getLunarMobSettings() {
        return lunarMobSettings;
    }
}
