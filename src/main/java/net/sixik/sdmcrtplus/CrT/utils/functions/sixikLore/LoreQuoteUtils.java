package net.sixik.sdmcrtplus.CrT.utils.functions.sixikLore;


import com.aizistral.enigmaticlegacy.client.Quote;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.sixik.sdmcrtplus.source.lore.LoreQuote;
import net.sixik.sdmcrtplus.source.lore.client.LoreSubtitles;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikLore/LoreQuoteUtils")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikLore.LoreQuoteUtils")
public class LoreQuoteUtils {

    @ZenCodeType.Method
    public static List<LoreQuote> getAllQuotes(){
        return LoreQuote.getAllQuotes();
    }
    @ZenCodeType.Method
    public static LoreQuote getLastQuote(){
        return LoreQuote.getLastQuote();
    }
    @ZenCodeType.Method
    public static LoreQuote getByID(int id){
        return LoreQuote.getByID(id);
    }

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable LoreQuote getByName(String name){
        for(LoreQuote i : LoreQuote.getAllQuotes()){
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }
    @ZenCodeType.Method
    public static LoreQuote getRandom(List<LoreQuote> list){
        return LoreQuote.getRandom(list);
    }

    @ZenCodeType.Method
    public static int getID(LoreQuote loreQuote){
        return loreQuote.getId();
    }
    @ZenCodeType.Method
    public static LoreSubtitles getSubtitles(LoreQuote loreQuote){
        return loreQuote.getSubtitles();
    }
    @ZenCodeType.Method
    public static String getName(LoreQuote loreQuote){
        return loreQuote.getName();
    }
    @ZenCodeType.Method
    public static SoundEvent getSound(LoreQuote loreQuote){
        return loreQuote.getSound();
    }

    @ZenCodeType.Method
    public static void playCustom(ServerPlayer player){
        Quote.DEATH_MAY.play(player);
    }

    @ZenCodeType.Method
    public static void play(LoreQuote loreQuote, ServerPlayer player){
         loreQuote.play(player);
    }
    @ZenCodeType.Method
    public static void play(LoreQuote loreQuote, ServerPlayer player, int delayTicks){
         loreQuote.play(player, delayTicks);
    }
    @ZenCodeType.Method
    public static double getDuration(LoreSubtitles loreSubtitles){
        return loreSubtitles.getDuration();
    }
//    @ZenCodeType.Method
//    public static double getTimeCount(LoreSubtitles loreSubtitles){
//        return loreSubtitles.getTimeCount();
//    }
}
