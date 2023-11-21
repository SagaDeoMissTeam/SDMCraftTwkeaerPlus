package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.block.destroy.BlockPropertyDestroy;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/block/BlockExplosion")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.block.BlockExplosion")
public class BlockExplosion extends BlockPropertyDestroy {

    public double radius;
    public double strange;
    public double chance;

    @ZenCodeType.Constructor
    public BlockExplosion(double radius, double strange, double chance ){
        this.radius =radius;
        this.strange =strange;
        this.chance = chance;
    }
    @ZenCodeType.Method
    public double getChance() {
        return chance;
    }
    @ZenCodeType.Method
    public double getRadius() {
        return radius;
    }

    @ZenCodeType.Method
    public double getStrange() {
        return strange;
    }
}
