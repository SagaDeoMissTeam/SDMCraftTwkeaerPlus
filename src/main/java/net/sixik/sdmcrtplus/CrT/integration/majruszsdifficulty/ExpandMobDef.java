package net.sixik.sdmcrtplus.CrT.integration.majruszsdifficulty;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.majruszsdifficulty.undeadarmy.data.MobDef;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "majruszsdifficulty")
@Document("mods/sdmcrtplus/integration/majruszsdifficulty/MobDef")
@NativeTypeRegistration(value = MobDef.class,zenCodeName = "mods.sdmcrtplus.integration.majruszsdifficulty.MobDef",
        constructors = @NativeConstructor({})
)

public class ExpandMobDef {

    @ZenCodeType.Method
    @ZenCodeType.Getter("count")
    public static int getCount(MobDef def){
        return def.count;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("type")
    public static EntityType<?> getType(MobDef def){
        return def.type;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("equipment")
    public static ResourceLocation getEquipment(MobDef def){
        return def.equipment;
    }

    @ZenCodeType.Method
    @ZenCodeType.Setter("count")
    public static int setCount(MobDef def, int count){
        return def.count = count;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("type")
    public static EntityType<?> setType(MobDef def, EntityType<?> type){
        return def.type = type;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("equipment")
    public static ResourceLocation setEquipment(MobDef def, ResourceLocation resourceLocation){
        return def.equipment = resourceLocation;
    }
}
