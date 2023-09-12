package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.jobs;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.jobs.registry.JobEntry;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

import java.util.function.BiFunction;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/jobs/JobEntry")
@NativeTypeRegistration(value = JobEntry.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.jobs.JobEntry")
public class ExpandJobEntry {

    @ZenCodeType.Method
    public static String getTranslationKey(JobEntry jobEntry){
        return jobEntry.getTranslationKey();
    }
    @ZenCodeType.Method
    public static ResourceLocation getKey(JobEntry jobEntry){
        return jobEntry.getKey();
    }
}
