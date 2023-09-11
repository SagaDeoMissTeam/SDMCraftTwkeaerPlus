package net.sixik.sdmcrtplus.CrT.utils.math;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.core.SectionPos;
import net.minecraft.world.level.ChunkPos;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/math/SectionPos")
@NativeTypeRegistration(value = SectionPos.class, zenCodeName = "mods.sdmcrtplus.utils.math.SectionPos")
public class ExpandSectionPos {

    @ZenCodeType.Method
    public static BlockPos center(SectionPos sectionPos){
        return sectionPos.center();
    }
    @ZenCodeType.Method
    public static ChunkPos chunk(SectionPos sectionPos){
        return sectionPos.chunk();
    }
     @ZenCodeType.Method
    public static int minBlockX(SectionPos sectionPos){
        return sectionPos.minBlockX();
    }
    @ZenCodeType.Method
    public static int minBlockY(SectionPos sectionPos){
        return sectionPos.minBlockY();
    }
    @ZenCodeType.Method
    public static int minBlockZ(SectionPos sectionPos){
        return sectionPos.minBlockZ();
    }
    @ZenCodeType.Method
    public static int maxBlockX(SectionPos sectionPos){
        return sectionPos.maxBlockX();
    }
    @ZenCodeType.Method
    public static int maxBlockZ(SectionPos sectionPos){
        return sectionPos.maxBlockZ();
    }
    @ZenCodeType.Method
    public static int maxBlockY(SectionPos sectionPos){
        return sectionPos.maxBlockY();
    }
}
