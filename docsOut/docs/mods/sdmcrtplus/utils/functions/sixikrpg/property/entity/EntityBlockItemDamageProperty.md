# EntityBlockItemDamageProperty

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.entity.EntityBlockItemDamageProperty;
```


## Extending EntityPropertyItemBase

EntityBlockItemDamageProperty extends [EntityPropertyItemBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyItemBase). That means all methods available in [EntityPropertyItemBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyItemBase) are also available in EntityBlockItemDamageProperty

## Constructors


```zenscript
new EntityBlockItemDamageProperty(itemStack as IItemStack[]) as EntityBlockItemDamageProperty
```
| Parameter |                     Type                     |
|-----------|----------------------------------------------|
| itemStack | [IItemStack](/vanilla/api/item/IItemStack)[] |



## Methods

:::group{name=getItems}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)[]

```zenscript
// EntityBlockItemDamageProperty.getItems() as IItemStack[]

myEntityBlockItemDamageProperty.getItems();
```

:::


## Properties

| Name |                     Type                     | Has Getter | Has Setter |
|------|----------------------------------------------|------------|------------|
| item | [IItemStack](/vanilla/api/item/IItemStack)[] | true       | false      |

