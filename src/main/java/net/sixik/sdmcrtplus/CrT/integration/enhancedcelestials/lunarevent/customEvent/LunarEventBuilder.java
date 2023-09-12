package net.sixik.sdmcrtplus.CrT.integration.enhancedcelestials.lunarevent.customEvent;


import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.google.common.collect.ImmutableMap;
import corgitaco.enhancedcelestials.api.client.ColorSettings;
import corgitaco.enhancedcelestials.api.lunarevent.*;
import corgitaco.enhancedcelestials.api.lunarevent.client.LunarEventClientSettings;
import corgitaco.enhancedcelestials.util.CustomTranslationTextComponent;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import net.sixik.sdmcrtplus.SDMConstants;
import net.sixik.sdmcrtplus.Sdmcrtplus;
import org.openzen.zencode.java.ZenCodeType;
import twilightforest.item.SteeleafHoeItem;

import static corgitaco.enhancedcelestials.api.lunarevent.DefaultLunarEvents.LUNAR_EVENTS;

@Document("mods/sdmcrtplus/integration/enhancedcelestials/lunarevent/customEvent/LunarEventBuilder")
@ZenCodeType.Name("mods.sdmcrtplus.integration.enhancedcelestials.lunarevent.customEvent.LunarEventBuilder")
@ZenRegister(modDeps = "enhancedcelestials", loaders = SDMConstants.CT_LOADER)
public class LunarEventBuilder {

    private @ZenCodeType.Nullable String name = null;
    private @ZenCodeType.Nullable ImmutableMap<ResourceKey<Level>, LunarEvent.SpawnRequirements> eventChancesByDimension = null;
    private @ZenCodeType.Nullable LunarEventClientSettings clientSettings = null;
    private @ZenCodeType.Nullable LunarTextComponents textComponents = null;
    private @ZenCodeType.Nullable LunarMobSettings lunarMobSettings = null;
    private @ZenCodeType.Nullable DropSettings dropSettings = null;
    @ZenCodeType.Constructor
    public LunarEventBuilder(){

    }

    @ZenCodeType.Method
    public LunarEventBuilder setName(String name){
        this.name = name;
        return this;
    }
    @ZenCodeType.Method
    public LunarEventBuilder setSpawnRequirements(ResourceLocation levelName, LunarSpawnRequirementsBuilder lunarSpawnRequirements){
        this.eventChancesByDimension = ImmutableMap.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, levelName), lunarSpawnRequirements.getSpawnRequirements());
        return this;
    }

    @ZenCodeType.Method
    public LunarEventBuilder setClientSettings(LunarEventClientSettingsBuilder lunarEventClientSettingsBuilder){
        this.clientSettings = lunarEventClientSettingsBuilder.getLunarEventClientSettings();
        return this;
    }
    @ZenCodeType.Method
    public LunarEventBuilder setTextComponents(LunarTextComponentsBuilder lunarTextComponentsBuilder){
        this.textComponents = lunarTextComponentsBuilder.getTextComponents();
        return this;
    }

    @ZenCodeType.Method
    public LunarEventBuilder setMobSettings(LunarMobSettingsBuilder lunarMobSettingsBuilder){
        this.lunarMobSettings = lunarMobSettingsBuilder.getLunarMobSettings();
        return this;
    }

    @ZenCodeType.Method
    public LunarEventBuilder setDropSettings(LunarDropSettingsBuilder lunarDropSettingsBuilder){
        this.dropSettings = lunarDropSettingsBuilder.getDropSettings();
        return this;
    }

//    @ZenCodeType.Method
//    public LunarEvent build(){
//        return new LunarEvent(
//                eventChancesByDimension != null ? eventChancesByDimension : ImmutableMap.of(),
//                clientSettings != null ? clientSettings : new LunarEventClientSettings(new ColorSettings("3333ff", "ffffff"), 20.0F, (ResourceLocation)null, (SoundEvent)null),
//                textComponents != null ? textComponents : new LunarTextComponents(new CustomTranslationTextComponent("enhancedcelestials.name.moon", new CustomTranslationTextComponent[0]), CustomTranslationTextComponent.DEFAULT, CustomTranslationTextComponent.DEFAULT),
//                lunarMobSettings != null ? lunarMobSettings : LunarMobSettings.DEFAULT,
//                dropSettings != null ? dropSettings : DropSettings.EMPTY
//        );
//    }

    @ZenCodeType.Method
    public void build(){
        DefaultLunarEvents.createEvent(this.name != null ? this.name : "not_name_lunar_event", () -> {
           return new LunarEvent(
                    eventChancesByDimension != null ? eventChancesByDimension : ImmutableMap.of(),
                    clientSettings != null ? clientSettings : new LunarEventClientSettings(new ColorSettings("3333ff", "ffffff"), 20.0F, (ResourceLocation)null, (SoundEvent)null),
                    textComponents != null ? textComponents : new LunarTextComponents(new CustomTranslationTextComponent("enhancedcelestials.name.moon", new CustomTranslationTextComponent[0]), CustomTranslationTextComponent.DEFAULT, CustomTranslationTextComponent.DEFAULT),
                    lunarMobSettings != null ? lunarMobSettings : LunarMobSettings.DEFAULT,
                    dropSettings != null ? dropSettings : DropSettings.EMPTY
            );
        });
    }

}
