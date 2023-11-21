package net.sixik.sdmcrtplus.CrT.utils.functions;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.util.function.Consumer;

@ZenRegister
@Document("mods/sdmcrtplus/utils/Consumer")
@NativeTypeRegistration(value = Consumer.class, zenCodeName = "mods.sdmcrtplus.utils.Consumer")
public class ExpandConsumer {



    @ZenCodeType.Method
    public static <T> void accept(Consumer<T> consumer, T t){
        consumer.accept(t);
    }

}
