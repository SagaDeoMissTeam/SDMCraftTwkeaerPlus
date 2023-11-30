package net.sixik.sdmcrtplus.source.client.Restricted;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;

public class ClientGUIRestrictedStage extends ClientGUIRestrictedBase{
    public String stage;
    public ClientGUIRestrictedStage(ResourceLocation id, String stage) {
        super(id);
        this.stage = stage;
    }
    public ClientGUIRestrictedStage(VanillaGuiOverlay id, String stage) {
        super(id);
        this.stage = stage;
    }
}
