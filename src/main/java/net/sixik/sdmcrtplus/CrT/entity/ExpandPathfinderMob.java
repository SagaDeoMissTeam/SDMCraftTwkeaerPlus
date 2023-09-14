package net.sixik.sdmcrtplus.CrT.entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.PathfinderMob;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/entity/PathfinderMob")
@NativeTypeRegistration(value = PathfinderMob.class, zenCodeName = "mods.sdmcrtplus.entity.PathfinderMob")
public class ExpandPathfinderMob {

    @ZenCodeType.Method
    public static float getWalkTargetValue(PathfinderMob pathfinderMob, BlockPos blockPos){
        return pathfinderMob.getWalkTargetValue(blockPos);
    }
}
