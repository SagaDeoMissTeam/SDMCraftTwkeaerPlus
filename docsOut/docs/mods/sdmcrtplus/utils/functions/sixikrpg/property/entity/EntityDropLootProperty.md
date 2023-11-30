# EntityDropLootProperty

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.entity.EntityDropLootProperty;
```


## Extending EntityPropertyLootBase

EntityDropLootProperty extends [EntityPropertyLootBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyLootBase). That means all methods available in [EntityPropertyLootBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyLootBase) are also available in EntityDropLootProperty

## Constructors


```zenscript
new EntityDropLootProperty(items as ItemLootBase, maxItems as int) as EntityDropLootProperty
```
| Parameter |                                         Type                                         |
|-----------|--------------------------------------------------------------------------------------|
| items     | [ItemLootBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootBase) |
| maxItems  | int                                                                                  |



## Methods

:::group{name=getItems}

Return Type: [ItemLootBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/loot/ItemLootBase)

```zenscript
// EntityDropLootProperty.getItems() as ItemLootBase

myEntityDropLootProperty.getItems();
```

:::

:::group{name=getMaxItems}

Return Type: int

```zenscript
// EntityDropLootProperty.getMaxItems() as int

myEntityDropLootProperty.getMaxItems();
```

:::


