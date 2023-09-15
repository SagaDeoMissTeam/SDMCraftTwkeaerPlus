package net.sixik.sdmcrtplus.CrT.utils.functions;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.util.function.Supplier;

@ZenRegister
@Document("mods/sdmcrtplus/utils/Supplier")
@NativeTypeRegistration(value = Supplier.class, zenCodeName = "mods.sdmcrtplus.utils.Supplier")
public class ExpandSupplier {
    @ZenCodeType.Method
    public static <T> T getValue(Supplier<T> supplier){
        return supplier.get();
    }
}
