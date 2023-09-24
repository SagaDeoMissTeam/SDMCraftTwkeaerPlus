package net.sixik.sdmcrtplus.CrT.utils.functions.sixikLore;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.sixik.sdmcrtplus.SDMConstants;
import net.sixik.sdmcrtplus.source.lore.LoreQuote;
import org.openzen.zencode.java.ZenCodeType;

@Document("mods/sdmcrtplus/utils/functions/sixikLore/LoreBuilder")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikLore.LoreBuilder")
@ZenRegister(loaders = SDMConstants.CT_LOADER)
public class LoreBuilder {

    @ZenCodeType.Method
    public static void registerLore(LoreQuote loreQuote){
        LoreQuote.register(loreQuote);
    }
}
