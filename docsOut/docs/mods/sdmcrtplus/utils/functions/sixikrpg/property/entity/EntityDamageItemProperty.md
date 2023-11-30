# EntityDamageItemProperty

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.entity.EntityDamageItemProperty;
```


## Extending EntityPropertyItemBase

EntityDamageItemProperty extends [EntityPropertyItemBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyItemBase). That means all methods available in [EntityPropertyItemBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyItemBase) are also available in EntityDamageItemProperty

## Constructors


```zenscript
new EntityDamageItemProperty(itemStack as IItemStack[], percent as double, functions as PropertyFunctions) as EntityDamageItemProperty
```
| Parameter |                                              Type                                               |
|-----------|-------------------------------------------------------------------------------------------------|
| itemStack | [IItemStack](/vanilla/api/item/IItemStack)[]                                                    |
| percent   | double                                                                                          |
| functions | [PropertyFunctions](/mods/sdmcrtplus/utils/functions/sixikrpg/property/utils/PropertyFunctions) |



## Methods

:::group{name=getItems}

Return Type: [IItemStack](/vanilla/api/item/IItemStack)[]

```zenscript
// EntityDamageItemProperty.getItems() as IItemStack[]

myEntityDamageItemProperty.getItems();
```

:::

:::group{name=getPercent}

Return Type: double

```zenscript
// EntityDamageItemProperty.getPercent() as double

myEntityDamageItemProperty.getPercent();
```

:::

:::group{name=getTypeFunction}

Return Type: [PropertyFunctions](/mods/sdmcrtplus/utils/functions/sixikrpg/property/utils/PropertyFunctions)

```zenscript
// EntityDamageItemProperty.getTypeFunction() as PropertyFunctions

myEntityDamageItemProperty.getTypeFunction();
```

:::


## Properties

|  Name   |                     Type                     | Has Getter | Has Setter |
|---------|----------------------------------------------|------------|------------|
| item    | [IItemStack](/vanilla/api/item/IItemStack)[] | true       | false      |
| percent | double                                       | true       | false      |

