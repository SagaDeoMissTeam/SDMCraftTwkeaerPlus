package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IVisitorData;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;

import java.util.UUID;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/IVisitorData")
@NativeTypeRegistration(value = IVisitorData.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.IVisitorData")
public class ExpandIVisitorData {

    @ZenCodeType.Method
    public static void setRecruitCosts(IVisitorData iVisitorData, ItemStack var1){
        iVisitorData.setRecruitCosts(var1);
    }
    @ZenCodeType.Method
    public static ItemStack getRecruitCost(IVisitorData iVisitorData){
        return iVisitorData.getRecruitCost();
    }
    @ZenCodeType.Method
    public static BlockPos getSittingPosition(IVisitorData iVisitorData){
        return iVisitorData.getSittingPosition();
    }
    @ZenCodeType.Method
    public static void setSittingPosition(IVisitorData iVisitorData,BlockPos var1){
        iVisitorData.setSittingPosition(var1);
    }
    @ZenCodeType.Method
    public static void setCustomTexture(IVisitorData iVisitorData,String uuid){
        iVisitorData.setCustomTexture(UUID.fromString(uuid));
    }
}
