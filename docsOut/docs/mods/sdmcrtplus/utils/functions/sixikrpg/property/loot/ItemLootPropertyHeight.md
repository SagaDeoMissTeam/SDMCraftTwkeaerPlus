# ItemLootPropertyHeight

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyHeight;
```


## Extending ItemLootPropertyBase

ItemLootPropertyHeight extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyHeight

## Constructors


```zenscript
new ItemLootPropertyHeight(yPos as int) as ItemLootPropertyHeight
```
| Parameter | Type |
|-----------|------|
| yPos      | int  |



## Methods

:::group{name=getyPos}

Return Type: int

```zenscript
// ItemLootPropertyHeight.getyPos() as int

myItemLootPropertyHeight.getyPos();
```

:::


## Properties

| Name | Type | Has Getter | Has Setter |
|------|------|------------|------------|
| y    | int  | true       | false      |

