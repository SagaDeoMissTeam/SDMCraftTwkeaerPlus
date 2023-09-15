package net.sixik.sdmcrtplus.CrT.integration.majruszsdifficulty;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.majruszsdifficulty.undeadarmy.data.MobDef;
import com.majruszsdifficulty.undeadarmy.data.MobInfo;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import org.openjdk.nashorn.internal.objects.annotations.Constructor;
import org.openzen.zencode.java.ZenCodeType;

import java.util.UUID;

@ZenRegister(modDeps = "majruszsdifficulty")
@Document("mods/sdmcrtplus/integration/majruszsdifficulty/MobInfo")
@NativeTypeRegistration(value = MobInfo.class,zenCodeName = "mods.sdmcrtplus.integration.majruszsdifficulty.MobInfo",
    constructors = {@NativeConstructor({}),
            @NativeConstructor(value ={
            @NativeConstructor.ConstructorParameter(name = "def", type = MobDef.class),
            @NativeConstructor.ConstructorParameter(name = "position", type = BlockPos.class),
            @NativeConstructor.ConstructorParameter(name = "isBoss", type = Boolean.class)
})})
public class ExpandMobInfo {

    @ZenCodeType.Method
    public static ResourceLocation getEquipment(MobInfo info){
        return info.equipment;
    }
    @ZenCodeType.Method
    public static boolean isBoss(MobInfo info){
        return info.isBoss;
    }
    @ZenCodeType.Method
    public static boolean isBoss(MobInfo info, boolean boss){
        return info.isBoss = boss;
    }
    @ZenCodeType.Method
    public static BlockPos getPosition(MobInfo info){
        return info.position;
    }
    @ZenCodeType.Method
    public static BlockPos setPosition(MobInfo info, BlockPos pos){
        return info.position = pos;
    }
    @ZenCodeType.Method
    public static EntityType<?> getType(MobInfo info){
        return info.type;
    }
    @ZenCodeType.Method
    public static EntityType<?> setType(MobInfo info, EntityType<?> entityType){
        return info.type = entityType;
    }
    @ZenCodeType.Method
    public static float getHealth(MobInfo info, ServerLevel level){
        return info.getHealth(level);
    }
    @ZenCodeType.Method
    public static float getMaxHealth(MobInfo info, ServerLevel level){
        return info.getMaxHealth(level);
    }
    @ZenCodeType.Method
    public static Entity toEntity(MobInfo info, ServerLevel level){
        return info.toEntity(level);
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("uuid")
    public static UUID getUUID(MobInfo info){
        return info.uuid;
    }
}
