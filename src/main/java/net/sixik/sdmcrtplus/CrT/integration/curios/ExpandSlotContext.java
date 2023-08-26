package net.sixik.sdmcrtplus.CrT.integration.curios;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.LivingEntity;
import org.openzen.zencode.java.ZenCodeType;
import top.theillusivec4.curios.api.SlotContext;

@ZenRegister(modDeps = "curios")
@Document("mods/sdmcrtplus/integration/curios/SlotContext")
@NativeTypeRegistration(value = SlotContext.class,zenCodeName = "mods.sdmcrtplus.integration.curios.SlotContext")
public class ExpandSlotContext {

    @ZenCodeType.Method
    @ZenCodeType.Getter("isCosmetic")
    public static boolean isCosmetic(SlotContext slotContext){
        return slotContext.cosmetic();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("isVisible")
    public static boolean isVisible(SlotContext slotContext){
        return slotContext.visible();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("index")
    public static int getIndex(SlotContext slotContext){
        return slotContext.index();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("entity")
    public static LivingEntity getEntity(SlotContext slotContext){
        return slotContext.entity();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("identifier")
    public static String getIdentifier(SlotContext slotContext){
        return slotContext.identifier();
    }
}
