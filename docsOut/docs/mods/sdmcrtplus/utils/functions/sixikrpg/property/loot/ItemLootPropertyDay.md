# ItemLootPropertyDay

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyDay;
```


## Extending ItemLootPropertyBase

ItemLootPropertyDay extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyDay

## Constructors


```zenscript
new ItemLootPropertyDay(day as long) as ItemLootPropertyDay
```
| Parameter | Type |
|-----------|------|
| day       | long |



## Methods

:::group{name=getDay}

Return Type: long

```zenscript
// ItemLootPropertyDay.getDay() as long

myItemLootPropertyDay.getDay();
```

:::


## Properties

| Name | Type | Has Getter | Has Setter |
|------|------|------------|------------|
| day  | long | true       | false      |

