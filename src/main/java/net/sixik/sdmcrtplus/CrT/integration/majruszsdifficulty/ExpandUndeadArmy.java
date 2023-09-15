package net.sixik.sdmcrtplus.CrT.integration.majruszsdifficulty;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.majruszsdifficulty.undeadarmy.UndeadArmy;
import com.majruszsdifficulty.undeadarmy.components.Components;
import com.majruszsdifficulty.undeadarmy.data.Direction;
import com.majruszsdifficulty.undeadarmy.data.MobInfo;
import com.majruszsdifficulty.undeadarmy.data.Phase;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "majruszsdifficulty")
@Document("mods/sdmcrtplus/integration/majruszsdifficulty/UndeadArmy")
@NativeTypeRegistration(value = UndeadArmy.class,zenCodeName = "mods.sdmcrtplus.integration.majruszsdifficulty.UndeadArmy")
public class ExpandUndeadArmy {

    @ZenCodeType.Method
    @ZenCodeType.Getter("direction")
    public static Direction getDirection(UndeadArmy undeadArmy){
        return undeadArmy.direction;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("level")
    public static ServerLevel getLevel(UndeadArmy undeadArmy){
        return undeadArmy.level;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("boss")
    public static Entity getBoss(UndeadArmy undeadArmy){
        return undeadArmy.boss;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("areEntitiesLoaded")
    public static boolean isAreEntitiesLoaded(UndeadArmy undeadArmy){
        return undeadArmy.areEntitiesLoaded;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("components")
    public static Components isComponents(UndeadArmy undeadArmy){
        return undeadArmy.components;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("currentWave")
    public static int getCurrentWave(UndeadArmy undeadArmy) {
        return undeadArmy.currentWave;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("mobsLeft")
    public static List<MobInfo> getMobsLeft(UndeadArmy undeadArmy) {
        return undeadArmy.mobsLeft;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("participants")
    public static List<ServerPlayer> getParticipants(UndeadArmy undeadArmy) {
        return undeadArmy.participants;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("phase")
    public static Phase getPhase(UndeadArmy undeadArmy) {
        return undeadArmy.phase;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("positionToAttack")
    public static BlockPos getSositionToAttack(UndeadArmy undeadArmy) {
        return undeadArmy.positionToAttack;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("hasFinished")
    public static boolean hasFinished(UndeadArmy undeadArmy) {
        return undeadArmy.hasFinished();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("isLastWave")
    public static boolean isLastWave(UndeadArmy undeadArmy) {
        return undeadArmy.isLastWave();
    }
    @ZenCodeType.Method
    public static double distanceTo(UndeadArmy undeadArmy, BlockPos pos) {
        return undeadArmy.distanceTo(pos);
    }
    @ZenCodeType.Method
    public static boolean isInRange(UndeadArmy undeadArmy, BlockPos pos) {
        return undeadArmy.isInRange(pos);
    }
    @ZenCodeType.Method
    public static boolean isPartOfWave(UndeadArmy undeadArmy, Entity entity) {
        return undeadArmy.isPartOfWave(entity);
    }
    @ZenCodeType.Method
    public static void finish(UndeadArmy undeadArmy) {
        undeadArmy.finish();
    }
    @ZenCodeType.Method
    public static void highlightArmy(UndeadArmy undeadArmy) {
        undeadArmy.highlightArmy();;
    }
    @ZenCodeType.Method
    public static void killAllUndeadArmyMobs(UndeadArmy undeadArmy) {
        undeadArmy.killAllUndeadArmyMobs();;
    }

    @ZenCodeType.Method
    public static void setState(UndeadArmy undeadArmy, Phase.State state, int ticksLeft) {
         undeadArmy.setState(state,ticksLeft);
    }
    @ZenCodeType.Method
    public static void tick(UndeadArmy undeadArmy) {
         undeadArmy.tick();;
    }
    @ZenCodeType.Method
    public static void start(UndeadArmy undeadArmy, BlockPos positionToAttack, Direction direction) {
         undeadArmy.start(positionToAttack, direction);
    }
}
