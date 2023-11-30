# ItemLootBase

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootBase;
```


## Constructors


```zenscript
new ItemLootBase(itemStack as IItemStack[], property as ItemLootPropertyBase[], chance as double) as ItemLootBase
```
| Parameter |                                                  Type                                                  |
|-----------|--------------------------------------------------------------------------------------------------------|
| itemStack | [IItemStack](/vanilla/api/item/IItemStack)[]                                                           |
| property  | [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase)[] |
| chance    | double                                                                                                 |



## Methods

:::group{name=getChance}

Return Type: double

```zenscript
// ItemLootBase.getChance() as double

myItemLootBase.getChance();
```

:::

:::group{name=getItemStack}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)[]

```zenscript
// ItemLootBase.getItemStack() as IItemStack[]

myItemLootBase.getItemStack();
```

:::

:::group{name=getProperty}

Return Type: [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase)[]

```zenscript
// ItemLootBase.getProperty() as ItemLootPropertyBase[]

myItemLootBase.getProperty();
```

:::


