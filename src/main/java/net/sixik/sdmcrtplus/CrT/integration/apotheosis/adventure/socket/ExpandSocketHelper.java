package net.sixik.sdmcrtplus.CrT.integration.apotheosis.adventure.socket;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;
import shadows.apotheosis.adventure.affix.socket.SocketHelper;
import shadows.apotheosis.adventure.affix.socket.gem.Gem;
import shadows.apotheosis.adventure.affix.socket.gem.GemInstance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@ZenRegister(modDeps = "apotheosis")
@Document("mods/sdmcrtplus/integration/apotheosis/adventure/socket/SocketHelper")
@ZenCodeType.Name("mods.sdmcrtplus.integration.apotheosis.adventure.socket.SocketHelper")
public class ExpandSocketHelper {

    @ZenCodeType.Method
    public static int getSockets(IItemStack itemStack){
       return SocketHelper.getSockets(itemStack.getInternal());
    }
    @ZenCodeType.Method
    public static int getFirstEmptySocket(IItemStack itemStack){
       return SocketHelper.getFirstEmptySocket(itemStack.getInternal());
    }
    @ZenCodeType.Method
    public static List<Gem> getActiveGems(IItemStack itemStack){
       return SocketHelper.getActiveGems(itemStack.getInternal());
    }
    @ZenCodeType.Method
    public static List<ItemStack> getGems(IItemStack itemStack){
       return SocketHelper.getGems(itemStack.getInternal());
    }
    @ZenCodeType.Method
    public static void setSockets(IItemStack itemStack, int sockets){
        SocketHelper.setSockets(itemStack.getInternal(), sockets);
    }
    @ZenCodeType.Method
    public static Stream<GemInstance> getGemInstances(IItemStack itemStack){
        return SocketHelper.getGemInstances(itemStack.getInternal());
    }
    @ZenCodeType.Method
    public static void setSockets(IItemStack itemStack, List<IItemStack> gems){
        List<ItemStack> gemsL = new ArrayList<>();
        for(IItemStack iItemStack : gems) gemsL.add(iItemStack.getInternal());
        SocketHelper.setGems(itemStack.getInternal(), gemsL);
    }
}
