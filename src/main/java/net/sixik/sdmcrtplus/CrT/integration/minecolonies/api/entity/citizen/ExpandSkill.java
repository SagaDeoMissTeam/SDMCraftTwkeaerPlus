package net.sixik.sdmcrtplus.CrT.integration.minecolonies.api.entity.citizen;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.minecolonies.api.entity.citizen.Skill;
import org.jetbrains.annotations.Nullable;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "minecolonies")
@Document("mods/sdmcrtplus/integration/minecolonies/api/entity/citizen/Skill")
@NativeTypeRegistration(value = Skill.class, zenCodeName = "mods.sdmcrtplus.integration.api.entity.citizen.Skill")
@BracketEnum("minecolonies:citizen/skill")
public class ExpandSkill {

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Skill getAdverse(Skill skill){
        return skill.getAdverse();
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Skill getComplimentary(Skill skill){
        return skill.getComplimentary();
    }
}
