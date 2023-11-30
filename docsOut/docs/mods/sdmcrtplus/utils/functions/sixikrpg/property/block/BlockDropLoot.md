# BlockDropLoot

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.block.BlockDropLoot;
```


## Extending BlockPropertyDestroy

BlockDropLoot extends [BlockPropertyDestroy](/mods/sdmcrtplus/utils/functions/sixikrpg/property/block/destroy/BlockPropertyDestroy). That means all methods available in [BlockPropertyDestroy](/mods/sdmcrtplus/utils/functions/sixikrpg/property/block/destroy/BlockPropertyDestroy) are also available in BlockDropLoot

## Constructors


```zenscript
new BlockDropLoot(items as ItemLootBase, maxItems as int) as BlockDropLoot
```
| Parameter |                                         Type                                         |
|-----------|--------------------------------------------------------------------------------------|
| items     | [ItemLootBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootBase) |
| maxItems  | int                                                                                  |



## Methods

:::group{name=getItems}

Return Type: [ItemLootBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootBase)

```zenscript
// BlockDropLoot.getItems() as ItemLootBase

myBlockDropLoot.getItems();
```

:::

:::group{name=getMaxItems}

Return Type: int

```zenscript
// BlockDropLoot.getMaxItems() as int

myBlockDropLoot.getMaxItems();
```

:::


