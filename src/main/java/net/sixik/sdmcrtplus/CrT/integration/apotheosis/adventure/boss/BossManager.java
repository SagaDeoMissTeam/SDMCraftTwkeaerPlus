package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.boss;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;
import shadows.apotheosis.adventure.boss.BossItemManager;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/boss/BossManager")
@ZenCodeType.Name("mods.sdmcrtplus.integration.apotheosis.adventure.boss.BossManager")
public class BossManager {

    @ZenCodeType.Method
    public static BossItemManager getBossItemManager(){
        return BossItemManager.INSTANCE;
    }
}
