package net.sixik.sdmcrtplus.CrT.integration.curios;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.type.inventory.ICurioStacksHandler;
import top.theillusivec4.curios.api.type.inventory.IDynamicStackHandler;

import java.util.Set;

@ZenRegister(modDeps = "curios")
@Document("mods/sdmcrtplus/integration/curios/ICurioStacksHandler")
@NativeTypeRegistration(value = ICurioStacksHandler.class,zenCodeName = "mods.sdmcrtplus.integration.curios.ICurioStacksHandler")
public class ExpandICurioStacksHandler {
    @ZenCodeType.Method
    @ZenCodeType.Getter("slots")
    public static int getSlots(ICurioStacksHandler iCurioStacksHandler){
       return iCurioStacksHandler.getSlots();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("stacks")
    public static IDynamicStackHandler getStacks(ICurioStacksHandler iCurioStacksHandler){
       return iCurioStacksHandler.getStacks();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("cosmeticStacks")
    public static IDynamicStackHandler getCosmeticStacks(ICurioStacksHandler iCurioStacksHandler){
       return iCurioStacksHandler.getCosmeticStacks();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("identifier")
    public static String getIdentifier(ICurioStacksHandler iCurioStacksHandler){
       return iCurioStacksHandler.getIdentifier();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("cachedModifiers")
    public static Set<AttributeModifier> getCachedModifiers(ICurioStacksHandler iCurioStacksHandler){
       return iCurioStacksHandler.getCachedModifiers();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("permanentModifiers")
    public static Set<AttributeModifier> getPermanentModifiers(ICurioStacksHandler iCurioStacksHandler){
       return iCurioStacksHandler.getPermanentModifiers();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("isVisible")
    public static boolean isVisible(ICurioStacksHandler iCurioStacksHandler){
       return iCurioStacksHandler.isVisible();
    }
}
