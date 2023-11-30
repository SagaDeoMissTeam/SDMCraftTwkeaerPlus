# EntityPropertyItemBase

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.entity.EntityPropertyItemBase;
```


## Extending EntityPropertyBase

EntityPropertyItemBase extends [EntityPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyBase). That means all methods available in [EntityPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyBase) are also available in EntityPropertyItemBase

## Constructors


```zenscript
new EntityPropertyItemBase(itemStack as IItemStack[]) as EntityPropertyItemBase
```
| Parameter |                     Type                     |
|-----------|----------------------------------------------|
| itemStack | [IItemStack](/vanilla/api/item/IItemStack)[] |



## Methods

:::group{name=getItems}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)[]

```zenscript
// EntityPropertyItemBase.getItems() as IItemStack[]

myEntityPropertyItemBase.getItems();
```

:::


## Properties

| Name |                     Type                     | Has Getter | Has Setter |
|------|----------------------------------------------|------------|------------|
| item | [IItemStack](/vanilla/api/item/IItemStack)[] | true       | false      |

