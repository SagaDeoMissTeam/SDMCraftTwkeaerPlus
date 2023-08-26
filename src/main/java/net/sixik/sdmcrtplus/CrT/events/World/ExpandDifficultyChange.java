package net.sixik.sdmcrtplus.CrT.events.World;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraftforge.event.DifficultyChangeEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/events/level/DifficultyChangeEvent")
@NativeTypeRegistration(value = DifficultyChangeEvent.class, zenCodeName = "mods.sdmcrtplus.events.level.DifficultyChangeEvent")
public class ExpandDifficultyChange {

    @ZenCodeType.Method
    @ZenCodeType.Getter("NewDifficultyKey")
    public static String getNewDifficultyKey(DifficultyChangeEvent event){
        return event.getDifficulty().getKey();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("NewDifficultyIndex")
    public static int getNewDifficultyIndex(DifficultyChangeEvent event){
        return event.getDifficulty().getId();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("OldDifficultyKey")
    public static int getOldDifficultyIndex(DifficultyChangeEvent event){
        return event.getOldDifficulty().getId();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("OldDifficultyIndex")
    public static String getOldDifficultyKey(DifficultyChangeEvent event){
        return event.getOldDifficulty().getKey();
    }
}
