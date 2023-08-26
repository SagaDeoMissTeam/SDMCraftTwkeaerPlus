package net.sixik.sdmcrtplus.CrT.world.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.LevelHeightAccessor;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/LevelHeightAccessor")
@NativeTypeRegistration(value = LevelHeightAccessor.class, zenCodeName = "mods.sdmcrtplus.world.level.LevelHeightAccessor")
public class ExpandLevelHeightAccessor {

    @ZenCodeType.Method
    @ZenCodeType.Getter("height")
    public static int getHeight(LevelHeightAccessor levelHeightAccessor){
        return levelHeightAccessor.getHeight();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("minBuildHeight")
    public static int getMinBuildHeight(LevelHeightAccessor levelHeightAccessor){
        return levelHeightAccessor.getMinBuildHeight();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("maxBuildHeight")
    public static int getMaxBuildHeight(LevelHeightAccessor levelHeightAccessor){
        return levelHeightAccessor.getMaxBuildHeight();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("maxSextion")
    public static int getMaxSection(LevelHeightAccessor levelHeightAccessor){
       return levelHeightAccessor.getMaxSection();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("sectionCount")
    public static int getSectionsCount(LevelHeightAccessor levelHeightAccessor){
       return levelHeightAccessor.getSectionsCount();
    }
    @ZenCodeType.Method
    public static int getSectionYFromSectionIndex(LevelHeightAccessor levelHeightAccessor, int index){
       return levelHeightAccessor.getSectionYFromSectionIndex(index);
    }
    @ZenCodeType.Method
    public static int getSectionIndexFromSectionY(LevelHeightAccessor levelHeightAccessor, int index){
       return levelHeightAccessor.getSectionIndexFromSectionY(index);
    }
    @ZenCodeType.Method
    public static int getSectionIndex(LevelHeightAccessor levelHeightAccessor, int index){
       return levelHeightAccessor.getSectionIndex(index);
    }
}
