package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.colonyEvents.descriptions;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.colonyEvents.descriptions.IColonyEventDescription;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/colonyEvents/descriptions/IColonyEventDescription")
@NativeTypeRegistration(value = IColonyEventDescription.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.colonyEvents.descriptions.IColonyEventDescription")
public class ExpandIColonyEventDescription {

    @ZenCodeType.Method
   public static ResourceLocation getEventTypeId(IColonyEventDescription iColonyEventDescription){
       return iColonyEventDescription.getEventTypeId();
    }
    @ZenCodeType.Method
   public static String getName(IColonyEventDescription iColonyEventDescription){
    return iColonyEventDescription.getName();
    }
    @ZenCodeType.Method
   public static String toDisplayString(IColonyEventDescription iColonyEventDescription) {
        return iColonyEventDescription.toDisplayString();
    }
    @ZenCodeType.Method
   public static BlockPos getEventPos(IColonyEventDescription iColonyEventDescription){
        return iColonyEventDescription.getEventPos();
    }

    @ZenCodeType.Method
   public static void setEventPos(IColonyEventDescription iColonyEventDescription,BlockPos var1){
        iColonyEventDescription.setEventPos(var1);
    }
}

