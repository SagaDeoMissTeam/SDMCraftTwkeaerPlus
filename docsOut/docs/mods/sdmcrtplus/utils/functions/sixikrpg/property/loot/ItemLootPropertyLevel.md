# ItemLootPropertyLevel

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyLevel;
```


## Extending ItemLootPropertyBase

ItemLootPropertyLevel extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyLevel

## Constructors


```zenscript
new ItemLootPropertyLevel(level as int) as ItemLootPropertyLevel
```
| Parameter | Type |
|-----------|------|
| level     | int  |



## Methods

:::group{name=getLevel}

Return Type: int

```zenscript
// ItemLootPropertyLevel.getLevel() as int

myItemLootPropertyLevel.getLevel();
```

:::


