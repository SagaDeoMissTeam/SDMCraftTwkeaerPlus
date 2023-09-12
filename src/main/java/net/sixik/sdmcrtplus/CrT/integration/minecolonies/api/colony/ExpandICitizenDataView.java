package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenDataView;
import com.minecolonies.api.colony.ICivilianData;
import com.minecolonies.api.colony.interactionhandling.IInteractionResponseHandler;
import com.minecolonies.api.colony.jobs.IJobView;
import com.minecolonies.api.entity.citizen.VisibleCitizenStatus;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenHappinessHandler;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenSkillHandler;
import com.minecolonies.api.util.Tuple;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/ICitizenDataView")
@NativeTypeRegistration(value = ICitizenDataView.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.ICitizenDataView")
public class ExpandICitizenDataView {
    @ZenCodeType.Method
    public static int getEntityId(ICitizenDataView internal){
        return internal.getEntityId();
    }

    @ZenCodeType.Method
    public static String getJob(ICitizenDataView internal){
        return internal.getJob();
    }

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable BlockPos getHomeBuilding(ICitizenDataView internal){
        return internal.getHomeBuilding();
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable BlockPos getWorkBuilding(ICitizenDataView internal){
        return internal.getWorkBuilding();
    }
    @ZenCodeType.Method
    public static void setWorkBuilding(ICitizenDataView internal, BlockPos var1){
        internal.setWorkBuilding(var1);
    }
    @ZenCodeType.Method
    public static int getColonyId(ICitizenDataView internal){
        return internal.getColonyId();
    }
    @ZenCodeType.Method
    public static double getHappiness(ICitizenDataView internal){
        return internal.getHappiness();
    }
    @ZenCodeType.Method
    public static BlockPos getPosition(ICitizenDataView internal){
        return internal.getPosition();
    }
    @ZenCodeType.Method
    public static double getHealth(ICitizenDataView internal){
        return internal.getHealth();
    }
    @ZenCodeType.Method
    public static double getMaxHealth(ICitizenDataView internal){
        return internal.getMaxHealth();
    }
//    @ZenCodeType.Method
//    public static List<IInteractionResponseHandler> getOrderedInteractions(ICitizenDataView internal){
//
//    }
//    @ZenCodeType.Method
//    public static @ZenCodeType.Nullable IInteractionResponseHandler getSpecificInteraction(ICitizenDataView internal, Component var1){
//
//    }
    @ZenCodeType.Method
    public static boolean hasBlockingInteractions(ICitizenDataView internal){
        return internal.hasBlockingInteractions();
    }
    @ZenCodeType.Method
    public static boolean hasVisibleInteractions(ICitizenDataView internal){
        return internal.hasVisibleInteractions();
    }
    @ZenCodeType.Method
    public static boolean hasPendingInteractions(ICitizenDataView internal){
        return internal.hasPendingInteractions();
    }
    @ZenCodeType.Method
    public static ICitizenSkillHandler getCitizenSkillHandler(ICitizenDataView internal){
        return internal.getCitizenSkillHandler();
    }
    @ZenCodeType.Method
    public static ICitizenHappinessHandler getHappinessHandler(ICitizenDataView internal){
        return internal.getHappinessHandler();
    }
    @ZenCodeType.Method
    public static ResourceLocation getInteractionIcon(ICitizenDataView internal){
        return internal.getInteractionIcon();
    }
    @ZenCodeType.Method
    public static VisibleCitizenStatus getVisibleStatus(ICitizenDataView internal){
        return internal.getVisibleStatus();
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable IJobView getJobView(ICitizenDataView internal){
        return internal.getJobView();
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Integer getPartner(ICitizenDataView internal){
        return internal.getPartner();
    }
    @ZenCodeType.Method
    public static List<Integer> getChildren(ICitizenDataView internal){
        return internal.getChildren();
    }
    @ZenCodeType.Method
    public static List<Integer> getSiblings(ICitizenDataView internal){
        return internal.getSiblings();
    }
    @ZenCodeType.Method
    public static Map<String, String> getParents(ICitizenDataView internal){
        Map<String, String> map = new HashMap<>();
        map.put(internal.getParents().getA(), internal.getParents().getB());
        return map;
    }
    @ZenCodeType.Method
    public static ResourceLocation getCustomTexture(ICitizenDataView internal){
        return internal.getCustomTexture();
    }
    @ZenCodeType.Method
    public static void setJobView(ICitizenDataView internal, IJobView var1){
        internal.setJobView(var1);
    }
    @ZenCodeType.Method
    public static void setHomeBuilding(ICitizenDataView internal, BlockPos var1){
        internal.setHomeBuilding(var1);
    }
}
