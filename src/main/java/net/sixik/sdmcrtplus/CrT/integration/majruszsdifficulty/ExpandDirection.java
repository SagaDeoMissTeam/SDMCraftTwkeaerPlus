package net.sixik.sdmcrtplus.CrT.integration.majruszsdifficulty;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.majruszsdifficulty.undeadarmy.data.Direction;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "majruszsdifficulty")
@Document("mods/sdmcrtplus/integration/majruszsdifficulty/Direction")
@NativeTypeRegistration(value = Direction.class,zenCodeName = "mods.sdmcrtplus.integration.majruszsdifficulty.Direction")
@BracketEnum("majruszsdifficulty:direction")
public class ExpandDirection {

    @ZenCodeType.Method
    public static int getX(Direction direction){
        return direction.x;
    }
    @ZenCodeType.Method
    public static int getZ(Direction direction){
        return direction.z;
    }
}
