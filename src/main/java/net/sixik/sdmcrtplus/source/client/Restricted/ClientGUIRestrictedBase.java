package net.sixik.sdmcrtplus.source.client.Restricted;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;

public class ClientGUIRestrictedBase {

    public ResourceLocation id;

    public ClientGUIRestrictedBase(ResourceLocation id){
        this.id = id;
    }

    public ClientGUIRestrictedBase(VanillaGuiOverlay id){
        this.id = id.id();
    }
}
