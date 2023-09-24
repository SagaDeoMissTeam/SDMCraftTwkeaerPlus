package net.sixik.sdmcrtplus.CrT.utils.functions.sixikLore;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.sixik.sdmcrtplus.SDMConstants;
import net.sixik.sdmcrtplus.source.lore.LoreQuote;
import net.sixik.sdmcrtplus.source.lore.client.LoreSubtitles;
import org.openzen.zencode.java.ZenCodeType;


@Document("mods/sdmcrtplus/utils/functions/sixikLore/LoreSubtitles")
@NativeTypeRegistration(value = LoreSubtitles.class, zenCodeName = "mods.sdmcrtplus.utils.functions.sixikLore.LoreSubtitles",
        constructors = @NativeConstructor(value = {
                @NativeConstructor.ConstructorParameter(
                        name = "duration", type = double.class
                )})
)
@ZenRegister(loaders = SDMConstants.CT_LOADER)
public class ExpandLoreSubtitles {

    @ZenCodeType.Method
    public static double getDuration(LoreSubtitles loreSubtitles){
        return loreSubtitles.getDuration();
    }
//    @ZenCodeType.Method
//    public static double getTimeCount(LoreSubtitles loreSubtitles){
//        return loreSubtitles.getTimeCount();
//    }
    @ZenCodeType.Method
    public static LoreSubtitles add(LoreSubtitles loreSubtitles, double time){
        return loreSubtitles.add(time);
    }
    @ZenCodeType.Method
    public static LoreSubtitles add(LoreSubtitles loreSubtitles, double time, String line){
        return loreSubtitles.add(time, line);
    }
    @ZenCodeType.Method
    public static String getLine(LoreSubtitles loreSubtitles, double time){
        return loreSubtitles.getLine(time);
    }
    @ZenCodeType.Method
    public static void setQuote(LoreSubtitles loreSubtitles, LoreQuote quote){
         loreSubtitles.setQuote(quote);
    }
}
