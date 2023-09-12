package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.requestsystem.requester;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.requestsystem.location.ILocation;
import com.minecolonies.api.colony.requestsystem.manager.IRequestManager;
import com.minecolonies.api.colony.requestsystem.request.IRequest;
import com.minecolonies.api.colony.requestsystem.requester.IRequester;
import com.minecolonies.api.colony.requestsystem.token.IToken;
import net.minecraft.network.chat.MutableComponent;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/requestsystem/requester/IRequester")
@NativeTypeRegistration(value = IRequester.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.requestsystem.requester.IRequester")
public class ExpandIRequester {
    @ZenCodeType.Method
    public static IToken<?> getId(IRequester iRequester){
        return iRequester.getId();
    }
    @ZenCodeType.Method
    public static ILocation getLocation(IRequester iRequester){
        return iRequester.getLocation();
    }

    @ZenCodeType.Method
    public static void onRequestedRequestComplete(IRequester iRequester, IRequestManager var1,  IRequest<?> var2){
        iRequester.onRequestedRequestComplete(var1,var2);
    }
    @ZenCodeType.Method
    public static void onRequestedRequestCancelled(IRequester iRequester, IRequestManager var1, IRequest<?> var2){
        iRequester.onRequestedRequestCancelled(var1,var2);
    }

    @ZenCodeType.Method
    public static MutableComponent getRequesterDisplayName(IRequester iRequester, IRequestManager var1, IRequest<?> var2){
        return iRequester.getRequesterDisplayName(var1,var2);
    }
}
