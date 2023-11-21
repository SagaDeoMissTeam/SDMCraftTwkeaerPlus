package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings.modules;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.ldtteam.blockui.views.BOWindow;
import com.minecolonies.api.colony.IColonyView;
import com.minecolonies.api.colony.buildings.modules.IBuildingModuleView;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.api.colony.buildings.views.IBuildingView;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;


/**
 * This class is responsible for displaying schematics in the book. To be honest, I don't fucking know what to do with it at all.
 */
@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/registry/IBuildingModuleView")
@NativeTypeRegistration(value = IBuildingModuleView.class, zenCodeName = "mods.sdmcrtplus.integration.api.colony.buildings.registry.IBuildingModuleView")
public class ExpandIBuildingModuleView {

    @ZenCodeType.Method
   public static IBuildingModuleView setBuildingView(IBuildingModuleView view, IBuildingView var1){
       return view.setBuildingView(var1);
   }
    @ZenCodeType.Method
   public static boolean isPageVisible(IBuildingModuleView view) {
       return view.isPageVisible();
   }
    @ZenCodeType.Method
   public static String getIcon(IBuildingModuleView view){
       return view.getIcon();
   }
    @ZenCodeType.Method
   public static String getDesc(IBuildingModuleView view){
       return view.getDesc();
   }
    @ZenCodeType.Method
   public static IColonyView getColony(IBuildingModuleView view){
       return view.getColony();
   }

   @ZenCodeType.Method
   public static IBuildingView getBuildingView(IBuildingModuleView view){
       return view.getBuildingView();
   }
}
