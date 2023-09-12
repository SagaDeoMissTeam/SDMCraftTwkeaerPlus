package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen.citizenhandlers;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenChatHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/citizenhandlers/ICitizenChatHandler")
@NativeTypeRegistration(value = ICitizenChatHandler.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.citizenhandlers.ICitizenChatHandler")
public class ExpandICitizenChatHandler {

    @ZenCodeType.Method
   public static void notifyDeath(ICitizenChatHandler internal, DamageSource var1){
       internal.notifyDeath(var1);
   }
    @ZenCodeType.Method
   public static void sendLocalizedChat(ICitizenChatHandler internal,String var1, Object... var2){
       internal.sendLocalizedChat(var1,var2);
   }
    @ZenCodeType.Method
   public static void sendLocalizedChat(ICitizenChatHandler internal,Component var1){
       internal.sendLocalizedChat(var1);
   }
}
