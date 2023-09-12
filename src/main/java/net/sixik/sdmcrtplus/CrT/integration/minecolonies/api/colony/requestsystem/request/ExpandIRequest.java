package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.requestsystem.request;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.reflect.TypeToken;
import com.minecolonies.api.colony.IColonyView;
import com.minecolonies.api.colony.requestsystem.manager.AssigningStrategy;
import com.minecolonies.api.colony.requestsystem.manager.IRequestManager;
import com.minecolonies.api.colony.requestsystem.request.IRequest;
import com.minecolonies.api.colony.requestsystem.request.RequestState;
import com.minecolonies.api.colony.requestsystem.requestable.IRequestable;
import com.minecolonies.api.colony.requestsystem.requester.IRequester;
import com.minecolonies.api.colony.requestsystem.token.IToken;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/requestsystem/request/IRequest")
@NativeTypeRegistration(value = IRequest.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.requestsystem.request.IRequest")
public class ExpandIRequest<R extends IRequestable>{

    @ZenCodeType.Method
    public static AssigningStrategy getStrategy(IRequest<?> iRequest) {
        return AssigningStrategy.PRIORITY_BASED;
    }

    @ZenCodeType.Method
    public static  <T extends IToken<?>> T getId(IRequest<?> iRequest){
        return iRequest.getId();
    }

//    @ZenCodeType.Method
//    public static RequestState getState(IRequest<?> iRequest){
//        return iRequest.getState();
//    }
//
//    @ZenCodeType.Method
//    public static void setState(IRequest<?> iRequest, IRequestManager var1, RequestState var2){
//         iRequest.setState(var1,var2);
//    }
//
//    @ZenCodeType.Method
//   public static IRequester getRequester(IRequest<?> iRequest){
//        return iRequest.getRequester();
//    }





}
