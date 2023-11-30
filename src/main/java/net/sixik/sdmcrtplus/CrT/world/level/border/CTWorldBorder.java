package net.sixik.sdmcrtplus.CrT.world.level.border;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.level.border.WorldBorder;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/border/CTWorldBorder")
@ZenCodeType.Name("mods.sdmcrtplus.world.level.border.CTWorldBorder")
public class CTWorldBorder extends WorldBorder{

    @ZenCodeType.Field
    public static final WorldBorder.Settings DEFAULT_SETTINGS = WorldBorder.DEFAULT_SETTINGS;

    @ZenCodeType.Constructor
    public CTWorldBorder(){

    }

    @ZenCodeType.Constructor
    public CTWorldBorder(double centerX, double centerZ, int absoluteMaxSize, double size, double damagePerBlock, double damageSafeZone){
        setCenter(centerX, centerZ);
        setAbsoluteMaxSize(absoluteMaxSize);
        setDamagePerBlock(damagePerBlock);
        setDamageSafeZone(damageSafeZone);
        setSize(size);
    }

}
