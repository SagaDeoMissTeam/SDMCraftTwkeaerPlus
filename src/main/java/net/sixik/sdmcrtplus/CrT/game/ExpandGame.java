//package net.sixik.sdmcrtplus.CrT.game;
//
//
//import com.blamejared.crafttweaker.api.annotation.ZenRegister;
//import com.blamejared.crafttweaker_annotations.annotations.Document;
//import net.minecraft.client.Minecraft;
//import org.openzen.zencode.java.ZenCodeType;
//
//
//@ZenRegister
//@Document("mods/sdmcrtplus/game/ExpandGame")
//@ZenCodeType.Expansion("crafttweaker.api.game.Game")
//public class ExpandGame {
//
//    /**
//     The selected language of the player RU/EN/UA/...
//     */
//    @ZenCodeType.Method
//    public static String getLang(){
//        return Minecraft.getInstance().getLocale().getLanguage();
//    }
//
//    /**
//     The selected language of the player ru_ru/en_en/ua_ua/...
//     */
//    @ZenCodeType.Method
//    public static String getLanguageTag(){
//        return Minecraft.getInstance().getLocale().toLanguageTag();
//    }
//}
