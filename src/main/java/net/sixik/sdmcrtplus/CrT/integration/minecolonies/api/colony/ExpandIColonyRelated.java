package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.colony.IColonyRelated;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/IColonyRelated")
@NativeTypeRegistration(value = IColonyRelated.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.IColonyRelated")
public class ExpandIColonyRelated {

    @ZenCodeType.Method
   public static void registerWithColony(IColonyRelated ic){
       ic.registerWithColony();;
   }
    @ZenCodeType.Method
   public static IColony getColony(IColonyRelated ic){
        return ic.getColony();
   }
    @ZenCodeType.Method
   public static void setColony(IColonyRelated ic, IColony var1){
        ic.setColony(var1);
   }
}
