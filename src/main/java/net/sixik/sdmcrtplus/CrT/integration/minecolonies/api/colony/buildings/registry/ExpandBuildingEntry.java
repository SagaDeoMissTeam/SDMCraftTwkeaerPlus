package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings.registry;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.blocks.AbstractBlockHut;
import com.minecolonies.api.blocks.AbstractBlockMinecolonies;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.IColonyView;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.colony.buildings.modules.IBuildingModule;
import com.minecolonies.api.colony.buildings.modules.IBuildingModuleView;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.api.colony.buildings.views.IBuildingView;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;



/**
 * This class is responsible for all blocks that can store items or change in some way (such as a Piston, Chest, Funnel, etc.)
 */
@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/registry/BuildingEntry")
@NativeTypeRegistration(value = BuildingEntry.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.registry.BuildingEntry")
public class ExpandBuildingEntry {

    /**
     * Allows you to get a Regular block from the Entity Block.
     */
    @ZenCodeType.Method
    public static AbstractBlockMinecolonies<?> getBuildingBlock(BuildingEntry buildingEntry){
        return buildingEntry.getBuildingBlock();
    }

    /**
     * This is a synchronization module with the server.
     */
    @ZenCodeType.Method
    public static List<Supplier<IBuildingModule>> getModuleProducers(BuildingEntry buildingEntry){
        return buildingEntry.getModuleProducers();
    }
    @ZenCodeType.Method
    public static List<Supplier<Supplier<IBuildingModuleView>>> getModuleViewProducers(BuildingEntry buildingEntry){
        return buildingEntry.getModuleViewProducers();
    }
    @ZenCodeType.Method
    public static ResourceLocation getRegistryName(BuildingEntry buildingEntry){
        return buildingEntry.getRegistryName();
    }
    @ZenCodeType.Method
    public static String getTranslationKey(BuildingEntry buildingEntry){
        return buildingEntry.getTranslationKey();
    }

    @ZenCodeType.Method
    public static IBuilding produceBuilding(BuildingEntry buildingEntry,BlockPos position, IColony colony) {
        return buildingEntry.produceBuilding(position, colony);
    }

    @ZenCodeType.Method
    public static IBuildingView produceBuildingView(BuildingEntry buildingEntry,BlockPos position, IColonyView colony) {
        return buildingEntry.produceBuildingView(position,colony);
    }

//    @ZenRegister(modDeps = "minecolonies")
//    @Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/registry/BuildingEntryBuilder")
//    @NativeTypeRegistration(value = BuildingEntry.Builder.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.registry.BuildingEntryBuilder")
//    public static class ExpandBuildingEntryBuilder{
//        @ZenCodeType.Method
//        public BuildingEntry.Builder setBuildingBlock(BuildingEntry.Builder builder, AbstractBlockHut<?> buildingBlock) {
//            return builder.setBuildingBlock(buildingBlock);
//        }
//        @ZenCodeType.Method
//        public BuildingEntry.Builder setBuildingProducer(BuildingEntry.Builder builder, BiFunction<IColony, BlockPos, IBuilding> buildingProducer) {
//            return builder.setBuildingProducer(buildingProducer);
//        }
//        @ZenCodeType.Method
//        public BuildingEntry.Builder setBuildingViewProducer(BuildingEntry.Builder builder, Supplier<BiFunction<IColonyView, BlockPos, IBuildingView>> buildingViewProducer) {
//            return builder.setBuildingViewProducer(buildingViewProducer);
//        }
//        @ZenCodeType.Method
//        public BuildingEntry.Builder setRegistryName(BuildingEntry.Builder builder, ResourceLocation registryName) {
//            return builder.setRegistryName(registryName);
//        }
//
//        @ZenCodeType.Method
//        public static BuildingEntry createBuildingEntry(BuildingEntry.Builder builder){
//            return builder.createBuildingEntry();
//        }
//    }
}
