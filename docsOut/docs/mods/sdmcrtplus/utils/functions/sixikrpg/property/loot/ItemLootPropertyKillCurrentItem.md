# ItemLootPropertyKillCurrentItem

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyKillCurrentItem;
```


## Extending ItemLootPropertyBase

ItemLootPropertyKillCurrentItem extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyKillCurrentItem

## Constructors


```zenscript
new ItemLootPropertyKillCurrentItem(items as IItemStack[]) as ItemLootPropertyKillCurrentItem
```
| Parameter |                     Type                     |
|-----------|----------------------------------------------|
| items     | [IItemStack](/vanilla/api/item/IItemStack)[] |



## Methods

:::group{name=getNeedItems}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)[]

```zenscript
// ItemLootPropertyKillCurrentItem.getNeedItems() as IItemStack[]

myItemLootPropertyKillCurrentItem.getNeedItems();
```

:::


## Properties

| Name  |                     Type                     | Has Getter | Has Setter |
|-------|----------------------------------------------|------------|------------|
| items | [IItemStack](/vanilla/api/item/IItemStack)[] | true       | false      |

