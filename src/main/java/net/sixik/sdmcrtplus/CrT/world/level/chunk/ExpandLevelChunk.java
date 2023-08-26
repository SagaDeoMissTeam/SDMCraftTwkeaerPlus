package net.sixik.sdmcrtplus.CrT.world.level.chunk;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.LevelChunk;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/chunk/LevelChunk")
@NativeTypeRegistration(value = LevelChunk.class, zenCodeName = "mods.sdmcrtplus.world.level.LevelChunk")
public class ExpandLevelChunk {
    @ZenCodeType.Method
    @ZenCodeType.Getter("isEmpty")
    public static boolean isEmpty(LevelChunk levelChunk){
        return levelChunk.isEmpty();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("level")
    public static Level getLevel(LevelChunk levelChunk){
        return levelChunk.getLevel();
    }
}
