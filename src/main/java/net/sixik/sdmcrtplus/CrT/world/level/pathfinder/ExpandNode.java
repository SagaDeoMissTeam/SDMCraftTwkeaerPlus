package net.sixik.sdmcrtplus.CrT.world.level.pathfinder;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.phys.Vec3;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/level/pathfinder/Node")
@NativeTypeRegistration(value = Node.class, zenCodeName = "mods.sdmcrtplus.world.level.pathfinder.Node")
public class ExpandNode {
    @ZenCodeType.Method
    public static float distanceTo(Node n, Node node) {
        return n.distanceTo(node);
    }
    @ZenCodeType.Method
    public static float distanceToXZ(Node n, Node node) {
        return n.distanceToXZ(node);
    }
    @ZenCodeType.Method
    public static float distanceTo(Node n, BlockPos pos) {
        return n.distanceTo(pos);
    }
    @ZenCodeType.Method
    public static float distanceToSqr(Node n, Node node) {
        return n.distanceToSqr(node);
    }
    @ZenCodeType.Method
    public static float distanceToSqr(Node n, BlockPos pos) {
        return n.distanceToSqr(pos);
    }
    @ZenCodeType.Method
    public static float distanceManhattan(Node n, Node node) {
        return n.distanceManhattan(node);
    }
    @ZenCodeType.Method
    public static float distanceManhattan(Node n, BlockPos pos) {
        return n.distanceManhattan(pos);
    }
    @ZenCodeType.Method
    public static BlockPos asBlockPos(Node n) {
        return n.asBlockPos();
    }
    @ZenCodeType.Method
    public static Vec3 asVec3(Node n) {
        return n.asVec3();
    }
}
