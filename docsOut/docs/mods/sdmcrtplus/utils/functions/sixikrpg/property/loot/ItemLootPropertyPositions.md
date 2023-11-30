# ItemLootPropertyPositions

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyPositions;
```


## Extending ItemLootPropertyBase

ItemLootPropertyPositions extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyPositions

## Constructors


```zenscript
new ItemLootPropertyPositions(pos as BlockPos) as ItemLootPropertyPositions
```
| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| pos       | [BlockPos](/vanilla/api/util/math/BlockPos) |



## Methods

:::group{name=getPos}

Return Type: [BlockPos](/vanilla/api/util/math/BlockPos)

```zenscript
// ItemLootPropertyPositions.getPos() as BlockPos

myItemLootPropertyPositions.getPos();
```

:::


## Properties

| Name |                    Type                     | Has Getter | Has Setter |
|------|---------------------------------------------|------------|------------|
| pos  | [BlockPos](/vanilla/api/util/math/BlockPos) | true       | false      |

