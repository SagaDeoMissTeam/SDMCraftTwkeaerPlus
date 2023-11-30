# EntityElementBase

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.entity.elements.EntityElementBase;
```


## Constructors


```zenscript
new EntityElementBase(entityTypes as EntityType<Entity>[], propertyBase as EntityPropertyBase[]) as EntityElementBase
```
|  Parameter   |                                                 Type                                                 |
|--------------|------------------------------------------------------------------------------------------------------|
| entityTypes  | [EntityType](/vanilla/api/entity/EntityType)&lt;[Entity](/vanilla/api/entity/Entity)&gt;[]           |
| propertyBase | [EntityPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyBase)[] |



## Methods

:::group{name=getEntityTypes}

Return Type: [EntityType](/vanilla/api/entity/EntityType)[]

```zenscript
// EntityElementBase.getEntityTypes() as EntityType[]

myEntityElementBase.getEntityTypes();
```

:::

:::group{name=getProperty}

Return Type: [EntityPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyBase)[]

```zenscript
// EntityElementBase.getProperty() as EntityPropertyBase[]

myEntityElementBase.getProperty();
```

:::


## Properties

|    Name     |                                                 Type                                                 | Has Getter | Has Setter |
|-------------|------------------------------------------------------------------------------------------------------|------------|------------|
| entityTypes | [EntityType](/vanilla/api/entity/EntityType)[]                                                       | true       | false      |
| property    | [EntityPropertyBase](/mods/sdmcrtplus/utils/functions/sixikrpg/property/entity/EntityPropertyBase)[] | true       | false      |

