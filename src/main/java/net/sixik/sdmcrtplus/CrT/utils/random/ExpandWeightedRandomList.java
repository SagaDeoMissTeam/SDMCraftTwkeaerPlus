package net.sixik.sdmcrtplus.CrT.utils.random;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.util.RandomSource;
import net.minecraft.util.random.WeightedEntry;
import net.minecraft.util.random.WeightedRandomList;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.Optional;

/**
 * @param <E>
 */
@ZenRegister
@Document("mods/sdmcrtplus/utils/random/WeightedRandomList")
@NativeTypeRegistration(value = WeightedRandomList.class, zenCodeName = "mods.sdmcrtplus.utils.random.WeightedRandomList")
public class ExpandWeightedRandomList<E extends WeightedEntry> {

    @ZenCodeType.Method
    public static <E extends WeightedEntry> Optional<E> getRandom(WeightedRandomList<E> weightedRandomList, RandomSource randomSource){
        return weightedRandomList.getRandom(randomSource);
    }
    @ZenCodeType.Method
    public static <E extends WeightedEntry> boolean isEmpty(WeightedRandomList<E> weightedRandomList){
        return weightedRandomList.isEmpty();
    }
    @ZenCodeType.Method
    public static <E extends WeightedEntry> List<E> unwrap(WeightedRandomList<E> weightedRandomList){
        return weightedRandomList.unwrap();
    }
}
