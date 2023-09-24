package net.sixik.sdmcrtplus.CrT.utils.functions.sixikLore;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.sixik.sdmcrtplus.SDMConstants;
import net.sixik.sdmcrtplus.source.lore.LoreQuote;
import net.sixik.sdmcrtplus.source.lore.client.LoreSubtitles;
import org.openzen.zencode.java.ZenCodeType;

@Document("mods/sdmcrtplus/utils/functions/sixikLore/LoreQuote")
@NativeTypeRegistration(value = LoreQuote.class, zenCodeName = "mods.sdmcrtplus.utils.functions.sixikLore.LoreQuote",
        constructors = @NativeConstructor(value = {
                @NativeConstructor.ConstructorParameter(
                    name = "name", type = String.class
        )}
))
@ZenRegister(loaders = SDMConstants.CT_LOADER)
public class ExpandLoreQuote {

    @ZenCodeType.Method
    public static LoreQuote addSubtitles(LoreQuote loreQuote, LoreSubtitles loreSubtitles){
       return loreQuote.addSubtitles(loreSubtitles);
    }
    @ZenCodeType.Method
    public static int getId(LoreQuote loreQuote){
       return loreQuote.getId();
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
    public static LoreSubtitles getSubtitles(LoreQuote loreQuote){
       return loreQuote.getSubtitles();
    }
    @ZenCodeType.Method
    public static void play(LoreQuote loreQuote){
        loreQuote.play();
    }
    @ZenCodeType.Method
    public static void play(LoreQuote loreQuote,int delay){
        loreQuote.play(delay);
    }
    @ZenCodeType.Method
    public static void play(LoreQuote loreQuote, ServerPlayer player){
        loreQuote.play(player);
    }
    @ZenCodeType.Method
    public static void play(LoreQuote loreQuote, ServerPlayer player, int delay){
        loreQuote.play(player, delay);
    }
}
