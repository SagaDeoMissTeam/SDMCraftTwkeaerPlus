# ItemLootPropertyCurios

It only works when the Curios API mod is installed

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyCurios;
```


## Extending ItemLootPropertyBase

ItemLootPropertyCurios extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyCurios

## Constructors


```zenscript
new ItemLootPropertyCurios(curios as IItemStack[]) as ItemLootPropertyCurios
```
| Parameter |                     Type                     |
|-----------|----------------------------------------------|
| curios    | [IItemStack](/vanilla/api/item/IItemStack)[] |



## Methods

:::group{name=getCurios}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)[]

```zenscript
// ItemLootPropertyCurios.getCurios() as IItemStack[]

myItemLootPropertyCurios.getCurios();
```

:::


## Properties

|  Name  |                     Type                     | Has Getter | Has Setter |
|--------|----------------------------------------------|------------|------------|
| curios | [IItemStack](/vanilla/api/item/IItemStack)[] | true       | false      |

