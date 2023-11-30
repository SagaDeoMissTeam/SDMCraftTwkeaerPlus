# ItemLootPropertyProjectile

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyProjectile;
```


## Extending ItemLootPropertyBase

ItemLootPropertyProjectile extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyProjectile

## Constructors


```zenscript
new ItemLootPropertyProjectile(projectile as Projectile) as ItemLootPropertyProjectile
```
| Parameter  |                             Type                             |
|------------|--------------------------------------------------------------|
| projectile | [Projectile](/vanilla/api/entity/type/projectile/Projectile) |



## Methods

:::group{name=getProjectile}

Return Type: [Projectile](/vanilla/api/entity/type/projectile/Projectile)

```zenscript
// ItemLootPropertyProjectile.getProjectile() as Projectile

myItemLootPropertyProjectile.getProjectile();
```

:::


## Properties

|    Name    |                             Type                             | Has Getter | Has Setter |
|------------|--------------------------------------------------------------|------------|------------|
| projectile | [Projectile](/vanilla/api/entity/type/projectile/Projectile) | true       | false      |

