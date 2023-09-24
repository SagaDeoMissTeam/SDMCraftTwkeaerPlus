package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.ai;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.entity.ai.Status;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/ai/Status")
@NativeTypeRegistration(value = Status.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.ai.Status")
@BracketEnum("minecolonies:ai/status")
public class ExpandStatus {
}
