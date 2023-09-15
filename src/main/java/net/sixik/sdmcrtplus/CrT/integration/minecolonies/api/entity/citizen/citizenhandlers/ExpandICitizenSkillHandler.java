package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen.citizenhandlers;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.entity.citizen.Skill;
import com.minecolonies.api.entity.citizen.citizenhandlers.ICitizenSkillHandler;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Tuple;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

import java.util.*;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/citizenhandlers/ICitizenSkillHandler")
@NativeTypeRegistration(value = ICitizenSkillHandler.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.citizenhandlers.ICitizenSkillHandler")
public class ExpandICitizenSkillHandler {

    @ZenCodeType.Method
    public static CompoundTag write(ICitizenSkillHandler iCitizenSkillHandler){
       return iCitizenSkillHandler.write();
    }

    @ZenCodeType.Method
    public static void read(ICitizenSkillHandler iCitizenSkillHandler, CompoundTag var1){
        iCitizenSkillHandler.read(var1);
    }
    @ZenCodeType.Method
   public static void init(ICitizenSkillHandler iCitizenSkillHandler, int var1){
       iCitizenSkillHandler.init(var1);
   }
    @ZenCodeType.Method
   public static void init(ICitizenSkillHandler iCitizenSkillHandler, IColony var1, @ZenCodeType.Nullable ICitizenData var2, @ZenCodeType.Nullable ICitizenData var3, Random var4){
       iCitizenSkillHandler.init(var1,var2,var3,var4);
   }
    @ZenCodeType.Method
   public static void tryLevelUpIntelligence(ICitizenSkillHandler iCitizenSkillHandler, Random var1, double var2, ICitizenData var4){
        iCitizenSkillHandler.tryLevelUpIntelligence(var1,var2,var4);
    }
    @ZenCodeType.Method
   public static int getLevel(ICitizenSkillHandler iCitizenSkillHandler, Skill var1){
        return iCitizenSkillHandler.getLevel(var1);
    }
    @ZenCodeType.Method
   public static void incrementLevel(ICitizenSkillHandler iCitizenSkillHandler,  Skill var1, int var2){
        iCitizenSkillHandler.incrementLevel(var1,var2);
    }
    @ZenCodeType.Method
   public static void addXpToSkill(ICitizenSkillHandler iCitizenSkillHandler, Skill var1, double var2, ICitizenData var4){
        iCitizenSkillHandler.addXpToSkill(var1,var2,var4);
    }
    @ZenCodeType.Method
   public static void removeXpFromSkill(ICitizenSkillHandler iCitizenSkillHandler,  Skill var1, double var2,  ICitizenData var4){
        iCitizenSkillHandler.removeXpFromSkill(var1,var2,var4);
    }
    @ZenCodeType.Method
   public static void levelUp(ICitizenSkillHandler iCitizenSkillHandler, ICitizenData var1){
        iCitizenSkillHandler.levelUp(var1);
    }
    @ZenCodeType.Method
   public static double getTotalXP(ICitizenSkillHandler iCitizenSkillHandler){
        return iCitizenSkillHandler.getTotalXP();
    }
    @ZenCodeType.Method
   public static Map<Skill, Map<Integer, Double>> getSkills(ICitizenSkillHandler iCitizenSkillHandler){
        Map<Skill, Map<Integer, Double>> map = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();
        for(Map.Entry<Skill, Tuple<Integer, Double>> entry : iCitizenSkillHandler.getSkills().entrySet()){
            map2.put(entry.getValue().getA(), entry.getValue().getB());
            map.put(entry.getKey(), map2);
        }
        return map;
    }
}
