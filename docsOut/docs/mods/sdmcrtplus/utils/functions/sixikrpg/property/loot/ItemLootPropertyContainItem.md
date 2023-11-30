# ItemLootPropertyContainItem

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyContainItem;
```


## Extending ItemLootPropertyBase

ItemLootPropertyContainItem extends [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase). That means all methods available in [ItemLootPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyBase) are also available in ItemLootPropertyContainItem

## Constructors


```zenscript
new ItemLootPropertyContainItem(itemStack as IItemStack) as ItemLootPropertyContainItem
```
| Parameter |                    Type                    |
|-----------|--------------------------------------------|
| itemStack | [IItemStack](/vanilla/api/item/IItemStack) |



## Methods

:::group{name=getItemStack}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)

```zenscript
// ItemLootPropertyContainItem.getItemStack() as IItemStack

myItemLootPropertyContainItem.getItemStack();
```

:::


