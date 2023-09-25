//package net.sixik.sdmcrtplus.CrT.world.level.block;
//
//import com.blamejared.crafttweaker.api.annotation.ZenRegister;
//import com.blamejared.crafttweaker_annotations.annotations.Document;
//import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
//import net.minecraft.core.BlockPos;
//import net.minecraft.world.damagesource.DamageSource;
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.EntitySelector;
//import net.minecraft.world.entity.item.FallingBlockEntity;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.Fallable;
//import net.minecraft.world.level.block.FallingBlock;
//import net.minecraft.world.level.block.state.BlockState;
//import org.openzen.zencode.java.ZenCodeType;
//
//import java.util.function.Predicate;
//
//@ZenRegister
//@Document("mods/sdmcrtplus/world/level/block/Fallable")
//@NativeTypeRegistration(value = Fallable.class, zenCodeName = "mods.sdmcrtplus.world.level.block.Fallable")
//public class ExpandFallable {
//
//    @ZenCodeType.Method
//    public static void onLand(Fallable fallable, Level level, BlockPos pos, BlockState blockState, BlockState state, FallingBlockEntity fallingBlockEntity) {
//        fallable.onLand(level,pos,blockState,state,fallingBlockEntity);
//    }
//    @ZenCodeType.Method
//    public static void onBrokenAfterFall(Fallable fallable, Level level, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
//        fallable.onBrokenAfterFall(level,pos,fallingBlockEntity);
//    }
//    @ZenCodeType.Method
//    public static DamageSource getFallDamageSource(Fallable fallable) {
//        return fallable.getFallDamageSource();
//    }
//    @ZenCodeType.Method
//    public static Predicate<Entity> getHurtsEntitySelector(Fallable fallable) {
//        return fallable.getHurtsEntitySelector();
//    }
//}
