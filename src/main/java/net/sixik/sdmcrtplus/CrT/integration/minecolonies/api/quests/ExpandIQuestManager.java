package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.quests;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.quests.IQuestInstance;
import com.minecolonies.api.quests.IQuestManager;
import com.minecolonies.api.quests.IQuestTemplate;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/quests/IQuestManager")
@NativeTypeRegistration(value = IQuestManager.class, zenCodeName = "mods.sdmcrtplus.integration.api.quests.IQuestManager")
public class ExpandIQuestManager {

    @ZenCodeType.Method
    public static Map<ResourceLocation, IQuestTemplate> getGlobalServerQuest(IQuestManager questManager){
        return questManager.GLOBAL_SERVER_QUESTS;
    }
    @ZenCodeType.Method
   public static boolean attemptAcceptQuest(IQuestManager iQuestManager, ResourceLocation var1, Player var2){
       return iQuestManager.attemptAcceptQuest(var1,var2);
   }
    @ZenCodeType.Method
   public static void completeQuest(IQuestManager iQuestManager,ResourceLocation var1){
       iQuestManager.completeQuest(var1);
   }
    @ZenCodeType.Method
   public static void onColonyTick(IQuestManager iQuestManager){
       iQuestManager.onColonyTick();
   }
    @ZenCodeType.Method
   public static void deleteQuest(IQuestManager iQuestManager,ResourceLocation var1){
       iQuestManager.deleteQuest(var1);
   }
    @ZenCodeType.Method
   public static @ZenCodeType.Nullable IQuestInstance getAvailableOrInProgressQuest(IQuestManager iQuestManager, ResourceLocation var1){
       return iQuestManager.getAvailableOrInProgressQuest(var1);
   }
    @ZenCodeType.Method
   public static void onWorldLoad(IQuestManager iQuestManager){
       iQuestManager.onWorldLoad();
   }
    @ZenCodeType.Method
   public static void unlockQuest(IQuestManager iQuestManager,ResourceLocation var1){
       iQuestManager.unlockQuest(var1);
   }
    @ZenCodeType.Method
   public static boolean isUnlocked(IQuestManager iQuestManager,ResourceLocation var1){
       return iQuestManager.isUnlocked(var1);
   }
    @ZenCodeType.Method
   public static void alterReputation(IQuestManager iQuestManager,double var1){
       iQuestManager.alterReputation(var1);
   }
    @ZenCodeType.Method
   public static double getReputation(IQuestManager iQuestManager){
       return iQuestManager.getReputation();
   }
}
