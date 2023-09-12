package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.colony.buildings;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.buildings.ModBuildings;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/colony/buildings/ModBuildings")
@ZenCodeType.Name("mods.sdmcrtplus.integration.api.colony.buildings.ModBuildings")
public class ExpandModBuildings {

   @ZenCodeType.Method
   public static @ZenCodeType.Nullable BuildingEntry getBuilding(String name){
      switch (name) {
         case "archery" : return ModBuildings.alchemist.get();
         case "baker" : return ModBuildings.bakery.get();
         case "barracks" : return ModBuildings.barracks.get();
         case "barrackstower" : return ModBuildings.barracksTower.get();
         case "blacksmith" : return ModBuildings.blacksmith.get();
         case "builder" : return ModBuildings.builder.get();
         case "chickenherder" : return ModBuildings.chickenHerder.get();
         case "combatacademy" : return ModBuildings.combatAcademy.get();
         case "composter" : return ModBuildings.composter.get();
         case "cook" : return ModBuildings.cook.get();
         case "cowboy" : return ModBuildings.cowboy.get();
         case "crusher" : return ModBuildings.crusher.get();
         case "deliveryman" : return ModBuildings.deliveryman.get();
         case "farmer" : return ModBuildings.farmer.get();
         case "fisherman" : return ModBuildings.fisherman.get();
         case "guardtower" : return ModBuildings.guardTower.get();
         case "residence" : return ModBuildings.home.get();
         case "library" : return ModBuildings.library.get();
         case "lumberjack" : return ModBuildings.lumberjack.get();
         case "miner" : return ModBuildings.miner.get();
         case "sawmill" : return ModBuildings.sawmill.get();
         case "shepherd" : return ModBuildings.shepherd.get();
         case "sifter" : return ModBuildings.sifter.get();
         case "smeltery" : return ModBuildings.smeltery.get();
         case "stonemason" : return ModBuildings.stoneMason.get();
         case "stonesmeltery" : return ModBuildings.stoneSmelter.get();
         case "swineherder" : return ModBuildings.swineHerder.get();
         case "townhall" : return ModBuildings.townHall.get();
         case "warehouse" : return ModBuildings.wareHouse.get();
         case "postbox" : return ModBuildings.postBox.get();
         case "florist" : return ModBuildings.florist.get();
         case "enchanter" : return ModBuildings.enchanter.get();
         case "university" : return ModBuildings.university.get();
         case "hospital" : return ModBuildings.home.get();
         case "stash" : return  ModBuildings.stash.get();
         case "school" : return ModBuildings.school.get();
         case "glassblower" : return ModBuildings.glassblower.get();
         case "dyer" : return ModBuildings.dyer.get();
         case "fletcher" : return ModBuildings.fisherman.get();
         case "mechanic" : return ModBuildings.mechanic.get();
         case "plantation" : return ModBuildings.plantation.get();
         case "tavern" : return ModBuildings.tavern.get();
         case "concretemixer" : return ModBuildings.concreteMixer.get();
         case "rabbithutch" : return ModBuildings.rabbitHutch.get();
         case "beekeeper" : return ModBuildings.beekeeper.get();
         case "mysticalsite" : return ModBuildings.mysticalSite.get();
         case "graveyard" : return ModBuildings.graveyard.get();
         case "netherworker" : return ModBuildings.netherWorker.get();
         case "simplequarry" : return ModBuildings.simpleQuarry.get();
         case "mediumquarry" : return ModBuildings.mediumQuarry.get();
         default:
            return null;
      }
   }

   @ZenCodeType.Field public static final String ARCHERY_ID = ModBuildings.ARCHERY_ID;
   @ZenCodeType.Field public static final String BAKERY_ID = ModBuildings.BAKERY_ID;
   @ZenCodeType.Field public static final String BARRACKS_ID = ModBuildings.BARRACKS_ID;
   @ZenCodeType.Field public static final String BARRACKS_TOWER_ID = ModBuildings.BARRACKS_TOWER_ID;
   @ZenCodeType.Field public static final String BLACKSMITH_ID = ModBuildings.BLACKSMITH_ID;
   @ZenCodeType.Field public static final String BUILDER_ID = ModBuildings.BUILDER_ID;
   @ZenCodeType.Field public static final String CHICKENHERDER_ID = ModBuildings.CHICKENHERDER_ID;
   @ZenCodeType.Field public static final String COMBAT_ACADEMY_ID = ModBuildings.COMBAT_ACADEMY_ID;
   @ZenCodeType.Field public static final String COMPOSTER_ID = ModBuildings.COMPOSTER_ID;
   @ZenCodeType.Field public static final String COOK_ID = ModBuildings.COOK_ID;
   @ZenCodeType.Field public static final String COWBOY_ID = ModBuildings.COWBOY_ID;
   @ZenCodeType.Field public static final String CRUSHER_ID = ModBuildings.CRUSHER_ID;
   @ZenCodeType.Field public static final String DELIVERYMAN_ID = ModBuildings.DELIVERYMAN_ID;
   @ZenCodeType.Field public static final String FARMER_ID = ModBuildings.FARMER_ID;
   @ZenCodeType.Field public static final String FISHERMAN_ID = ModBuildings.FISHERMAN_ID;
   @ZenCodeType.Field public static final String GUARD_TOWER_ID = ModBuildings.GUARD_TOWER_ID;
   @ZenCodeType.Field public static final String HOME_ID = ModBuildings.HOME_ID;
   @ZenCodeType.Field public static final String LIBRARY_ID = ModBuildings.LIBRARY_ID;
   @ZenCodeType.Field public static final String LUMBERJACK_ID = ModBuildings.LUMBERJACK_ID;
   @ZenCodeType.Field public static final String MINER_ID = ModBuildings.MINER_ID;
   @ZenCodeType.Field public static final String SAWMILL_ID = ModBuildings.SAWMILL_ID;
   @ZenCodeType.Field public static final String SHEPHERD_ID = ModBuildings.SHEPHERD_ID;
   @ZenCodeType.Field public static final String SIFTER_ID = ModBuildings.SIFTER_ID;
   @ZenCodeType.Field public static final String SMELTERY_ID = ModBuildings.SMELTERY_ID;
   @ZenCodeType.Field public static final String STONE_MASON_ID = ModBuildings.STONE_MASON_ID;
   @ZenCodeType.Field public static final String STONE_SMELTERY_ID = ModBuildings.STONE_SMELTERY_ID;
   @ZenCodeType.Field public static final String SWINE_HERDER_ID = ModBuildings.SWINE_HERDER_ID;
   @ZenCodeType.Field public static final String TOWNHALL_ID = ModBuildings.TOWNHALL_ID;
   @ZenCodeType.Field public static final String WAREHOUSE_ID = ModBuildings.WAREHOUSE_ID;
   @ZenCodeType.Field public static final String POSTBOX_ID = ModBuildings.POSTBOX_ID;
   @ZenCodeType.Field public static final String FLORIST_ID = ModBuildings.FLORIST_ID;
   @ZenCodeType.Field public static final String ENCHANTER_ID = ModBuildings.ENCHANTER_ID;
   @ZenCodeType.Field public static final String UNIVERSITY_ID = ModBuildings.UNIVERSITY_ID;
   @ZenCodeType.Field public static final String HOSPITAL_ID = ModBuildings.HOSPITAL_ID;
   @ZenCodeType.Field public static final String STASH_ID = ModBuildings.STASH_ID;
   @ZenCodeType.Field public static final String SCHOOL_ID = ModBuildings.SCHOOL_ID;
   @ZenCodeType.Field public static final String GLASSBLOWER_ID = ModBuildings.GLASSBLOWER_ID;
   @ZenCodeType.Field public static final String DYER_ID = ModBuildings.DYER_ID;
   @ZenCodeType.Field public static final String FLETCHER_ID = ModBuildings.FLETCHER_ID;
   @ZenCodeType.Field public static final String MECHANIC_ID = ModBuildings.MECHANIC_ID;
   @ZenCodeType.Field public static final String PLANTATION_ID = ModBuildings.PLANTATION_ID;
   @ZenCodeType.Field public static final String TAVERN_ID = ModBuildings.TAVERN_ID;
   @ZenCodeType.Field public static final String CONCRETE_ID = ModBuildings.CONCRETE_ID;
   @ZenCodeType.Field public static final String RABBIT_ID =  ModBuildings.RABBIT_ID;
   @ZenCodeType.Field public static final String BEEKEEPER_ID = ModBuildings.BEEKEEPER_ID;
   @ZenCodeType.Field public static final String MYSTICAL_SITE_ID = ModBuildings.MYSTICAL_SITE_ID;
   @ZenCodeType.Field public static final String GRAVEYARD_ID = ModBuildings.GRAVEYARD_ID;
   @ZenCodeType.Field public static final String NETHERWORKER_ID = ModBuildings.NETHERWORKER_ID;
   @ZenCodeType.Field public static final String SIMPLE_QUARRY_ID = ModBuildings.SIMPLE_QUARRY_ID;
   @ZenCodeType.Field public static final String MEDIUM_QUARRY_ID = ModBuildings.MEDIUM_QUARRY_ID;
//   @ZenCodeType.Field public static final String LARGE_QUARRY_ID = ModBuildings.LARGE_QUARRY_ID;
   @ZenCodeType.Field public static final String ALCHEMIST_ID = ModBuildings.ALCHEMIST_ID;
}
