# EntityDamageProperty

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.entity.EntityDamageProperty;
```


## Extending EntityPropertyBase

EntityDamageProperty extends [EntityPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyBase). That means all methods available in [EntityPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyBase) are also available in EntityDamageProperty

## Constructors


```zenscript
new EntityDamageProperty(percent as double, function as PropertyFunctions) as EntityDamageProperty
```
| Parameter |                                              Type                                               |
|-----------|-------------------------------------------------------------------------------------------------|
| percent   | double                                                                                          |
| function  | [PropertyFunctions](/mods/sdmcrtplus/utils/functions/sixikrpg/property/utils/PropertyFunctions) |



## Methods

:::group{name=getPercent}

Return Type: double

```zenscript
// EntityDamageProperty.getPercent() as double

myEntityDamageProperty.getPercent();
```

:::

:::group{name=getTypeFunction}

Return Type: [PropertyFunctions](/mods/sdmcrtplus/utils/functions/sixikrpg/property/utils/PropertyFunctions)

```zenscript
// EntityDamageProperty.getTypeFunction() as PropertyFunctions

myEntityDamageProperty.getTypeFunction();
```

:::


## Properties

|  Name   |  Type  | Has Getter | Has Setter |
|---------|--------|------------|------------|
| percent | double | true       | false      |

