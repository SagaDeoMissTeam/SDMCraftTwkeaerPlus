package net.sixik.sdmcrtplus.CrT.integration.curios;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.type.capability.ICuriosItemHandler;
import top.theillusivec4.curios.api.type.inventory.ICurioStacksHandler;

import java.util.Map;
import java.util.Set;

@ZenRegister(modDeps = "curios")
@Document("mods/sdmcrtplus/integration/curios/ICuriosItemHandler")
@NativeTypeRegistration(value = ICuriosItemHandler.class,zenCodeName = "mods.sdmcrtplus.integration.curios.ICuriosItemHandler")
public class ExpandICuriosItemHandler {

    @ZenCodeType.Method
    @ZenCodeType.Getter("curios")
    public static Map<String, ICurioStacksHandler> getCurios(ICuriosItemHandler handler){
        return handler.getCurios();
    }
    @ZenCodeType.Method
    public static int getLootingLevel(ICuriosItemHandler handler, DamageSource var1, LivingEntity var2, int var3){
        return handler.getLootingLevel(var1,var2,var3);
    }

    @ZenCodeType.Method
    public static ICurioStacksHandler getStacksHandler(ICuriosItemHandler handler, String var1){
        return handler.getStacksHandler(var1).get();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("slots")
    public static int getSlots(ICuriosItemHandler handler){
        return handler.getSlots();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("wearer")
    public static LivingEntity getWearer(ICuriosItemHandler handler){
        return handler.getWearer();
    }
    @ZenCodeType.Method
    public static Set<ICurioStacksHandler> getUpdatingInventories(ICuriosItemHandler handler){
        return handler.getUpdatingInventories();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("visibleSlots")
    public static int getVisibleSlots(ICuriosItemHandler handler){
        return handler.getVisibleSlots();
    }
    @ZenCodeType.Method
    public static void setCurios(ICuriosItemHandler handler, Map<String, ICurioStacksHandler> var1){
        handler.setCurios(var1);
    }
}
