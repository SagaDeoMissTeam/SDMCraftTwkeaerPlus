# ItemLootPropertyContainItemInSlot

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.loot.ItemLootPropertyContainItemInSlot;
```


## Extending ItemLootPropertyContainItem

ItemLootPropertyContainItemInSlot extends [ItemLootPropertyContainItem](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyContainItem). That means all methods available in [ItemLootPropertyContainItem](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootPropertyContainItem) are also available in ItemLootPropertyContainItemInSlot

## Constructors


```zenscript
new ItemLootPropertyContainItemInSlot(itemStack as IItemStack, slot as int) as ItemLootPropertyContainItemInSlot
```
| Parameter |                    Type                    |
|-----------|--------------------------------------------|
| itemStack | [IItemStack](/vanilla/api/item/IItemStack) |
| slot      | int                                        |



## Methods

:::group{name=getItemStack}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)

```zenscript
// ItemLootPropertyContainItemInSlot.getItemStack() as IItemStack

myItemLootPropertyContainItemInSlot.getItemStack();
```

:::

:::group{name=getSlot}

Return Type: int

```zenscript
// ItemLootPropertyContainItemInSlot.getSlot() as int

myItemLootPropertyContainItemInSlot.getSlot();
```

:::


## Properties

| Name | Type | Has Getter | Has Setter |
|------|------|------------|------------|
| slot | int  | true       | false      |

