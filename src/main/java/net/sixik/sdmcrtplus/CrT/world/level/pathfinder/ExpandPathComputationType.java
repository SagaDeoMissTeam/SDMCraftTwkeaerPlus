package net.sixik.sdmcrtplus.CrT.world.level.pathfinder;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.level.pathfinder.PathComputationType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/pathfinder/PathComputationType")
@NativeTypeRegistration(value = PathComputationType.class, zenCodeName = "mods.sdmcrtplus.world.level.pathfinder.PathComputationType")
@BracketEnum("level:pathtype")
public class ExpandPathComputationType {
}
