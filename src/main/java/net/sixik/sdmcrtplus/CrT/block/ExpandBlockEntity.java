package net.sixik.sdmcrtplus.CrT.block;


import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.Container;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.openzen.zencode.java.ZenCodeType;

/**
 * @docParam this blockEntity
 */
@ZenRegister
@Document("mods/sdmcrtplus/block/entity/ExpandBlockEntity")
@ZenCodeType.Expansion("crafttweaker.api.block.entity.BlockEntity")
public class ExpandBlockEntity {
    private static boolean onHaveContainer(BlockEntity blockEntity){
        if(blockEntity == null) return false;
        return blockEntity instanceof BaseContainerBlockEntity;
    }

    /**
     Checks if the block has inventory. If there is it will return True otherwise false
     */
    @ZenCodeType.Method
    public static boolean isHaveContainer(BlockEntity entity){
        if(!onHaveContainer(entity)) return false;
        if(entity instanceof BaseContainerBlockEntity block){
            return true;
        }
        return false;
    }

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Container getContainer(BlockEntity entity){
        try {
            if(entity instanceof BaseContainerBlockEntity block){
                return block;
            }
        } catch (NullPointerException ct){
            CraftTweakerAPI.LOGGER.info("Cold not find Container on " + entity.getBlockState().getBlock().getName());
        }
        return null;
    }
}
