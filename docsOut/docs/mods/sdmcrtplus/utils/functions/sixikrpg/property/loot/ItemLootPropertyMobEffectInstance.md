# ItemLootPropertyMobEffectInstance

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyMobEffectInstance;
```


## Extending ItemLootPropertyBase

ItemLootPropertyMobEffectInstance extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyMobEffectInstance

## Constructors


```zenscript
new ItemLootPropertyMobEffectInstance(effectInstance as MobEffectInstance[]) as ItemLootPropertyMobEffectInstance
```
|   Parameter    |                                Type                                 |
|----------------|---------------------------------------------------------------------|
| effectInstance | [MobEffectInstance](/vanilla/api/entity/effect/MobEffectInstance)[] |



## Methods

:::group{name=getEffect}

Return Type: [MobEffectInstance](/vanilla/api/entity/effect/MobEffectInstance)[]

```zenscript
// ItemLootPropertyMobEffectInstance.getEffect() as MobEffectInstance[]

myItemLootPropertyMobEffectInstance.getEffect();
```

:::


## Properties

|  Name  |                                Type                                 | Has Getter | Has Setter |
|--------|---------------------------------------------------------------------|------------|------------|
| effect | [MobEffectInstance](/vanilla/api/entity/effect/MobEffectInstance)[] | true       | false      |

