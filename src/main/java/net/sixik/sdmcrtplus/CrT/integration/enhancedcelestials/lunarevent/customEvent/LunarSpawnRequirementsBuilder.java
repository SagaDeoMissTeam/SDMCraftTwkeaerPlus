package net.sixik.sdmcrtplus.CrT.integration.enhancedcelestials.lunarevent.customEvent;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import corgitaco.enhancedcelestials.api.lunarevent.DefaultLunarEvents;
import corgitaco.enhancedcelestials.api.lunarevent.LunarEvent;
import net.sixik.sdmcrtplus.SDMConstants;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Collection;
import java.util.List;


@Document("mods/sdmcrtplus/integration/enhancedcelestials/lunarevent/customEvent/LunarSpawnRequirementsBuilder")
@ZenCodeType.Name("mods.sdmcrtplus.integration.enhancedcelestials.lunarevent.customEvent.LunarSpawnRequirementsBuilder")
@ZenRegister(modDeps = "enhancedcelestials", loaders = SDMConstants.CT_LOADER)
public class LunarSpawnRequirementsBuilder {

    public LunarEvent.SpawnRequirements SpawnRequirements;

    @ZenCodeType.Constructor
    public LunarSpawnRequirementsBuilder(){
    }

    @ZenCodeType.Field
    public static final List<Integer> DEFAULT_PHASES = DefaultLunarEvents.DEFAULT_PHASES.stream().toList();
    @ZenCodeType.Field
    public static final List<Integer> DEFAULT_SUPER_MOON_PHASES = DefaultLunarEvents.DEFAULT_SUPER_MOON_PHASES.stream().toList();

    @ZenCodeType.Method
    public LunarSpawnRequirementsBuilder create(double chance, int minNumberOfNights, List<Integer> validMoonPhases){
        Collection<Integer> list = validMoonPhases;
        this.SpawnRequirements = new LunarEvent.SpawnRequirements(chance,minNumberOfNights, list);
        return this;
    }

    public LunarEvent.SpawnRequirements getSpawnRequirements(){
        return this.SpawnRequirements;
    }
}
