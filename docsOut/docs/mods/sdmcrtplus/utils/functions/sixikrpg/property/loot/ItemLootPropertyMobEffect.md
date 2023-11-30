# ItemLootPropertyMobEffect

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyMobEffect;
```


## Extending ItemLootPropertyBase

ItemLootPropertyMobEffect extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyMobEffect

## Constructors


```zenscript
new ItemLootPropertyMobEffect(effect as MobEffect[]) as ItemLootPropertyMobEffect
```
| Parameter |                        Type                         |
|-----------|-----------------------------------------------------|
| effect    | [MobEffect](/vanilla/api/entity/effect/MobEffect)[] |



## Methods

:::group{name=getEffect}

Return Type: [MobEffect](/vanilla/api/entity/effect/MobEffect)[]

```zenscript
// ItemLootPropertyMobEffect.getEffect() as MobEffect[]

myItemLootPropertyMobEffect.getEffect();
```

:::


## Properties

|  Name  |                        Type                         | Has Getter | Has Setter |
|--------|-----------------------------------------------------|------------|------------|
| effect | [MobEffect](/vanilla/api/entity/effect/MobEffect)[] | true       | false      |

