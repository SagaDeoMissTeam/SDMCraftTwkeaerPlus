package net.sixik.sdmcrtplus.CrT.utils.fastutil.longs;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.openzen.zencode.java.ZenCodeType;


@ZenRegister
@Document("mods/sdmcrtplus/utils/fastutil/longs/LongSet")
@NativeTypeRegistration(value = LongSet.class, zenCodeName = "mods.sdmcrtplus.utils.fastutils.longs.LongSet")
public class ExpandLongSet {
    @ZenCodeType.Method
    public static void getLong(LongSet longs){
        longs.iterator().nextLong();
    }
}
