package net.sixik.sdmcrtplus.CrT.entity.type.projectile.arrow;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.level.block.state.BlockState;
import net.sixik.sdmcrtplus.mixin.accessor.AbstractArrowAccessor;
import org.openzen.zencode.java.ZenCodeType;

/**
 * @docParam this Arrow
 */
@ZenRegister
@Document("mods/sdmcrtplus/entity/type/projectile/arrow/ExpandArrow")
@ZenCodeType.Expansion("crafttweaker.api.entity.type.projectile.arrow.Arrow")
public class ExpandArrow {

    @ZenCodeType.Method
    public static BlockState getLastState(AbstractArrow arrow){
       return ((AbstractArrowAccessor)arrow).getLastState();
    }
    @ZenCodeType.Method
    public static int getInGroundTime(AbstractArrow arrow){
       return ((AbstractArrowAccessor)arrow).getInGroundTime();
    }
    @ZenCodeType.Method
    public static int getLife(AbstractArrow arrow){
       return ((AbstractArrowAccessor)arrow).getLife();
    }
    @ZenCodeType.Method
    public static boolean isInGround(AbstractArrow arrow){
       return ((AbstractArrowAccessor)arrow).getInGround();
    }
}
