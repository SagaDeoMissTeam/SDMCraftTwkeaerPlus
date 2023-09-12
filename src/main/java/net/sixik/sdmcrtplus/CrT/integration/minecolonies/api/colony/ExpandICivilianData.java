package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICivilianData;
import com.minecolonies.api.colony.interactionhandling.IInteractionResponseHandler;
import com.minecolonies.api.entity.citizen.AbstractCivilianEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Optional;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/ICivilianData")
@NativeTypeRegistration(value = ICivilianData.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.ICivilianData")
public class ExpandICivilianData {
    @ZenCodeType.Method
    public static void setEntity(ICivilianData iCivilianData, @ZenCodeType.Nullable AbstractCivilianEntity var1){
        iCivilianData.setEntity(var1);
    }
    @ZenCodeType.Method
    public static void markDirty(ICivilianData iCivilianData){
        iCivilianData.markDirty();
    }
    @ZenCodeType.Method
    public static void initForNewCivilian(ICivilianData iCivilianData){
        iCivilianData.initForNewCivilian();
    }
    @ZenCodeType.Method
    public static void initEntityValues(ICivilianData iCivilianData){
        iCivilianData.initEntityValues();
    }
    @ZenCodeType.Method
    public static void setGenderAndGenerateName(ICivilianData iCivilianData, boolean var1){
        iCivilianData.setGenderAndGenerateName(var1);
    }
    @ZenCodeType.Method
    public static void setGender(ICivilianData iCivilianData,boolean var1){
        iCivilianData.setGender(var1);
    }
    @ZenCodeType.Method
    public static int getTextureId(ICivilianData iCivilianData){
        return iCivilianData.getTextureId();
    }
    @ZenCodeType.Method
    public static boolean isDirty(ICivilianData iCivilianData){
        return iCivilianData.isDirty();
    }
    @ZenCodeType.Method
    public static void clearDirty(ICivilianData iCivilianData){
        iCivilianData.clearDirty();
    }
    @ZenCodeType.Method
    public static void updateEntityIfNecessary(ICivilianData iCivilianData){
        iCivilianData.updateEntityIfNecessary();
    }
    @ZenCodeType.Method
    public static void increaseSaturation(ICivilianData iCivilianData,double var1){
        iCivilianData.increaseSaturation(var1);
    }
    @ZenCodeType.Method
    public static void decreaseSaturation(ICivilianData iCivilianData,double var1){
        iCivilianData.decreaseSaturation(var1);
    }
    @ZenCodeType.Method
    public static void setName(ICivilianData iCivilianData,String var1){
        iCivilianData.setName(var1);
    }
    @ZenCodeType.Method
    public static void onResponseTriggered(ICivilianData iCivilianData, Component var1, @NotNull int var2, Player var3){
        iCivilianData.onResponseTriggered(var1,var2,var3);
    }
    @ZenCodeType.Method
    public static void tick(ICivilianData iCivilianData){
        iCivilianData.tick();
    }
    @ZenCodeType.Method
    public static void triggerInteraction(ICivilianData iCivilianData, IInteractionResponseHandler var1){
        iCivilianData.triggerInteraction(var1);
    }
    @ZenCodeType.Method
    public static String getTextureSuffix(ICivilianData iCivilianData){
        return iCivilianData.getTextureSuffix();
    }
    @ZenCodeType.Method
    public static void setSuffix(ICivilianData iCivilianData,String var1){
        iCivilianData.setSuffix(var1);
    }
    @ZenCodeType.Method
    public static Optional<? extends AbstractCivilianEntity> getEntity(ICivilianData iCivilianData){
        return iCivilianData.getEntity();
    }
    @ZenCodeType.Method
    public static int getSoundProfile(ICivilianData iCivilianData){
        return iCivilianData.getSoundProfile();
    }
}
