package net.sixik.sdmcrtplus.CrT.integration.majruszsdifficulty;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.majruszsdifficulty.Registries;
import com.majruszsdifficulty.undeadarmy.UndeadArmyManager;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "majruszsdifficulty")
@Document("mods/sdmcrtplus/integration/majruszsdifficulty/UndeadArmyUtils")
@ZenCodeType.Name("mods.sdmcrtplus.integration.majruszsdifficulty.UndeadArmyUtils")
public class ExpandUndeadArmyUtils {

    @ZenCodeType.Method
    public static UndeadArmyManager getUndeadArmyManager(){
        return Registries.getUndeadArmyManager();
    }
}
