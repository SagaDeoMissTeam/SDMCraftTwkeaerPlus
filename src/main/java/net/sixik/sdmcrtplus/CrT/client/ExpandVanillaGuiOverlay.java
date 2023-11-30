package net.sixik.sdmcrtplus.CrT.client;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/client/VanillaGuiOverlay")
@NativeTypeRegistration(value = VanillaGuiOverlay.class, zenCodeName = "mods.sdmcrtplus.client.VanillaGuiOverlay")
@BracketEnum("overlay")
public class ExpandVanillaGuiOverlay {

    @ZenCodeType.Method
    @ZenCodeType.Getter("id")
    public static ResourceLocation getId(VanillaGuiOverlay vanillaGuiOverlay){
       return vanillaGuiOverlay.id();
    }
}
