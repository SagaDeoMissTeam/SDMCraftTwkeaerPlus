package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IVisitorViewData;
import net.minecraft.world.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/IVisitorViewData")
@NativeTypeRegistration(value = IVisitorViewData.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.IVisitorViewData")
public class ExpandIVisitorViewData {

    @ZenCodeType.Method
    public static ItemStack getRecruitCost(IVisitorViewData iVisitorViewData){
        return iVisitorViewData.getRecruitCost();
    }
}
