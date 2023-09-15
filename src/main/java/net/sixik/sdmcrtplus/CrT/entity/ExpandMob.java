package net.sixik.sdmcrtplus.CrT.entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.sixik.sdmcrtplus.mixin.accessor.MobAccessor;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/entity/Mob")
@NativeTypeRegistration(value = Mob.class, zenCodeName = "mods.sdmcrtplus.entity.Mob")
public class ExpandMob {

    @ZenCodeType.Method
    public static void spawnAnim(Mob mob){
        mob.spawnAnim();
    }
    @ZenCodeType.Method
    public static boolean canPickUpLoot(Mob mob){
        return mob.canPickUpLoot();
    }
    @ZenCodeType.Method
    public static boolean canBeLeashed(Mob mob, Player player){
        return mob.canBeLeashed(player);
    }
    @ZenCodeType.Method
    public static boolean canHoldItem(Mob mob, IItemStack itemStack){
        return mob.canHoldItem(itemStack.getInternal());
    }
    @ZenCodeType.Method
    public static boolean canTakeItem(Mob mob, IItemStack itemStack){
        return mob.canTakeItem(itemStack.getInternal());
    }
    @ZenCodeType.Method
    public static boolean wantsToPickUp(Mob mob, IItemStack itemStack){
        return mob.wantsToPickUp(itemStack.getInternal());
    }
    @ZenCodeType.Method
    public static boolean requiresCustomPersistence(Mob mob){
        return mob.requiresCustomPersistence();
    }
    @ZenCodeType.Method
    public static boolean removeWhenFarAway(Mob mob, double var){
        return mob.removeWhenFarAway(var);
    }
    @ZenCodeType.Method
    public static boolean isWithinRestriction(Mob mob){
        return mob.isWithinRestriction();
    }
    @ZenCodeType.Method
    public static LivingEntity getTarget(Mob mob){
        return mob.getTarget();
    }
    @ZenCodeType.Method
    public static void setTarget(Mob mob, LivingEntity target){
         mob.setTarget(target);
    }

    @ZenCodeType.Method
    public static Entity getLeashHolder(Mob mob){
       return ((MobAccessor)mob).getLeashHolder();
    }
//    @ZenCodeType.Method
//    public static ResourceLocation getLootTable(Mob mob){
//       return ((MobAccessor)mob).getLootTable();
//    }
    @ZenCodeType.Method
    public static int getXpReward(Mob mob){
       return ((MobAccessor)mob).getXpReward();
    }
//    @ZenCodeType.Method
//    public static void setLootTable(Mob mob, ResourceLocation lootTable){
//      ((MobAccessor)mob).setLootTable(lootTable);
//    }
}
