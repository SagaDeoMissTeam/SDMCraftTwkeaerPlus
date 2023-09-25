package net.sixik.sdmcrtplus.CrT.world.level.block;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/block/BucketPickup")
@NativeTypeRegistration(value = BucketPickup.class, zenCodeName = "mods.sdmcrtplus.world.level.block.BucketPickup")
public class ExpandBucketPickup {
    @ZenCodeType.Method
    public static ItemStack pickupBlock(BucketPickup bucketPickup, LevelAccessor levelAccessor, BlockPos pos, BlockState blockState){
        return bucketPickup.pickupBlock(levelAccessor,pos,blockState);
    }

}
