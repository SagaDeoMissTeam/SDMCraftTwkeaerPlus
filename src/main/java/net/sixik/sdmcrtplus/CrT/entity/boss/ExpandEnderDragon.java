package net.sixik.sdmcrtplus.CrT.entity.boss;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.level.pathfinder.Path;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/entity/boss/EnderDragon")
@NativeTypeRegistration(value = EnderDragon.class, zenCodeName = "mods.sdmcrtplus.entity.boss.EnderDragon")
public class ExpandEnderDragon {

    @ZenCodeType.Method
    public static Path findPath(EnderDragon enderDragon, int x, int z, @ZenCodeType.Nullable Node node){
        return enderDragon.findPath(x,z,node);
    }
    @ZenCodeType.Method
    public static void findClosestNode(EnderDragon enderDragon){
        enderDragon.findClosestNode();
    }
    @ZenCodeType.Method
    public static void findClosestNode(EnderDragon enderDragon, double x, double y, double z){
        enderDragon.findClosestNode(x,y,z);
    }
}
