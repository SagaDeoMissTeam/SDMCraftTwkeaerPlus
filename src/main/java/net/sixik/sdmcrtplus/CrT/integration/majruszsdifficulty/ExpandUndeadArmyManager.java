package net.sixik.sdmcrtplus.CrT.integration.majruszsdifficulty;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.majruszsdifficulty.undeadarmy.UndeadArmy;
import com.majruszsdifficulty.undeadarmy.UndeadArmyManager;
import com.majruszsdifficulty.undeadarmy.data.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.Optional;

@ZenRegister(modDeps = "majruszsdifficulty")
@Document("mods/sdmcrtplus/integration/majruszsdifficulty/UndeadArmyManager")
@NativeTypeRegistration(value = UndeadArmyManager.class,zenCodeName = "mods.sdmcrtplus.integration.majruszsdifficulty.UndeadArmyManager")
public class ExpandUndeadArmyManager {

    @ZenCodeType.Method
    public static UndeadArmy findNearestUndeadArmy(UndeadArmyManager undeadArmyManager, BlockPos position){
       return undeadArmyManager.findNearestUndeadArmy(position);
    }
    @ZenCodeType.Method
    public static List<UndeadArmy> getUndeadArmies(UndeadArmyManager undeadArmyManager){
       return undeadArmyManager.getUndeadArmies();
    }
    @ZenCodeType.Method
    public static boolean isPartOfUndeadArmy(UndeadArmyManager undeadArmyManager, Entity entity){
       return undeadArmyManager.isPartOfUndeadArmy(entity);
    }
    @ZenCodeType.Method
    public static boolean tryToSpawn(UndeadArmyManager undeadArmyManager, Player player){
       return undeadArmyManager.tryToSpawn(player);
    }
    @ZenCodeType.Method
    public static boolean tryToSpawn(UndeadArmyManager undeadArmyManager, BlockPos position, Direction direction){
       return undeadArmyManager.tryToSpawn(position, Optional.of(direction));
    }
}
