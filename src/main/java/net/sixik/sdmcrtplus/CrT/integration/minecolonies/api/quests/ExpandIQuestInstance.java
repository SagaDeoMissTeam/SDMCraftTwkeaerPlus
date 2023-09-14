package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.quests;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.colony.IColony;
import com.minecolonies.api.quests.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/quests/IQuestInstance")
@NativeTypeRegistration(value = IQuestInstance.class, zenCodeName = "mods.sdmcrtplus.integration.api.quests.IQuestInstance")
public class ExpandIQuestInstance {
    @ZenCodeType.Method
   public static void onStart(IQuestInstance instance, Player var1, IColony var2){
       instance.onStart(var1,var2);
   }
    @ZenCodeType.Method
   public static IQuestGiver getQuestGiver(IQuestInstance instance){
        return instance.getQuestGiver();
   }
    @ZenCodeType.Method
   public static int getQuestGiverId(IQuestInstance instance){
        return instance.getQuestGiverId();
   }
    @ZenCodeType.Method
   public static boolean isValid(IQuestInstance instance, IColony var1){
        return instance.isValid(var1);
   }
    @ZenCodeType.Method
   public static ResourceLocation getId(IQuestInstance instance){
        return instance.getId();
   }
    @ZenCodeType.Method
   public static void onDeletion(IQuestInstance instance){
        instance.onDeletion();
   }
    @ZenCodeType.Method
   public static IObjectiveInstance advanceObjective(IQuestInstance instance,Player var1, int var2){
        return instance.advanceObjective(var1,var2);
   }
    @ZenCodeType.Method
   public static void onCompletion(IQuestInstance instance){
        instance.onCompletion();
   }
    @ZenCodeType.Method
   public static int getIndex(IQuestInstance instance){
        return instance.getIndex();
   }
    @ZenCodeType.Method
   public static IQuestParticipant getParticipant(IQuestInstance instance,int var1){
        return instance.getParticipant(var1);
   }
    @ZenCodeType.Method
   public static List<Integer> getParticipants(IQuestInstance instance){
        return instance.getParticipants();
   }
    @ZenCodeType.Method
   public static @ZenCodeType.Nullable IObjectiveInstance getCurrentObjectiveInstance(IQuestInstance instance){
        return instance.getCurrentObjectiveInstance();
   }
    @ZenCodeType.Method
   public static IColony getColony(IQuestInstance instance){
        return instance.getColony();
   }
    @ZenCodeType.Method
   public static String getAssignedPlayer(IQuestInstance instance){
        return instance.getAssignedPlayer().toString();
   }
    @ZenCodeType.Method
   public static void advanceObjective(IQuestInstance instance,Player var1){
        instance.advanceObjective(var1);
   }
    @ZenCodeType.Method
   public static void onWorldLoad(IQuestInstance instance){
        instance.onWorldLoad();
   }
}
