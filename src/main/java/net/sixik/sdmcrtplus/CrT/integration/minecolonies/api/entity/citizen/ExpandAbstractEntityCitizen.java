package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.ICitizenDataView;
import com.minecolonies.api.colony.ICivilianData;
import com.minecolonies.api.colony.requestsystem.location.ILocation;
import com.minecolonies.api.entity.ai.statemachine.states.IState;
import com.minecolonies.api.entity.ai.statemachine.tickratestatemachine.ITickRateStateMachine;
import com.minecolonies.api.entity.citizen.AbstractEntityCitizen;
import com.minecolonies.api.entity.citizen.citizenhandlers.*;
import com.minecolonies.api.entity.pathfinding.AbstractAdvancedPathNavigate;
import com.minecolonies.api.inventory.InventoryCitizen;
import com.minecolonies.api.sounds.SoundManager;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.ai.goal.GoalSelector;
import net.minecraft.world.entity.player.Player;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/AbstractEntityCitizen")
@NativeTypeRegistration(value = AbstractEntityCitizen.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.AbstractEntityCitizen")
public class ExpandAbstractEntityCitizen {

    @ZenCodeType.Method
    public static ICitizenData getCitizenData(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getCitizenData();
    }
    @ZenCodeType.Method
    public static ICitizenDataView getCitizenDataView(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getCitizenDataView();
    }
    @ZenCodeType.Method
    public static InventoryCitizen getInventoryCitizen(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getInventoryCitizen();
    }
    @ZenCodeType.Method
    public static ICitizenChatHandler getCitizenChatHandler(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getCitizenChatHandler();
    }
    @ZenCodeType.Method
    public static ICitizenColonyHandler getCitizenColonyHandler(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getCitizenColonyHandler();
    }
    @ZenCodeType.Method
    public static ICitizenDiseaseHandler getCitizenDiseaseHandler(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getCitizenDiseaseHandler();
    }
    @ZenCodeType.Method
    public static ICitizenItemHandler getCitizenItemHandler(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getCitizenItemHandler();
    }
    @ZenCodeType.Method
    public static ICitizenExperienceHandler getCitizenExperienceHandler(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getCitizenExperienceHandler();
    }
    @ZenCodeType.Method
    public static ICitizenInventoryHandler getCitizenInventoryHandler(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getCitizenInventoryHandler();
    }
    @ZenCodeType.Method
    public static ICitizenJobHandler getCitizenJobHandler(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getCitizenJobHandler();
    }
    @ZenCodeType.Method
    public static ICitizenSleepHandler getCitizenSleepHandler(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getCitizenSleepHandler();
    }
    @ZenCodeType.Method
    public static RandomSource getRandom(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getRandom();
    }
    @ZenCodeType.Method
    public static ILocation getLocation(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getLocation();
    }
//    @ZenCodeType.Method
//    public static ITickRateStateMachine<IState> getEntityStateController(AbstractEntityCitizen abstractEntityCitizen){
//        return abstractEntityCitizen.getEntityStateController();
//    }
    @ZenCodeType.Method
    public static GoalSelector getTasks(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getTasks();
    }
    @ZenCodeType.Method
    public static AbstractAdvancedPathNavigate getNavigation(AbstractEntityCitizen abstractEntityCitizen){
        return abstractEntityCitizen.getNavigation();
    }
    @ZenCodeType.Method
    public static int getOffsetTicks(AbstractEntityCitizen abstractEntityCitizen) {
        return abstractEntityCitizen.getOffsetTicks();
    }
    @ZenCodeType.Method
    public static boolean isBlocking(AbstractEntityCitizen abstractEntityCitizen) {
        return abstractEntityCitizen.isBlocking();
    }
    @ZenCodeType.Method
    public static int getRecentlyHit(AbstractEntityCitizen abstractEntityCitizen) {
        return abstractEntityCitizen.getRecentlyHit();
    }
    @ZenCodeType.Method
    public static boolean checkCanDropLoot(AbstractEntityCitizen abstractEntityCitizen) {
        return abstractEntityCitizen.checkCanDropLoot();
    }

    @ZenCodeType.Method
    public static ICivilianData getCivilianData(AbstractEntityCitizen abstractCivilianEntity){
        return abstractCivilianEntity.getCivilianData();
    }
    @ZenCodeType.Method
    public static void setCivilianData(AbstractEntityCitizen abstractCivilianEntity, ICivilianData iCivilianData){
        abstractCivilianEntity.setCivilianData(iCivilianData);
    }

    @ZenCodeType.Method
    public static boolean canBeStuck(AbstractEntityCitizen abstractCivilianEntity){
        return abstractCivilianEntity.canBeStuck();
    }
    @ZenCodeType.Method
    public static boolean canBeLeashed(AbstractEntityCitizen abstractCivilianEntity, Player player){
        return abstractCivilianEntity.canBeLeashed(player);
    }
    @ZenCodeType.Method
    public static int getCivilianID(AbstractEntityCitizen abstractCivilianEntity){
        return abstractCivilianEntity.getCivilianID();
    }
    @ZenCodeType.Method
    public static void setCitizenId(AbstractEntityCitizen abstractCivilianEntity, int id){
        abstractCivilianEntity.setCitizenId(id);
    }
    @ZenCodeType.Method
    public static SoundManager getSoundManager(AbstractEntityCitizen abstractCivilianEntity){
        return abstractCivilianEntity.getSoundManager();
    }
    @ZenCodeType.Method
    public static void setCanBeStuck(AbstractEntityCitizen abstractCivilianEntity, boolean var){
        abstractCivilianEntity.setCanBeStuck(var);
    }
    @ZenCodeType.Method
    public static boolean isDead(AbstractEntityCitizen abstractCivilianEntity){
       return abstractCivilianEntity.isDead();
    }
    @ZenCodeType.Method
    public static boolean isFemale(AbstractEntityCitizen abstractCivilianEntity){
       return abstractCivilianEntity.isFemale();
    }
    @ZenCodeType.Method
    public static boolean isPushable(AbstractEntityCitizen abstractCivilianEntity){
       return abstractCivilianEntity.isPushable();
    }
    @ZenCodeType.Method
    public static boolean isPushedByFluid(AbstractEntityCitizen abstractCivilianEntity){
       return abstractCivilianEntity.isPushedByFluid();
    }
    @ZenCodeType.Method
    public static boolean isWorkerAtSiteWithMove(AbstractEntityCitizen abstractCivilianEntity, BlockPos var1, int var2){
       return abstractCivilianEntity.isWorkerAtSiteWithMove(var1, var2);
    }
}
