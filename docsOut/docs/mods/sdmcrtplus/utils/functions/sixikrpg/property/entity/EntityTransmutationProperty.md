# EntityTransmutationProperty

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.property.entity.EntityTransmutationProperty;
```


## Extending EntityPropertyBase

EntityTransmutationProperty extends [EntityPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyBase). That means all methods available in [EntityPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyBase) are also available in EntityTransmutationProperty

## Constructors


```zenscript
new EntityTransmutationProperty(entityTypes as EntityType<Entity>[]) as EntityTransmutationProperty
```
|  Parameter  |                                            Type                                            |
|-------------|--------------------------------------------------------------------------------------------|
| entityTypes | [EntityType](/vanilla/api/entity/EntityType)&lt;[Entity](/vanilla/api/entity/Entity)&gt;[] |



## Methods

:::group{name=getEntityTypes}

Return Type: [EntityType](/vanilla/api/entity/EntityType)&lt;[Entity](/vanilla/api/entity/Entity)&gt;[]

```zenscript
// EntityTransmutationProperty.getEntityTypes() as EntityType<Entity>[]

myEntityTransmutationProperty.getEntityTypes();
```

:::


