package net.sixik.sdmcrtplus.CrT.entity.monster;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.ai.Brain;
import net.minecraft.world.entity.monster.Enemy;

@ZenRegister
@Document("mods/sdmcrtplus/entity/monster/Enemy")
@NativeTypeRegistration(value = Enemy.class, zenCodeName = "mods.sdmcrtplus.entity.monster.Enemy")
@BracketEnum("entity:monster/enemy")
public class ExpandEnemy {
}
