package net.sixik.sdmcrtplus.CrT.world.level.border;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.border.BorderStatus;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/border/BorderStatus")
@NativeTypeRegistration(value = BorderStatus.class, zenCodeName = "mods.sdmcrtplus.world.level.border.BorderStatus")
@BracketEnum("minecraft/border/status")
public class ExpandBorderStatus {

    @ZenCodeType.Method
    @ZenCodeType.Getter("color")
    public static int getColor(BorderStatus status){
        return status.getColor();
    }
}
