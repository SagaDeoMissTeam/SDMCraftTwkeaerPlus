package net.sixik.sdmcrtplus.CrT.client;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.data.IData;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.sixik.sdmcrtplus.Sdmcrtplus;
import net.sixik.sdmcrtplus.source.client.Restricted.ClientGUIRestrictedBase;
import net.sixik.sdmcrtplus.source.client.Restricted.ClientGUIRestrictedData;
import net.sixik.sdmcrtplus.source.client.Restricted.ClientGUIRestrictedStage;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/client/ClientRestricted")
@ZenCodeType.Name("mods.sdmcrtplus.client.ClientRestricted")
public class ClientRestricted {

    @ZenCodeType.Method
    public static void setClientGUIRestricted(ResourceLocation id){
        Sdmcrtplus.CLIENT_GUI_RESTRICTED.put(id, new ClientGUIRestrictedBase(id));
    }
    @ZenCodeType.Method
    public static void setClientGUIRestricted(ResourceLocation id, String stage){
        Sdmcrtplus.CLIENT_GUI_RESTRICTED.put(id,new ClientGUIRestrictedStage(id, stage));
    }
    @ZenCodeType.Method
    public static void setClientGUIRestricted(ResourceLocation id, IData data){
        Sdmcrtplus.CLIENT_GUI_RESTRICTED.put(id, new ClientGUIRestrictedData(id, data));
    }
    @ZenCodeType.Method
    public static void setClientGUIRestricted(VanillaGuiOverlay id){
        Sdmcrtplus.CLIENT_GUI_RESTRICTED.put(id.id(), new ClientGUIRestrictedBase(id));
    }
    @ZenCodeType.Method
    public static void setClientGUIRestricted(VanillaGuiOverlay id, String stage){
        Sdmcrtplus.CLIENT_GUI_RESTRICTED.put(id.id(),new ClientGUIRestrictedStage(id, stage));
    }
    @ZenCodeType.Method
    public static void setClientGUIRestricted(VanillaGuiOverlay id, IData data){
        Sdmcrtplus.CLIENT_GUI_RESTRICTED.put(id.id(), new ClientGUIRestrictedData(id, data));
    }
}
