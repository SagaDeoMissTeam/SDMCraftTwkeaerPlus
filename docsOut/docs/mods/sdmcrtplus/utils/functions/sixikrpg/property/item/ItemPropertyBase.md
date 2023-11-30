# ItemPropertyBase

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.item.ItemPropertyBase;
```


## Constructors


```zenscript
new ItemPropertyBase(itemStack as IItemStack) as ItemPropertyBase
```
| Parameter |                    Type                    |
|-----------|--------------------------------------------|
| itemStack | [IItemStack](/vanilla/api/item/IItemStack) |



## Methods

:::group{name=getItem}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)

```zenscript
// ItemPropertyBase.getItem() as IItemStack

myItemPropertyBase.getItem();
```

:::


## Properties

| Name |                    Type                    | Has Getter | Has Setter |
|------|--------------------------------------------|------------|------------|
| item | [IItemStack](/vanilla/api/item/IItemStack) | true       | false      |

