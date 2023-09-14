package net.sixik.sdmcrtplus.CrT.entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.AgeableMob;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/entity/AgeableMob")
@NativeTypeRegistration(value = AgeableMob.class, zenCodeName = "mods.sdmcrtplus.entity.AgeableMob")
public class ExpandAgeableMob {

    @ZenCodeType.Method
    public static int getAge(AgeableMob ageableMob){
        return ageableMob.getAge();
    }
    @ZenCodeType.Method
    public static void setAge(AgeableMob ageableMob, int age){
        ageableMob.setAge(age);
    }
    @ZenCodeType.Method
    public static void setAge(AgeableMob ageableMob, boolean baby){
        ageableMob.setBaby(baby);
    }
}
