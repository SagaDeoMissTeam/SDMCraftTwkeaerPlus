# SixikRPGUtils

## Importing the class

It might be required for you to import the package if you encounter any issues (like casting an Array), so better be safe than sorry and add the import at the very top of the file.
```zenscript
import mods.sdmcrtplus.utils.functions.sixikrpg.utils.SixikRPGUtils;
```


## Static Methods

:::group{name=getBlockSkills}

Return Type: stdlib.List&lt;[BlockSkillBase](/mods/sdmcrtplus/utils/functions/sixikrpg/block/BlockSkillBase)&gt;

```zenscript
// SixikRPGUtils.getBlockSkills() as stdlib.List<BlockSkillBase>

SixikRPGUtils.getBlockSkills();
```

:::

:::group{name=getRegisteredEntity}

Return Type: stdlib.List&lt;[EntityElementBase](/mods/sdmcrtplus/utils/functions/sixikrpg/entity/elements/EntityElementBase)&gt;

```zenscript
// SixikRPGUtils.getRegisteredEntity() as stdlib.List<EntityElementBase>

SixikRPGUtils.getRegisteredEntity();
```

:::

:::group{name=register}

Return Type: [BlockSkillBase](/mods/sdmcrtplus/utils/functions/sixikrpg/block/BlockSkillBase)

```zenscript
SixikRPGUtils.register(elements as BlockSkillBase) as BlockSkillBase
```

| Parameter |                                       Type                                       |
|-----------|----------------------------------------------------------------------------------|
| elements  | [BlockSkillBase](/mods/sdmcrtplus/utils/functions/sixikrpg/block/BlockSkillBase) |


:::

:::group{name=register}

Return Type: [BlockSkillBase](/mods/sdmcrtplus/utils/functions/sixikrpg/block/BlockSkillBase)[]

```zenscript
SixikRPGUtils.register(elements as BlockSkillBase[]) as BlockSkillBase[]
```

| Parameter |                                        Type                                        |
|-----------|------------------------------------------------------------------------------------|
| elements  | [BlockSkillBase](/mods/sdmcrtplus/utils/functions/sixikrpg/block/BlockSkillBase)[] |


:::

:::group{name=register}

Return Type: [EntityElementBase](/mods/sdmcrtplus/utils/functions/sixikrpg/entity/elements/EntityElementBase)

```zenscript
SixikRPGUtils.register(elements as EntityElementBase) as EntityElementBase
```

| Parameter |                                               Type                                               |
|-----------|--------------------------------------------------------------------------------------------------|
| elements  | [EntityElementBase](/mods/sdmcrtplus/utils/functions/sixikrpg/entity/elements/EntityElementBase) |


:::

:::group{name=register}

Return Type: [EntityElementBase](/mods/sdmcrtplus/utils/functions/sixikrpg/entity/elements/EntityElementBase)[]

```zenscript
SixikRPGUtils.register(elements as EntityElementBase[]) as EntityElementBase[]
```

| Parameter |                                                Type                                                |
|-----------|----------------------------------------------------------------------------------------------------|
| elements  | [EntityElementBase](/mods/sdmcrtplus/utils/functions/sixikrpg/entity/elements/EntityElementBase)[] |


:::

