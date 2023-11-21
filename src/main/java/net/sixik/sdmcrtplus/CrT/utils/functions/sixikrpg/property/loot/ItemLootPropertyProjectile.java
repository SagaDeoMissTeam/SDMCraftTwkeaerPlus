package net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.property.loot;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.world.entity.projectile.Projectile;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyProjectile")
@ZenCodeType.Name("mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyProjectile")
public class ItemLootPropertyProjectile extends ItemLootPropertyBase{

    public Projectile projectile;

    @ZenCodeType.Constructor
    public ItemLootPropertyProjectile(Projectile projectile){
        this.projectile = projectile;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("projectile")
    public Projectile getProjectile() {
        return projectile;
    }
}
