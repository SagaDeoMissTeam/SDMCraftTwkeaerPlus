# ItemLootPropertyBoxPosition

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyBoxPosition;
```


## Extending ItemLootPropertyBase

ItemLootPropertyBoxPosition extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyBoxPosition

## Constructors


```zenscript
new ItemLootPropertyBoxPosition(pos1 as BlockPos, pos2 as BlockPos) as ItemLootPropertyBoxPosition
```
| Parameter |                    Type                     |
|-----------|---------------------------------------------|
| pos1      | [BlockPos](/vanilla/api/util/math/BlockPos) |
| pos2      | [BlockPos](/vanilla/api/util/math/BlockPos) |



## Methods

:::group{name=getPos1}

Return Type: [BlockPos](/vanilla/api/util/math/BlockPos)

```zenscript
// ItemLootPropertyBoxPosition.getPos1() as BlockPos

myItemLootPropertyBoxPosition.getPos1();
```

:::

:::group{name=getPos2}

Return Type: [BlockPos](/vanilla/api/util/math/BlockPos)

```zenscript
// ItemLootPropertyBoxPosition.getPos2() as BlockPos

myItemLootPropertyBoxPosition.getPos2();
```

:::


## Properties

| Name |                    Type                     | Has Getter | Has Setter |
|------|---------------------------------------------|------------|------------|
| pos1 | [BlockPos](/vanilla/api/util/math/BlockPos) | true       | false      |
| pos2 | [BlockPos](/vanilla/api/util/math/BlockPos) | true       | false      |

