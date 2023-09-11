package net.sixik.sdmcrtplus.mixin.mods.enhancedcelestials;

import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import corgitaco.enhancedcelestials.api.lunarevent.LunarEvent;
import corgitaco.enhancedcelestials.lunarevent.LunarEventInstance;
import corgitaco.enhancedcelestials.lunarevent.LunarForecast;
import net.minecraft.commands.arguments.ResourceOrTagLocationArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.sdmcrtplus.source.integration.enhancedcelestials.events.LunarStartEvent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;
import java.util.Optional;

@Mixin(value = LunarForecast.class, remap = false)
public class LunarForecastMixin {


    @Shadow @Final private List<LunarEventInstance> forecast;

    @Inject(method = "Lcorgitaco/enhancedcelestials/lunarevent/LunarForecast;setOrReplaceEventWithResponse(Lnet/minecraft/commands/arguments/ResourceOrTagLocationArgument$Result;JLnet/minecraft/util/RandomSource;)Lcom/mojang/datafixers/util/Pair;", at = @At("RETURN"))
    public void sdm$setOrReplaceEventWithResponse(ResourceOrTagLocationArgument.Result<LunarEvent> result, long currentDay, RandomSource randomSource, CallbackInfoReturnable<Pair<Component, Boolean>> cir){
        if(cir.getReturnValue().getSecond()){
            Either<ResourceKey<LunarEvent>, TagKey<LunarEvent>> unwrappedResult = result.unwrap();
            Optional<ResourceKey<LunarEvent>> left = unwrappedResult.left();
            ResourceKey<LunarEvent> resourceKey = (ResourceKey)left.orElseThrow();
            ResourceLocation lunarName = resourceKey.location();
            MinecraftForge.EVENT_BUS.post(new LunarStartEvent(lunarName,currentDay,randomSource, this.forecast.get(0)));
        }
    }
}
