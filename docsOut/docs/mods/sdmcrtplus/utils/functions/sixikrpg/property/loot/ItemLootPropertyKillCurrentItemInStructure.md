# ItemLootPropertyKillCurrentItemInStructure

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyKillCurrentItemInStructure;
```


## Extending ItemLootPropertyKillCurrentItem

ItemLootPropertyKillCurrentItemInStructure extends [ItemLootPropertyKillCurrentItem](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyKillCurrentItem). That means all methods available in [ItemLootPropertyKillCurrentItem](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyKillCurrentItem) are also available in ItemLootPropertyKillCurrentItemInStructure

## Constructors


```zenscript
new ItemLootPropertyKillCurrentItemInStructure(items as IItemStack[], structure as ResourceLocation[]) as ItemLootPropertyKillCurrentItemInStructure
```
| Parameter |                             Type                             |
|-----------|--------------------------------------------------------------|
| items     | [IItemStack](/vanilla/api/item/IItemStack)[]                 |
| structure | [ResourceLocation](/vanilla/api/resource/ResourceLocation)[] |



## Methods

:::group{name=getNeedItems}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)[]

```zenscript
// ItemLootPropertyKillCurrentItemInStructure.getNeedItems() as IItemStack[]

myItemLootPropertyKillCurrentItemInStructure.getNeedItems();
```

:::

:::group{name=getStructure}

Return Type: [ResourceLocation](/vanilla/api/resource/ResourceLocation)[]

```zenscript
// ItemLootPropertyKillCurrentItemInStructure.getStructure() as ResourceLocation[]

myItemLootPropertyKillCurrentItemInStructure.getStructure();
```

:::


## Properties

|   Name    |                             Type                             | Has Getter | Has Setter |
|-----------|--------------------------------------------------------------|------------|------------|
| items     | [IItemStack](/vanilla/api/item/IItemStack)[]                 | true       | false      |
| structure | [ResourceLocation](/vanilla/api/resource/ResourceLocation)[] | true       | false      |

