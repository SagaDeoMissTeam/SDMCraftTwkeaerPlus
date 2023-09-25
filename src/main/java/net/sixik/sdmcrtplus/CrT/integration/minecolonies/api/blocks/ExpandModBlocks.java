package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.blocks;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.google.common.collect.BiMap;
import com.minecolonies.api.blocks.*;
import com.minecolonies.api.blocks.decorative.AbstractBlockGate;
import com.minecolonies.api.blocks.decorative.AbstractBlockMinecoloniesConstructionTape;
import com.minecolonies.api.blocks.decorative.AbstractColonyFlagBanner;
import com.minecolonies.api.blocks.huts.AbstractBlockMinecoloniesDefault;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/blocks/ModBlocks")
@ZenCodeType.Name("mods.sdmcrtplus.integration.api.blocks.ModBlocks")
public class ExpandModBlocks {

//    public static final BiMap<String, AbstractBlockHut<? extends AbstractBlockHut<?>>> MODS_BUILDINGS

    @ZenCodeType.Method
    public static AbstractBlockHut<?>[] getHuts() {
        return ModBlocks.getHuts();
    }

    @ZenCodeType.Field
    public static AbstractBlockMinecoloniesConstructionTape<? extends AbstractBlockMinecoloniesConstructionTape<?>> blockConstructionTape = ModBlocks.blockConstructionTape;
    @ZenCodeType.Field
    public static AbstractBlockMinecoloniesRack<? extends AbstractBlockMinecoloniesRack<?>> blockRack = ModBlocks.blockRack;
    @ZenCodeType.Field
    public static AbstractBlockMinecoloniesGrave<? extends AbstractBlockMinecoloniesGrave<?>> blockGrave = ModBlocks.blockGrave;
    @ZenCodeType.Field
    public static AbstractBlockMinecoloniesNamedGrave<? extends AbstractBlockMinecoloniesNamedGrave<?>> blockNamedGrave = ModBlocks.blockNamedGrave;
    @ZenCodeType.Field
    public static AbstractBlockMinecolonies<? extends AbstractBlockMinecolonies<?>> blockWayPoint = ModBlocks.blockWayPoint;
    @ZenCodeType.Field
    public static AbstractBlockBarrel<? extends AbstractBlockBarrel<?>> blockBarrel = ModBlocks.blockBarrel;
    @ZenCodeType.Field
    public static AbstractBlockMinecoloniesHorizontal<? extends AbstractBlockMinecoloniesHorizontal<?>> blockDecorationPlaceholder = ModBlocks.blockDecorationPlaceholder;
    @ZenCodeType.Field
    public static AbstractBlockMinecoloniesDefault<? extends AbstractBlockMinecoloniesDefault<?>> blockScarecrow = ModBlocks.blockScarecrow;
    @ZenCodeType.Field
    public static AbstractBlockMinecoloniesHorizontal<? extends AbstractBlockMinecoloniesHorizontal<?>> blockPlantationField = ModBlocks.blockPlantationField;
    @ZenCodeType.Field
    public static AbstractBlockMinecolonies<? extends AbstractBlockMinecolonies<?>> blockCompostedDirt = ModBlocks.blockCompostedDirt;
    @ZenCodeType.Field
    public static AbstractColonyFlagBanner<? extends AbstractColonyFlagBanner<?>> blockColonyBanner = ModBlocks.blockColonyBanner;
    @ZenCodeType.Field
    public static AbstractColonyFlagBanner<? extends AbstractColonyFlagBanner<?>> blockColonyWallBanner = ModBlocks.blockColonyWallBanner;
    @ZenCodeType.Field
    public static AbstractBlockGate blockIronGate = ModBlocks.blockIronGate;
    @ZenCodeType.Field
    public static AbstractBlockGate blockWoodenGate = ModBlocks.blockWoodenGate;
}
