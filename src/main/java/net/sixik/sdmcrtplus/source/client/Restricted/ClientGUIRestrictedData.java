package net.sixik.sdmcrtplus.source.client.Restricted;

import com.blamejared.crafttweaker.api.data.IData;
import com.blamejared.crafttweaker.api.data.MapData;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;

public class ClientGUIRestrictedData extends ClientGUIRestrictedBase{
    public IData data;
    public ClientGUIRestrictedData(ResourceLocation id, IData data) {
        super(id);
        this.data = data;
    }
    public ClientGUIRestrictedData(VanillaGuiOverlay id, IData data) {
        super(id);
        this.data = data;
    }
}
